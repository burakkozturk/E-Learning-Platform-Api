package mbat.master.service;



import jakarta.persistence.EntityNotFoundException;
import mbat.master.dto.CreateUserRequest;
import mbat.master.dto.UserUpdateDto;
import mbat.master.entity.Status;
import mbat.master.entity.User;
import mbat.master.repository.StatusRepository;
import mbat.master.repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService implements UserDetailsService {

    private final UserRepository userRepository;
    private final BCryptPasswordEncoder passwordEncoder;
    private final StatusRepository statusRepository;

    public UserService(UserRepository userRepository, BCryptPasswordEncoder passwordEncoder, StatusRepository statusRepository) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
        this.statusRepository = statusRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Optional<User> user = userRepository.findByUsername(username);
        return user.orElseThrow(EntityNotFoundException::new);
    }

    public Optional<User> getByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    public User createUser(CreateUserRequest request) {

        // Kullanıcı nesnesi oluşturuluyor
        User newUser = User.builder()
                .name(request.name())
                .username(request.username())
                .password(passwordEncoder.encode(request.password()))
                .authorities(request.authorities())
                .accountNonExpired(true)
                .credentialsNonExpired(true)
                .isEnabled(true)
                .accountNonLocked(true)
                .build();

        // Kullanıcı veritabanına kaydediliyor
        User savedUser = userRepository.save(newUser);

        // Status nesnesi oluşturuluyor ve başlangıç değerleri atanıyor
        Status newStatus = new Status();
        newStatus.setUser(savedUser); // Oluşturulan kullanıcıyı Status'a atayın
        newStatus.setU1(0);
        newStatus.setU2(0);
        newStatus.setU3(0);
        newStatus.setU4(0);
        newStatus.setU5(0);
        newStatus.setU6(0);
        newStatus.setU7(0);
        newStatus.setU8(0);
        newStatus.setU9(0);
        newStatus.setU10(0);
        newStatus.setU11(0);
        newStatus.setU12(0);
        newStatus.setU13(0);
        newStatus.setC1(0);
        newStatus.setC2(0);
        newStatus.setC3(0);
        // Diğer alanlar için de benzer atamalar yapılabilir

        // Status nesnesi veritabanına kaydediliyor
        statusRepository.save(newStatus);

        // Kullanıcı nesnesi geri döndürülüyor
        return savedUser;
    }


    public User updateUser(Long id, UserUpdateDto userUpdateDto) {
        Optional<User> userOptional = userRepository.findById(id);
        if (userOptional.isPresent()) {
            User user = userOptional.get();
            user.setName(userUpdateDto.getName());
            user.setUsername(userUpdateDto.getUsername());
            // Şifre güncellenirken şifrelemeyi unutmayın
            user.setPassword(userUpdateDto.getPassword());
            return userRepository.save(user);
        }
        return null;
    }


}