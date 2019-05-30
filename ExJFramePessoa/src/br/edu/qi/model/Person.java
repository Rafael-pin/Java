/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.qi.model;

/**
 *
 * @author Rafael
 * @since 20/05/2019- 13:44
 * @version 1.0 Beta
 */
public class Person {
    
    private String name;
    private int age;
    private double weight;

    public Person() {
    }
    
    /**
     * 
     * @param name Get Person's name
     * @param age Get Person's age
     * @param wight Get Person's weight
     */
    public Person(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
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
    
    /**
     * 
     * @return Calculate age in months
     */
    public int calculateAgeInMonths( ){
        return this.age*12;
    }

    @Override
    public String toString() {
        return "Name: " + name + 
               "\nAge: " + age + 
               "\nWeight: " + weight +
               "\nAge in months: " + calculateAgeInMonths();
    }
}//close class
