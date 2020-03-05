package com.example.demo.bo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String fullName;

	/*
	 * @OneToMany(fetch = FetchType.LAZY, optional = false)
	 * 
	 * @JoinColumn(name = "post_id", nullable = false) List<Subject>subjectsex;
	 */

	@OneToMany(mappedBy = "student", cascade = { CascadeType.ALL })
	private List<Subject> subjects;

	public Student() {

	}

	public Student(int id, String fullName, List<Subject> subjects) {
		this.id = id;
		this.fullName = fullName;
		this.subjects = subjects;
	}
    
	public Student(int id, String fullName) {
		this.id = id;
		this.fullName = fullName;
		
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public List<Subject> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}
}
