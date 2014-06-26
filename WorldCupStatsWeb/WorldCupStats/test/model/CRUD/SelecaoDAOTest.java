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
public class SelecaoDAOTest {
    
    public SelecaoDAOTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of toString method, of class SelecaoDAO.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        SelecaoDAO instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class SelecaoDAO.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object o = null;
        SelecaoDAO instance = null;
        boolean expResult = false;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGrupo method, of class SelecaoDAO.
     */
    @Test
    public void testGetGrupo() {
        System.out.println("getGrupo");
        SelecaoDAO instance = null;
        char expResult = ' ';
        char result = instance.getGrupo();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAno method, of class SelecaoDAO.
     */
    @Test
    public void testGetAno() {
        System.out.println("getAno");
        SelecaoDAO instance = null;
        int expResult = 0;
        int result = instance.getAno();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRank method, of class SelecaoDAO.
     */
    @Test
    public void testGetRank() {
        System.out.println("getRank");
        SelecaoDAO instance = null;
        int expResult = 0;
        int result = instance.getRank();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTecnico method, of class SelecaoDAO.
     */
    @Test
    public void testGetTecnico() {
        System.out.println("getTecnico");
        SelecaoDAO instance = null;
        PessoaDAO expResult = null;
        PessoaDAO result = instance.getTecnico();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getJogadores method, of class SelecaoDAO.
     */
    @Test
    public void testGetJogadores() {
        System.out.println("getJogadores");
        SelecaoDAO instance = null;
        List<PessoaDAO> expResult = null;
        List<PessoaDAO> result = instance.getJogadores();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of addPlayers method, of class SelecaoDAO.
     */
    @Test
    public void testAddPlayers() {
        System.out.println("addPlayers");
        PessoaDAO player = null;
        SelecaoDAO instance = null;
        instance.addPlayers(player);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGols method, of class SelecaoDAO.
     */
    @Test
    public void testGetGols() {
        System.out.println("getGols");
        SelecaoDAO instance = null;
        List<GolDAO> expResult = null;
        List<GolDAO> result = instance.getGols();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of addGoals method, of class SelecaoDAO.
     */
    @Test
    public void testAddGoals() {
        System.out.println("addGoals");
        GolDAO goal = null;
        SelecaoDAO instance = null;
        instance.addGoals(goal);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPais method, of class SelecaoDAO.
     */
    @Test
    public void testGetPais() {
        System.out.println("getPais");
        SelecaoDAO instance = null;
        PaisDAO expResult = null;
       // PaisDAO result = instance.getPais();
        //assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCopa method, of class SelecaoDAO.
     */
    @Test
    public void testGetCopa() {
        System.out.println("getCopa");
        SelecaoDAO instance = null;
        CopaDAO expResult = null;
        CopaDAO result = instance.getCopa();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of golRapido method, of class SelecaoDAO.
     */
    @Test
    public void testGolRapido() {
        System.out.println("golRapido");
        SelecaoDAO instance = null;
        GolDAO expResult = null;
        GolDAO result = instance.golRapido();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
