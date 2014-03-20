/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014 Joachim Grüneis
 * mailto:grueneis@spengergasse.at
 */
package timetable.webapp.kaffee;

import timetable.webapp.ContentPanel;

/**
 *
 */
public class KaffeePanel extends ContentPanel {
    public KaffeePanel(String id) {
        super(id);
        add(new KaffeeForm("kaffeeForm"));
    }
}
