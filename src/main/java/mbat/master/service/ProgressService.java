package mbat.master.service;

import jakarta.persistence.EntityNotFoundException;
import mbat.master.dto.CourseProgressDto;
import mbat.master.entity.User;
import mbat.master.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Optional;

@Service
public class ProgressService {

    private final UserRepository userRepository;

    public ProgressService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void updateUnitStatus(String username, int unitNumber, boolean status) {
        Optional<User> userOptional = userRepository.findByUsername(username);
        if (userOptional.isPresent()) {
            User user = userOptional.get();
            switch (unitNumber) {
                case 1:
                    user.setUnitStatus1(status);
                    break;
                case 2:
                    user.setUnitStatus2(status);
                    break;
                case 3:
                    user.setUnitStatus3(status);
                    break;
                case 4:
                    user.setUnitStatus4(status);
                    break;
                case 5:
                    user.setUnitStatus5(status);
                    break;
                case 6:
                    user.setUnitStatus6(status);
                    break;
                case 7:
                    user.setUnitStatus7(status);
                    break;
                case 8:
                    user.setUnitStatus8(status);
                    break;
                case 9:
                    user.setUnitStatus9(status);
                    break;
                case 10:
                    user.setUnitStatus10(status);
                    break;
                case 11:
                    user.setUnitStatus11(status);
                    break;
                case 12:
                    user.setUnitStatus12(status);
                    break;
                case 13:
                    user.setUnitStatus13(status);
                    break;
                default:
                    throw new IllegalArgumentException("Invalid unit number: " + unitNumber);
            }
            userRepository.save(user);
        } else {
            throw new EntityNotFoundException("User not found with username: " + username);
        }
    }

    public CourseProgressDto getUserCourseProgress(String username) {
        Optional<User> userOptional = userRepository.findByUsername(username);
        if (userOptional.isPresent()) {
            User user = userOptional.get();
            int course1Progress = (int) (Arrays.asList(user.getUnitStatus1(), user.getUnitStatus2(), user.getUnitStatus3())
                    .stream().filter(Boolean::booleanValue).count() * 100.0 / 3);
            int course2Progress = (int) (Arrays.asList(user.getUnitStatus4(), user.getUnitStatus5(), user.getUnitStatus6(), user.getUnitStatus7(), user.getUnitStatus8(), user.getUnitStatus9())
                    .stream().filter(Boolean::booleanValue).count() * 100.0 / 6);
            int course3Progress = (int) (Arrays.asList(user.getUnitStatus10(), user.getUnitStatus11(), user.getUnitStatus12(), user.getUnitStatus13())
                    .stream().filter(Boolean::booleanValue).count() * 100.0 / 4);

            return new CourseProgressDto(course1Progress, course2Progress, course3Progress);
        }
        throw new EntityNotFoundException("User not found with username: " + username);
    }
}
