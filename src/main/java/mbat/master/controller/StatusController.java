package mbat.master.controller;

import mbat.master.entity.Status;
import mbat.master.service.StatusService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/status")
public class StatusController {
    private final StatusService statusService;

    public StatusController(StatusService statusService) {
        this.statusService = statusService;
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<Status>> getStatusesByUserId(@PathVariable Long userId) {
        List<Status> statuses = statusService.getStatusesByUserId(userId);
        return ResponseEntity.ok(statuses);
    }



    @PostMapping("/setU1Active/{statusId}")
    public ResponseEntity<?> setU1ToActive(@PathVariable Long statusId) {
        statusService.setU1ToActive(statusId);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/setU2Active/{statusId}")
    public ResponseEntity<?> setU2ToActive(@PathVariable Long statusId) {
        statusService.setU2ToActive(statusId);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/setU3Active/{statusId}")
    public ResponseEntity<?> setU3ToActive(@PathVariable Long statusId) {
        statusService.setU3ToActive(statusId);
        return ResponseEntity.ok().build();
    }

    // Diğer metodlar benzer şekilde eklenir...

    @PostMapping("/setU4Active/{statusId}")
    public ResponseEntity<?> setU4ToActive(@PathVariable Long statusId) {
        statusService.setU4ToActive(statusId);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/setU5Active/{statusId}")
    public ResponseEntity<?> setU5ToActive(@PathVariable Long statusId) {
        statusService.setU5ToActive(statusId);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/setU6Active/{statusId}")
    public ResponseEntity<?> setU6ToActive(@PathVariable Long statusId) {
        statusService.setU1ToActive(statusId);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/setU7Active/{statusId}")
    public ResponseEntity<?> setU7ToActive(@PathVariable Long statusId) {
        statusService.setU2ToActive(statusId);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/setU8Active/{statusId}")
    public ResponseEntity<?> setU8ToActive(@PathVariable Long statusId) {
        statusService.setU3ToActive(statusId);
        return ResponseEntity.ok().build();
    }

    // Diğer metodlar benzer şekilde eklenir...f
    @PostMapping("/setU9Active/{statusId}")
    public ResponseEntity<?> setU9ToActive(@PathVariable Long statusId) {
        statusService.setU4ToActive(statusId);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/setU10Active/{statusId}")
    public ResponseEntity<?> setU10ToActive(@PathVariable Long statusId) {
        statusService.setU5ToActive(statusId);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/setU11Active/{statusId}")
    public ResponseEntity<?> setU11ToActive(@PathVariable Long statusId) {
        statusService.setU1ToActive(statusId);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/setU12Active/{statusId}")
    public ResponseEntity<?> setU12ToActive(@PathVariable Long statusId) {
        statusService.setU2ToActive(statusId);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/setU13Active/{statusId}")
    public ResponseEntity<?> setU13ToActive(@PathVariable Long statusId) {
        statusService.setU3ToActive(statusId);
        return ResponseEntity.ok().build();
    }


}
