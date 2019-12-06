package org.academiadecodigo.eventapp.dao.jpa;

import org.academiadecodigo.eventapp.dao.EventDao;
import org.academiadecodigo.eventapp.model.Event;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

@Repository
public class JpaEventDao extends GenericJpaDao<Event> implements EventDao {

    public JpaEventDao() {
        super(Event.class);
    }

    @Override
    public List<Event> findByLocation(Integer locationId) {


        CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<Event> criteriaQuery = builder.createQuery(modelType);
        Root<Event> root = criteriaQuery.from(modelType);
        criteriaQuery.select(root);
        criteriaQuery.where(builder.equal(root.get("location"), locationId));

        return em.createQuery(criteriaQuery).getResultList();

    }
}
