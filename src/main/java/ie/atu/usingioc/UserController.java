package ie.atu.usingioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService us){
        this.userService = us;
    }

    @GetMapping("/registerUser/{name}/{email}")
    public String getUser(@PathVariable String name,@PathVariable String email){
        return userService.registerUser(name,email);
    }
}
