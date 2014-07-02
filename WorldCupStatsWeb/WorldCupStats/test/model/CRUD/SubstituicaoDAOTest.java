/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.CRUD;

import java.sql.Date;
import java.util.List;
import model.Enuns.FaseCopa;
import model.pojo.Jogo;
import model.pojo.Selecao;
import model.pojo.Substituicao;
import org.junit.After;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author D.L.O.L.
 */
public class SubstituicaoDAOTest {

    private SubstituicaoDAO dao;
    private Substituicao substituicao1;
    private Substituicao substituicao2;
    private Substituicao substituicao3;
    
    private SelecaoDAO daoSelecao;
    private Selecao selecao;
    
    private JogoDAO daoJogo;
    private Jogo jogo;

    @Before
    public void setUp() {

        dao = new SubstituicaoDAO();
        daoSelecao = new SelecaoDAO();
        daoJogo = new JogoDAO();

        selecao = new Selecao("A", new Date(100, 1, 1), 5);

        substituicao1 = new Substituicao(new Date(150000));
        substituicao1.setSelecao(selecao);

        substituicao2 = new Substituicao(new Date(300000));
        substituicao2.setSelecao(selecao);
        substituicao2.setTempo(new Date(300000));
        substituicao3 = new Substituicao(new Date(900000));
        substituicao3.setSelecao(selecao);
        substituicao3.setTempo(new Date(900000));

        jogo = new Jogo(new Date(50, 1, 1), "Fonte Nova", FaseCopa.FINAL.getFase());
        
        daoSelecao.adicionar(selecao); 
        
        daoJogo.adicionar(jogo);
    }

    @After
    public void tearDown() {
        daoSelecao.removerTodos();
        daoJogo.removerTodos();
        dao.removerTodos();
    }

    /**
     * Test of adicionar method, of class SubstituicaoDAO.
     */
    @Test
    public void testAdicionar() {

        dao.adicionar(substituicao1);
        dao.adicionar(substituicao2);
        dao.adicionar(substituicao3);

        List<Substituicao> substituicoes = dao.listar();
        assertEquals(substituicao1, substituicoes.get(0));
        assertEquals(substituicao2, substituicoes.get(1));
        assertEquals(substituicao3, substituicoes.get(2));
    }

    /**
     * Test of atualizar method, of class SubstituicaoDAO.
     */
    @Test
    public void testAtualizar() {

        dao.adicionar(substituicao1);
        substituicao1.setTempo(new Date(1000000));
        dao.atualizar(substituicao1);
        List<Substituicao> substituicoes = dao.listar();
        assertEquals(substituicao1, substituicoes.get(0));
    }

    /**
     * Test of remover method, of class SubstituicaoDAO.
     */
    @Test
    public void testRemover() {

        dao.adicionar(substituicao1);
        dao.adicionar(substituicao2);

        dao.remover(substituicao1);
        List<Substituicao> substituicoes = dao.listar();
        assertEquals(substituicao2, substituicoes.get(0));
    }

    /**
     * Test of removerTodos method, of class SubstituicaoDAO.
     */
    @Test
    public void testRemoverTodos() {

        dao.adicionar(substituicao1);
        dao.adicionar(substituicao2);

        List<Substituicao> substituicoes = dao.listar();
        assertTrue(2 == substituicoes.size());
        
        dao.removerTodos();
        
        substituicoes = dao.listar();
        assertTrue(substituicoes.isEmpty());
    }

    /**
     * Test of listar method, of class SubstituicaoDAO.
     */
    @Test
    public void testListar() {

        List<Substituicao> substituicoes = dao.listar();
        assertTrue(substituicoes.isEmpty());

        dao.adicionar(substituicao1);
        dao.adicionar(substituicao2);
        dao.adicionar(substituicao3);

        substituicoes = dao.listar();
        assertFalse(substituicoes.isEmpty());

        assertEquals(substituicao1, substituicoes.get(0));
        assertEquals(substituicao2, substituicoes.get(1));
        assertEquals(substituicao3, substituicoes.get(2));
    }

    /**
     * Test of buscar method, of class SubstituicaoDAO.
     */
    @Test
    public void testBuscar() {

        dao.adicionar(substituicao1);
        dao.adicionar(substituicao2);
        dao.adicionar(substituicao3);

        Substituicao subs = dao.buscar(new Date(150000), selecao, jogo);
        assertEquals(substituicao1, subs);

        subs = dao.buscar(new Date(300000), selecao, jogo);
        assertEquals(substituicao2, subs);

        subs = dao.buscar(new Date(900000), selecao, jogo);
        assertEquals(substituicao3, subs);
    }

}
