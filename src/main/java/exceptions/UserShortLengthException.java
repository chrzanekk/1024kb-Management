package exceptions;

/**
 * Created by chrzanekk on 18.10.2019
 */
public class UserShortLengthException extends Exception {

    public UserShortLengthException() {

    }

    public UserShortLengthException(String message) {
        super(message);
    }
}
