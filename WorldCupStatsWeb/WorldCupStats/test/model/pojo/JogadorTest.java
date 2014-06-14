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
public class JogadorTest {
    
    public JogadorTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getId method, of class Jogador.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Jogador instance = new Jogador();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Jogador.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Jogador instance = new Jogador();
        instance.setId(id);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDataNascimento method, of class Jogador.
     */
    @Test
    public void testGetDataNascimento() {
        System.out.println("getDataNascimento");
        Jogador instance = new Jogador();
        Date expResult = null;
        Date result = instance.getDataNascimento();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDataNascimento method, of class Jogador.
     */
    @Test
    public void testSetDataNascimento() {
        System.out.println("setDataNascimento");
        Date dataNascimento = null;
        Jogador instance = new Jogador();
        instance.setDataNascimento(dataNascimento);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNome method, of class Jogador.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        Jogador instance = new Jogador();
        String expResult = "";
        String result = instance.getNome();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNome method, of class Jogador.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "";
        Jogador instance = new Jogador();
        instance.setNome(nome);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumero method, of class Jogador.
     */
    @Test
    public void testGetNumero() {
        System.out.println("getNumero");
        Jogador instance = new Jogador();
        int expResult = 0;
        int result = instance.getNumero();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumero method, of class Jogador.
     */
    @Test
    public void testSetNumero() {
        System.out.println("setNumero");
        int numero = 0;
        Jogador instance = new Jogador();
        instance.setNumero(numero);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPosicao method, of class Jogador.
     */
    @Test
    public void testGetPosicao() {
        System.out.println("getPosicao");
        Jogador instance = new Jogador();
        String expResult = "";
        String result = instance.getPosicao();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPosicao method, of class Jogador.
     */
    @Test
    public void testSetPosicao() {
        System.out.println("setPosicao");
        String posicao = "";
        Jogador instance = new Jogador();
        instance.setPosicao(posicao);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGols method, of class Jogador.
     */
    @Test
    public void testGetGols() {
        System.out.println("getGols");
        Jogador instance = new Jogador();
        Set expResult = null;
        Set result = instance.getGols();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGols method, of class Jogador.
     */
    @Test
    public void testSetGols() {
        System.out.println("setGols");
        Set gols = null;
        Jogador instance = new Jogador();
        instance.setGols(gols);
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Jogador.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Jogador instance = new Jogador();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Jogador.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Jogador instance = new Jogador();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
