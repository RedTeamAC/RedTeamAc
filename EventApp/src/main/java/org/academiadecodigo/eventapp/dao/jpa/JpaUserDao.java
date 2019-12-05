package org.academiadecodigo.eventapp.dao.jpa;

import org.academiadecodigo.eventapp.model.User;
import org.springframework.stereotype.Repository;

@Repository
public class JpaUserDao extends GenerigJpaDao{

    public JpaUserDao() {
        super(User.class);
    }

}
