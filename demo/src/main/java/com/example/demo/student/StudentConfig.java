package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.AUGUST;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner (StudentRepo repo){
        return args -> {
            Student saeed = new Student(
                    "Saeed",
                    "Saeed@gmail.com",
                    LocalDate.of(1997, AUGUST, 18));
            Student mariam = new Student(
                    "Mariam",
                    "mariam@gmail.com",
                    LocalDate.of(2000, AUGUST, 5));

            repo.saveAll(
                    List.of(saeed,mariam)
            );
        };

    };
    }