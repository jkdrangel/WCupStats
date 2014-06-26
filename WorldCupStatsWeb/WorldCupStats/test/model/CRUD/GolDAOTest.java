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
public class GolDAOTest {
    
    public GolDAOTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getID method, of class GolDAO.
     */
    @Test
    public void testGetID() {
        System.out.println("getID");
        GolDAO instance = null;
        int expResult = 0;
        int result = instance.getID();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getJogo method, of class GolDAO.
     */
    @Test
    public void testGetJogo() {
        System.out.println("getJogo");
        GolDAO instance = null;
        JogoDAO expResult = null;
        JogoDAO result = instance.getJogo();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getJogador method, of class GolDAO.
     */
    @Test
    public void testGetJogador() {
        System.out.println("getJogador");
        GolDAO instance = null;
        PessoaDAO expResult = null;
        PessoaDAO result = instance.getJogador();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSelecao method, of class GolDAO.
     */
    @Test
    public void testGetSelecao() {
        System.out.println("getSelecao");
        GolDAO instance = null;
        SelecaoDAO expResult = null;
        SelecaoDAO result = instance.getSelecao();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTempo method, of class GolDAO.
     */
    @Test
    public void testGetTempo() {
        System.out.println("getTempo");
        GolDAO instance = null;
        Date expResult = null;
        Date result = instance.getTempo();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of isFoiContra method, of class GolDAO.
     */
    @Test
    public void testIsFoiContra() {
        System.out.println("isFoiContra");
        GolDAO instance = null;
        boolean expResult = false;
        boolean result = instance.isFoiContra();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
