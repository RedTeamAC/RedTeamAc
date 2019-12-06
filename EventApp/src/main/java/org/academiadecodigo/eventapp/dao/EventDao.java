package org.academiadecodigo.eventapp.dao;

import org.academiadecodigo.eventapp.model.Event;

import java.util.List;

public interface EventDao extends Dao<Event> {
    List<Event> findByLocation(Integer locationId);
}
