package org.academiadecodigo.eventapp.service;

import org.academiadecodigo.eventapp.model.Event;

import java.util.List;

public interface EventService {

    Event get(Integer id);

    List<Event> findAll();

    void save(Event event);

    void delete(Integer id);
}
