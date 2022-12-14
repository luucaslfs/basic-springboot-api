package com.jacapromo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(CustomerRepository repository) {

        return args -> {
            log.info("Preloading " + repository.save(new Customer("Bilbo Bolseiro", "bilbo@bolseiro.com", 87)));
            log.info("Preloading " + repository.save(new Customer("Pato Donald", "donald@duck.com", 90)));
        };
    }
}
