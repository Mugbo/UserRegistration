package ie.atu.userregistration;

import lombok.Data;
import org.springframework.stereotype.Service;


@Data
@Service
public class UserService {

    public String UserInfo(String name, String email){

        return "Name: " + name + " Email: " + email;
    }

    public String UserInfoJSON(UserDetails user){
        return "Congratulations " + user.getName() + " you have successfully registered using the email: " + user.getEmail();
    }
}
