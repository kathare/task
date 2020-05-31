package registration.registration.Controller;

import registration.registration.Model.User;
import registration.registration.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import registration.registration.Service.UserService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Users")
public class Controller {

    @Autowired
    private UserService userService;

    @PostMapping("/addUsers")
    public User addUser (@RequestBody  User user){
       return userService.save(user);

    }

    @GetMapping("/getUsers/{id}")
    public Optional<User> getAllUsers(@PathVariable Integer id){
        return userService.getById(id);
    }

}
