package api;

import entity.User;
import exceptions.UserLoginAlreadyExistException;
import exceptions.UserShortLengthException;
import exceptions.UserShortLengthPasswordException;

import java.io.IOException;
import java.util.List;

/**
 * Created by chrzanekk on 01.10.2019
 */
public interface UserService {
    List<User> getAllUsers() throws IOException;
    void addUser(User user) throws IOException, UserShortLengthPasswordException, UserShortLengthException, UserLoginAlreadyExistException;
    void removeUserById(Long userId) throws IOException;

}
