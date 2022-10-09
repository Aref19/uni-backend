package com.example.uniprojektbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;


@ConfigurationPropertiesScan
@EnableScheduling
@SpringBootApplication
@EnableWebSecurity
public class UniProjektBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(UniProjektBackendApplication.class, args);
    }

}
