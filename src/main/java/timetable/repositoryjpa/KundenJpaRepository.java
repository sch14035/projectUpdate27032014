/*
 * Jumio Inc.
 *
 * Copyright (C) 2010 - 2011
 * All rights reserved.
 */
package timetable.repositoryjpa;

import timetable.domain.Kunde;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class KundenJpaRepository extends AbstractJpaRepository<Kunde> {
    @Autowired
    private KundenJpaRepository teacherJpaRepository;

    public List<Kunde> findAll() {
        return entityManager().createQuery("SELECT kd FROM Kunde kd", Kunde.class).getResultList();
    }

    public Kunde findById(Long id) {
        return entityManager().find(Kunde.class, id);
    }
}
//Classroom