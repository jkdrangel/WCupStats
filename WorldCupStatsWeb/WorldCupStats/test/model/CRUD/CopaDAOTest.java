/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model.CRUD;

import java.util.Date;
import java.util.List;
import model.pojo.Copa;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lsantana
 */
public class CopaDAOTest {
    
    public CopaDAOTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of adicionar method, of class CopaDAO.
     */
    @Test
    public void testAdicionar() {
        System.out.println("adicionar");
        Copa copa = null;
        CopaDAO instance = new CopaDAO();
        instance.adicionar(copa);
        fail("The test case is a prototype.");
    }

    /**
     * Test of atualizar method, of class CopaDAO.
     */
    @Test
    public void testAtualizar() {
        System.out.println("atualizar");
        Copa copa = null;
        CopaDAO instance = new CopaDAO();
        instance.atualizar(copa);
        fail("The test case is a prototype.");
    }

    /**
     * Test of remover method, of class CopaDAO.
     */
    @Test
    public void testRemover() {
        System.out.println("remover");
        Copa copa = null;
        CopaDAO instance = new CopaDAO();
        instance.remover(copa);
        fail("The test case is a prototype.");
    }

    /**
     * Test of removerTodos method, of class CopaDAO.
     */
    @Test
    public void testRemoverTodos() {
        System.out.println("removerTodos");
        CopaDAO instance = new CopaDAO();
        instance.removerTodos();
        fail("The test case is a prototype.");
    }

    /**
     * Test of listar method, of class CopaDAO.
     */
    @Test
    public void testListar() {
        System.out.println("listar");
        CopaDAO instance = new CopaDAO();
        List<CopaDAO> expResult = null;
        List<Copa> result = instance.listar();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscar method, of class CopaDAO.
     */
    @Test
    public void testBuscar() {
        System.out.println("buscar");
        Date ano = null;
        CopaDAO instance = new CopaDAO();
        Copa expResult = null;
        Copa result = instance.buscar(ano);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
