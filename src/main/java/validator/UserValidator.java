package validator;

import api.UserDao;
import dao.UserDaoImpl;
import entity.User;
import exceptions.UserLoginAlreadyExistException;
import exceptions.UserShortLengthException;
import exceptions.UserShortLengthPasswordException;
import service.UserServiceImpl;

import java.io.IOException;

/**
 * Created by chrzanekk on 18.10.2019
 */
public class UserValidator {

    private final int MIN_PASSWORD_LENGTH = 6;
    private final int MIN_LOGIN_LENGTH = 4;

    private static UserValidator instance = null;
    private UserDao userDao = UserDaoImpl.getInstance();

    private UserValidator(){
    }

    public static UserValidator getInstance() {
        if (instance == null) {
            instance = new UserValidator();
        }
        return instance;
    }

    public boolean isValidate(User user) throws UserLoginAlreadyExistException, UserShortLengthException, UserShortLengthPasswordException {
        if (isPasswordLengthEnough((user.getPassword())))
            throw new UserShortLengthPasswordException("Password is too short.");

        if (isLoginLengthEnough(user.getLogin()))
            throw new UserShortLengthException("Login is too short.");

        if (isLoginExists(user.getLogin()))
            throw new UserLoginAlreadyExistException("User with this login already exists.");

        return true;
    }

    private boolean isPasswordLengthEnough(String password) {
        return password.length() >= MIN_PASSWORD_LENGTH;
    }

    private boolean isLoginLengthEnough(String login) {
        return login.length() >= MIN_LOGIN_LENGTH;
    }

    private boolean isLoginExists(String login) {
        User user = null;
        try {
            user = userDao.getUserByLogin(login);
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        if (user == null) {
            return false;
        }
        return true;
    }

}
