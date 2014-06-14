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
public class JogoTest {
    
    public JogoTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getId method, of class Jogo.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Jogo instance = new Jogo();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Jogo.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Jogo instance = new Jogo();
        instance.setId(id);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCopa method, of class Jogo.
     */
    @Test
    public void testGetCopa() {
        System.out.println("getCopa");
        Jogo instance = new Jogo();
        Copa expResult = null;
        Copa result = instance.getCopa();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCopa method, of class Jogo.
     */
    @Test
    public void testSetCopa() {
        System.out.println("setCopa");
        Copa copa = null;
        Jogo instance = new Jogo();
        instance.setCopa(copa);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getData method, of class Jogo.
     */
    @Test
    public void testGetData() {
        System.out.println("getData");
        Jogo instance = new Jogo();
        Date expResult = null;
        Date result = instance.getData();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setData method, of class Jogo.
     */
    @Test
    public void testSetData() {
        System.out.println("setData");
        Date data = null;
        Jogo instance = new Jogo();
        instance.setData(data);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLocal method, of class Jogo.
     */
    @Test
    public void testGetLocal() {
        System.out.println("getLocal");
        Jogo instance = new Jogo();
        String expResult = "";
        String result = instance.getLocal();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLocal method, of class Jogo.
     */
    @Test
    public void testSetLocal() {
        System.out.println("setLocal");
        String local = "";
        Jogo instance = new Jogo();
        instance.setLocal(local);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFase method, of class Jogo.
     */
    @Test
    public void testGetFase() {
        System.out.println("getFase");
        Jogo instance = new Jogo();
        String expResult = "";
        String result = instance.getFase();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFase method, of class Jogo.
     */
    @Test
    public void testSetFase() {
        System.out.println("setFase");
        String fase = "";
        Jogo instance = new Jogo();
        instance.setFase(fase);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGols method, of class Jogo.
     */
    @Test
    public void testGetGols() {
        System.out.println("getGols");
        Jogo instance = new Jogo();
        Set expResult = null;
        Set result = instance.getGols();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGols method, of class Jogo.
     */
    @Test
    public void testSetGols() {
        System.out.println("setGols");
        Set gols = null;
        Jogo instance = new Jogo();
        instance.setGols(gols);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSubstituicaos method, of class Jogo.
     */
    @Test
    public void testGetSubstituicaos() {
        System.out.println("getSubstituicaos");
        Jogo instance = new Jogo();
        Set expResult = null;
        Set result = instance.getSubstituicaos();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSubstituicaos method, of class Jogo.
     */
    @Test
    public void testSetSubstituicaos() {
        System.out.println("setSubstituicaos");
        Set substituicaos = null;
        Jogo instance = new Jogo();
        instance.setSubstituicaos(substituicaos);
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Jogo.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Jogo instance = new Jogo();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Jogo.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Jogo instance = new Jogo();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
