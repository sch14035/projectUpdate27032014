/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014 Joachim Grüneis
 * mailto:grueneis@spengergasse.at
 */
package timetable.webapp.kaffee;

import timetable.domain.Kaffee;
import timetable.repository.KaffeeRepository;
import org.apache.wicket.markup.html.form.Form;

import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.spring.injection.annot.SpringBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



/**
 *
 */
@SuppressWarnings("serial")
public class KaffeeForm extends Form<Kaffee> {
    protected final Logger logger = LoggerFactory.getLogger(getClass());

    @SpringBean
    private KaffeeRepository kaffeeRepository;

    public KaffeeForm(String id) {
        super(id, new CompoundPropertyModel<Kaffee>(new Kaffee("EduschoKaffee",20.0f,"2","Wien","Bohnenkaffee",10.3f)));
        
    }

    @Override
    public final void onSubmit() {
        Kaffee kaffee = getModelObject();
        kaffeeRepository.save(kaffee);
        logger.error("Kaffee after save: " + kaffee);
    }
}
