package com.example.demo.bo;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="subject")
public class Subject {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String subjectName;
    private int mark;
   
   
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "Id",nullable=false,insertable=false,updatable=false )
    private Student student;
    
    public Subject(int id, String subjectName, int mark) {
        this.id = id;
        this.subjectName = subjectName;
        this.mark = mark;
    }

    public Subject()
    {
    	
    }

	public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }
    
    @Override
	public String toString() {
		return "Subject [id=" + id + ", subjectName=" + subjectName + ", mark=" + mark + "]";
	}
}
