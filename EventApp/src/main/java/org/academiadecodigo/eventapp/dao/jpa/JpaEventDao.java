package org.academiadecodigo.eventapp.dao.jpa;

import org.academiadecodigo.eventapp.model.Event;
import org.springframework.stereotype.Repository;

@Repository
public class JpaEventDao extends GenerigJpaDao {

    public JpaEventDao() {
        super(Event.class);
    }
}
