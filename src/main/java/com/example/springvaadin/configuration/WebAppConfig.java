package com.example.springvaadin.configuration;

import org.h2.tools.Server;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

import javax.sql.DataSource;
import java.sql.SQLException;

public class WebAppConfig {
    @Bean
    public DataSource dataSource(
            @Value("${datasource.dbname}") String dbname,
            @Value("${datasource.script}") String script) {

        return new EmbeddedDatabaseBuilder()
                .setType(EmbeddedDatabaseType.H2)
                .setName(dbname)
                .addScript(script)
                .build();
    }

    @Bean(initMethod = "start", destroyMethod = "stop")
    public Server h2Server() throws SQLException {
        return Server.createWebServer(); // порт по умолчанию 8082
    }
}
