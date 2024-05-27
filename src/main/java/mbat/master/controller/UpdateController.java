package mbat.master.controller;

import mbat.master.dto.UserUpdateDto;
import mbat.master.entity.User;
import mbat.master.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
@CrossOrigin
public class UpdateController {

    @Autowired
    private UserService userService;

    // Diğer endpoint'ler...

//    @PutMapping("/{id}")
//    public ResponseEntity<User> updateProfile(@PathVariable Long id, @RequestBody UserUpdateDto userUpdateDto) {
//        User updatedUser = userService.updateUser(id, userUpdateDto);
//        if (updatedUser == null) {
//            return ResponseEntity.notFound().build();
//        }
//        return ResponseEntity.ok(updatedUser);
//    }
}
