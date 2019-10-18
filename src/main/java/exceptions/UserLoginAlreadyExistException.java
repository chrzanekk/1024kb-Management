package exceptions;

/**
 * Created by chrzanekk on 18.10.2019
 */
public class UserLoginAlreadyExistException extends Exception{

    public UserLoginAlreadyExistException() {

    }

    public UserLoginAlreadyExistException(String message) {
        super(message);
    }
}
