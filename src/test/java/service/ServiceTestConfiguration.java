/*
 * Jumio Inc.
 *
 * Copyright (C) 2010 - 2011
 * All rights reserved.
 */
package service;

import timetable.domain.DomainConfiguration;
import timetable.service.ServiceConfiguration;
import timetable.repository.RepositoryConfiguration;
import timetable.repositoryjpa.RepositoryJpaConfiguration;
import timetable.servicejpa.ServiceJpaConfiguration;
import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

/**
 * To combine all configurations from main that are required to execute test on layer of service. Additionally H2
 * database is used as datasource at testing.
 */
@Configuration
@Import({DomainConfiguration.class, RepositoryConfiguration.class, ServiceConfiguration.class})
public class ServiceTestConfiguration {

    @Bean
    public DataSource dataSource() {
        return new EmbeddedDatabaseBuilder().setType(EmbeddedDatabaseType.H2).build();
    }
}
