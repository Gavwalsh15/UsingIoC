package ie.atu.usingioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserService {
    public String registerUser(String username, String email){
        return "Hello, " + username + " welcome to the platform";
    }
}
