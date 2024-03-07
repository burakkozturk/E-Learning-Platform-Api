package mbat.master.service;

import mbat.master.entity.Unit;
import mbat.master.repository.UnitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class UnitService {

    private final UnitRepository unitRepository;

    @Autowired
    public UnitService(UnitRepository unitRepository) {
        this.unitRepository = unitRepository;
    }

    public List<Unit> getAllUnits() {
        return unitRepository.findAll();
    }
    public Optional<Unit> getUnitById(Long unitId) {
        return unitRepository.findById(unitId);
    }

}
