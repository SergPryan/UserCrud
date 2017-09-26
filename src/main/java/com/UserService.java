package com;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class UserService {

    @PersistenceContext
    private EntityManager entityManager;

    public void create(User user){
         entityManager.persist(user);
    }

    public void delete(Long id){
        User user = entityManager.find(User.class,id);
        entityManager.remove(user);
    }

}
