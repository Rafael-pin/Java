/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.qi.model;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Rafael & Carlos
 * @since 23/05/2019
 * @version 1.0 beta
 */
public class StudentTest {
    
    private static final Student STUDENT = new Student();
    
    public StudentTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        STUDENT.setName("Eduardo");
        STUDENT.setGrade1(8);
        STUDENT.setGrade2(8);
        STUDENT.setNumberPresence(10);
        STUDENT.setGender("Masculino");
        STUDENT.setClassTotal(20);
        ArrayList <String> subject = new ArrayList<>();
        subject.add("Matemática");
        subject.add("Português");
        STUDENT.setSubject(subject);
        STUDENT.setWeight1(2);
        STUDENT.setWeight2(1);
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println(STUDENT.toString());
    }
    
    @Before
    public void setUp() { 
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getSubjects method, of class Student.
     */
    @Test
    public void testGetSubjects() {
    }

    /**
     * Test of setSubjects method, of class Student.
     */
    @Test
    public void testSetSubjects() {
    }

    /**
     * Test of getNome method, of class Student.
     */
    @Test
    public void testGetNome() {
    }

    /**
     * Test of setNome method, of class Student.
     */
    @Test
    public void testSetNome() {
    }

    /**
     * Test of getGrade1 method, of class Student.
     */
    @Test
    public void testGetGrade1() {
    }

    /**
     * Test of setGrade1 method, of class Student.
     */
    @Test
    public void testSetGrade1() {
    }

    /**
     * Test of getGrade2 method, of class Student.
     */
    @Test
    public void testGetGrade2() {
    }

    /**
     * Test of setGrade2 method, of class Student.
     */
    @Test
    public void testSetGrade2() {
    }

    /**
     * Test of getClassTotal method, of class Student.
     */
    @Test
    public void testGetClassTotal() {
    }

    /**
     * Test of setClassTotal method, of class Student.
     */
    @Test
    public void testSetClassTotal() {
    }

    /**
     * Test of getNumberOfAttendance method, of class Student.
     */
    @Test
    public void testGetNumberOfAttendance() {
    }

    /**
     * Test of setNumberPresence method, of class Student.
     */
    @Test
    public void testSetNumberPresence() {
    }

    /**
     * Test of getGender method, of class Student.
     */
    @Test
    public void testGetGender() {
    }

    /**
     * Test of setSexo method, of class Student.
     */
    @Test
    public void testSetSexo() {
    }
    
    /**
     * Test of calculateArithmeticAverage method, of class Student.
     */
    @Test
    public void testCalculateArithmeticAverage() {
        assertEquals(8,STUDENT.calculateArithmeticAverage(),0.0);
        STUDENT.setGrade1(4);
        STUDENT.setGrade2(4);
        assertEquals(4,STUDENT.calculateArithmeticAverage(),0.0);
    }
    
    /**
     * Test of calculateFrequency method, of class Student.
     */
    @Test
    public void testCalculateFrequency() {
        STUDENT.setClassTotal(100);
        STUDENT.setNumberPresence(25);
        assertEquals(25,STUDENT.calculateFrequency(),0.0);
        STUDENT.setClassTotal(50);
        STUDENT.setNumberPresence(25);
        assertEquals(50,STUDENT.calculateFrequency(),0.0);
    }
    
    /**
     * Test of verifySituation method of class Student. 
     */
    @Test
    public void testVerifySituation() {
        STUDENT.setGrade1(7);
        STUDENT.setGrade2(7);
        assertEquals("Reprovado por frequência!", STUDENT.verifySituation());
        STUDENT.setNumberPresence(10);
        STUDENT.setClassTotal(10);
        assertEquals("Aprovado!", STUDENT.verifySituation());
        STUDENT.setGrade1(5);
        STUDENT.setGrade2(5);
        assertEquals("Reprovado por nota!", STUDENT.verifySituation());
        STUDENT.setClassTotal(100);
        assertEquals("Reprovado por nota e frequência!", STUDENT.verifySituation());
    }
    
    /**
     * Test of verifyNotion method, of class Student.
     */
    @Test
    public void testVerifyNotion() {
        assertEquals("D", STUDENT.verifyNotion());
        STUDENT.setGrade1(6);
        STUDENT.setGrade2(6);
        assertEquals("C", STUDENT.verifyNotion());
        STUDENT.setGrade1(8);
        STUDENT.setGrade2(8);
        assertEquals("B", STUDENT.verifyNotion());
        STUDENT.setGrade1(10);
        STUDENT.setGrade2(10);
        assertEquals("A", STUDENT.verifyNotion());
    }
    

    /**
     * Test of toString method, of class Student.
     */
    @Test
    public void testToString() {
    }
    
}
