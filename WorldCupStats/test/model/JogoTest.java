/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.util.Date;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author marc
 */
public class JogoTest {
    
    
    @Before
    public void setUp() {
    }

    /**
     * Test of getFASE method, of class Jogo.
     */
    @Test
    public void testGetFASE() {
        System.out.println("getFASE");
        Jogo instance = null;
        String expResult = "";
        String result = instance.getFASE();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getData method, of class Jogo.
     */
    @Test
    public void testGetData() {
        System.out.println("getData");
        Jogo instance = null;
        Date expResult = null;
        Date result = instance.getData();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLocal method, of class Jogo.
     */
    @Test
    public void testGetLocal() {
        System.out.println("getLocal");
        Jogo instance = null;
        String expResult = "";
        String result = instance.getLocal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCopa method, of class Jogo.
     */
    @Test
    public void testGetCopa() {
        System.out.println("getCopa");
        Jogo instance = null;
        Copa expResult = null;
        Copa result = instance.getCopa();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTimeA method, of class Jogo.
     */
    @Test
    public void testGetTimeA() {
        System.out.println("getTimeA");
        Jogo instance = null;
        Time expResult = null;
        Time result = instance.getTimeA();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTimeB method, of class Jogo.
     */
    @Test
    public void testGetTimeB() {
        System.out.println("getTimeB");
        Jogo instance = null;
        Time expResult = null;
        Time result = instance.getTimeB();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEscalacaoA method, of class Jogo.
     */
    @Test
    public void testGetEscalacaoA() {
        System.out.println("getEscalacaoA");
        Jogo instance = null;
        Escalacao expResult = null;
        Escalacao result = instance.getEscalacaoA();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEscalacaoB method, of class Jogo.
     */
    @Test
    public void testGetEscalacaoB() {
        System.out.println("getEscalacaoB");
        Jogo instance = null;
        Escalacao expResult = null;
        Escalacao result = instance.getEscalacaoB();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSubstis method, of class Jogo.
     */
    @Test
    public void testGetSubstis() {
        System.out.println("getSubstis");
        Jogo instance = null;
        List<Substituicao> expResult = null;
        List<Substituicao> result = instance.getSubstis();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addSubstis method, of class Jogo.
     */
    @Test
    public void testAddSubstis() {
        System.out.println("addSubstis");
        Substituicao substis = null;
        Jogo instance = null;
        instance.addSubstis(substis);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addGol method, of class Jogo.
     */
    @Test
    public void testAddGol() {
        System.out.println("addGol");
        Gol gol = null;
        boolean foiGolDoTimeA = false;
        Jogo instance = null;
        instance.addGol(gol, foiGolDoTimeA);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of placarJogo method, of class Jogo.
     */
    @Test
    public void testPlacarJogo() {
        System.out.println("placarJogo");
        Jogo instance = null;
        String expResult = "";
        String result = instance.placarJogo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of timeParticipouJogo method, of class Jogo.
     */
    @Test
    public void testTimeParticipouJogo() {
        System.out.println("timeParticipouJogo");
        Time timeC = null;
        Jogo instance = null;
        boolean expResult = false;
        boolean result = instance.timeParticipouJogo(timeC);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of vitoriaIncontestavel method, of class Jogo.
     */
    @Test
    public void testVitoriaIncontestavel() {
        System.out.println("vitoriaIncontestavel");
        Jogo instance = null;
        boolean expResult = false;
        boolean result = instance.vitoriaIncontestavel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of diferencaGols method, of class Jogo.
     */
    @Test
    public void testDiferencaGols() {
        System.out.println("diferencaGols");
        Jogo instance = null;
        int expResult = 0;
        int result = instance.diferencaGols();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of empatou method, of class Jogo.
     */
    @Test
    public void testEmpatou() {
        System.out.println("empatou");
        Jogo instance = null;
        boolean expResult = false;
        boolean result = instance.empatou();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
