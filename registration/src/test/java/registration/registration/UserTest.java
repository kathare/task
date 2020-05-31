package registration.registration;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;
import registration.registration.Model.User;
import registration.registration.Repository.UserRepository;
import registration.registration.Service.UserService;

import static org.junit.Assert.assertNotNull;


@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class UserTest {
    @Autowired
    private UserRepository userRepository;

    @Test
    @Rollback(false)
    public void testAddUser(){
        User user = new User(29596642, "Janet", "Karea");
        User saveUser = userRepository.save(user);

        assertNotNull(saveUser);
    }
}