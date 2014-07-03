/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model.CRUD;

import java.sql.Date;
import java.util.List;
import model.Enuns.FaseCopa;
import model.Enuns.FuncaoJogador;
import model.pojo.Gol;
import model.pojo.Jogador;
import model.pojo.Jogo;
import model.pojo.Selecao;
import org.junit.After;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author D.L.O.L.
 */
public class GolDAOTest {
    private GolDAO golDAO;
    private Gol gol1, gol2, gol3, gol4;
    
    private JogoDAO daoJogo;
    private Jogo jogo;
    
    private JogadorDAO daoJogador;
    private Jogador jogador1, jogador2, jogador3;
    
    private SelecaoDAO daoSelecao;
    private Selecao selecao1, selecao2;
    
    @Before
    public void setUp() {
        golDAO = new GolDAO();
        daoJogador = new JogadorDAO();
        daoSelecao = new SelecaoDAO();
        daoJogo = new JogoDAO();
        
        jogador1 = new Jogador(new Date(99, 1, 1), "Gonzaga", 10, FuncaoJogador.GOLEIRO.getFuncao());
        jogador2 = new Jogador(new Date(150, 1, 1), "Alguem", 99, FuncaoJogador.VOLANTE.getFuncao());
        jogador3 = new Jogador(new Date(500, 1, 1), "Veinho", 00, FuncaoJogador.ATACANTE.getFuncao());
        
        selecao1 = new Selecao("A", new Date(100, 1, 1), 5);
        selecao1.setJogadorByJogador1(jogador1);
        selecao1.setJogadorByJogador2(jogador2);
        
        selecao2 = new Selecao("H", new Date(50, 1, 1), 1);
        selecao2.setJogadorByJogador1(jogador3);
        
        jogo = new Jogo(new Date(50, 1, 1), "Fonte Nova", FaseCopa.FINAL.getFase());
        jogo.setSelecaoBySelecaoA(selecao1);
        jogo.setSelecaoBySelecaoB(selecao2);
        
        gol1 = new Gol(new java.sql.Time(1,0,0), false);
        gol1.setJogador(jogador1);
        gol1.setJogo(jogo);
        gol1.setSelecao(selecao1);
        
        gol2 = new Gol(new java.sql.Time(1,1,1), false);
        gol2.setJogador(jogador1);
        gol2.setJogo(jogo);
        gol2.setSelecao(selecao1);
        
        gol3 = new Gol(new java.sql.Time(0,1,2), false);
        gol3.setJogador(jogador2);
        gol3.setJogo(jogo);
        gol3.setSelecao(selecao1);
        
        gol4 = new Gol(new java.sql.Time(0,20,1), false);
        gol4.setJogador(jogador3);
        gol4.setJogo(jogo);
        gol4.setSelecao(selecao2);

        daoJogador.adicionar(jogador1);
        daoJogador.adicionar(jogador2);
        daoJogador.adicionar(jogador3);
        
        daoSelecao.adicionar(selecao1);
        daoSelecao.adicionar(selecao2);
        
        daoJogo.adicionar(jogo);
    }
    
    @After
    public void tearDown() {
        daoJogador.removerTodos();
        daoSelecao.removerTodos();
        daoJogo.removerTodos();
        golDAO.removerTodos();
    }

    @Test
    public void testAdicionar(){
        golDAO.adicionar(gol1);
        List<Gol> gols = golDAO.listar();
        assertEquals(gol1, gols.get(0));
    }
    
    @Test
    public void testAtualizar(){
        golDAO.adicionar(gol1);
        golDAO.adicionar(gol2);
        golDAO.adicionar(gol3);
        
        gol2.setJogador(jogador2);
        golDAO.atualizar(gol2);
        List<Gol> gols = golDAO.listar();
        assertEquals(gol2, gols.get(1));
    }
    
    @Test
    public void testRemover(){
        golDAO.adicionar(gol1);
        golDAO.adicionar(gol2);
        golDAO.adicionar(gol3);
        golDAO.adicionar(gol4);
        
        golDAO.remover(gol3);
        List<Gol> gols = golDAO.listar();
        assertTrue(3 == gols.size());
        assertEquals(gol1, gols.get(0));
        assertEquals(gol2, gols.get(1));
        assertEquals(gol4, gols.get(2));
    }
    
    @Test
    public void testRemoverTodos(){
        golDAO.adicionar(gol1);
        golDAO.adicionar(gol2);
        golDAO.adicionar(gol3);
        golDAO.adicionar(gol4);
        
        golDAO.removerTodos();
        List<Gol> gols = golDAO.listar();
        assertTrue(gols.isEmpty());
    }
    
    @Test
    public void testListar(){
        List<Gol> gols = golDAO.listar();
        assertTrue(gols.isEmpty());
        
        golDAO.adicionar(gol1);
        golDAO.adicionar(gol2);
        golDAO.adicionar(gol3);
        golDAO.adicionar(gol4);
        gols = golDAO.listar();
        assertFalse(gols.isEmpty());
        
        assertEquals(gol1, gols.get(0));
        assertEquals(gol2, gols.get(1));
        assertEquals(gol3, gols.get(2));
        assertEquals(gol4, gols.get(3));
     
    }
    
    @Test
    public void testBuscar(){
        golDAO.adicionar(gol1);
        golDAO.adicionar(gol2);
        golDAO.adicionar(gol3);
        golDAO.adicionar(gol4);
        
        Gol resultado = golDAO.buscar(jogo, gol1.getTempo());
        assertEquals(gol1, resultado);
    }
}
