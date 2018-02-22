package com.interfront.interns.java.standardSetup;

import org.junit.Test;

import static org.junit.Assert.*;

public class UserTest {

    @Test
    public void getName()
    {
        User user = new User();
        assertEquals("Randall",user.getName());

    }

    @Test
    public void getSurname() {
        User user = new User();
        assertEquals("Blackenberg",user.getSurname());
    }

    @Test
    public void getTown() {
        User user = new User();
        assertEquals("Cape Town",user.getTown());
    }

    @Test
    public void getSuburb() {
        User user = new User();
        assertEquals("Eersteriver",user.getSuburb());
    }

    @Test
    public void getStreetName() {
        User user = new User();
        assertEquals("Pinetree Way",user.getStreetName());
    }

    @Test
    public void getStreetNo() {
        User user = new User();
        assertEquals(100,user.getStreetNo());
    }

    @Test
    public void getEmail() {
        User user = new User();
        assertEquals("randallerasmus1@gmail.com",user.getEmail());
    }

    @Test
    public void getUniversityAttended() {
        User user = new User();
        assertEquals("Cput",user.getUniversityAttended());
    }

    @Test
    public void getDegree() {
        User user = new User();
        assertEquals("National Diploma in IT ",user.getDegree());
    }

    @Test
    public void getHobbies() {
        User user = new User();
        assertEquals("Soccer",user.getHobbies());
    }

    @Test
    public void getTechnicalSkills() {
        User user = new User();
        assertEquals("Hacking with Linux Kali,Port Scanner, Java",user.getTechnicalSkills());
    }
}