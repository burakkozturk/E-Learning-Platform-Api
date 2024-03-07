package mbat.master.controller;

import mbat.master.entity.Unit;
import mbat.master.entity.Content;
import mbat.master.service.UnitService;
import mbat.master.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class MasterController {

    @Autowired
    private UnitService unitService;

    @Autowired
    private ContentService contentService;

    @GetMapping("/units")
    public ResponseEntity<List<Unit>> getAllUnits() {
        List<Unit> units = unitService.getAllUnits();
        return ResponseEntity.ok(units);
    }

    @GetMapping("/contents")
    public ResponseEntity<List<Content>> getAllContents() {
        List<Content> contents = contentService.getAllContents();
        return ResponseEntity.ok(contents);
    }

    @GetMapping("/contents/unit/{unitId}")
    public ResponseEntity<List<Content>> getContentByUnitId(@PathVariable Long unitId) {
        List<Content> contents = contentService.getContentByUnitId(unitId);
        return ResponseEntity.ok(contents);
    }

    @GetMapping("/units/{unitId}")
    public ResponseEntity<Unit> getUnitById(@PathVariable Long unitId) {
        Optional<Unit> unit = unitService.getUnitById(unitId);
        return unit.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

}
