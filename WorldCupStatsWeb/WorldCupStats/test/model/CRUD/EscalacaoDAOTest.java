/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model.CRUD;

import java.util.List;
import model.pojo.Escalacao;
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
public class EscalacaoDAOTest {
    EscalacaoDAO escDAO;
    Escalacao escA, escB;
    Selecao selecaoA, selecaoB;
    Jogo jogo;
    Jogador jogA1, jogA2, jogA3, jogA4, jogA5, jogA6, jogA7,
            jogA8, jogA9, jogA10, jogA11;
    Jogador jogB1, jogB2, jogB3, jogB4, jogB5, jogB6, jogB7,
            jogB8, jogB9, jogB10, jogB11;
    
    
    @Before
    public void setUp() {
        escDAO = new EscalacaoDAO();
        
        jogA1 = new Jogador();
        jogA2 = new Jogador();
        jogA3 = new Jogador();
        jogA4 = new Jogador();
        jogA5 = new Jogador();
        jogA6 = new Jogador();
        jogA7 = new Jogador();
        jogA8 = new Jogador();
        jogA9 = new Jogador();
        jogA10 = new Jogador();
        jogA11 = new Jogador();
        
        jogB1 = new Jogador();
        jogB2 = new Jogador();
        jogB3 = new Jogador();
        jogB4 = new Jogador();
        jogB5 = new Jogador();
        jogB6 = new Jogador();
        jogB7 = new Jogador();
        jogB8 = new Jogador();
        jogB9 = new Jogador();
        jogB10 = new Jogador();
        jogB11 = new Jogador();
        
        selecaoA = new Selecao();
        selecaoA.setJogadorByJogador1(jogA1);
        selecaoA.setJogadorByJogador2(jogA2);
        selecaoA.setJogadorByJogador3(jogA3);
        selecaoA.setJogadorByJogador4(jogA4);
        selecaoA.setJogadorByJogador5(jogA5);
        selecaoA.setJogadorByJogador6(jogA6);
        selecaoA.setJogadorByJogador7(jogA7);
        selecaoA.setJogadorByJogador8(jogA8);
        selecaoA.setJogadorByJogador9(jogA9);
        selecaoA.setJogadorByJogador10(jogA10);
        selecaoA.setJogadorByJogador11(jogA11);
        
        selecaoB = new Selecao();
        selecaoB.setJogadorByJogador1(jogB1);
        selecaoB.setJogadorByJogador2(jogB2);
        selecaoB.setJogadorByJogador3(jogB3);
        selecaoB.setJogadorByJogador4(jogB4);
        selecaoB.setJogadorByJogador5(jogB5);
        selecaoB.setJogadorByJogador6(jogB6);
        selecaoB.setJogadorByJogador7(jogB7);
        selecaoB.setJogadorByJogador8(jogB8);
        selecaoB.setJogadorByJogador9(jogB9);
        selecaoB.setJogadorByJogador10(jogB10);
        selecaoB.setJogadorByJogador11(jogB11);
        
        jogo = new Jogo();
        jogo.setSelecaoBySelecaoA(selecaoA);
        jogo.setSelecaoBySelecaoB(selecaoB);
        
        escA = new Escalacao();
        escA.setJogadorByJogador1(jogA1);
        escA.setJogadorByJogador2(jogA2);
        escA.setJogadorByJogador3(jogA3);
        escA.setJogadorByJogador4(jogA4);
        escA.setJogadorByJogador5(jogA5);
        escA.setJogadorByJogador6(jogA6);
        escA.setJogadorByJogador7(jogA7);
        escA.setJogadorByJogador8(jogA8);
        escA.setJogadorByJogador9(jogA9);
        escA.setJogadorByJogador10(jogA10);
        escA.setJogadorByJogador11(jogA11);
        escA.setSelecao(selecaoA);
        escA.setJogo(jogo);
        
        escB = new Escalacao();
        escB.setJogadorByJogador1(jogB1);
        escB.setJogadorByJogador2(jogB2);
        escB.setJogadorByJogador3(jogB3);
        escB.setJogadorByJogador4(jogB4);
        escB.setJogadorByJogador5(jogB5);
        escB.setJogadorByJogador6(jogB6);
        escB.setJogadorByJogador7(jogB7);
        escB.setJogadorByJogador8(jogB8);
        escB.setJogadorByJogador9(jogB9);
        escB.setJogadorByJogador10(jogA10);
        escB.setJogadorByJogador11(jogA11);
        escB.setSelecao(selecaoB);
        escB.setJogo(jogo);
    }
    
    @After
    public void tearDown() {
        escDAO.removerTodos();
    }

    @Test
    public void testAdicionar(){
        escDAO.adicionar(escA);
        List<Escalacao> escs = escDAO.listar();
        assertEquals(escA, escs.get(0));
    }
    
    @Test
    public void testAtualizar(){
        escDAO.adicionar(escA);
        escDAO.adicionar(escB);
        Jogador jogA12 = new Jogador();
        
        escA.setJogadorByJogador6(jogA12);
        escDAO.atualizar(escA);
        List<Escalacao> escs = escDAO.listar();
        
        assertEquals(2, escs.size());
        assertEquals(escA, escs.get(1));
    }
    
    @Test
    public void testRemover(){
        escDAO.adicionar(escA);
        escDAO.adicionar(escB);
        
        escDAO.remover(escA);
        List<Escalacao> escs = escDAO.listar();
        assertEquals(1, escs.size());
    }
    
    @Test
    public void testRemoverTodos(){
        escDAO.adicionar(escA);
        escDAO.adicionar(escB);
        
        escDAO.removerTodos();
        List<Escalacao> escs = escDAO.listar();
        assertTrue(escs.isEmpty());
    }
    
    @Test
    public void testListar(){
        List<Escalacao> escs = escDAO.listar();
        assertTrue(escs.isEmpty());
        
        escDAO.adicionar(escA);
        escDAO.adicionar(escB);
        assertFalse(escs.isEmpty());
        
        assertEquals(escA, escs.get(0));
        assertEquals(escB, escs.get(1));
        
        escDAO.remover(escA);
        escs = escDAO.listar();
        assertEquals(1, escs.size());
    }
    
    @Test
    public void testBuscar(){
        escDAO.adicionar(escA);
        escDAO.adicionar(escB);
        
        Escalacao resultado = escDAO.buscar(jogo, selecaoA);
        assertEquals(escA, resultado);
    }
}
