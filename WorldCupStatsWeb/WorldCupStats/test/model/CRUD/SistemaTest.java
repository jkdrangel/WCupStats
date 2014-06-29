/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.CRUD;

import java.sql.Date;
import java.util.List;
import model.pojo.Copa;
import model.pojo.Pais;
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
        sistema.copa.removerTodos();
        sistema.pais.removerTodos();
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void cadastrarPaisTest() {
        Pais brasil= sistema.cadastrarPais("Brazil", "America do sul");
        assertNotNull(brasil);
        List<Pais> paises = sistema.listarPaises();
        assertEquals(brasil, paises.get(0));
    }


    @Test
    public void cadastrarCopaTest() {
        Copa brasil= sistema.cadastrarCopa(new Date(114,1,1),null,null);
        assertNotNull(brasil);
        List<Copa> copas = sistema.listarCopas();
        assertEquals(brasil, copas.get(0));
    }

    @Test
    public void listarPaisesTest() {
        Pais brasil= sistema.cadastrarPais("brasil", "america");
        Pais africa= sistema.cadastrarPais("africa", "africa");
        Pais coreia= sistema.cadastrarPais("coreia", "asia");
        
        List<Pais> paises = sistema.listarPaises();
        assertFalse(paises.isEmpty());
        assertEquals(brasil, paises.get(0));
        assertEquals(africa, paises.get(1));
        assertEquals(coreia, paises.get(2));
    }

    @Test
    public void listarCopasTest() {
        
        Copa copa= sistema.cadastrarCopa(new Date(114,1,1),null,null);
        Copa copa1= sistema.cadastrarCopa(new Date(110,1,1),null,null);
        Copa copa2= sistema.cadastrarCopa(new Date(106,1,1),null,null);
        List<Copa> copas = sistema.listarCopas();
        assertFalse(copas.isEmpty());
        assertEquals(copa, copas.get(0));
        assertEquals(copa1, copas.get(1));
        assertEquals(copa2, copas.get(2));
        
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
