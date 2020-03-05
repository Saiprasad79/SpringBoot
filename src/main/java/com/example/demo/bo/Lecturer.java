package com.example.demo.bo;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Lecturer")
public class Lecturer {
    @Id
    private int id;
    private String fullName;
    private int experienceInYears;

   @OneToOne(fetch = FetchType.LAZY, optional = false)
   @JoinColumn(name = "Id", nullable = false,insertable=false,updatable=false)
   private Student student;
    
    
    public Lecturer()
    {
    	
    }
    
    public Lecturer(int id, String fullName, int experienceInYears) {
        this.id = id;
        this.fullName = fullName;
        this.experienceInYears = experienceInYears;
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

    public int getExperienceInYears() {
        return experienceInYears;
    }

    public void setExperienceInYears(int experienceInYears) {
        this.experienceInYears = experienceInYears;
    }
}
