/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model.CRUD;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lsantana
 */
public class SistemaDAOTest {
    
    public SistemaDAOTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of cadastrarPais method, of class SistemaDAO.
     */
    @Test
    public void testCadastrarPais() {
        System.out.println("cadastrarPais");
        String brazil = "";
        String america_do_sul = "";
        Sistema instance = new Sistema();
        instance.cadastrarPais(brazil, america_do_sul);
        fail("The test case is a prototype.");
    }

    /**
     * Test of cadastrarCopa method, of class SistemaDAO.
     */
    @Test
    public void testCadastrarCopa() {
        System.out.println("cadastrarCopa");
        Date ano = null;
        PaisDAO sede = null;
        Sistema instance = new Sistema();
        instance.cadastrarCopa(ano, sede);
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarPaises method, of class SistemaDAO.
     */
    @Test
    public void testListarPaises() {
        System.out.println("listarPaises");
        Sistema instance = new Sistema();
        Iterator<PaisDAO> expResult = null;
        Iterator<PaisDAO> result = instance.listarPaises();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarCopas method, of class SistemaDAO.
     */
    @Test
    public void testListarCopas() {
        System.out.println("listarCopas");
        Sistema instance = new Sistema();
        Iterator<CopaDAO> expResult = null;
        Iterator<CopaDAO> result = instance.listarCopas();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of eMarmelada method, of class SistemaDAO.
     */
    @Test
    public void testEMarmelada() {
        System.out.println("eMarmelada");
        Sistema instance = new Sistema();
        instance.eMarmelada();
        fail("The test case is a prototype.");
    }

    /**
     * Test of eDoBrasil method, of class SistemaDAO.
     */
    @Test
    public void testEDoBrasil() {
        System.out.println("eDoBrasil");
        Sistema instance = new Sistema();
        ArrayList<PaisDAO> expResult = null;
        ArrayList<PaisDAO> result = instance.eDoBrasil();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of toDentro method, of class SistemaDAO.
     */
    @Test
    public void testToDentro() {
        System.out.println("toDentro");
        Sistema instance = new Sistema();
        instance.toDentro();
        fail("The test case is a prototype.");
    }

    /**
     * Test of arrozDeCopa method, of class SistemaDAO.
     */
    @Test
    public void testArrozDeCopa() {
        System.out.println("arrozDeCopa");
        Sistema instance = new Sistema();
        instance.arrozDeCopa();
        fail("The test case is a prototype.");
    }

    /**
     * Test of sempreVice method, of class SistemaDAO.
     */
    @Test
    public void testSempreVice() {
        System.out.println("sempreVice");
        Sistema instance = new Sistema();
        instance.sempreVice();
        fail("The test case is a prototype.");
    }

    /**
     * Test of fregues method, of class SistemaDAO.
     */
    @Test
    public void testFregues() {
        System.out.println("fregues");
        Sistema instance = new Sistema();
        instance.fregues();
        fail("The test case is a prototype.");
    }

    /**
     * Test of timeRuim method, of class SistemaDAO.
     */
    @Test
    public void testTimeRuim() {
        System.out.println("timeRuim");
        Sistema instance = new Sistema();
        instance.timeRuim();
        fail("The test case is a prototype.");
    }

    /**
     * Test of timeBom method, of class SistemaDAO.
     */
    @Test
    public void testTimeBom() {
        System.out.println("timeBom");
        Sistema instance = new Sistema();
        instance.timeBom();
        fail("The test case is a prototype.");
    }

    /**
     * Test of invictos method, of class SistemaDAO.
     */
    @Test
    public void testInvictos() {
        System.out.println("invictos");
        Sistema instance = new Sistema();
        instance.invictos();
        fail("The test case is a prototype.");
    }

    /**
     * Test of perdeuGanhou method, of class SistemaDAO.
     */
    @Test
    public void testPerdeuGanhou() {
        System.out.println("perdeuGanhou");
        Sistema instance = new Sistema();
        instance.perdeuGanhou();
        fail("The test case is a prototype.");
    }
    
}
