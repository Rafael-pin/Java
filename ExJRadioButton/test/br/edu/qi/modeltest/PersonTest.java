/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.qi.modeltest;

import br.edu.qi.model.Person;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Rafael Pinheiro
 * @since 22/05/2019 - 14:00
 * @version 1.0 beta
 */
public class PersonTest {
    
    private static final Person PERSON = new Person();
    
    public PersonTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        PERSON.setName("Zé");
        PERSON.setAge(35);
        PERSON.setGender("Masculino");
        ArrayList<String> preferences = new ArrayList<>();
        preferences.add("Filme");
        preferences.add("Série");
        PERSON.setPreferences(preferences);
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
     * Test of getGender method, of class Person.
     */
    @Test
    public void testGetGender() {
    }

    /**
     * Test of setGender method, of class Person.
     */
    @Test
    public void testSetGender() {
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
     * Test of testCheckGender method, of class Person.
     */
   @Test
   public void testCheckGender() {
       PERSON.setGender("Masculino");
       assertEquals("Você é homem!", PERSON.checkGender());
       PERSON.setGender("Feminino");
       assertEquals("Você é mulher!", PERSON.checkGender());
   }
    /**
     * Test of toString method, of class Person.
     */
    @Test
    public void testToString() {
    }
 
}
