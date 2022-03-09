package com.tehrany.demoboot.model.repository;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class BaseRepo<T, I extends Number> {
    @PersistenceContext
    private EntityManager entityManager;

    public void insert(T t) {
        entityManager.persist(t);
    }

    public void update(T t) {
        entityManager.merge(t);
    }

    public T selectOne(Class aClass, I id) {
        return (T) entityManager.find(aClass, id);
    }

    public List<T> selectAll(Class aClass) {
        return entityManager.createQuery("SELECT o FROM " + aClass.getSimpleName() + " o").getResultList();
    }
}
