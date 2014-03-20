/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014 Joachim Grüneis
 * mailto:grueneis@spengergasse.at
 */
package timetable.webapp.kaffee;

import timetable.webapp.KaffeeManagementPage;
import org.apache.wicket.Component;

/**
 *
 */
public class KaffeePage extends KaffeeManagementPage {

    protected Component contentPanel() {
        return new KaffeePanel("kaffeePanel");
    }
}
