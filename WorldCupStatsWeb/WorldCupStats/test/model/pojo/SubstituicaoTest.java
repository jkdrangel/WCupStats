/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model.pojo;

import java.util.Date;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lsantana
 */
public class SubstituicaoTest {
    
    public SubstituicaoTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getId method, of class Substituicao.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Substituicao instance = new Substituicao();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Substituicao.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Substituicao instance = new Substituicao();
        instance.setId(id);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSelecao method, of class Substituicao.
     */
    @Test
    public void testGetSelecao() {
        System.out.println("getSelecao");
        Substituicao instance = new Substituicao();
        Selecao expResult = null;
        Selecao result = instance.getSelecao();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSelecao method, of class Substituicao.
     */
    @Test
    public void testSetSelecao() {
        System.out.println("setSelecao");
        Selecao selecao = null;
        Substituicao instance = new Substituicao();
        instance.setSelecao(selecao);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getJogo method, of class Substituicao.
     */
    @Test
    public void testGetJogo() {
        System.out.println("getJogo");
        Substituicao instance = new Substituicao();
        Jogo expResult = null;
        Jogo result = instance.getJogo();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setJogo method, of class Substituicao.
     */
    @Test
    public void testSetJogo() {
        System.out.println("setJogo");
        Jogo jogo = null;
        Substituicao instance = new Substituicao();
        instance.setJogo(jogo);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTempo method, of class Substituicao.
     */
    @Test
    public void testGetTempo() {
        System.out.println("getTempo");
        Substituicao instance = new Substituicao();
        Date expResult = null;
        Date result = instance.getTempo();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTempo method, of class Substituicao.
     */
    @Test
    public void testSetTempo() {
        System.out.println("setTempo");
        Date tempo = null;
        Substituicao instance = new Substituicao();
        instance.setTempo(tempo);
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Substituicao.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Substituicao instance = new Substituicao();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Substituicao.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Substituicao instance = new Substituicao();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
