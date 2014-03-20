/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014 Joachim Grüneis
 * mailto:grueneis@spengergasse.at
 */
package timetable.webapp;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.panel.Panel;

import java.util.Date;

/**
 *
 */
public class HeaderPanel extends Panel {
    public HeaderPanel(String id) {
        super(id);
        add(new Label("Jetzt:", new Date().toString()));
    }
}