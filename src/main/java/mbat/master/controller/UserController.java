package mbat.master.controller;


import lombok.extern.slf4j.Slf4j;
import mbat.master.dto.AuthRequest;
import mbat.master.dto.CourseProgressDto;
import mbat.master.dto.CreateUserRequest;
import mbat.master.dto.UserProgressDto;
import mbat.master.entity.User;
import mbat.master.repository.UserRepository;
import mbat.master.service.JwtService;
import mbat.master.service.UserService;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@Slf4j
@CrossOrigin
public class UserController {

    private final UserService service;

    private final JwtService jwtService;

    private final AuthenticationManager authenticationManager;
    private final UserRepository userRepository;


    public UserController(UserService service, JwtService jwtService, AuthenticationManager authenticationManager, UserRepository userRepository) {
        this.service = service;
        this.jwtService = jwtService;
        this.authenticationManager = authenticationManager;
        this.userRepository = userRepository;
    }

    @GetMapping("/welcome")
    public String welcome() {
        return "Hello World! this is FOLSDEV";
    }

    @PostMapping("/addNewUser")
    public User addUser(@RequestBody CreateUserRequest request) {
        return service.createUser(request);
    }

    @PostMapping("/generateToken")
    public String generateToken(@RequestBody AuthRequest request) {
        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(request.username(), request.password()));
        if (authentication.isAuthenticated()) {
            return jwtService.generateToken(request.username());
        }
        log.info("invalid username " + request.username());
        throw new UsernameNotFoundException("invalid username {} " + request.username());
    }

//    @GetMapping("/user/{id}/progress")
//    public CourseProgressDto getUserCourseProgress(@PathVariable Long id) {
//        return service.getUserCourseProgress(id);
//    }

    @GetMapping("/user")
    public String getUserString() {
        return "This is USER!";
    }

    @GetMapping("/admin")
    public String getAdminString() {
        return "This is ADMIN!";
    }


}