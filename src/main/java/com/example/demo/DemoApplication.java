package com.example.demo;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.bo.Lecturer;
import com.example.demo.bo.Student;
import com.example.demo.bo.Subject;
import com.example.demo.repository.LecturerRepository;
import com.example.demo.repository.StudentRepository;
import com.example.demo.repository.SubjectRepository;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    
    
    @Bean
    public CommandLineRunner mappingDemo(StudentRepository studRepository,
                                         SubjectRepository subjectRepository,
                                         LecturerRepository lecturerRepository) {
        return args -> {

           
            @SuppressWarnings("unchecked")
			Student student = new Student(101, "John Doe");

            
            studRepository.save(student);
          
            subjectRepository.save(new Subject(101, "history", 50));
            lecturerRepository.save(new Lecturer(101,"John Doe", 12));
           /* subjectRepository.save(new Subject(2, "english", 50));
            subjectRepository.save(new Subject(3, "science", 50));*/
          
        };
    }

}
