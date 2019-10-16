package api;

import entity.User;

import java.util.List;

/**
 * Created by chrzanekk on 16.10.2019
 */
public interface UserDao {
    void saveUser(User user);
    void saveUsers(List<User> users);
    void removeUserByLogin(String login);
    void removeUserById(Long userId);
    List<User> getAllUsers();
    User getUserByLogin(String login);
    User GetUserById(Long userId);

}
