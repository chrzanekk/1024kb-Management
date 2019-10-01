package service;

import entity.User;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chrzanekk on 01.10.2019
 */
public class UserServiceTest {
    @Test
    public void testGetAllUsers() {
        //is
        List<User> users = new ArrayList<User>();
        users.add(new User(1L, "admin", "admin"));
        users.add(new User(2L, "kondzio", "elorapy"));

        //then
        UserServiceImpl userService = new UserServiceImpl(users);
        List<User> usersFromTestClass = userService.getAllUsers();

        //expected
        Assert.assertEquals(users, usersFromTestClass);
    }

    @Test
    public void testAddUser() {
        //is
        List<User> users = new ArrayList<User>();
        User user = new User(1L, "admin", "admin");
        users.add(user);

        //then
        UserServiceImpl userService = new UserServiceImpl();
        userService.addUser(user);
        List<User> usersFromTestClass = userService.getAllUsers();

        //expected
        Assert.assertEquals(users, usersFromTestClass);
    }

    @Test
    public void testRemoveUser() {
        //is
        List<User> users = new ArrayList<User>();
        User admin = new User(1L, "admin", "admin");
        User kondzio = new User(2L, "kondzio", "admin");
        users.add(admin);
        users.add(kondzio);

        //then
        UserServiceImpl userService = new UserServiceImpl(users);
        userService.removeUserById(1L);
        users.remove(admin);
        List<User> usersFromTestClass = userService.getAllUsers();

        //expected
        Assert.assertEquals(users, usersFromTestClass);


    }
}
