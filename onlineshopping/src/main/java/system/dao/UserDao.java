package system.dao;

import org.springframework.stereotype.Repository;
import system.model.User;


import java.util.Arrays;
import java.util.List;

@Repository
public class UserDao {
    private List<User> users = Arrays.asList(new User("admin", "admin"),
            new User("user", "12345"));
    public List<User> getAllUsers(){
        return users;
    }
}
