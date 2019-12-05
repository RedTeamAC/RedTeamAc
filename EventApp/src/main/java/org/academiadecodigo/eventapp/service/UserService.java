package org.academiadecodigo.eventapp.service;

import org.academiadecodigo.eventapp.model.User;

import java.util.List;

public interface UserService {

    User get(Integer id);

    List<User> findAll();

    User save(User user);

    void delete(Integer id);

    User findByEmail(String email);
}
