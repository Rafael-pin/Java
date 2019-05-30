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
 * @author Rafael Pinheiro
 * @since  28/05/2019 - 13:54
 * @version 1.0 beta
 */
public class PersonTest {
    
    private static final Person PERSON = new Person();
    
    public PersonTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        PERSON.setName("Zé");
        PERSON.setAge(1);
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println(PERSON.toString());
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
     * Test of calculateAgeInMonths method, of class Person.
     */
    @Test
    public void testCalculateAgeInMonths() {
        assertEquals(12,PERSON.calculateAgeInMonths());
    }

    /**
     * Test of toString method, of class Person.
     */
    @Test
    public void testToString() {
    }
    
}
