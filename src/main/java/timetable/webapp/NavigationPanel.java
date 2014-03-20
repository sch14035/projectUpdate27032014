/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014 Joachim Grüneis
 * mailto:grueneis@spengergasse.at
 */
package timetable.webapp;

import timetable.webapp.kaffee.KaffeePage;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.markup.html.panel.Panel;

/**
 *
 */
public class NavigationPanel extends Panel {
    public NavigationPanel(String id) {
        super(id);
        add(new Link("navigateHelloWorld") {
            @Override
            public void onClick() {
                setResponsePage(HelloWorldPage.class);
            }
        });
        add(new Link("navigateKaffee") {
            @Override
            public void onClick() {
                setResponsePage(KaffeePage.class);
            }
        });
    }
}