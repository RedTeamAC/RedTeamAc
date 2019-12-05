package org.academiadecodigo.eventapp.dao;

import org.academiadecodigo.eventapp.model.AbstractEntity;

import java.util.List;

public interface Dao<T extends AbstractEntity> {

    List<T> findAll();

    T findById(Integer id);

    T saveOrUpdate(T modelObject);

    void delete(Integer id);
}
