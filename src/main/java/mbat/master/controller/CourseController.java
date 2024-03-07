package mbat.master.controller;

import mbat.master.entity.Course;
import mbat.master.entity.Unit;
import mbat.master.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/courses")
@CrossOrigin
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping
    public List<Course> getAllCourses() {
        return courseService.findAllCourses();
    }

    @GetMapping("/{courseId}/units")
    public List<Unit> getUnitsByCourseId(@PathVariable Long courseId) {
        return courseService.findUnitsByCourseId(courseId);
    }
}
