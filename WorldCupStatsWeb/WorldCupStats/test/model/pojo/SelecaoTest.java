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
public class SelecaoTest {
    
    public SelecaoTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getId method, of class Selecao.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Selecao instance = new Selecao();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Selecao.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Selecao instance = new Selecao();
        instance.setId(id);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCopa method, of class Selecao.
     */
    @Test
    public void testGetCopa() {
        System.out.println("getCopa");
        Selecao instance = new Selecao();
        Copa expResult = null;
        Copa result = instance.getCopa();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCopa method, of class Selecao.
     */
    @Test
    public void testSetCopa() {
        System.out.println("setCopa");
        Copa copa = null;
        Selecao instance = new Selecao();
        instance.setCopa(copa);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPais method, of class Selecao.
     */
    @Test
    public void testGetPais() {
        System.out.println("getPais");
        Selecao instance = new Selecao();
        Pais expResult = null;
        Pais result = instance.getPais();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPais method, of class Selecao.
     */
    @Test
    public void testSetPais() {
        System.out.println("setPais");
        Pais pais = null;
        Selecao instance = new Selecao();
        instance.setPais(pais);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGrupo method, of class Selecao.
     */
    @Test
    public void testGetGrupo() {
        System.out.println("getGrupo");
        Selecao instance = new Selecao();
        String expResult = "";
        String result = instance.getGrupo();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGrupo method, of class Selecao.
     */
    @Test
    public void testSetGrupo() {
        System.out.println("setGrupo");
        String grupo = "";
        Selecao instance = new Selecao();
        instance.setGrupo(grupo);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAno method, of class Selecao.
     */
    @Test
    public void testGetAno() {
        System.out.println("getAno");
        Selecao instance = new Selecao();
        Date expResult = null;
        Date result = instance.getAno();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAno method, of class Selecao.
     */
    @Test
    public void testSetAno() {
        System.out.println("setAno");
        Date ano = null;
        Selecao instance = new Selecao();
        instance.setAno(ano);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPosicao method, of class Selecao.
     */
    @Test
    public void testGetPosicao() {
        System.out.println("getPosicao");
        Selecao instance = new Selecao();
        int expResult = 0;
        int result = instance.getPosicao();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPosicao method, of class Selecao.
     */
    @Test
    public void testSetPosicao() {
        System.out.println("setPosicao");
        int posicao = 0;
        Selecao instance = new Selecao();
        instance.setPosicao(posicao);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTecnicos method, of class Selecao.
     */
    @Test
    public void testGetTecnicos() {
        System.out.println("getTecnicos");
        Selecao instance = new Selecao();
        Set expResult = null;
        Set result = instance.getTecnicos();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTecnicos method, of class Selecao.
     */
    @Test
    public void testSetTecnicos() {
        System.out.println("setTecnicos");
        Set tecnicos = null;
        Selecao instance = new Selecao();
        instance.setTecnicos(tecnicos);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSubstituicaos method, of class Selecao.
     */
    @Test
    public void testGetSubstituicaos() {
        System.out.println("getSubstituicaos");
        Selecao instance = new Selecao();
        Set expResult = null;
        Set result = instance.getSubstituicaos();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSubstituicaos method, of class Selecao.
     */
    @Test
    public void testSetSubstituicaos() {
        System.out.println("setSubstituicaos");
        Set substituicaos = null;
        Selecao instance = new Selecao();
        instance.setSubstituicaos(substituicaos);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGols method, of class Selecao.
     */
    @Test
    public void testGetGols() {
        System.out.println("getGols");
        Selecao instance = new Selecao();
        Set expResult = null;
        Set result = instance.getGols();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGols method, of class Selecao.
     */
    @Test
    public void testSetGols() {
        System.out.println("setGols");
        Set gols = null;
        Selecao instance = new Selecao();
        instance.setGols(gols);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCopas method, of class Selecao.
     */
    @Test
    public void testGetCopas() {
        System.out.println("getCopas");
        Selecao instance = new Selecao();
        Set expResult = null;
        Set result = instance.getCopas();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCopas method, of class Selecao.
     */
    @Test
    public void testSetCopas() {
        System.out.println("setCopas");
        Set copas = null;
        Selecao instance = new Selecao();
        instance.setCopas(copas);
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Selecao.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Selecao instance = new Selecao();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Selecao.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Selecao instance = new Selecao();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
