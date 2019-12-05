package org.academiadecodigo.eventapp.dao.jpa;

import org.academiadecodigo.eventapp.dao.UserDao;
import org.academiadecodigo.eventapp.model.User;
import org.springframework.stereotype.Repository;

@Repository
public class JpaUserDao extends GenericJpaDao<User> implements UserDao {

    public JpaUserDao() {
        super(User.class);
    }

}
