package Day37.Main;

import java.time.LocalDateTime;

public class UserService {
    private UserRepository userRepository;
    
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    
    public User registerUser(User user) {
        user.setRegistrationDate(LocalDateTime.now());
        return userRepository.save(user);
    }
}