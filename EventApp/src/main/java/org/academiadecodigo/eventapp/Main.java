package org.academiadecodigo.eventapp;

import org.academiadecodigo.eventapp.dao.UserDao;
import org.academiadecodigo.eventapp.dao.jpa.JpaUserDao;
import org.academiadecodigo.eventapp.model.User;
import org.academiadecodigo.eventapp.service.UserService;
import org.academiadecodigo.eventapp.service.UserServiceImpl;

public class Main {

    public static void main(String[] args) {

        UserService userService = new UserServiceImpl();
        UserDao userDao = new JpaUserDao();
        ((UserServiceImpl) userService).setUserDao(userDao);
        User user = new User();


        user.setName("asd");
        user.setLocation("sadsad");
        user.setContact("asdasd");
        user.setEmail("asdasd");
        user.setPassword("adasd");

        userService.save(user);
    }

}
