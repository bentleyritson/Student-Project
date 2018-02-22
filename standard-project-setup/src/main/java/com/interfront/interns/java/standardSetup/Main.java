package com.interfront.interns.java.standardSetup;

public class Main {


    public static void main(String[] args) {

        //Instance of the user class to access the variables
        User user = new User();
        System.out.println("Your Details are below:");

        //Only Setting the values for output
        user.setName("Jan");
        user.setSurname("Erasmus");
        user.setTown("Cape Town");
        user.setSuburb("Eersteriver");
        user.setStreetName("Pinetree");
        user.setStreetNo(10);
        user.setEmail("randallerasmus1@gmail.com");
        user.setUniversityAttended("CPUT");
        user.setDegree("National Diploma IT");
        user.setHobbies("Baseball");
        user.setTechnicalSkills("Java,"+"Html,"+"Css,"+"C++");

        //Display details of the User
        System.out.print("Name:");
        System.out.print(user.getName()+" ");
        System.out.println(user.getSurname());
        System.out.println("Your Address:");
        System.out.print(user.getStreetNo()+",");
        System.out.println(user.getStreetName());
        System.out.println(user.getSuburb());
        System.out.println(user.getTown());
        System.out.print("Email:");
        System.out.println(user.getEmail());
        System.out.println(user.getUniversityAttended());
        System.out.println(user.getDegree());
        System.out.println(user.getHobbies());
        System.out.println(user.getTechnicalSkills());
    }
}


