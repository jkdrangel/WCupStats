/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model.CRUD;

import model.pojo.Pais;
import org.junit.After;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author lsantana
 */
public class PaisDAOTest {
    
    public PaisDAOTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of cadastrarSelecao method, of class PaisDAO.
     */
    @Test
    public void testCadastrarSelecao() {
        System.out.println("cadastrarSelecao");
        String a = "";
        int i = 0;
        PaisDAO instance = null;
        //instance.cadastrarSelecao();
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNome method, of class PaisDAO.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        Pais instance = null;
        String expResult = "";
        String result = instance.getNome();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getContinente method, of class PaisDAO.
     */
    @Test
    public void testGetContinente() {
        System.out.println("getContinente");
        Pais instance = null;
        String expResult = "";
        String result = instance.getContinente();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getID method, of class PaisDAO.
     */
    @Test
    public void testGetID() {
        System.out.println("getID");
        Pais instance = null;
        int expResult = 0;
        //int result = instance.getID();
        //assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setID method, of class PaisDAO.
     */
    @Test
    public void testSetID() {
        System.out.println("setID");
        int ID = 0;
        Pais instance = null;
        //instance.setID(ID);
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class PaisDAO.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        PaisDAO instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of consultarQtdJogos method, of class PaisDAO.
     */
    @Test
    public void testConsultarQtdJogos() {
        System.out.println("consultarQtdJogos");
        Pais instance = null;
        //instance.consultarQtdJogos();
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTitulos method, of class PaisDAO.
     */
    @Test
    public void testGetTitulos() {
        System.out.println("getTitulos");
        Pais instance = null;
        int expResult = 0;
        //int result = instance.getTitulos();
        //assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTitulos method, of class PaisDAO.
     */
    @Test
    public void testSetTitulos() {
        System.out.println("setTitulos");
        int titulos = 0;
        Pais instance = null;
       // instance.setTitulos(titulos);
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class PaisDAO.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        PaisDAO instance = null;
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class PaisDAO.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        PaisDAO instance = null;
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of compareTo method, of class PaisDAO.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        PaisDAO o = null;
        PaisDAO instance = null;
        int expResult = 0;
        //int result = instance.compareTo(o);
        //assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
