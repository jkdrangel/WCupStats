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
public class TecnicoTest {
    
    public TecnicoTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getId method, of class Tecnico.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Tecnico instance = new Tecnico();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Tecnico.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Tecnico instance = new Tecnico();
        instance.setId(id);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSelecao method, of class Tecnico.
     */
    @Test
    public void testGetSelecao() {
        System.out.println("getSelecao");
        Tecnico instance = new Tecnico();
        Selecao expResult = null;
        Selecao result = instance.getSelecao();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSelecao method, of class Tecnico.
     */
    @Test
    public void testSetSelecao() {
        System.out.println("setSelecao");
        Selecao selecao = null;
        Tecnico instance = new Tecnico();
        instance.setSelecao(selecao);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNome method, of class Tecnico.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        Tecnico instance = new Tecnico();
        String expResult = "";
        String result = instance.getNome();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNome method, of class Tecnico.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "";
        Tecnico instance = new Tecnico();
        instance.setNome(nome);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDataNascimento method, of class Tecnico.
     */
    @Test
    public void testGetDataNascimento() {
        System.out.println("getDataNascimento");
        Tecnico instance = new Tecnico();
        Date expResult = null;
        Date result = instance.getDataNascimento();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDataNascimento method, of class Tecnico.
     */
    @Test
    public void testSetDataNascimento() {
        System.out.println("setDataNascimento");
        Date dataNascimento = null;
        Tecnico instance = new Tecnico();
        instance.setDataNascimento(dataNascimento);
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Tecnico.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Tecnico instance = new Tecnico();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Tecnico.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Tecnico instance = new Tecnico();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
