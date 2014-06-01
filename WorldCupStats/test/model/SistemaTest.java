/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;
import java.util.Iterator;
import org.junit.After;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author lsantana
 */
public class SistemaTest {

    Sistema sistema = new Sistema();

    public SistemaTest() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void cadastrarPaisTest() {
        sistema.cadastrarPais("Brazil", "America do sul");
        assertFalse(sistema.paises.isEmpty());
        assertTrue(sistema.paises.size()==1);
        
        sistema.cadastrarPais("EUA", "America do Norte");
        assertFalse(sistema.paises.size()==1);
        assertTrue(sistema.paises.size()==2);
    }


    @Test
    public void cadastrarCopaTest() {
        sistema.cadastrarCopa(new Date(2014,0,0), new Pais("Brazil", "America do sul"));
        assertFalse(sistema.copas.isEmpty());
        assertTrue(sistema.copas.size()==1);
        
        sistema.cadastrarCopa(new Date(2010,0,0), new Pais("Africa do Sul", "Africa"));
        assertFalse(sistema.copas.size()==1);
        assertTrue(sistema.copas.size()==2);
    }

    @Test
    public void listarPaisesTest() {
        Iterator it=sistema.listarPaises();
        assertFalse(it.hasNext());
    }

    @Test
    public void listarCopasTest() {
        Iterator it=sistema.listarCopas();
        assertFalse(it.hasNext());
        
        sistema.cadastrarCopa(new Date(2014,0,0), new Pais("Brazil", "America do sul"));
        sistema.cadastrarCopa(new Date(2010,0,0), new Pais("Africa do Sul", "Africa"));
        assertTrue(it.hasNext());
        assertEquals(new Date(2014,0,0), ((Copa)it.next()).getData());
        
    }
    
    @Test
    public void eMarmelada(){
    sistema.eMarmelada();
    }
    
    @Test
    public void eDoBrasil(){
    sistema.eDoBrasil();
    }
    
    @Test
    public void toDentro(){
    sistema.toDentro();
    }
    
    @Test
    public void arrozDeCopa(){
    sistema.arrozDeCopa();
    }
    
    @Test
    public void sempreVice(){
    sistema.sempreVice();
    }
    
    
    @Test
    public void fregues(){
    sistema.fregues();
    }
    
    
    @Test
    public void timeBom(){
    sistema.timeBom();
    }
    
    @Test
    public void timeRuim(){
    sistema.timeRuim();
    }
    
    @Test
    public void invictos(){
    sistema.invictos();
    }
    
    @Test
    public void perdeuGanhou(){
    sistema.perdeuGanhou();
    }
}
