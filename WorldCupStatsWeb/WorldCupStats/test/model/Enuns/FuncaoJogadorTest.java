/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model.Enuns;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lsantana
 */
public class FuncaoJogadorTest {
    
    public FuncaoJogadorTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of values method, of class FuncaoJogador.
     */
    @Test
    public void testValues() {
        System.out.println("values");
        FuncaoJogador[] expResult = null;
        FuncaoJogador[] result = FuncaoJogador.values();
        assertArrayEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of valueOf method, of class FuncaoJogador.
     */
    @Test
    public void testValueOf() {
        System.out.println("valueOf");
        String name = "";
        FuncaoJogador expResult = null;
        FuncaoJogador result = FuncaoJogador.valueOf(name);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFuncao method, of class FuncaoJogador.
     */
    @Test
    public void testGetFuncao() {
        System.out.println("getFuncao");
        FuncaoJogador instance = null;
        String expResult = "";
        String result = instance.getFuncao();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
