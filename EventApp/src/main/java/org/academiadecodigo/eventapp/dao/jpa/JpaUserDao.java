package org.academiadecodigo.eventapp.dao.jpa;

import org.academiadecodigo.eventapp.dao.UserDao;
import org.academiadecodigo.eventapp.model.User;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

@Repository
public class JpaUserDao extends GenericJpaDao<User> implements UserDao {

    public JpaUserDao() {
        super(User.class);
    }

    public User findByEmail(String email){

        CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<User> criteriaQuery = builder.createQuery(modelType);
        Root<User> root = criteriaQuery.from(modelType);
        criteriaQuery.select(root);
        criteriaQuery.where(builder.equal(root.get("email"), email));

        return em.createQuery(criteriaQuery).getSingleResult();

    }

}
