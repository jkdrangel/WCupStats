/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model.CRUD;

import java.sql.Date;
import java.util.List;
import model.pojo.Jogo;
import model.pojo.Pais;
import model.pojo.Selecao;
import model.pojo.Substituicao;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author marc
 */
public class SubstituicaoDAOTest {

    private SubstituicaoDAO dao;
    private Substituicao substituicao;
    private Selecao selecao;
    private Jogo jogo;
    
    @Before
    public void setUp() {

        dao = new SubstituicaoDAO();
        
        selecao = new Selecao();
        selecao.setAno(new Date(100, 1, 1));
        substituicao = new Substituicao();
        substituicao.setSelecao(selecao);
        
        jogo = new Jogo();
    }

    
    @After
    public void tearDown() {
        dao.removerTodos();
    }
    
    /**
     * Test of adicionar method, of class SubstituicaoDAO.
     */
    @Test
    public void testAdicionar() {
        
        
    }

    /**
     * Test of atualizar method, of class SubstituicaoDAO.
     */
    @Test
    public void testAtualizar() {

        
    }

    /**
     * Test of remover method, of class SubstituicaoDAO.
     */
    @Test
    public void testRemover() {

        
    }

    /**
     * Test of removerTodos method, of class SubstituicaoDAO.
     */
    @Test
    public void testRemoverTodos() {

        
    }

    /**
     * Test of listar method, of class SubstituicaoDAO.
     */
    @Test
    public void testListar() {

        
    }

    /**
     * Test of buscar method, of class SubstituicaoDAO.
     */
    @Test
    public void testBuscar() {
      
        
    }
    
}
