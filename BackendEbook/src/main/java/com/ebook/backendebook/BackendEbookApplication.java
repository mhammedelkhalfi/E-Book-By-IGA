package com.ebook.backendebook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class BackendEbookApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackendEbookApplication.class, args);
    }

}
