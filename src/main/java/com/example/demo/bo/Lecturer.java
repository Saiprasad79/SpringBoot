package com.example.demo.bo;

public class Lecturer {

    private int id;
    private String fullName;
    private int experienceInYears;

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
