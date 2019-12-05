package org.academiadecodigo.eventapp.service;

import org.academiadecodigo.eventapp.dao.UserDao;
import org.academiadecodigo.eventapp.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    @Autowired
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public User get(Integer id) {
        return userDao.findById(id);
    }

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    @Transactional
    public User save(User user) {
        return userDao.saveOrUpdate(user);
    }

    @Override
    @Transactional
    public void delete(Integer id) {
        userDao.delete(id);
    }
}
