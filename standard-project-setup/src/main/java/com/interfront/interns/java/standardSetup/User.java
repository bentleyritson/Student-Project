package com.interfront.interns.java.standardSetup;

public class User {

    //private access modifiers
    private String name;
    private String surname;
    private String town;
    private String suburb;
    private String streetName;
    private int streetNo;
    private String email;
    private String universityAttended;
    private String degree;
    private String hobbies;
    private String technicalSkills;

    public String getName() {   return name="Randall";
    }

    public void setName(String name) { this.name=name;
    }

    public String getSurname() {
        return surname = "Erasmus";
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getTown() {
        return town="Cape Town";
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getSuburb() {
        return suburb = "Eersteriver";
    }

    public void setSuburb(String suburb) {
        this.suburb = suburb;
    }

    public String getStreetName() {
        return streetName = "Pinetree Way";
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public int getStreetNo() {
        return streetNo = 8;
    }

    public void setStreetNo(int streetNo) {
        this.streetNo = streetNo;
    }

    public String getEmail() {
        return email = "randallerasmus1@gmail.com";
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUniversityAttended() {
        return universityAttended = "Cape Peninsula University of Technology";
    }

    public void setUniversityAttended(String universityAttended) {
        this.universityAttended = universityAttended;
    }

    public String getDegree() {
        return degree = "National Diploma : Information Technology";
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getHobbies() {
        return hobbies = "Soccer";
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    public String getTechnicalSkills() {
        return technicalSkills = "Hacking with Linux Kali,Port Scanner, Java ";
    }

    public void setTechnicalSkills(String technicalSkills) {
        this.technicalSkills = technicalSkills;
    }


}

