/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.woerterzaehlen;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author weiss
 */
public class lesenIT {
    
    public lesenIT() {
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
     * Test of einlesen method, of class lesen.
     */
    @Test
    public void testEinlesen() {
        System.out.println("einlesen");
        lesen instance = new lesen();
        int expResult = 3;
        int result = instance.einlesen();
        assertEquals(expResult, result);
    
    }
    
}
