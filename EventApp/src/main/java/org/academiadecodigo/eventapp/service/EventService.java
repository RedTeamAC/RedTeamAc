package org.academiadecodigo.eventapp.service;

import org.academiadecodigo.eventapp.model.Event;
import org.academiadecodigo.eventapp.model.User;

import java.util.List;

public interface EventService {

    Event get(Integer id);

    List<Event> findAll();

    Event save(Event event);

    void delete(Integer id);

    void test(User user, Integer id);

    List<Event> findByLocation(String location);

}
