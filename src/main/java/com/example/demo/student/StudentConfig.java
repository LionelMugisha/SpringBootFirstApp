package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student student1 = new Student(
                    "Sanchez Santos",
                    "sanches.santos@gmail.com",
                    LocalDate.of(1999, Month.FEBRUARY,15)
            );
            Student student2 = new Student(
                    "Leonel Messi",
                    "leonel.messi@gmail.com",
                    LocalDate.of(1989, Month.AUGUST,15)
            );
            repository.saveAll(
                    List.of(student1,student2));
        };
    }

}
