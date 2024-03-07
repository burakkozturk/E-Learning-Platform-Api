package mbat.master.repository;

import mbat.master.entity.Content;
import mbat.master.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course,Long> {
}
