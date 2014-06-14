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
        SistemaDAO instance = new SistemaDAO();
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
        SistemaDAO instance = new SistemaDAO();
        instance.cadastrarCopa(ano, sede);
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarPaises method, of class SistemaDAO.
     */
    @Test
    public void testListarPaises() {
        System.out.println("listarPaises");
        SistemaDAO instance = new SistemaDAO();
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
        SistemaDAO instance = new SistemaDAO();
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
        SistemaDAO instance = new SistemaDAO();
        instance.eMarmelada();
        fail("The test case is a prototype.");
    }

    /**
     * Test of eDoBrasil method, of class SistemaDAO.
     */
    @Test
    public void testEDoBrasil() {
        System.out.println("eDoBrasil");
        SistemaDAO instance = new SistemaDAO();
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
        SistemaDAO instance = new SistemaDAO();
        instance.toDentro();
        fail("The test case is a prototype.");
    }

    /**
     * Test of arrozDeCopa method, of class SistemaDAO.
     */
    @Test
    public void testArrozDeCopa() {
        System.out.println("arrozDeCopa");
        SistemaDAO instance = new SistemaDAO();
        instance.arrozDeCopa();
        fail("The test case is a prototype.");
    }

    /**
     * Test of sempreVice method, of class SistemaDAO.
     */
    @Test
    public void testSempreVice() {
        System.out.println("sempreVice");
        SistemaDAO instance = new SistemaDAO();
        instance.sempreVice();
        fail("The test case is a prototype.");
    }

    /**
     * Test of fregues method, of class SistemaDAO.
     */
    @Test
    public void testFregues() {
        System.out.println("fregues");
        SistemaDAO instance = new SistemaDAO();
        instance.fregues();
        fail("The test case is a prototype.");
    }

    /**
     * Test of timeRuim method, of class SistemaDAO.
     */
    @Test
    public void testTimeRuim() {
        System.out.println("timeRuim");
        SistemaDAO instance = new SistemaDAO();
        instance.timeRuim();
        fail("The test case is a prototype.");
    }

    /**
     * Test of timeBom method, of class SistemaDAO.
     */
    @Test
    public void testTimeBom() {
        System.out.println("timeBom");
        SistemaDAO instance = new SistemaDAO();
        instance.timeBom();
        fail("The test case is a prototype.");
    }

    /**
     * Test of invictos method, of class SistemaDAO.
     */
    @Test
    public void testInvictos() {
        System.out.println("invictos");
        SistemaDAO instance = new SistemaDAO();
        instance.invictos();
        fail("The test case is a prototype.");
    }

    /**
     * Test of perdeuGanhou method, of class SistemaDAO.
     */
    @Test
    public void testPerdeuGanhou() {
        System.out.println("perdeuGanhou");
        SistemaDAO instance = new SistemaDAO();
        instance.perdeuGanhou();
        fail("The test case is a prototype.");
    }
    
}
