/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.qi.model;

import java.util.ArrayList;

/**
 *
 * @author Rafael & Carlos
 * @since 19/23/05 - 01:46pm
 * @version 1.0 Beta
 */
public class Student {
    
    private String name;
    private double grade1;
    private double grade2;
    private int classTotal;
    private int numberOfAttendance;
    private String gender;
    private ArrayList<String> subject;
    private int weight1;
    private int weight2;

    public Student() {
    }
    
    /**
     * 
     * @param name get name
     * @param grade1 get grade1
     * @param grade2 get grade2
     * @param classTotal get classTotal
     * @param numberOfAttendance get numberOfAttendance
     * @param gender get gender
     * @param subjects get subject
     */
    

    public Student(String name, double grade1, double grade2, int classTotal, int numberOfAttendance, String gender, ArrayList<String> subject, int weight1, int weight2) {
        this.name = name;
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.classTotal = classTotal;
        this.numberOfAttendance = numberOfAttendance;
        this.gender = gender;
        this.subject = subject;
        this.weight1 = weight1;
        this.weight2 = weight2;
    }

    public ArrayList<String> getSubject() {
        return subject;
    }

    public void setSubject(ArrayList<String> subject) {
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrade1() {
        return grade1;
    }

    public void setGrade1(double grade1) {
        this.grade1 = grade1;
    }

    public double getGrade2() {
        return grade2;
    }

    public void setGrade2(double grade2) {
        this.grade2 = grade2;
    }

    public int getClassTotal() {
        return classTotal;
    }

    public void setClassTotal(int classTotal) {
        this.classTotal = classTotal;
    }

    public int getNumberOfAttendance() {
        return numberOfAttendance;
    }

    public void setNumberPresence(int numberOfAttendance) {
        this.numberOfAttendance = numberOfAttendance;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public int getWeight1() {
        return weight1;
    }

    public void setWeight1(int weight1) {
        this.weight1 = weight1;
    }

    public int getWeight2() {
        return weight2;
    }

    public void setWeight2(int weight2) {
        this.weight2 = weight2;
    }

    
    /**
     * 
     * @return calculate Student's average arithmetic.
     */
    public double calculateArithmeticAverage() {
        return (grade1 + grade2) / 2;
    }
    
    /**
     * @return calculate Student's frequency.
     */
    public double calculateFrequency() {
        return (numberOfAttendance*100)/classTotal ;
    }
    
    /**
     * 
     * @return determine if Student is approved.
     */
    public String verifySituation() {
        if (calculateArithmeticAverage() >= 6 && calculateFrequency() >= 75) {
            return "Aprovado!";
        } else if (calculateArithmeticAverage() >= 6 && calculateFrequency() < 75) {
            return "Reprovado por frequência!";
        } else if (calculateArithmeticAverage() < 6 && calculateFrequency() >= 75) {
            return "Reprovado por nota!";
        } else {
            return "Reprovado por nota e frequência!";
        }
    }
    
    /**
     * 
     * @return a letter based on Average
     */
    public String verifyNotion() {
        if (calculateArithmeticAverage() <6) {
            return "D";
        } else if (calculateArithmeticAverage() >=6 && calculateArithmeticAverage() <8) {
            return "C";
        } else if (calculateArithmeticAverage() >=8 && calculateArithmeticAverage() <9) {
            return "B";
        } else {
            return "A";
        }
    }
    
    /**
     * 
     * @return 
     */
    //public double 
    
    @Override
    public String toString() {
        return "\nNome: " + name
                +"\nSexo: " + gender
                +"\nPeso 1: " + weight1
                +"\nNota 1: " + grade1
                +"\nPeso 2: " + weight2
                +"\nNota 2: " + grade2
                +"\nAulas totais: " + classTotal
                +"\nNúmero de presenças: " + numberOfAttendance
                +"\nDisciplinas: " + subject
                +"\nMédia aritimética: " + calculateArithmeticAverage()
                +"\nFrequência: " + calculateFrequency() + "%"
                +"\nResultado: " + verifySituation()
                +"\nConceito: " + verifyNotion(); 
    }

    
}
