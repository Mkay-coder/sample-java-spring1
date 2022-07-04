package com.example.demo3.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args ->{
            Student moses = new Student(
                    "Moses",
                    "moses.karanja@gmail.com",
                    LocalDate.of(1997, MAY, 12)
            );
            Student karanja = new Student(
                    "Karanja",
                    "karanja.moses@gmail.com",
                    LocalDate.of(1995, JUNE, 12)
            );

            //saving to db

            repository.saveAll(List.of(moses, karanja));
        };
    }
}
