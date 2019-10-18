package exceptions;

/**
 * Created by chrzanekk on 18.10.2019
 */
public class UserShortLengthPasswordException extends Exception {
    public UserShortLengthPasswordException() {

    }

    public UserShortLengthPasswordException(String message) {
        super(message);
    }
}
