/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model.pojo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lsantana
 */
public class EscalacaoTest {
    
    public EscalacaoTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getId method, of class Escalacao.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Escalacao instance = new Escalacao();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Escalacao.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Escalacao instance = new Escalacao();
        instance.setId(id);
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Escalacao.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Escalacao instance = new Escalacao();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Escalacao.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Escalacao instance = new Escalacao();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
