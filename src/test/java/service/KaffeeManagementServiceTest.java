/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2013 Joachim Grüneis
 * mailto:grueneis@spengergasse.at
 */
package service;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import timetable.service.KaffeeManagementService;

@ContextConfiguration(classes = ServiceTestConfiguration.class)
public class KaffeeManagementServiceTest extends AbstractJUnit4SpringContextTests {

    @Autowired
    KaffeeManagementService kaffeeManagementService;

    @Test
    public void aTest() {
        Assert.assertNotNull(kaffeeManagementService);
    }
}
