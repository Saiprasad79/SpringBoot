package com.example.demo.repository;

import java.util.List;

import javax.persistence.Id;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.bo.Student;

@Repository
public interface BaseRepository<T> extends JpaRepository<Student,Id>{

    List<Student> findAll();

    T findById(int id);

    //you may add any other required method
}
