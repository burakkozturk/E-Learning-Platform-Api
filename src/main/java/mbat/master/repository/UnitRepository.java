package mbat.master.repository;

import mbat.master.entity.Content;
import mbat.master.entity.Unit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UnitRepository extends JpaRepository<Unit,Long> {
}
