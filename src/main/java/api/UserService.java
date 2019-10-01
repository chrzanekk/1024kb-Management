package api;

import entity.User;

import java.util.List;

/**
 * Created by chrzanekk on 01.10.2019
 */
public interface UserService {
    List<User> getAllUsers();
    void addUser(User user);
    void removeUserById(Long userId);

}
