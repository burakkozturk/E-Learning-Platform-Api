package mbat.master.service;
import mbat.master.entity.Course;
import mbat.master.entity.Unit;
import mbat.master.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CourseService {

    @Autowired
    private final CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public List<Course> findAllCourses() {
        return courseRepository.findAll();
    }

    public List<Unit> findUnitsByCourseId(Long courseId) {
        Optional<Course> courseOptional = courseRepository.findById(courseId);
        if (courseOptional.isPresent()) {
            Course course = courseOptional.get();
            // Set<Unit>'i List<Unit>'e dönüştür
            return course.getUnits().stream().collect(Collectors.toList());
        } else {
            // Kurs bulunamazsa boş bir liste döndür
            return Collections.emptyList();
        }
    }
}

