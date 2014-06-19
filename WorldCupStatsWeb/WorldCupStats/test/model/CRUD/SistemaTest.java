/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.CRUD;

import junit.framework.Assert;
import model.pojo.Pais;
import org.junit.After;
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
        Pais brasil= sistema.cadastrarPais("Brazil", "America do sul");
        Assert.assertNotNull(brasil);
    }


    @Test
    public void cadastrarCopaTest() {
    }

    @Test
    public void listarPaisesTest() {
    }

    @Test
    public void listarCopasTest() {
        
        
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
