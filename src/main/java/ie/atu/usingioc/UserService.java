package ie.atu.usingioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserService {
    public String registerUser(String name,String email){
        return "Hello, " + name + " welcome to the platform";
    }

    public String registerUser(User user){
        String message = "Hello, " + user.getName() + " welcome to the platform";
        return message;
    }
}
