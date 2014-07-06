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
 * @author D.L.O.L.
 */
public class EscalacaoDAOTest {

    private EscalacaoDAO escDAO;
    private Escalacao escA, escB;

    private SelecaoDAO daoSelecao;
    private Selecao selecaoA, selecaoB;

    private JogoDAO daoJogo;
    private Jogo jogo;

    private JogadorDAO daoJogador;
    private Jogador jogA1, jogA2, jogA3, jogA4, jogA5, jogA6, jogA7,
            jogA8, jogA9, jogA10, jogA11;
    private Jogador jogB1, jogB2, jogB3, jogB4, jogB5, jogB6, jogB7,
            jogB8, jogB9, jogB10, jogB11;

    @Before
    public void setUp() {
        escDAO = new EscalacaoDAO();
        daoJogador = new JogadorDAO();
        daoSelecao = new SelecaoDAO();
        daoJogo = new JogoDAO();

        jogA1 = new Jogador(new Date(200, 1, 1), "Clediosmar", 2, FuncaoJogador.ATACANTE.getFuncao());
        jogA2 = new Jogador(new Date(200, 1, 1), "Niu", 10, FuncaoJogador.ATACANTE.getFuncao());
        jogA3 = new Jogador(new Date(200, 1, 1), "Nii", 5, FuncaoJogador.ATACANTE.getFuncao());
        jogA4 = new Jogador(new Date(200, 1, 1), "Onee", 7, FuncaoJogador.ATACANTE.getFuncao());
        jogA5 = new Jogador(new Date(200, 1, 1), "Vish", 8, FuncaoJogador.ATACANTE.getFuncao());
        jogA6 = new Jogador(new Date(200, 1, 1), "Tá", 11, FuncaoJogador.MEIO_ATACANTE.getFuncao());
        jogA7 = new Jogador(new Date(200, 1, 1), "tapioca", 9, FuncaoJogador.MEIO_ATACANTE.getFuncao());
        jogA8 = new Jogador(new Date(200, 1, 1), "caudio", 17, FuncaoJogador.MEIO_ATACANTE.getFuncao());
        jogA9 = new Jogador(new Date(200, 1, 1), "claudio", 13, FuncaoJogador.ZAGUEIRO.getFuncao());
        jogA10 = new Jogador(new Date(200, 1, 1), "coragi", 35, FuncaoJogador.ZAGUEIRO.getFuncao());
        jogA11 = new Jogador(new Date(200, 1, 1), "bom", 6, FuncaoJogador.GOLEIRO.getFuncao());

        jogB1 = new Jogador(new Date(200, 1, 1), "nossa", 15, FuncaoJogador.ATACANTE.getFuncao());
        jogB2 = new Jogador(new Date(200, 1, 1), "nego", 99, FuncaoJogador.ATACANTE.getFuncao());
        jogB3 = new Jogador(new Date(200, 1, 1), "chanarou", 50, FuncaoJogador.ATACANTE.getFuncao());
        jogB4 = new Jogador(new Date(200, 1, 1), "datte", 1, FuncaoJogador.ATACANTE.getFuncao());
        jogB5 = new Jogador(new Date(200, 1, 1), "abata", 2, FuncaoJogador.ATACANTE.getFuncao());
        jogB6 = new Jogador(new Date(200, 1, 1), "nao", 3, FuncaoJogador.ATACANTE.getFuncao());
        jogB7 = new Jogador(new Date(200, 1, 1), "damee", 4, FuncaoJogador.ATACANTE.getFuncao());
        jogB8 = new Jogador(new Date(200, 1, 1), "lol", 5, FuncaoJogador.ZAGUEIRO.getFuncao());
        jogB9 = new Jogador(new Date(200, 1, 1), "ok", 9, FuncaoJogador.ZAGUEIRO.getFuncao());
        jogB10 = new Jogador(new Date(200, 1, 1), "subarashii", 35, FuncaoJogador.ZAGUEIRO.getFuncao());
        jogB11 = new Jogador(new Date(200, 1, 1), "sugoi", 6, FuncaoJogador.GOLEIRO.getFuncao());

        selecaoA = new Selecao("A", new Date(100, 1, 1), 5);

        selecaoB = new Selecao("H", new Date(50, 1, 1), 1);

        jogo = new Jogo(new Date(50, 1, 1), "Fonte Nova", FaseCopa.FINAL.getFase());
        jogo.setSelecaoBySelecaoA(selecaoA);
        jogo.setSelecaoBySelecaoB(selecaoB);

        escA = new Escalacao();
        escA.setJogador(jogA1);
        /*
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
         */
        escA.setSelecao(selecaoA);

        escA.setJogo(jogo);

        escB = new Escalacao();
        escB.setJogador(jogB1);
        /*
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
                */
        escB.setSelecao(selecaoB);
        escB.setJogo(jogo);

        daoJogador.adicionar(jogA1);
        daoJogador.adicionar(jogA2);
        daoJogador.adicionar(jogA3);
        daoJogador.adicionar(jogA4);
        daoJogador.adicionar(jogA5);
        daoJogador.adicionar(jogA6);
        daoJogador.adicionar(jogA7);
        daoJogador.adicionar(jogA8);
        daoJogador.adicionar(jogA9);
        daoJogador.adicionar(jogA10);
        daoJogador.adicionar(jogA11);
        daoJogador.adicionar(jogB1);
        daoJogador.adicionar(jogB2);
        daoJogador.adicionar(jogB3);
        daoJogador.adicionar(jogB4);
        daoJogador.adicionar(jogB5);
        daoJogador.adicionar(jogB6);
        daoJogador.adicionar(jogB7);
        daoJogador.adicionar(jogB8);
        daoJogador.adicionar(jogB9);
        daoJogador.adicionar(jogB10);
        daoJogador.adicionar(jogB11);

        daoSelecao.adicionar(selecaoA);
        daoSelecao.adicionar(selecaoB);

        daoJogo.adicionar(jogo);
    }

    @After
    public void tearDown() {
        escDAO.removerTodos();
        daoJogo.removerTodos();
        daoSelecao.removerTodos();
        daoJogador.removerTodos();
    }

    @Test
    public void testAdicionar() {
        escDAO.adicionar(escA);
        List<Escalacao> escs = escDAO.listar();
        assertEquals(escA, escs.get(0));
    }

    @Test
    public void testAtualizar() {
        escDAO.adicionar(escA);
        escDAO.adicionar(escB);
        Jogador jogA12 = new Jogador(new Date(200, 1, 1), "Clediosmar", 2, FuncaoJogador.ATACANTE.getFuncao());
        daoJogador.adicionar(jogA12);
        escA.setJogador(jogA12);
        escDAO.atualizar(escA);
        List<Escalacao> escs = escDAO.listar();

        assertEquals(2, escs.size());
        assertEquals(escA, escs.get(0));
    }

    @Test
    public void testRemover() {
        escDAO.adicionar(escA);
        escDAO.adicionar(escB);

        escDAO.remover(escA);
        List<Escalacao> escs = escDAO.listar();
        assertEquals(1, escs.size());
    }

    @Test
    public void testRemoverTodos() {
        escDAO.adicionar(escA);
        escDAO.adicionar(escB);

        escDAO.removerTodos();
        List<Escalacao> escs = escDAO.listar();
        assertTrue(escs.isEmpty());
    }

    @Test
    public void testListar() {
        List<Escalacao> escs = escDAO.listar();
        assertTrue(escs.isEmpty());

        escDAO.adicionar(escA);
        escDAO.adicionar(escB);
        escs = escDAO.listar();
        assertFalse(escs.isEmpty());

        assertEquals(escA, escs.get(0));
        assertEquals(escB, escs.get(1));

        escDAO.remover(escA);
        escs = escDAO.listar();
        assertEquals(1, escs.size());
    }

    @Test
    public void testBuscar() {
        escDAO.adicionar(escA);
        escDAO.adicionar(escB);

        Escalacao resultado = escDAO.buscar(jogo, selecaoA);
        assertEquals(escA, resultado);
    }
}
