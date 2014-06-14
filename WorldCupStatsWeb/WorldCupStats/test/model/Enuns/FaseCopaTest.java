/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model.Enuns;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lsantana
 */
public class FaseCopaTest {
    
    public FaseCopaTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of values method, of class FaseCopa.
     */
    @Test
    public void testValues() {
        System.out.println("values");
        FaseCopa[] expResult = null;
        FaseCopa[] result = FaseCopa.values();
        assertArrayEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of valueOf method, of class FaseCopa.
     */
    @Test
    public void testValueOf() {
        System.out.println("valueOf");
        String name = "";
        FaseCopa expResult = null;
        FaseCopa result = FaseCopa.valueOf(name);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFase method, of class FaseCopa.
     */
    @Test
    public void testGetFase() {
        System.out.println("getFase");
        FaseCopa instance = null;
        String expResult = "";
        String result = instance.getFase();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
