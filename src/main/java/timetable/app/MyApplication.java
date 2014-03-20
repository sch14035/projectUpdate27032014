/*
 * Jumio Inc.
 *
 * Copyright (C) 2010 - 2011
 * All rights reserved.
 */
package timetable.app;

import timetable.repositoryjpa.PersistenceFactory;
import timetable.service.ServiceFactory;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import timetable.app.PersistenceFactoryImpl;
import timetable.app.ServiceFactoryImpl;


/**
 *
 */
public class MyApplication {

    private EntityManagerFactory entityManagerFactory;

    private EntityManager entityManager;

    private PersistenceFactory persistenceFactory;

    private ServiceFactory serviceFactory;

    public MyApplication() {
        entityManagerFactory = Persistence.createEntityManagerFactory("spengergassePU");
        entityManager = entityManagerFactory.createEntityManager();
        persistenceFactory = new PersistenceFactoryImpl(entityManager);
        serviceFactory = new ServiceFactoryImpl(persistenceFactory);
    }

    public void doSomething() {

    }

    public void teardown() {
        if (entityManager != null) {
            entityManager.close();
        }
        if (entityManagerFactory != null) {
            entityManagerFactory.close();
        }
    }

    public static void main(String[] args) {
        MyApplication myApplication = new MyApplication();
        myApplication.doSomething();
        myApplication.teardown();
    }
}
