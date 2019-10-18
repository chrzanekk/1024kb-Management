package dao;

import api.UserDao;
import entity.User;
import entity.UserParser;
import utils.FileUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by chrzanekk on 16.10.2019
 */
public class UserDaoImpl implements UserDao {

    private static final String fileName = "user.data";
    private static UserDaoImpl instance = null;

    private UserDaoImpl() {
        try {
            FileUtils.createNewFile(fileName);
        }
        catch (IOException e) {
            System.out.println("Error in file patch.");
            System.exit(-1);
        }
    }

    public static UserDaoImpl getInstance() {
        if (instance == null) {
            instance = new UserDaoImpl();
        }
        return instance;
    }


    public List<User> getAllUsers() throws IOException{
        List<User> users = new ArrayList<User>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
        String readLine = bufferedReader.readLine();
        while (readLine != null) {
            User user = UserParser.stringToUser(readLine);
            if (user != null) {
                users.add(user);
            }
            readLine = bufferedReader.readLine();
        }
        bufferedReader.close();

        return users;
    }

    public void saveUsers(List<User> users) throws FileNotFoundException{
        FileUtils.clearFile(fileName);
        PrintWriter printWriter = new PrintWriter(new FileOutputStream(fileName,true));
        for (User user : users) {
            printWriter.write(user.toString() + "\n");
        }
        printWriter.close();
    }

    public void saveUser(User user) throws IOException{
        List<User> users = getAllUsers();
        users.add(user);
        saveUsers(users);
    }

    public User getUserByLogin(String login) throws IOException {
        List<User> users = getAllUsers();
        for (User user : users) {
            boolean isFoundUser = user.getLogin().equals(login);
            if (isFoundUser) {
                return user;
            }
        }
        return null;
    }

    public User getUserById(Long userId) throws IOException {
        List<User> users = getAllUsers();
        for (User user : users) {
            boolean isFoundUserId = user.getId().equals(userId);
            if (isFoundUserId) {
                return user;
            }
        }
        return null;
    }

    public void removeUserById(Long userId) throws IOException {
        List<User> users = getAllUsers();
        for (int i = 0; i <users.size(); i++) {
            boolean isFoundUser = users.get(i).getId().equals(userId);
            if (isFoundUser) {
                users.remove(i);
            }
        }
        saveUsers(users);
    }

    public void removeUserByLogin(String login) throws IOException {
        List<User> users = getAllUsers();
        for (int i = 0; i < users.size(); i++) {
            boolean isFoundUser = users.get(i).getLogin().equals(login);
            if (isFoundUser) {
                users.remove(i);
            }
        }
        saveUsers(users);
    }



}
