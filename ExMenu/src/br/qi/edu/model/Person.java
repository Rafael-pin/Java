/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.qi.edu.model;

/**
 *
 * @author Rafael Pinheiro
 * @since 28/05/19 - 13:48
 * @version 1.0 beta
 */
public class Person {
    private String name;
    private int age; 

    public Person() {
    }

    /**
     * 
     * @param name get and set name
     * @param age get and set age
     */
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * 
     * @return calculate age in months (age * 12)
     */
    public int calculateAgeInMonths() {
        return this.age * 12;
    }

    @Override
    public String toString() {
        return "\nNome: " + name
              +"\nIdade: " + age
              +"\nIdade em mêses: " + calculateAgeInMonths();
    }
  
}
