package mbat.master.controller;


import mbat.master.dto.OptionDTO;
import mbat.master.entity.Option;
import mbat.master.entity.Question;
import mbat.master.entity.Quiz;
import mbat.master.repository.QuestionRepository;
import mbat.master.repository.OptionRepository;
import mbat.master.repository.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/quizzes")
@CrossOrigin
public class QuizController {

    private final QuizRepository quizRepository;
    private final QuestionRepository questionRepository;
    private final OptionRepository optionRepository;


    @Autowired
    public QuizController(QuizRepository quizRepository, QuestionRepository questionRepository, OptionRepository optionRepository) {
        this.quizRepository = quizRepository;
        this.questionRepository = questionRepository;
        this.optionRepository = optionRepository;
    }

    // Tüm quizleri getir
    @GetMapping
    public List<Quiz> getAllQuizzes() {
        return quizRepository.findAll();
    }

    // ID'ye göre tek bir quiz getir
    @GetMapping("/{quizId}")
    public ResponseEntity<Quiz> getQuizById(@PathVariable Long quizId) {
        return quizRepository.findById(quizId)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Bir quiz'e ait tüm soruları getir
    @GetMapping("/{quizId}/questions")
    public ResponseEntity<List<Question>> getQuestionsByQuizId(@PathVariable Long quizId) {
        if (!quizRepository.existsById(quizId)) {
            return ResponseEntity.notFound().build();
        }
        List<Question> questions = questionRepository.findByQuizId(quizId);
        return ResponseEntity.ok(questions);
    }

    @PostMapping("/options")
    public ResponseEntity<Option> createOption(@RequestBody OptionDTO optionDTO) {
        Option option = new Option();
        option.setQuestionId(optionDTO.getQuestionId());
        option.setOptionText(optionDTO.getOptionText());
        option.setCorrect(optionDTO.getIsCorrect());

        Option savedOption = optionRepository.save(option);
        return new ResponseEntity<>(savedOption, HttpStatus.CREATED);
    }

    @GetMapping("/units/{unitId}/quizzes")
    public ResponseEntity<List<Quiz>> getQuizzesByUnitId(@PathVariable Long unitId) {
        List<Quiz> quizzes = quizRepository.findByUnitId(unitId);
        if (quizzes.isEmpty()) {
            return ResponseEntity.noContent().build(); // Eğer quiz listesi boşsa, No Content durumunu döndür
        }
        return ResponseEntity.ok(quizzes); // Eğer quiz listesi doluysa, listeyi döndür
    }

    @GetMapping("/units/{unitId}/hasQuiz")
    public ResponseEntity<Boolean> hasQuiz(@PathVariable Long unitId) {
        boolean hasQuiz = !quizRepository.findByUnitId(unitId).isEmpty();
        return ResponseEntity.ok(hasQuiz);
    }

}
