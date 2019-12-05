package org.academiadecodigo.eventapp.service;

import org.academiadecodigo.eventapp.model.User;

import java.util.List;

public interface UserService {

    User get(Integer id);

    List<User> findAll();

    void save(User user);

    void delete(Integer id);
}
