package org.academiadecodigo.eventapp.dao;

import org.academiadecodigo.eventapp.model.User;

public interface UserDao extends Dao<User> {

    User findByEmail(String email);
}
