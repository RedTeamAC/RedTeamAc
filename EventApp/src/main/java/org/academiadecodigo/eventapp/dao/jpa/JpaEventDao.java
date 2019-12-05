package org.academiadecodigo.eventapp.dao.jpa;

import org.academiadecodigo.eventapp.dao.EventDao;
import org.academiadecodigo.eventapp.model.Event;
import org.springframework.stereotype.Repository;

@Repository
public class JpaEventDao extends GenericJpaDao<Event> implements EventDao {

    public JpaEventDao() {
        super(Event.class);
    }
}
