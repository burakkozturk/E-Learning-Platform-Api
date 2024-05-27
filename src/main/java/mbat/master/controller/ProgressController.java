package mbat.master.controller;

import mbat.master.dto.CourseProgressDto;
import mbat.master.service.ProgressService;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/progress")
@CrossOrigin
public class ProgressController {

    private final ProgressService progressService;

    public ProgressController(ProgressService progressService) {
        this.progressService = progressService;
    }

    @PutMapping("/user/{username}/unit/{unitNumber}/status")
    public void updateUserUnitStatus(@PathVariable String username, @PathVariable int unitNumber, @RequestParam boolean status) {
        progressService.updateUnitStatus(username, unitNumber, status);
    }

    @GetMapping("/user/{username}")
    public CourseProgressDto getUserCourseProgress(@PathVariable String username) {
        return progressService.getUserCourseProgress(username);
    }
}
