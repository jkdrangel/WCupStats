/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model.CRUD;

import java.util.Date;
import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lsantana
 */
public class JogoDAOTest {
    
    public JogoDAOTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getFASE method, of class JogoDAO.
     */
    @Test
    public void testGetFASE() {
        System.out.println("getFASE");
        JogoDAO instance = null;
        String expResult = "";
        String result = instance.getFASE();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getData method, of class JogoDAO.
     */
    @Test
    public void testGetData() {
        System.out.println("getData");
        JogoDAO instance = null;
        Date expResult = null;
        Date result = instance.getData();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLocal method, of class JogoDAO.
     */
    @Test
    public void testGetLocal() {
        System.out.println("getLocal");
        JogoDAO instance = null;
        String expResult = "";
        String result = instance.getLocal();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCopa method, of class JogoDAO.
     */
    @Test
    public void testGetCopa() {
        System.out.println("getCopa");
        JogoDAO instance = null;
        CopaDAO expResult = null;
        CopaDAO result = instance.getCopa();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTimeA method, of class JogoDAO.
     */
    @Test
    public void testGetTimeA() {
        System.out.println("getTimeA");
        JogoDAO instance = null;
        SelecaoDAO expResult = null;
        SelecaoDAO result = instance.getTimeA();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEscalacaoA method, of class JogoDAO.
     */
    @Test
    public void testGetEscalacaoA() {
        System.out.println("getEscalacaoA");
        JogoDAO instance = null;
        EscalacaoDAO expResult = null;
        EscalacaoDAO result = instance.getEscalacaoA();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEscalacaoB method, of class JogoDAO.
     */
    @Test
    public void testGetEscalacaoB() {
        System.out.println("getEscalacaoB");
        JogoDAO instance = null;
        EscalacaoDAO expResult = null;
        EscalacaoDAO result = instance.getEscalacaoB();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSubstituicao method, of class JogoDAO.
     */
    @Test
    public void testGetSubstituicao() {
        System.out.println("getSubstituicao");
        JogoDAO instance = null;
        List<SubstituicaoDAO> expResult = null;
        List<SubstituicaoDAO> result = instance.getSubstituicao();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of addSubstituicao method, of class JogoDAO.
     */
    @Test
    public void testAddSubstituicao() {
        System.out.println("addSubstituicao");
        SubstituicaoDAO substis = null;
        JogoDAO instance = null;
        instance.addSubstituicao(substis);
        fail("The test case is a prototype.");
    }

    /**
     * Test of addGolTimeA method, of class JogoDAO.
     */
    @Test
    public void testAddGolTimeA() {
        System.out.println("addGolTimeA");
        GolDAO gol = null;
        JogoDAO instance = null;
        instance.addGolTimeA(gol);
        fail("The test case is a prototype.");
    }

    /**
     * Test of addGolTimeB method, of class JogoDAO.
     */
    @Test
    public void testAddGolTimeB() {
        System.out.println("addGolTimeB");
        GolDAO gol = null;
        JogoDAO instance = null;
        instance.addGolTimeB(gol);
        fail("The test case is a prototype.");
    }

    /**
     * Test of golsLiquidos method, of class JogoDAO.
     */
    @Test
    public void testGolsLiquidos() {
        System.out.println("golsLiquidos");
        JogoDAO instance = null;
        int[] expResult = null;
        int[] result = instance.golsLiquidos();
        assertArrayEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of placarJogo method, of class JogoDAO.
     */
    @Test
    public void testPlacarJogo() {
        System.out.println("placarJogo");
        JogoDAO instance = null;
        String expResult = "";
        String result = instance.placarJogo();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of timeParticipouJogo method, of class JogoDAO.
     */
    @Test
    public void testTimeParticipouJogo() {
        System.out.println("timeParticipouJogo");
        SelecaoDAO timeC = null;
        JogoDAO instance = null;
        boolean expResult = false;
        boolean result = instance.timeParticipouJogo(timeC);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of vitoriaIncontestavel method, of class JogoDAO.
     */
    @Test
    public void testVitoriaIncontestavel() {
        System.out.println("vitoriaIncontestavel");
        JogoDAO instance = null;
        boolean expResult = false;
        boolean result = instance.vitoriaIncontestavel();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of diferencaGols method, of class JogoDAO.
     */
    @Test
    public void testDiferencaGols() {
        System.out.println("diferencaGols");
        JogoDAO instance = null;
        int expResult = 0;
        int result = instance.diferencaGols();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of empatou method, of class JogoDAO.
     */
    @Test
    public void testEmpatou() {
        System.out.println("empatou");
        JogoDAO instance = null;
        boolean expResult = false;
        boolean result = instance.empatou();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of vencedor method, of class JogoDAO.
     */
    @Test
    public void testVencedor() {
        System.out.println("vencedor");
        JogoDAO instance = null;
        SelecaoDAO expResult = null;
        SelecaoDAO result = instance.vencedor();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of Derrotado method, of class JogoDAO.
     */
    @Test
    public void testDerrotado() {
        System.out.println("Derrotado");
        JogoDAO instance = null;
        SelecaoDAO expResult = null;
        SelecaoDAO result = instance.Derrotado();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
