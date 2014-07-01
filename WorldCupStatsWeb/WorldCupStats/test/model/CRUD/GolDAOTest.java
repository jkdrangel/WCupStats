/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model.CRUD;

import java.util.Date;
import java.util.List;
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
 * @author lsantana
 */
public class GolDAOTest {
    GolDAO golDAO;
    Gol gol1, gol2, gol3, gol4;
    Jogo jogo;
    Jogador jogador1, jogador2, jogador3;
    Selecao selecao1, selecao2;
    
    @Before
    public void setUp() {
        golDAO = new GolDAO();
        
        jogador1 = new Jogador();
        jogador2 = new Jogador();
        jogador3 = new Jogador();
        
        selecao1 = new Selecao();
        selecao1.setJogador1(jogador1.getId());
        selecao1.setJogador2(jogador2.getId());
        
        selecao2 = new Selecao();
        selecao2.setJogador1(jogador3.getId());
        
        jogo = new Jogo();
        jogo.setSelecaoBySelecaoA(selecao1);
        jogo.setSelecaoBySelecaoB(selecao2);
        
        gol1 = new Gol();
        gol1.setJogador(jogador1);
        gol1.setJogo(jogo);
        gol1.setSelecao(selecao1);
        gol1.setFoiContra(false);
        gol1.setTempo(new java.sql.Date(114, 0, 0));
        
        gol2 = new Gol();
        gol2.setJogador(jogador1);
        gol2.setJogo(jogo);
        gol2.setSelecao(selecao1);
        gol2.setFoiContra(false);
        
        gol3 = new Gol();
        gol3.setJogador(jogador2);
        gol3.setJogo(jogo);
        gol3.setSelecao(selecao1);
        gol3.setFoiContra(false);
        
        gol4 = new Gol();
        gol4.setJogador(jogador3);
        gol4.setJogo(jogo);
        gol4.setSelecao(selecao2);
        gol4.setFoiContra(false);
    }
    
    @After
    public void tearDown() {
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
        assertEquals(3, gols.size());
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
        List<Gol> copas = golDAO.listar();
        assertTrue(copas.isEmpty());
        
        golDAO.adicionar(gol1);
        golDAO.adicionar(gol2);
        golDAO.adicionar(gol3);
        golDAO.adicionar(gol4);
        assertFalse(copas.isEmpty());
        
        assertEquals(gol1, copas.get(0));
        assertEquals(gol2, copas.get(1));
        assertEquals(gol4, copas.get(2));
        
        golDAO.remover(gol2);
        List<Gol> gols = golDAO.listar();
        assertEquals(3, gols.size());
    }
    
    @Test
    public void testBuscar(){
        golDAO.adicionar(gol1);
        golDAO.adicionar(gol2);
        golDAO.adicionar(gol3);
        golDAO.adicionar(gol4);
        
        Gol resultado = golDAO.buscar(jogo, new java.sql.Date(114, 0, 0));
        assertEquals(gol1, resultado);
    }
}
