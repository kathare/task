package registration.registration.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import registration.registration.Model.User;
import registration.registration.Repository.UserRepository;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User save(User user){
        return userRepository.save(user);
    }
    public Optional<User> getById(Integer id){
        return userRepository.findById(id);
    }
}
