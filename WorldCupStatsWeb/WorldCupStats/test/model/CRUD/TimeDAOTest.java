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
public class TimeDAOTest {
    
    public TimeDAOTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of toString method, of class TimeDAO.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        TimeDAO instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class TimeDAO.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object o = null;
        TimeDAO instance = null;
        boolean expResult = false;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGrupo method, of class TimeDAO.
     */
    @Test
    public void testGetGrupo() {
        System.out.println("getGrupo");
        TimeDAO instance = null;
        char expResult = ' ';
        char result = instance.getGrupo();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAno method, of class TimeDAO.
     */
    @Test
    public void testGetAno() {
        System.out.println("getAno");
        TimeDAO instance = null;
        int expResult = 0;
        int result = instance.getAno();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRank method, of class TimeDAO.
     */
    @Test
    public void testGetRank() {
        System.out.println("getRank");
        TimeDAO instance = null;
        int expResult = 0;
        int result = instance.getRank();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTecnico method, of class TimeDAO.
     */
    @Test
    public void testGetTecnico() {
        System.out.println("getTecnico");
        TimeDAO instance = null;
        PessoaDAO expResult = null;
        PessoaDAO result = instance.getTecnico();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getJogadores method, of class TimeDAO.
     */
    @Test
    public void testGetJogadores() {
        System.out.println("getJogadores");
        TimeDAO instance = null;
        List<PessoaDAO> expResult = null;
        List<PessoaDAO> result = instance.getJogadores();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of addPlayers method, of class TimeDAO.
     */
    @Test
    public void testAddPlayers() {
        System.out.println("addPlayers");
        PessoaDAO player = null;
        TimeDAO instance = null;
        instance.addPlayers(player);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGols method, of class TimeDAO.
     */
    @Test
    public void testGetGols() {
        System.out.println("getGols");
        TimeDAO instance = null;
        List<GolDAO> expResult = null;
        List<GolDAO> result = instance.getGols();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of addGoals method, of class TimeDAO.
     */
    @Test
    public void testAddGoals() {
        System.out.println("addGoals");
        GolDAO goal = null;
        TimeDAO instance = null;
        instance.addGoals(goal);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPais method, of class TimeDAO.
     */
    @Test
    public void testGetPais() {
        System.out.println("getPais");
        TimeDAO instance = null;
        PaisDAO expResult = null;
       // PaisDAO result = instance.getPais();
        //assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCopa method, of class TimeDAO.
     */
    @Test
    public void testGetCopa() {
        System.out.println("getCopa");
        TimeDAO instance = null;
        CopaDAO expResult = null;
        CopaDAO result = instance.getCopa();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of golRapido method, of class TimeDAO.
     */
    @Test
    public void testGolRapido() {
        System.out.println("golRapido");
        TimeDAO instance = null;
        GolDAO expResult = null;
        GolDAO result = instance.golRapido();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
