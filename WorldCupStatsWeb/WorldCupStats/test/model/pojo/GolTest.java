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
public class GolTest {
    
    public GolTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getId method, of class Gol.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Gol instance = new Gol();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Gol.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Gol instance = new Gol();
        instance.setId(id);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getJogador method, of class Gol.
     */
    @Test
    public void testGetJogador() {
        System.out.println("getJogador");
        Gol instance = new Gol();
        Jogador expResult = null;
        Jogador result = instance.getJogador();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setJogador method, of class Gol.
     */
    @Test
    public void testSetJogador() {
        System.out.println("setJogador");
        Jogador jogador = null;
        Gol instance = new Gol();
        instance.setJogador(jogador);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSelecao method, of class Gol.
     */
    @Test
    public void testGetSelecao() {
        System.out.println("getSelecao");
        Gol instance = new Gol();
        Selecao expResult = null;
        Selecao result = instance.getSelecao();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSelecao method, of class Gol.
     */
    @Test
    public void testSetSelecao() {
        System.out.println("setSelecao");
        Selecao selecao = null;
        Gol instance = new Gol();
        instance.setSelecao(selecao);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getJogo method, of class Gol.
     */
    @Test
    public void testGetJogo() {
        System.out.println("getJogo");
        Gol instance = new Gol();
        Jogo expResult = null;
        Jogo result = instance.getJogo();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setJogo method, of class Gol.
     */
    @Test
    public void testSetJogo() {
        System.out.println("setJogo");
        Jogo jogo = null;
        Gol instance = new Gol();
        instance.setJogo(jogo);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTempo method, of class Gol.
     */
    @Test
    public void testGetTempo() {
        System.out.println("getTempo");
        Gol instance = new Gol();
        Date expResult = null;
        Date result = instance.getTempo();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTempo method, of class Gol.
     */
    @Test
    public void testSetTempo() {
        System.out.println("setTempo");
        Date tempo = null;
        Gol instance = new Gol();
        instance.setTempo(tempo);
        fail("The test case is a prototype.");
    }

    /**
     * Test of isFoiContra method, of class Gol.
     */
    @Test
    public void testIsFoiContra() {
        System.out.println("isFoiContra");
        Gol instance = new Gol();
        boolean expResult = false;
        boolean result = instance.isFoiContra();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFoiContra method, of class Gol.
     */
    @Test
    public void testSetFoiContra() {
        System.out.println("setFoiContra");
        boolean foiContra = false;
        Gol instance = new Gol();
        instance.setFoiContra(foiContra);
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Gol.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Gol instance = new Gol();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Gol.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Gol instance = new Gol();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
