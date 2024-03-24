package mbat.master.repository;

import mbat.master.entity.Status;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StatusRepository extends JpaRepository<Status, Long> {


    List<Status> findByUserId(Long userId);
}
