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
public class JogadorDAOTest {
    
    public JogadorDAOTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getNumero method, of class JogadorDAO.
     */
    @Test
    public void testGetNumero() {
        System.out.println("getNumero");
        JogadorDAO instance = null;
        int expResult = 0;
        int result = instance.getNumero();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFuncao method, of class JogadorDAO.
     */
    @Test
    public void testGetFuncao() {
        System.out.println("getFuncao");
        JogadorDAO instance = null;
        String expResult = "";
        String result = instance.getFuncao();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumero method, of class JogadorDAO.
     */
    @Test
    public void testSetNumero() {
        System.out.println("setNumero");
        int n = 0;
        JogadorDAO instance = null;
        instance.setNumero(n);
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class JogadorDAO.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object o = null;
        JogadorDAO instance = null;
        boolean expResult = false;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
