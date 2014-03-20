/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014 Joachim Grüneis
 * mailto:grueneis@spengergasse.at
 */
package timetable.webapp;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;

/**
 *
 */
public class HelloWorldPage extends WebPage {
    public HelloWorldPage() {
        super();
        add(new Label("Erik Schwienbacher", "Spengergasse"));
    }
}
