/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model.CRUD;

import java.sql.Date;
import java.util.List;
import model.pojo.Pais;
import model.pojo.Selecao;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author natsu
 */
public class SelecaoDAOTest {
   
    private SelecaoDAO dao;
    private Selecao selecaoA;
    private Selecao selecaoB;
    
    private PaisDAO daoPais;
    private Pais paisA;
    private Pais paisB;
    
    @Before
    public void setUp() {
        dao = new SelecaoDAO();
        
        selecaoA = new Selecao("A", new Date(100, 1, 1), 5);
        paisA = new Pais("Pais", "Mundo");
        selecaoA.setPais(paisA);
        
        selecaoB = new Selecao("H", new Date(50, 1, 1), 1);
        paisB = new Pais("Country", "World");
        selecaoB.setPais(paisB);
        
        daoPais.adicionar(paisA);
        daoPais.adicionar(paisB);
    }
    
    @After
    public void tearDown() {
        daoPais.removerTodos();
        dao.removerTodos();
    }

    /**
     * Test of adicionar method, of class SelecaoDAO.
     */
    @Test
    public void testAdicionar() {
        
        dao.adicionar(selecaoA);
        dao.adicionar(selecaoB);
        
        List<Selecao> selecoes = dao.listar();
        assertEquals(selecaoA, selecoes.get(0));
        assertEquals(selecaoB, selecoes.get(1));
    }

    /**
     * Test of atualizar method, of class SelecaoDAO.
     */
    @Test
    public void testAtualizar() {
       
        dao.adicionar(selecaoA);
        selecaoA.setPais(paisB);
        dao.atualizar(selecaoA);
        List<Selecao> selecoes = dao.listar();
        assertEquals(selecaoA, selecoes.get(0));
    }

    /**
     * Test of remover method, of class SelecaoDAO.
     */
    @Test
    public void testRemover() {
        
        dao.adicionar(selecaoA);
        dao.adicionar(selecaoB);
        
        dao.remover(selecaoA);
        List<Selecao> selecoes = dao.listar();
        assertEquals(selecaoB, selecoes.get(0));
    }

    /**
     * Test of removerTodos method, of class SelecaoDAO.
     */
    @Test
    public void testRemoverTodos() {
        
        dao.adicionar(selecaoA);
        dao.adicionar(selecaoB);
        
        List<Selecao> selecoes = dao.listar();
        assertTrue(2 == selecoes.size());

        dao.removerTodos();
        
        selecoes = dao.listar();
        assertTrue(selecoes.isEmpty());
    }

    /**
     * Test of listar method, of class SelecaoDAO.
     */
    @Test
    public void testListar() {
        
        List<Selecao> selecoes = dao.listar();
        assertTrue(selecoes.isEmpty());
        
        dao.adicionar(selecaoA);
        dao.adicionar(selecaoB);
        
        selecoes = dao.listar();
        assertFalse(selecoes.isEmpty());
        
        assertEquals(selecaoA, selecoes.get(0));
        assertEquals(selecaoB, selecoes.get(1));
    }

    /**
     * Test of buscar method, of class SelecaoDAO.
     */
    @Test
    public void testBuscar() {
        
        dao.adicionar(selecaoA);
        dao.adicionar(selecaoB);
        
        Selecao selecao = dao.buscar(paisA, new Date(100, 1, 1));
        assertEquals(selecaoA, selecao);
        
        selecao = dao.buscar(paisB, new Date(50, 1, 1));
        assertEquals(selecaoB, selecao);
    }
    
}
