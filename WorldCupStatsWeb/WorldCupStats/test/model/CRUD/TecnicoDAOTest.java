/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model.CRUD;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lsantana
 */
public class TecnicoDAOTest {
    
    public TecnicoDAOTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of equals method, of class TecnicoDAO.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object o = null;
        TecnicoDAO instance = null;
        boolean expResult = false;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class TecnicoDAO.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        TecnicoDAO instance = null;
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
