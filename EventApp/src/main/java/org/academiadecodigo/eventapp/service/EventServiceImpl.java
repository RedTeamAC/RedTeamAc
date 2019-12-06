package org.academiadecodigo.eventapp.service;

import org.academiadecodigo.eventapp.dao.EventDao;
import org.academiadecodigo.eventapp.model.Event;
import org.academiadecodigo.eventapp.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EventServiceImpl implements EventService {

    private EventDao eventDao;

    @Autowired
    public void setEventDao(EventDao eventDao) {
        this.eventDao = eventDao;
    }

    @Override
    public Event get(Integer id) {
        return eventDao.findById(id);
    }

    @Override
    public List<Event> findAll() {
        return eventDao.findAll();
    }

    @Override
    @Transactional
    public Event save(Event event) {
        return eventDao.saveOrUpdate(event);
    }

    @Override
    @Transactional
    public void delete(Integer id) {

    }

    @Transactional
    public void test(User user, Integer id) {
        Event event = eventDao.findById(id);
        event.getUserList().add(user);

        eventDao.saveOrUpdate(event);
    }
}
