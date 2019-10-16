package entity;

/**
 * Created by chrzanekk on 16.10.2019
 */
public class UserParser {
    public static User stringToUser(String readLine) {
        String [] userInformation = readLine.split(User.USER_SEPARATOR);

        Long userId = Long.parseLong(userInformation[0]);
        String login = userInformation[1];
        String password = userInformation[2];

        return new User(userId, login, password);
    }
}
