/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model.pojo;

import java.util.Set;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lsantana
 */
public class PaisTest {
    
    public PaisTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getId method, of class Pais.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Pais instance = new Pais();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Pais.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Pais instance = new Pais();
        instance.setId(id);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNome method, of class Pais.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        Pais instance = new Pais();
        String expResult = "";
        String result = instance.getNome();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNome method, of class Pais.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "";
        Pais instance = new Pais();
        instance.setNome(nome);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getContinente method, of class Pais.
     */
    @Test
    public void testGetContinente() {
        System.out.println("getContinente");
        Pais instance = new Pais();
        String expResult = "";
        String result = instance.getContinente();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setContinente method, of class Pais.
     */
    @Test
    public void testSetContinente() {
        System.out.println("setContinente");
        String continente = "";
        Pais instance = new Pais();
        instance.setContinente(continente);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSelecaos method, of class Pais.
     */
    @Test
    public void testGetSelecaos() {
        System.out.println("getSelecaos");
        Pais instance = new Pais();
        Set expResult = null;
        Set result = instance.getSelecaos();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSelecaos method, of class Pais.
     */
    @Test
    public void testSetSelecaos() {
        System.out.println("setSelecaos");
        Set selecaos = null;
        Pais instance = new Pais();
        instance.setSelecaos(selecaos);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCopas method, of class Pais.
     */
    @Test
    public void testGetCopas() {
        System.out.println("getCopas");
        Pais instance = new Pais();
        Set expResult = null;
        Set result = instance.getCopas();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCopas method, of class Pais.
     */
    @Test
    public void testSetCopas() {
        System.out.println("setCopas");
        Set copas = null;
        Pais instance = new Pais();
        instance.setCopas(copas);
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Pais.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Pais instance = new Pais();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Pais.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Pais instance = new Pais();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
