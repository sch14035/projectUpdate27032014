/*
 * Jumio Inc.
 *
 * Copyright (C) 2010 - 2011
 * All rights reserved.
 */
package timetable.repositoryjpa;

import timetable.domain.Kaffee;
import java.util.List;
import javax.persistence.EntityManager;


import org.springframework.stereotype.Repository;


@Repository
public class KaffeeJpaRepository extends AbstractJpaRepository<Kaffee> {

    public List<Kaffee> findAll() {
        return entityManager().createQuery("SELECT kf FROM Kaffee kf", Kaffee.class).getResultList();
    }

    public Kaffee findById(Long id) {
        return entityManager().find(Kaffee.class, id);
    }
}
//SchoolClass