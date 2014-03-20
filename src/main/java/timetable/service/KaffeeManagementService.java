/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2013 Joachim Grüneis
 * mailto:grueneis@spengergasse.at
 */
package timetable.service;

import timetable.domain.Kaffee;
import timetable.repository.KaffeeRepository;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * All uses cases for the timetable management.
 */
@Service
public class KaffeeManagementService {

    @Autowired
    private KaffeeRepository kaffeeRepository;

   

    @Transactional
    public void createNewKaffee(String name, float preis, String menge, String herkunft, String art, float alterBohne) {
        // start transaction
        // write audit log
        Kaffee kaffee = new Kaffee(name,preis,menge,herkunft,art,alterBohne);
        kaffeeRepository.save(kaffee);
        // end (commit) transaction
    }
}
