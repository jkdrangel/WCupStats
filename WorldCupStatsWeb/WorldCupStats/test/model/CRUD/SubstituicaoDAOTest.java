/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.CRUD;

import java.sql.Date;
import java.sql.Time;
import java.util.List;
import model.Enuns.FaseCopa;
import model.Enuns.FuncaoJogador;
import model.pojo.Jogador;
import model.pojo.Jogo;
import model.pojo.Selecao;
import model.pojo.Substituicao;
import org.junit.After;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
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

    private JogadorDAO daoJogador;
    private Jogador jogador1, jogador2;

    @Before
    public void setUp() {

        dao = new SubstituicaoDAO();
        daoSelecao = new SelecaoDAO();
        daoJogo = new JogoDAO();
        daoJogador= new JogadorDAO();

        selecao = new Selecao("A", new Date(100, 1, 1), 5);
        
        
        jogo = new Jogo(new Date(50, 1, 1), "Fonte Nova", FaseCopa.FINAL.getFase());
        jogador1 = new Jogador(new Date(99, 1, 1), "Gonzaga", 10, FuncaoJogador.GOLEIRO.getFuncao());
        jogador2 = new Jogador(new Date(150, 1, 1), "Alguem", 99, FuncaoJogador.VOLANTE.getFuncao());
        
        substituicao1 = new Substituicao(new Time(0, 93, 10));
        substituicao1.setSelecao(selecao);
        substituicao1.setJogadorByJogadorEntra(jogador1);
        substituicao1.setJogadorByJogadorSai(jogador2);
        substituicao1.setJogo(jogo);

        substituicao2 = new Substituicao(new Time(1,0,1));
        substituicao2.setSelecao(selecao);
        substituicao2.setJogadorByJogadorEntra(jogador1);
        substituicao2.setJogadorByJogadorSai(jogador2);
        substituicao2.setJogo(jogo);
        
        substituicao3 = new Substituicao(new Time(1,1,1));
        substituicao3.setSelecao(selecao);
        substituicao3.setJogadorByJogadorEntra(jogador1);
        substituicao3.setJogadorByJogadorSai(jogador2);
        substituicao3.setJogo(jogo);


        daoSelecao.adicionar(selecao);
        daoJogador.adicionar(jogador1);
        daoJogador.adicionar(jogador2);
        daoJogo.adicionar(jogo);
    }

    @After
    public void tearDown() {
        daoSelecao.removerTodos();
        daoJogo.removerTodos();
        dao.removerTodos();
        daoJogador.removerTodos();
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
        substituicao1.setTempo(new Time(0, 0, 10));
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

        Substituicao subs = dao.buscar(substituicao1.getTempo(), selecao, jogo);
        assertEquals(substituicao1, subs);

        subs = dao.buscar(substituicao2.getTempo(), selecao, jogo);
        assertEquals(substituicao2, subs);

        subs = dao.buscar(substituicao3.getTempo(), selecao, jogo);
        assertEquals(substituicao3, subs);
    }

}
