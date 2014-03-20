/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2013 Joachim Grüneis
 * mailto:grueneis@spengergasse.at
 */
package rest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.AnnotationConfigWebContextLoader;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

import timetable.rest.RestApplicationConfig;

import javax.annotation.Resource;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

/**
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(loader = AnnotationConfigWebContextLoader.class, classes = RestApplicationConfig.class)
@WebAppConfiguration
public class KaffeeApiTest {

    @Resource
    private WebApplicationContext webApplicationContext;

    @Test
    public void readFromEmptyListOfTeachers() throws Exception {

        MockMvc mockMvc = webAppContextSetup(webApplicationContext).build();

        mockMvc.
                perform(get("/kaffee")).
                andExpect(status().isOk());
    }

    @Test
    public void insertNewTeacher() throws Exception {

        MockMvc mockMvc = webAppContextSetup(webApplicationContext).build();

        mockMvc.
                perform(
                        post("/kaffee").
                                contentType(MediaType.APPLICATION_JSON).
                                content("{\"name\":\"Eduschokaffee\",\"preis\":\"20\",\"menge\":\"2\",\"herkunft\":\"Wien\",\"art\":\"Bohnenkaffee\",\"Alter Kaffebohne\":\"20 Jahre\"}")).
                andExpect(status().isCreated());
    }
}
