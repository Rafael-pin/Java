/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.qi.edu.model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alunos
 */
public class PersonTest {
    
    private static final Person PERSON = new Person();
    
    public PersonTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        PERSON.setName("Rafael");
        PERSON.setLastName("Pinheiro");
        PERSON.setAge(18);
        PERSON.setIsEmployeee(true);
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getAge method, of class Person.
     */
    @Test
    public void testGetAge() {
    }

    /**
     * Test of setAge method, of class Person.
     */
    @Test
    public void testSetAge() {
    }

    /**
     * Test of getName method, of class Person.
     */
    @Test
    public void testGetName() {
    }

    /**
     * Test of setName method, of class Person.
     */
    @Test
    public void testSetName() {
    }

    /**
     * Test of getLastName method, of class Person.
     */
    @Test
    public void testGetLastName() {
    }

    /**
     * Test of setLastName method, of class Person.
     */
    @Test
    public void testSetLastName() {
    }

    /**
     * Test of isIsEmployeee method, of class Person.
     */
    @Test
    public void testIsIsEmployeee() {
    }

    /**
     * Test of setIsEmployeee method, of class Person.
     */
    @Test
    public void testSetIsEmployeee() {
    }

    /**
     * Test of checkIfIsEmployee method, of class Person.
     */
    @Test
    public void testCheckIfIsEmployee() {
        assertEquals("É um funcionário", PERSON.checkIfIsEmployee());
        PERSON.setIsEmployeee(false);
        assertEquals("Não é um funcionário", PERSON.checkIfIsEmployee());
    }

    /**
     * Test of toString method, of class Person.
     */
    @Test
    public void testToString() {
    }
    
}
