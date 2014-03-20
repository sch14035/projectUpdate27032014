/*
 * Jumio Inc.
 *
 * Copyright (C) 2010 - 2011
 * All rights reserved.
 */
package timetable.repositoryjpa;

import timetable.domain.BasePersistable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import timetable.repositoryjpa.JpaRepository;
 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class AbstractJpaRepository<T extends BasePersistable> implements JpaRepository {

    protected final Logger logger = LoggerFactory.getLogger(getClass());

    @PersistenceContext
    private EntityManager entityManager;

    public AbstractJpaRepository() {}

    protected EntityManager entityManager() {
        return entityManager;
    }

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public abstract List<T> findAll();

    public abstract T findById(Long id);

    public void persist(T entity) {
        entityManager.persist(entity);
    }
}
