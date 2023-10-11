package ie.atu.userregistration;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserService {

    public String UserInfo(String name, String email){

        return "Name: " + name + " Email: " + email;
    }
}
