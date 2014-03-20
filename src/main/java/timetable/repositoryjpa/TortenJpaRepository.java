/*
 * Jumio Inc.
 *
 * Copyright (C) 2010 - 2011
 * All rights reserved.
 */
package timetable.repositoryjpa;

import timetable.domain.Torte;
import java.util.List;
import javax.persistence.EntityManager;


import org.springframework.stereotype.Repository;


@Repository
public class TortenJpaRepository extends AbstractJpaRepository<Torte> {

    @Override
    public List<Torte> findAll() {
        return entityManager().createQuery("SELECT tt FROM Torte tt", Torte.class).getResultList();
    }

    @Override
    public Torte findById(Long id) {
        return entityManager().find(Torte.class, id);
    }
}
//subject