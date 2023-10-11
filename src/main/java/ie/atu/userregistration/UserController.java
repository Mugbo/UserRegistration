package ie.atu.userregistration;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    private UserService userService;

    @Autowired
    public void setUserService(UserService userService){
        this.userService = userService;
    }

    @GetMapping("/registerUser/{name}/{email}")
    public String getUserInformation(@PathVariable("name") String name, @PathVariable("email") String email){
        return userService.UserInfo(name, email);
    }
}
