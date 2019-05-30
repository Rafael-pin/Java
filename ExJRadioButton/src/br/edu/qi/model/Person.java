/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.qi.model;

import java.util.ArrayList;

/**
 *
 * @author Rafael Pinheiro
 * @version 1.0 Beta
 * @since 22/05/2019 - 13:45
 */
public class Person {
    
    private String name;
    private int age;
    private String gender;
    private ArrayList<String> preferences;

    public Person() {
    }

    /**
     * 
     * @param name get and set person's name
     * @param age get and set person's age
     * @param gender get and set person's gender
     * @param preferences get and set person's preferences
     */
    

    public Person(String name, int age, String gender, ArrayList<String> preferences) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.preferences = preferences;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ArrayList<String> getPreferences() {
        return preferences;
    }

    public void setPreferences(ArrayList<String> preferences) {
        this.preferences = preferences;
    }
    
    /**
     * 
     * @return A string based on gender
     */
    public String checkGender() {
        if (gender.equalsIgnoreCase("Masculino")) 
            return "Você é homem!";
        return "Você é mulher!";
    } 
    
    @Override
    public String toString() {
        return "\nName: " + name + 
               "\nAge: " + age + 
               "\nGender: " + gender +
               "\nPreferences: " + preferences;
    }
    
    
    
}//close class
