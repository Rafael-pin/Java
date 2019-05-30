/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.qi.model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Rafael Pinheiro
 * @since 19/05/2019- 11:10
 * @version 1.0 Beta
 */
public class DateTest {
    
    private static final Date DATE = new Date();
    
    public DateTest() {
        DATE.setDay(0);
        DATE.setMonth(0);
    }
    
    @BeforeClass
    public static void setUpClass() {
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
     * Test of getMonth method, of class Date.
     */
    @Test
    public void testGetMonth() {
    }

    /**
     * Test of setMonth method, of class Date.
     */
    @Test
    public void testSetMonth() {
    }

    /**
     * Test of getDay method, of class Date.
     */
    @Test
    public void testGetDay() {
    }

    /**
     * Test of setDay method, of class Date.
     */
    @Test
    public void testSetDay() {
    }

    /**
     * Test of validateDate method, of class Date. Check the awnser based in month and day
     */
    @Test
    public void testValidateDate() {
        assertEquals(DATE.validateDate(),"Data inválida!");
        DATE.setDay(28);
        DATE.setMonth(1);
        assertEquals(DATE.validateDate(),"Data válida \n" + "Janeiro!");
        DATE.setMonth(2);
        assertEquals(DATE.validateDate(),"Data válida \n" + "Fevereiro!");
        DATE.setMonth(3);
        assertEquals(DATE.validateDate(),"Data válida \n" + "Março!");
        DATE.setMonth(4);
        assertEquals(DATE.validateDate(),"Data válida \n" + "Abril!");
        DATE.setMonth(5);
        assertEquals(DATE.validateDate(),"Data válida \n" + "Maio!");
        DATE.setMonth(6);
        assertEquals(DATE.validateDate(),"Data válida \n" + "Junho!");
        DATE.setMonth(7);
        assertEquals(DATE.validateDate(),"Data válida \n" + "Julho!");
        DATE.setMonth(8);
        assertEquals(DATE.validateDate(),"Data válida \n" + "Agosto!");
        DATE.setMonth(9);
        assertEquals(DATE.validateDate(),"Data válida \n" + "Setembro!");
        DATE.setMonth(10);
        assertEquals(DATE.validateDate(),"Data válida \n" + "Outubro!");
        DATE.setMonth(11);
        assertEquals(DATE.validateDate(),"Data válida \n" + "Novembro!");
        DATE.setMonth(12);
        assertEquals(DATE.validateDate(),"Data válida \n" + "Dezembro!"); 
    }

    /**
     * Test of toString method, of class Date.
     */
    @Test
    public void testToString() {
    }
    
}
