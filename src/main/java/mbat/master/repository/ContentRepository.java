package mbat.master.repository;

import mbat.master.entity.Content;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ContentRepository extends JpaRepository<Content, Long> {
    List<Content> findByUnitId(Long unitId);
}
