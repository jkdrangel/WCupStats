/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model.CRUD;

import java.util.Date;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lsantana
 */
public class SubstituicaoDAOTest {
    
    public SubstituicaoDAOTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of toString method, of class SubstituicaoDAO.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        SubstituicaoDAO instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTime method, of class SubstituicaoDAO.
     */
    @Test
    public void testGetTime() {
        System.out.println("getTime");
        SubstituicaoDAO instance = null;
        TimeDAO expResult = null;
        TimeDAO result = instance.getTime();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getqEntra method, of class SubstituicaoDAO.
     */
    @Test
    public void testGetqEntra() {
        System.out.println("getqEntra");
        SubstituicaoDAO instance = null;
        PessoaDAO expResult = null;
        PessoaDAO result = instance.getqEntra();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getqSai method, of class SubstituicaoDAO.
     */
    @Test
    public void testGetqSai() {
        System.out.println("getqSai");
        SubstituicaoDAO instance = null;
        PessoaDAO expResult = null;
        PessoaDAO result = instance.getqSai();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTempo method, of class SubstituicaoDAO.
     */
    @Test
    public void testGetTempo() {
        System.out.println("getTempo");
        SubstituicaoDAO instance = null;
        Date expResult = null;
        Date result = instance.getTempo();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
