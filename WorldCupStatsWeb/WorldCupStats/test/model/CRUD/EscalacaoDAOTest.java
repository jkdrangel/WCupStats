/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model.CRUD;

import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lsantana
 */
public class EscalacaoDAOTest {
    
    public EscalacaoDAOTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getID method, of class EscalacaoDAO.
     */
    @Test
    public void testGetID() {
        System.out.println("getID");
        EscalacaoDAO instance = null;
        int expResult = 0;
        int result = instance.getID();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setID method, of class EscalacaoDAO.
     */
    @Test
    public void testSetID() {
        System.out.println("setID");
        int ID = 0;
        EscalacaoDAO instance = null;
        instance.setID(ID);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getJogo method, of class EscalacaoDAO.
     */
    @Test
    public void testGetJogo() {
        System.out.println("getJogo");
        EscalacaoDAO instance = null;
        JogoDAO expResult = null;
        JogoDAO result = instance.getJogo();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setJogo method, of class EscalacaoDAO.
     */
    @Test
    public void testSetJogo() {
        System.out.println("setJogo");
        JogoDAO jogo = null;
        EscalacaoDAO instance = null;
        instance.setJogo(jogo);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getJogador method, of class EscalacaoDAO.
     */
    @Test
    public void testGetJogador() {
        System.out.println("getJogador");
        EscalacaoDAO instance = null;
        List<PessoaDAO> expResult = null;
        List<PessoaDAO> result = instance.getJogador();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
