/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model.pojo;

import java.util.Date;
import java.util.Set;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lsantana
 */
public class CopaTest {
    
    public CopaTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getId method, of class Copa.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Copa instance = new Copa();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Copa.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Copa instance = new Copa();
        instance.setId(id);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSelecao method, of class Copa.
     */
    @Test
    public void testGetSelecao() {
        System.out.println("getSelecao");
        Copa instance = new Copa();
        Selecao expResult = null;
        Selecao result = instance.getSelecao();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSelecao method, of class Copa.
     */
    @Test
    public void testSetSelecao() {
        System.out.println("setSelecao");
        Selecao selecao = null;
        Copa instance = new Copa();
        instance.setSelecao(selecao);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPais method, of class Copa.
     */
    @Test
    public void testGetPais() {
        System.out.println("getPais");
        Copa instance = new Copa();
        Pais expResult = null;
        Pais result = instance.getPais();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPais method, of class Copa.
     */
    @Test
    public void testSetPais() {
        System.out.println("setPais");
        Pais pais = null;
        Copa instance = new Copa();
        instance.setPais(pais);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAno method, of class Copa.
     */
    @Test
    public void testGetAno() {
        System.out.println("getAno");
        Copa instance = new Copa();
        Date expResult = null;
        Date result = instance.getAno();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAno method, of class Copa.
     */
    @Test
    public void testSetAno() {
        System.out.println("setAno");
        Date ano = null;
        Copa instance = new Copa();
        instance.setAno(ano);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSelecaos method, of class Copa.
     */
    @Test
    public void testGetSelecaos() {
        System.out.println("getSelecaos");
        Copa instance = new Copa();
        Set expResult = null;
        Set result = instance.getSelecaos();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSelecaos method, of class Copa.
     */
    @Test
    public void testSetSelecaos() {
        System.out.println("setSelecaos");
        Set selecaos = null;
        Copa instance = new Copa();
        instance.setSelecaos(selecaos);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getJogos method, of class Copa.
     */
    @Test
    public void testGetJogos() {
        System.out.println("getJogos");
        Copa instance = new Copa();
        Set expResult = null;
        Set result = instance.getJogos();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setJogos method, of class Copa.
     */
    @Test
    public void testSetJogos() {
        System.out.println("setJogos");
        Set jogos = null;
        Copa instance = new Copa();
        instance.setJogos(jogos);
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Copa.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Copa instance = new Copa();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Copa.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Copa instance = new Copa();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
