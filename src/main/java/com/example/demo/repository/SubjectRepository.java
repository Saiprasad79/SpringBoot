package com.example.demo.repository;

import javax.persistence.Id;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.bo.Subject;

public interface SubjectRepository extends JpaRepository<Subject,Id>{

}
