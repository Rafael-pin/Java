/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.qi.edu.model;

import java.awt.Frame;
import javax.swing.JFrame;

/**
 *
 * @author Rafael Pinheiro
 * @since 29/05/2019
 * @version 1.0 Beta
 */
public class Person {
    
    private String name;
    private String lastName;
    private boolean isEmployeee;
    private int age;

    public Person() {
    }

    /**
     * 
     * @param name get and set Person's name
     * @param lastName get and set Person's last name
     * @param isEmployeee indicates whether Person is empoyee or not
     * @param age get and set Person's age
     */
    public Person(String name, String lastName, boolean isEmployeee, int age) {
        this.name = name;
        this.lastName = lastName;
        this.isEmployeee = isEmployeee;
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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isIsEmployeee() {
        return isEmployeee;
    }

    public void setIsEmployeee(boolean isEmployeee) {
        this.isEmployeee = isEmployeee;
    }
    
    public String checkIfIsEmployee(){
        return (isEmployeee) ? "É um funcionário" : "Não é um funcionário";
    }

    @Override
    public String toString() {
        return "\nNome: " + this.name + " " + this.lastName +
               "\nIdade: " + this.age +
               "\n" + checkIfIsEmployee();
    }
    
    
}
