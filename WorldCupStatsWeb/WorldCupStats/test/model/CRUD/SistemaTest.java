/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.CRUD;

import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
import model.Enuns.FaseCopa;
import model.Enuns.FuncaoJogador;
import model.pojo.Copa;
import model.pojo.Escalacao;
import model.pojo.Gol;
import model.pojo.Jogador;
import model.pojo.Jogo;
import model.pojo.Pais;
import model.pojo.Selecao;
import model.pojo.Substituicao;
import model.pojo.Tecnico;
import org.junit.After;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author lsantana
 */
public class SistemaTest {
    
    Sistema sistema = new Sistema();
    PaisDAO paisDao = sistema.getPaisDao();
    CopaDAO copaDao = sistema.getCopaDao();
    TecnicoDAO tecnicoDao = sistema.getTecnicoDao();
    EscalacaoDAO escalacaoDao = sistema.getEscalacaoDao();
    GolDAO golDao = sistema.getGolDao();
    JogadorDAO jogadorDao = sistema.getJogadorDao();
    JogoDAO jogoDao = sistema.getJogoDao();
    SelecaoDAO selecaoDao = sistema.getSelecaoDao();
    SubstituicaoDAO substituicaoDao = sistema.getSubstituicaoDao();
    
    Pais brasil, africa, coreia;
    Selecao selecaoB1, selecaoA1, selecaoC1, selecaoB2, selecaoA2, selecaoC2,
            selecaoB3, selecaoA3, selecaoC3;
    Escalacao escA1, escB1, escC1, escA2, escB2, escC2, escA3, escB3, escC3;
    Jogador jogA1, jogA2, jogA3, jogA4, jogA5, jogA6, jogA7,
            jogA8, jogA9, jogA10, jogA11, jogB1, jogB2, jogB3,
            jogB4, jogB5, jogB6, jogB7, jogB8, jogB9, jogB10, jogB11;
    Copa copa, copa1, copa2;
    Gol gol1, gol2, gol3, gol4;
    Jogo jogo1, jogo2, jogo3;
    Substituicao substituicao1, substituicao2, substituicao3;
    Tecnico felipao, titi, zagalo;
    
    public SistemaTest() {
    }
    
    @Before
    public void setUp() {
        
        copa = new Copa(new Date(114, 1, 1));
        copa1 = new Copa(new Date(110, 1, 1));
        copa2 = new Copa(new Date(106, 1, 1));
        
        brasil = new Pais("brasil", "america");
        africa = new Pais("Africa", "africa");
        coreia = new Pais("coreia", "asia");
        
        copa.setPais(brasil);
        copa1.setPais(africa);
        copa2.setPais(coreia);
        
        selecaoB1 = new Selecao("A", new Date(50, 1, 1), 1);
        selecaoB1.setPais(brasil);
        selecaoB1.setNome("Brasil");
        selecaoA1 = new Selecao("A", new Date(109, 1, 1), 2);
        selecaoA1.setPais(africa);
        selecaoC1 = new Selecao("A", new Date(108, 1, 1), 3);        
        selecaoC1.setPais(coreia);
        selecaoB2 = new Selecao("A", new Date(110, 1, 1), 1);
        selecaoB2.setPais(brasil);
        selecaoB2.setNome("Brasil");
        selecaoA2 = new Selecao("A", new Date(110, 1, 1), 3);
        selecaoA2.setPais(africa);
        selecaoC2 = new Selecao("A", new Date(110, 1, 1), 2);
        selecaoC2.setPais(coreia);
        selecaoB3 = new Selecao("A", new Date(106, 1, 1), 2);
        selecaoB3.setPais(brasil);
        selecaoB3.setNome("Brasil");
        selecaoA3 = new Selecao("A", new Date(106, 1, 1), 1);
        selecaoA3.setPais(africa);
        selecaoC3 = new Selecao("A", new Date(106, 1, 1), 3);
        selecaoC3.setPais(coreia);
        
        escA1 = new Escalacao();
        escB1 = new Escalacao();
        escC1 = new Escalacao();
        escA2 = new Escalacao();
        escB2 = new Escalacao();
        escC2 = new Escalacao();
        escA3 = new Escalacao();
        escB3 = new Escalacao();
        escC3 = new Escalacao();
        
        escA1.setSelecao(selecaoA1);
        
        jogB1 = new Jogador(new Date(80, 5, 15), "julio", 1, FuncaoJogador.GOLEIRO.getFuncao());
        jogB1.setSelecao(selecaoB1);
        jogB2 = new Jogador(new Date(83, 3, 20), "daniel", 2, FuncaoJogador.LATERAL.getFuncao());
        jogB3 = new Jogador(new Date(90, 11, 2), "tiago", 3, FuncaoJogador.LATERAL.getFuncao());
        jogB4 = new Jogador(new Date(81, 3, 5), "david", 4, FuncaoJogador.ZAGUEIRO.getFuncao());
        jogB5 = new Jogador(new Date(89, 8, 21), "fernandinho", 5, FuncaoJogador.VOLANTE.getFuncao());
        jogB6 = new Jogador(new Date(97, 6, 13), "marcelo", 6, FuncaoJogador.LATERAL.getFuncao());
        jogB7 = new Jogador(new Date(95, 1, 11), "hulk", 7, FuncaoJogador.ATACANTE.getFuncao());
        jogB8 = new Jogador(new Date(82, 6, 8), "paulinho", 8, FuncaoJogador.VOLANTE.getFuncao());
        jogB9 = new Jogador(new Date(84, 2, 27), "fred", 9, FuncaoJogador.ATACANTE.getFuncao());
        jogB10 = new Jogador(new Date(79, 8, 12), "neymar", 10, FuncaoJogador.ATACANTE.getFuncao());
        jogB11 = new Jogador(new Date(91, 7, 30), "oscar", 11, FuncaoJogador.MEIO_DE_CAMPO.getFuncao());
        
        jogo1 = new Jogo(new Date(114, 6, 20), "Maracana", FaseCopa.GRUPOS.getFase());
        jogo2 = new Jogo(new Date(114, 6, 21), "dunas", FaseCopa.GRUPOS.getFase());
        jogo3 = new Jogo(new Date(114, 6, 22), "fonte nova", FaseCopa.GRUPOS.getFase());
        
        felipao = new Tecnico("felipao", new Date(84, 6, 22));
    }
    
    @After
    public void tearDown() {
        copaDao.removerTodos();
        paisDao.removerTodos();
        escalacaoDao.removerTodos();
        golDao.removerTodos();
        jogadorDao.removerTodos();
        jogoDao.removerTodos();
        selecaoDao.removerTodos();
        substituicaoDao.removerTodos();
        tecnicoDao.removerTodos();
    }
    
    @Test
    public void testCadastrarPais() {
        brasil = sistema.cadastrarPais("Brazil", "America do sul");
        assertNotNull(brasil);
        List<Pais> paises = sistema.listarPaises();
        assertEquals(brasil, paises.get(0));
    }
    
    @Test
    public void testCadastrarCopa() {
        paisDao.adicionar(brasil);
        copa1 = sistema.cadastrarCopa(new Date(114, 1, 1), brasil);
        assertNotNull(copa1);
        List<Copa> copas = sistema.listarCopas();
        assertEquals(copa1, copas.get(0));
    }
    
    @Test
    public void testListarPaises() {
        brasil = sistema.cadastrarPais("brasil", "america");
        africa = sistema.cadastrarPais("africa", "africa");
        coreia = sistema.cadastrarPais("coreia", "asia");
        
        List<Pais> paises = sistema.listarPaises();
        assertFalse(paises.isEmpty());
        assertEquals(brasil, paises.get(0));
        assertEquals(africa, paises.get(1));
        assertEquals(coreia, paises.get(2));
    }
    
    @Test
    public void testListarCopas() {
        paisDao.adicionar(brasil);
        paisDao.adicionar(africa);
        paisDao.adicionar(coreia);
        copa = sistema.cadastrarCopa(new Date(114, 1, 1), brasil);
        copa1 = sistema.cadastrarCopa(new Date(110, 1, 1), africa);
        copa2 = sistema.cadastrarCopa(new Date(106, 1, 1), coreia);
        List<Copa> copas = sistema.listarCopas();
        assertFalse(copas.isEmpty());
        assertEquals(copa, copas.get(0));
        assertEquals(copa1, copas.get(1));
        assertEquals(copa2, copas.get(2));
        
    }

    /**
     * Test of listarPaisesCopa method, of class Sistema.
     */
    @Test
    public void testListarPaisesCopa() {
        paisDao.adicionar(brasil);
        copaDao.adicionar(copa);
        selecaoB1.setCopa(copa);
        selecaoB3.setCopa(copa);
        selecaoB2.setCopa(copa);
        selecaoDao.adicionar(selecaoB1);
        selecaoDao.adicionar(selecaoB2);
        selecaoDao.adicionar(selecaoB3);
        
        List<Selecao> lista = sistema.listarPaisesCopa(copa);
        assertFalse(lista.isEmpty());
        
        assertEquals(selecaoB1, lista.get(0));
        assertEquals(selecaoB2, lista.get(1));
        assertEquals(selecaoB3, lista.get(2));
    }

    /**
     * Test of listarJogosCopa method, of class Sistema.
     */
    @Test
    public void testListarJogosCopa() {  //M
        copaDao.adicionar(copa);
        selecaoA1.setCopa(copa);
        selecaoB1.setCopa(copa);
        selecaoC1.setCopa(copa);
        
        selecaoA1.setNome("France");
        selecaoC1.setNome("Japan");
        
        selecaoDao.adicionar(selecaoA1);
        selecaoDao.adicionar(selecaoB1);
        selecaoDao.adicionar(selecaoC1);
        
        jogo1 = sistema.cadastrarJogo(new Date(90, 1, 1), "Anti-Local", copa, selecaoB1, selecaoA1, FaseCopa.FINAL.getFase(), 2, 3);
        jogo2 = sistema.cadastrarJogo(new Date(150, 1, 1), "Kamikaze", copa, selecaoB1, selecaoC1, FaseCopa.GRUPOS.getFase(), 1, 1);
        jogo3 = sistema.cadastrarJogo(new Date(50, 1, 1), "Outro", copa, selecaoC1, selecaoA1, FaseCopa.FINAL.getFase(), 3, 0);
        Jogo jogo4 = sistema.cadastrarJogo(new Date(90, 1, 1), "Local", copa, selecaoB1, selecaoA1, FaseCopa.FINAL.getFase(), 7, 5);
        
        List<Jogo> lista = sistema.listarJogosCopa(copa);
        assertFalse(lista.isEmpty());
        
        assertEquals("Brasil 2x3 France", lista.get(0).toString());
        assertEquals("Brasil 1x1 Japan", lista.get(1).toString());
        assertEquals("Japan 3x0 France", lista.get(2).toString());
        assertEquals("Brasil 7x5 France", lista.get(3).toString());
        
    }

    /**
     * Test of qtdJogosPais method, of class Sistema.
     */
    @Test
    public void testQtdJogosPais() {
        
        brasil = new Pais("brasil", "america");
        africa = new Pais("egito", "africa");
        coreia = new Pais("coreia", "asia");
        
        paisDao.adicionar(brasil);
        paisDao.adicionar(africa);
        paisDao.adicionar(coreia);
        
        copaDao.adicionar(copa);
        
        selecaoA1 = sistema.cadastrarSelecao(5, new Date(50, 1, 1), "D", brasil);
        selecaoA2 = sistema.cadastrarSelecao(5, new Date(70, 1, 1), "D", brasil);
        
        selecaoB1 = sistema.cadastrarSelecao(5, new Date(50, 1, 1), "D", africa);
        selecaoB2 = sistema.cadastrarSelecao(5, new Date(70, 1, 1), "D", africa);
        
        selecaoC1 = sistema.cadastrarSelecao(5, new Date(50, 1, 1), "D", coreia);
        selecaoC2 = sistema.cadastrarSelecao(5, new Date(70, 1, 1), "D", coreia);
        
        sistema.cadastrarJogo(new Date(150, 1, 1), "nenhum", copa, selecaoA1, selecaoB1, FaseCopa.OITAVAS.getFase(), 5, 1);
        sistema.cadastrarJogo(new Date(190, 1, 1), "Killarea", copa, selecaoA2, selecaoC1, FaseCopa.OITAVAS.getFase(), 7, 1);
        sistema.cadastrarJogo(new Date(110, 1, 1), "Tamu", copa, selecaoA1, selecaoC1, FaseCopa.OITAVAS.getFase(), 0, 1);
        sistema.cadastrarJogo(new Date(160, 1, 1), "Aqui", copa, selecaoA2, selecaoC1, FaseCopa.OITAVAS.getFase(), 2, 1);
        sistema.cadastrarJogo(new Date(20, 1, 1), "Acchou?", copa, selecaoA1, selecaoC2, FaseCopa.FINAL.getFase(), 99, 56);
        
        int br = sistema.qtdJogosPais(brasil);
        int af = sistema.qtdJogosPais(africa);
        int ko = sistema.qtdJogosPais(coreia);
        
        assertEquals(5, br);
        assertEquals(1, af);
        assertEquals(4, ko);
    }

    /**
     * Test of cadastrarJogador method, of class Sistema.
     */
    @Test
    public void testCadastrarJogador() {
        Jogador jogador = sistema.cadastrarJogador(new Date(92, 1, 1), "neimar", 10, FuncaoJogador.MEIO_DE_CAMPO.getFuncao());
        List<Jogador> lista = sistema.listarJogadores();
        assertEquals(jogador, lista.get(0));
    }

    /**
     * Test of cadastrarTecnico method, of class Sistema.
     */
    @Test
    public void testCadastrarTecnico() {
        Tecnico tecnico = sistema.cadastrarTecnico("felipão", new Date(50, 1, 1));
        List<Tecnico> lista = sistema.listarTecnicos();
        assertEquals(tecnico, lista.get(0));
    }

    /**
     * Test of cadastrarSelecao method, of class Sistema.
     */
    @Test
    public void testCadastrarSelecao() {
        paisDao.adicionar(brasil);
        selecaoB1 = sistema.cadastrarSelecao(1, new Date(114, 1, 1), "A", brasil);
        List<Selecao> lista = sistema.listarSelecoes();
        assertEquals(selecaoB1, lista.get(0));
    }

    /**
     * Test of cadastrarEscalacao method, of class Sistema.
     */
    @Test
    public void testCadastrarEscalacao() {
        selecaoDao.adicionar(selecaoB1);
        jogoDao.adicionar(jogo1);
        jogadorDao.adicionar(jogB1);
        Escalacao escalacao = sistema.cadastrarEscalacao(jogo1, selecaoB1, jogB1);
        List<Escalacao> lista = sistema.getEscalacaoDao().listar();
        assertEquals(escalacao, lista.get(0));
    }

    /**
     * Test of cadastrarGol method, of class Sistema.
     */
    @Test
    public void testCadastrarGol() {
        jogoDao.adicionar(jogo1);
        jogadorDao.adicionar(jogB1);
        selecaoDao.adicionar(selecaoA1);
        Gol gol = sistema.cadastrarGol(jogo1, new Time(0, 0, 1), true, jogB1, selecaoA1);
        List<Gol> lista = sistema.getGolDao().listar();
        assertEquals(gol, lista.get(0));
    }

    /**
     * Test of cadastrarSubstituicao method, of class Sistema.
     */
    @Test
    public void testCadastrarSubstituicao() {
        jogadorDao.adicionar(jogB1);
        jogadorDao.adicionar(jogB11);
        jogoDao.adicionar(jogo1);
        selecaoDao.adicionar(selecaoB1);
        Substituicao substituicao = sistema.cadastrarSubstituicao(new Time(1, 30, 1), jogB1, jogB11, jogo1, selecaoB1);
        List<Substituicao> lista = sistema.getSubstituicaoDao().listar();
        assertEquals(substituicao, lista.get(0));
    }

    /**
     * Test of listarJogadores method, of class Sistema.
     */
    @Test
    public void testListarJogadores() {
        Jogador jogador = sistema.cadastrarJogador(new Date(90, 1, 1), "neimar", 1, FuncaoJogador.ATACANTE.getFuncao());
        Jogador jogador1 = sistema.cadastrarJogador(new Date(80, 1, 1), "fred", 2, FuncaoJogador.ATACANTE.getFuncao());
        Jogador jogador2 = sistema.cadastrarJogador(new Date(85, 1, 1), "david", 3, FuncaoJogador.ZAGUEIRO.getFuncao());
        List<Jogador> jogadores = sistema.listarJogadores();
        assertFalse(jogadores.isEmpty());
        assertEquals(jogador, jogadores.get(0));
        assertEquals(jogador1, jogadores.get(1));
        assertEquals(jogador2, jogadores.get(2));
    }

    /**
     * Test of listarTecnicos method, of class Sistema.
     */
    @Test
    public void testListarTecnicos() {
        Tecnico tecnico = sistema.cadastrarTecnico("felipao", new Date(90, 1, 1));
        Tecnico tecnico1 = sistema.cadastrarTecnico("pareira", new Date(85, 1, 1));
        Tecnico tecnico2 = sistema.cadastrarTecnico("dunga", new Date(80, 1, 1));
        List<Tecnico> tecnicos = sistema.listarTecnicos();
        assertFalse(tecnicos.isEmpty());
        assertEquals(tecnico, tecnicos.get(0));
        assertEquals(tecnico1, tecnicos.get(1));
        assertEquals(tecnico2, tecnicos.get(2));
    }

    /**
     * Test of listarSelecoes method, of class Sistema.
     */
    @Test
    public void testListarSelecoes() {
        paisDao.adicionar(brasil);
        paisDao.adicionar(africa);
        paisDao.adicionar(coreia);
        
        selecaoB1 = sistema.cadastrarSelecao(1, new Date(110, 1, 1), "A", brasil);
        Selecao selecao1 = sistema.cadastrarSelecao(2, new Date(110, 1, 1), "B", africa);
        Selecao selecao2 = sistema.cadastrarSelecao(3, new Date(110, 1, 1), "C", coreia);
        List<Selecao> selecoes = sistema.listarSelecoes();
        assertFalse(selecoes.isEmpty());
        assertEquals(selecaoB1, selecoes.get(0));
        assertEquals(selecao1, selecoes.get(1));
        assertEquals(selecao2, selecoes.get(2));
    }

    /**
     * Test of listarJogadoresDaSelecao method, of class Sistema.
     */
    @Test
    public void testListarJogadoresDaSelecao() {
        
        selecaoDao.adicionar(selecaoB1);
        jogB1.setSelecao(selecaoB1);
        jogB10.setSelecao(selecaoB1);
        jogB11.setSelecao(selecaoB1);
        jogadorDao.adicionar(jogB1);
        jogadorDao.adicionar(jogB10);
        jogadorDao.adicionar(jogB11);
        
        List<Jogador> result = sistema.listarJogadoresDaSelecao(selecaoB1);
        assertFalse(result.isEmpty());
        assertEquals(jogB1, result.get(0));
    }

    /**
     * Test of consultarTecnicoSelecao method, of class Sistema.
     */
    @Test
    public void testConsultarTecnicoSelecao() {
        tecnicoDao.adicionar(felipao);
        selecaoB1.setTecnico(felipao);
        selecaoDao.adicionar(selecaoB1);
        Tecnico t = sistema.consultarTecnicoSelecao(selecaoB1);
        assertEquals(selecaoB1.getTecnico(), t);
    }

    /**
     * Test of consultarPlacarJogo method, of class Sistema.
     */
    @Test
    public void testConsultarPlacarJogo() {
        
        selecaoA1.setNome("Brasil");
        selecaoB1.setNome("Uruguai");
        
        selecaoDao.adicionar(selecaoB1);
        selecaoDao.adicionar(selecaoA1);
        copaDao.adicionar(copa);
        
        jogo1 = sistema.cadastrarJogo(new Date(114, 7, 1), "maracana", copa, selecaoA1, selecaoB1, FaseCopa.GRUPOS.getFase(), 5, 2);
        jogo2 = sistema.cadastrarJogo(new Date(114, 7, 2), "puli", copa, selecaoB1, selecaoA1, FaseCopa.GRUPOS.getFase(), 2, 2);
        jogo3 = sistema.cadastrarJogo(new Date(114, 7, 5), "pelourinho", copa, selecaoA1, selecaoB1, FaseCopa.GRUPOS.getFase(), 9, 1);
        
        Jogo jogo1meio = sistema.consultarPlacarJogo(jogo1);
        Jogo jogo2meio = sistema.consultarPlacarJogo(jogo2);
        Jogo jogo3meio = sistema.consultarPlacarJogo(jogo3);
        
        assertEquals("Brasil 5x2 Uruguai", jogo1meio.toString());
        assertEquals("Uruguai 2x2 Brasil", jogo2meio.toString());
        assertEquals("Brasil 9x1 Uruguai", jogo3meio.toString());
    }

    /**
     * Test of consultarEscalacaoSelecao method, of class Sistema.
     */
    @Test
    public void testConsultarEscalacaoSelecao() {
        
        selecaoDao.adicionar(selecaoB1);
        selecaoDao.adicionar(selecaoA1);
        copaDao.adicionar(copa);
        
        Jogo jogo = sistema.cadastrarJogo(new Date(50, 1, 1), "Pelourinho", copa, selecaoB1, selecaoA1, FaseCopa.FINAL.getFase(), 5, 3);
        
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
        
        jogadorDao.adicionar(jogA1);
        jogadorDao.adicionar(jogA2);
        jogadorDao.adicionar(jogA3);
        jogadorDao.adicionar(jogA4);
        jogadorDao.adicionar(jogA5);
        jogadorDao.adicionar(jogA6);
        jogadorDao.adicionar(jogA7);
        jogadorDao.adicionar(jogA8);
        jogadorDao.adicionar(jogA9);
        jogadorDao.adicionar(jogA10);
        jogadorDao.adicionar(jogA11);
        
        jogoDao.adicionar(jogo);
        
        sistema.cadastrarEscalacao(jogo, selecaoB1, jogA1);
        sistema.cadastrarEscalacao(jogo, selecaoB1, jogA2);
        sistema.cadastrarEscalacao(jogo, selecaoB1, jogA3);
        sistema.cadastrarEscalacao(jogo, selecaoB1, jogA4);
        sistema.cadastrarEscalacao(jogo, selecaoB1, jogA5);
        sistema.cadastrarEscalacao(jogo, selecaoB1, jogA6);
        sistema.cadastrarEscalacao(jogo, selecaoB1, jogA7);
        sistema.cadastrarEscalacao(jogo, selecaoB1, jogA8);
        sistema.cadastrarEscalacao(jogo, selecaoB1, jogA9);
        sistema.cadastrarEscalacao(jogo, selecaoB1, jogA10);
        sistema.cadastrarEscalacao(jogo, selecaoB1, jogA11);
        
        List<Jogador> escalacao = sistema.consultarEscalacaoSelecao(selecaoB1, jogo);
        assertFalse(escalacao.isEmpty());
        
        assertEquals(FuncaoJogador.ATACANTE.getFuncao() + " - Clediosmar", escalacao.get(0).toString());
        assertEquals(FuncaoJogador.ATACANTE.getFuncao() + " - Niu", escalacao.get(1).toString());
        assertEquals(FuncaoJogador.ATACANTE.getFuncao() + " - Onee", escalacao.get(3).toString());
        assertEquals(FuncaoJogador.MEIO_ATACANTE.getFuncao() + " - tapioca", escalacao.get(6).toString());
        assertEquals(FuncaoJogador.ZAGUEIRO.getFuncao() + " - coragi", escalacao.get(9).toString());
        assertEquals(FuncaoJogador.GOLEIRO.getFuncao() + " - bom", escalacao.get(10).toString());
    }

    /**
     * Test of listaSubstituicoesJogo method, of class Sistema.
     */
    @Test
    public void testListaSubstituicoesJogo() {
        selecaoDao.adicionar(selecaoB1);
        jogoDao.adicionar(jogo1);
        jogadorDao.adicionar(jogB2);
        jogadorDao.adicionar(jogB3);
        jogadorDao.adicionar(jogB4);
        jogadorDao.adicionar(jogB5);
        jogadorDao.adicionar(jogB10);
        jogadorDao.adicionar(jogB11);
        substituicao1 = sistema.cadastrarSubstituicao(new Time(1, 1, 1), jogB5, jogB10, jogo1, selecaoB1);
        substituicao2 = sistema.cadastrarSubstituicao(new Time(0, 40, 1), jogB2, jogB11, jogo1, selecaoB1);
        substituicao3 = sistema.cadastrarSubstituicao(new Time(1, 15, 1), jogB3, jogB4, jogo1, selecaoB1);
        List<Substituicao> substituicoes = sistema.listarSubstituicoes(jogo1);
        assertFalse(substituicoes.isEmpty());
        assertEquals(substituicao1, substituicoes.get(0));
        assertEquals(substituicao2, substituicoes.get(1));
        assertEquals(substituicao3, substituicoes.get(2));
    }

    /**
     * Test of listaGolsDaPartida method, of class Sistema.
     */
    @Test
    public void testListaGolsDaPartida() {
        
        selecaoA1 = new Selecao("H", new Date(100, 1, 1), 1);
        selecaoA1.setNome("Brasil");
        jogo1 = new Jogo(new Date(102, 5, 2), "Campo Minado", FaseCopa.SEMI.getFase());
        Jogador jogador = new Jogador(new Date(60, 1, 1), "Kishin", 1, FuncaoJogador.ATACANTE.getFuncao());
        
        selecaoDao.adicionar(selecaoA1);
        jogoDao.adicionar(jogo1);
        jogadorDao.adicionar(jogador);
        
        gol1 = sistema.cadastrarGol(jogo1, new Time(0, 10, 0), true, jogador, selecaoA1);
        gol2 = sistema.cadastrarGol(jogo1, new Time(1, 10, 2), false, jogador, selecaoA1);
        gol3 = sistema.cadastrarGol(jogo1, new Time(1, 20, 50), true, jogador, selecaoA1);
        
        List<Gol> gols = sistema.getGolDao().listar();
        assertFalse(gols.isEmpty());
        
        gols = sistema.listaGolsDaPartida(jogo1);
        String saiu1 = gols.get(0).toString(),
                saiu2 = gols.get(1).toString(),
                saiu3 = gols.get(2).toString();
        
        assertEquals("Gol Brasil, 10:00, Kishin[Contra]", saiu1);
        assertEquals("Gol Brasil, 70:02, Kishin[Normal]", saiu2);
        assertEquals("Gol Brasil, 80:50, Kishin[Contra]", saiu3);
    }

    /**
     * Test of consultarCaracteristicasJogador method, of class Sistema.
     */
    @Test
    public void testConsultarCaracteristicasJogador() {  //M
        paisDao.adicionar(brasil);
        copaDao.adicionar(copa);
        selecaoDao.adicionar(selecaoB1);
        jogadorDao.adicionar(jogB1);
        assertEquals(sistema.consultarCaracteristicasJogador(jogB1, copa), jogB1.toString());
        
    }

    /**
     * Test of consultarQuantidadeEMediaDeGols method, of class Sistema.
     */
    @Test
    public void testConsultarQuantidadeEMediaDeGols() {
        brasil = new Pais("brasil", "america");
        africa = new Pais("egito", "africa");
        coreia = new Pais("coreia", "asia");
        
        paisDao.adicionar(brasil);
        paisDao.adicionar(africa);
        paisDao.adicionar(coreia);
        
        copaDao.adicionar(copa);
        
        selecaoA1 = sistema.cadastrarSelecao(5, new Date(50, 1, 1), "D", brasil);
        selecaoA2 = sistema.cadastrarSelecao(5, new Date(70, 1, 1), "D", brasil);
        
        selecaoB1 = sistema.cadastrarSelecao(5, new Date(50, 1, 1), "D", africa);
        selecaoB2 = sistema.cadastrarSelecao(5, new Date(70, 1, 1), "D", africa);
        
        selecaoC1 = sistema.cadastrarSelecao(5, new Date(50, 1, 1), "D", coreia);
        selecaoC2 = sistema.cadastrarSelecao(5, new Date(70, 1, 1), "D", coreia);
        
        sistema.cadastrarJogo(new Date(150, 1, 1), "nenhum", copa, selecaoA1, selecaoB1, FaseCopa.OITAVAS.getFase(), 5, 1);
        sistema.cadastrarJogo(new Date(190, 1, 1), "Killarea", copa, selecaoA2, selecaoC1, FaseCopa.OITAVAS.getFase(), 7, 1);
        sistema.cadastrarJogo(new Date(110, 1, 1), "Tamu", copa, selecaoA1, selecaoC1, FaseCopa.OITAVAS.getFase(), 0, 1);
        sistema.cadastrarJogo(new Date(160, 1, 1), "Aqui", copa, selecaoA2, selecaoC1, FaseCopa.OITAVAS.getFase(), 2, 1);
        sistema.cadastrarJogo(new Date(20, 1, 1), "Acchou?", copa, selecaoA1, selecaoC2, FaseCopa.FINAL.getFase(), 96, 56);
        
        double result[] = sistema.consultarQuantidadeEMediaDeGols(copa);
        
        assertEquals(170, (int) result[0]);
        assertEquals(Double.doubleToLongBits(34), Double.doubleToLongBits(result[1]));
        
    }

    /**
     * Test of consultarMaioresGoleadas method, of class Sistema.
     */
    @Test
    public void testConsultarMaioresGoleadas() {
        
        selecaoDao.adicionar(selecaoA1);
        selecaoDao.adicionar(selecaoA2);
        
        jogo1 = new Jogo(new Date(102, 5, 2), "Campo Minado", FaseCopa.SEMI.getFase());
        jogo1.setGolA(7);
        jogo1.setGolB(1);
        jogo1.setSelecaoBySelecaoA(selecaoA1);
        jogo1.setSelecaoBySelecaoA(selecaoA2);
        jogoDao.adicionar(jogo1);
        
        jogo2 = new Jogo(new Date(102, 5, 2), "Campo Minado", FaseCopa.SEMI.getFase());
        jogo2.setGolA(1);
        jogo2.setGolB(1);
        jogo2.setSelecaoBySelecaoA(selecaoA1);
        jogo2.setSelecaoBySelecaoA(selecaoA2);
        jogoDao.adicionar(jogo2);
        
        jogo3 = new Jogo(new Date(102, 5, 2), "Campo Minado", FaseCopa.SEMI.getFase());
        jogo3.setGolA(8);
        jogo3.setGolB(2);
        jogo3.setSelecaoBySelecaoA(selecaoA1);
        jogo3.setSelecaoBySelecaoA(selecaoA2);
        jogoDao.adicionar(jogo3);
        
        List<Jogo> jogos = sistema.consultarMaioresGoleadas();
        assertEquals(jogos.get(0), jogo1);
        assertEquals(jogos.get(1), jogo3);
        
    }

    /**
     * Test of listarJogosEmpatados method, of class Sistema.
     */
    @Test
    public void testListarJogosEmpatados() {  //M

        selecaoA1.setNome("Brasil");
        selecaoB1.setNome("Uruguai");
        
        selecaoDao.adicionar(selecaoB1);
        selecaoDao.adicionar(selecaoA1);
        copaDao.adicionar(copa);
        
        Jogo jogo1 = sistema.cadastrarJogo(new Date(114, 7, 1), "maracana", copa, selecaoA1, selecaoB1, FaseCopa.GRUPOS.getFase(), 5, 2);
        Jogo jogo2 = sistema.cadastrarJogo(new Date(114, 7, 2), "puli", copa, selecaoA1, selecaoB1, FaseCopa.GRUPOS.getFase(), 2, 2);
        Jogo jogo3 = sistema.cadastrarJogo(new Date(114, 7, 5), "pelourinho", copa, selecaoA1, selecaoB1, FaseCopa.GRUPOS.getFase(), 5, 2);
        Jogo jogo4 = sistema.cadastrarJogo(new Date(114, 7, 10), "nao sei", copa, selecaoA1, selecaoB1, FaseCopa.GRUPOS.getFase(), 0, 0);
        Jogo jogo5 = sistema.cadastrarJogo(new Date(114, 7, 19), "cabando", copa, selecaoA1, selecaoB1, FaseCopa.GRUPOS.getFase(), 3, 3);
        Jogo jogo6 = sistema.cadastrarJogo(new Date(114, 7, 20), "fim", copa, selecaoA1, selecaoB1, FaseCopa.GRUPOS.getFase(), 5, 2);
        
        List<Jogo> lista = sistema.listarJogosEmpatados(copa);
        assertEquals("Brasil 2x2 Uruguai", lista.get(0).toString());
        assertEquals("Brasil 0x0 Uruguai", lista.get(1).toString());
        assertEquals("Brasil 3x3 Uruguai", lista.get(2).toString());
        
    }

    /**
     * Test of listarVitoriasIncontestaveis method, of class Sistema.
     */
    @Test
    public void testListarVitoriasIncontestaveis() {
        
        selecaoA1.setNome("Brasil");
        selecaoB1.setNome("Uruguai");
        
        selecaoDao.adicionar(selecaoB1);
        selecaoDao.adicionar(selecaoA1);
        copaDao.adicionar(copa);
        
        sistema.cadastrarJogo(new Date(114, 7, 1), "maracana", copa, selecaoA1, selecaoB1, FaseCopa.GRUPOS.getFase(), 6, 2);
        sistema.cadastrarJogo(new Date(114, 7, 2), "puli", copa, selecaoA1, selecaoB1, FaseCopa.GRUPOS.getFase(), 2, 2);
        sistema.cadastrarJogo(new Date(114, 7, 5), "pelourinho", copa, selecaoB1, selecaoA1, FaseCopa.GRUPOS.getFase(), 7, 2);
        sistema.cadastrarJogo(new Date(114, 7, 10), "nao sei", copa, selecaoA1, selecaoB1, FaseCopa.GRUPOS.getFase(), 3, 0);
        sistema.cadastrarJogo(new Date(114, 7, 19), "cabando", copa, selecaoA1, selecaoB1, FaseCopa.GRUPOS.getFase(), 0, 3);
        sistema.cadastrarJogo(new Date(114, 7, 20), "fim", copa, selecaoA1, selecaoB1, FaseCopa.GRUPOS.getFase(), 3, 2);
        
        List<Jogo> lista = sistema.listarVitoriasIncontestaveis();
        assertFalse(lista.isEmpty());
        
        assertEquals("Brasil 6x2 Uruguai", lista.get(0).toString());
        assertEquals("Uruguai 7x2 Brasil", lista.get(1).toString());
        assertEquals("Brasil 3x0 Uruguai", lista.get(2).toString());
        assertEquals("Brasil 0x3 Uruguai", lista.get(3).toString());
    }

    /**
     * Test of consutarOrdemClassificacao method, of class Sistema.
     */
    @Test
    public void testConsutarOrdemClassificacao() {
        fail("The test case is a prototype.");
    }

    /**
     * Test of consultaArtilheiros method, of class Sistema.
     */
    @Test
    public void testConsultaArtilheiros() {
        fail("The test case is a prototype.");
    }

    /**
     * Test of consultaMediaIdadeSelecoes method, of class Sistema.
     */
    @Test
    public void testConsultaMediaIdadeSelecoes() { //M
        fail("The test case is a prototype.");
    }

    /**
     * Test of listaTodasFinais method, of class Sistema.
     */
    @Test
    public void testListaTodasFinais() {
        
        copa1 = new Copa(new Date(500, 1, 1));
        
        Selecao sele1 = new Selecao("A", new Date(50, 1, 1), 1);
        sele1.setNome("Brasil");
        Selecao sele2 = new Selecao("A", new Date(64, 1, 1), 1);
        sele2.setNome("Argentina");
        Selecao sele3 = new Selecao("A", new Date(20, 1, 1), 1);
        sele3.setNome("Alemanha");
        
        copaDao.adicionar(copa1);
        selecaoDao.adicionar(sele1);
        selecaoDao.adicionar(sele2);
        selecaoDao.adicionar(sele3);
        
        Jogo jo1 = sistema.cadastrarJogo(new Date(150, 1, 1), "Fonte Nova", copa1, sele1, sele2,
                FaseCopa.FINAL.getFase(), 5, 1);
        Jogo jo2 = sistema.cadastrarJogo(new Date(150, 1, 1), "Fonte Nova", copa1, sele3, sele2,
                FaseCopa.FINAL.getFase(), 7, 12);
        Jogo jo3 = sistema.cadastrarJogo(new Date(150, 1, 1), "Fonte Nova", copa1, sele2, sele1,
                FaseCopa.SEMI.getFase(), 5, 5);
        Jogo jo4 = sistema.cadastrarJogo(new Date(150, 1, 1), "Fonte Nova", copa1, sele1, sele3,
                FaseCopa.OITAVAS.getFase(), 2, 1);
        Jogo jo5 = sistema.cadastrarJogo(new Date(150, 1, 1), "Fonte Nova", copa1, sele1, sele3,
                FaseCopa.FINAL.getFase(), 1, 1);
        Jogo jo6 = sistema.cadastrarJogo(new Date(150, 1, 1), "Fonte Nova", copa1, sele3, sele2,
                FaseCopa.SEMI.getFase(), 4, 0);
        Jogo jo7 = sistema.cadastrarJogo(new Date(150, 1, 1), "Fonte Nova", copa1, sele2, sele1,
                FaseCopa.FINAL.getFase(), 2, 0);
        Jogo jo8 = sistema.cadastrarJogo(new Date(150, 1, 1), "Fonte Nova", copa1, sele3, sele2,
                FaseCopa.QUARTAS.getFase(), 1, 2);
        Jogo jo9 = sistema.cadastrarJogo(new Date(150, 1, 1), "Fonte Nova", copa1, sele1, sele2,
                FaseCopa.FINAL.getFase(), 5, 7);
        
        List<Jogo> finais = sistema.listaTodasFinais();
        
        assertEquals("Brasil 5x1 Argentina", finais.get(0).toString());
        assertEquals("Alemanha 7x12 Argentina", finais.get(1).toString());
        assertEquals("Brasil 1x1 Alemanha", finais.get(2).toString());
        assertEquals("Argentina 2x0 Brasil", finais.get(3).toString());
        assertEquals("Brasil 5x7 Argentina", finais.get(4).toString());
    }

    /**
     * Test of listaTecnicosCampeoes method, of class Sistema.
     */
    @Test
    public void testListaTecnicosCampeoes() {
        fail("The test case is a prototype.");
    }

    /**
     * Test of listaGolsContra method, of class Sistema.
     */
    @Test
    public void testListaGolsContra() {
        jogoDao.adicionar(jogo1);
        jogadorDao.adicionar(jogB1);
        selecaoDao.adicionar(selecaoA1);
        Gol gol1 = sistema.cadastrarGol(jogo1, new Time(0, 0, 1), false, jogB1, selecaoA1);
        
        jogoDao.adicionar(jogo2);
        jogadorDao.adicionar(jogB2);
        selecaoDao.adicionar(selecaoA2);
        Gol gol2 = sistema.cadastrarGol(jogo2, new Time(0, 0, 1), true, jogB1, selecaoA1);
        
        List<Gol> lista = sistema.listaGolsContra();
        assertEquals(gol2, lista.get(0));
        assertEquals(1, lista.size());
    }

    /**
     * Test of listaCopasComPaisSedeCampeao method, of class Sistema.
     */
    @Test
    public void testListaCopasComPaisSedeCampeao() {  //M
        fail("The test case is a prototype.");
    }

    /**
     * Test of listaDecrescenteDePaisesComMaisTitulos method, of class Sistema.
     */
    @Test
    public void testListaDecrescenteDePaisesComMaisTitulos() {
        
        Pais pais1 = new Pais("Brasil", "continente");
        Pais pais2 = new Pais("Argentina", "continente");
        Pais pais3 = new Pais("Alemanha", "continente");
        Pais pais4 = new Pais("Holanda", "continente");
        Pais pais5 = new Pais("Colombia", "continente");
        Pais pais6 = new Pais("França", "continente");
        Pais pais7 = new Pais("Argelia", "continente");
        
        paisDao.adicionar(pais1);
        paisDao.adicionar(pais2);
        paisDao.adicionar(pais3);
        paisDao.adicionar(pais4);
        paisDao.adicionar(pais5);
        paisDao.adicionar(pais6);
        paisDao.adicionar(pais7);
        
        Selecao sele1 = new Selecao("A", new Date(50, 1, 1), 1);
        sele1.setPais(pais1);
        sele1.setNome("Brasil");
        Selecao sele2 = new Selecao("A", new Date(194, 1, 1), 1);
        sele2.setPais(pais1);
        sele2.setNome("Brasil");
        Selecao sele3 = new Selecao("A", new Date(202, 1, 1), 1);
        sele3.setPais(pais1);
        sele3.setNome("Brasil");
        Selecao sele8 = new Selecao("A", new Date(50, 1, 1), 1);
        sele8.setPais(pais1);
        sele8.setNome("Brasil");
        Selecao sele10 = new Selecao("A", new Date(250, 1, 1), 1);
        sele10.setPais(pais1);
        sele10.setNome("Brasil");
        
        Selecao sele4 = new Selecao("A", new Date(64, 1, 1), 1);
        sele4.setPais(pais2);
        sele4.setNome("Argentina");
        Selecao sele5 = new Selecao("A", new Date(69, 1, 1), 1);
        sele5.setPais(pais2);
        sele5.setNome("Argentina");
        Selecao sele7 = new Selecao("A", new Date(150, 1, 1), 1);
        sele7.setPais(pais2);
        sele7.setNome("Argentina");
        Selecao sele11 = new Selecao("A", new Date(70, 1, 1), 1);
        sele11.setPais(pais2);
        sele11.setNome("Argentina");
        
        Selecao sele6 = new Selecao("A", new Date(10, 1, 1), 1);
        sele6.setPais(pais3);
        sele6.setNome("Alemanha");
        Selecao sele9 = new Selecao("A", new Date(200, 1, 1), 1);
        sele9.setPais(pais3);
        sele9.setNome("Alemanha");
        Selecao sele12 = new Selecao("A", new Date(20, 1, 1), 1);
        sele12.setPais(pais3);
        sele12.setNome("Alemanha");
        
        Selecao sele13 = new Selecao("A", new Date(15, 1, 1), 1);
        sele13.setPais(pais4);
        sele13.setNome("Holanda");
        Selecao sele14 = new Selecao("A", new Date(19, 1, 1), 1);
        sele14.setPais(pais4);
        sele14.setNome("Holanda");
        
        Selecao sele15 = new Selecao("A", new Date(25, 1, 1), 1);
        sele15.setPais(pais5);
        sele15.setNome("Colombia");
        ///////////////////////////////(13~5)
        Selecao sele16 = new Selecao("A", new Date(8, 1, 1), 13);
        sele16.setPais(pais6);
        sele16.setNome("França");
        Selecao sele17 = new Selecao("A", new Date(4, 1, 1), 5);
        sele17.setPais(pais7);
        sele17.setNome("Argelia");
        
        selecaoDao.adicionar(sele1);
        selecaoDao.adicionar(sele2);
        selecaoDao.adicionar(sele3);
        selecaoDao.adicionar(sele4);
        selecaoDao.adicionar(sele5);
        selecaoDao.adicionar(sele6);
        selecaoDao.adicionar(sele7);
        selecaoDao.adicionar(sele8);
        selecaoDao.adicionar(sele9);
        selecaoDao.adicionar(sele10);
        selecaoDao.adicionar(sele11);
        selecaoDao.adicionar(sele12);
        selecaoDao.adicionar(sele13);
        selecaoDao.adicionar(sele14);
        selecaoDao.adicionar(sele15);
        selecaoDao.adicionar(sele16);
        selecaoDao.adicionar(sele17);
        
        List<Pais> campeoes = sistema.listaDecrescenteDePaisesComMaisTitulos();
        
        assertEquals("Brasil", campeoes.get(0).getNome()); // funciona
        assertEquals("Argentina", campeoes.get(1).getNome());
        assertEquals("Alemanha", campeoes.get(2).getNome());
        assertEquals("Holanda", campeoes.get(3).getNome());
        assertEquals("Colombia", campeoes.get(4).getNome());
        /* assertEquals(pais1, campeoes.get(0));
         assertEquals(pais2, campeoes.get(1));
         assertEquals(pais3, campeoes.get(2));
         assertEquals(pais4, campeoes.get(3));
         assertEquals(pais5, campeoes.get(4));*/ // Assim nao, por que vem _$$_Javaassist
    }

    /**
     * Test of quatidadeDeParticipacoesEmCopas method, of class Sistema.
     */
    @Test
    public void testQuatidadeDeParticipacoesEmCopas() {
        sistema.quatidadeDeParticipacoesEmCopas(brasil);
    }

    /**
     * Test of listarPaisesComMaisParticipacoes method, of class Sistema.
     */
    @Test
    public void testListarPaisesComMaisParticipacoes() {  //M

        ArrayList<Pais> p = new ArrayList<>(10);
        
        for (int i = 0; i < 10; i++) {
            p.add(new Pais("p" + i, "c" + i));
            paisDao.adicionar(p.get(i));
        }
        
        Selecao s3, s4, s5, s6, s7, s8, s9, s0;
        ArrayList<Selecao> s1 = new ArrayList<>(3);
        ArrayList<Selecao> s2 = new ArrayList<>(2);
        
        tecnicoDao.adicionar(felipao);
        
        s1.add(new Selecao(null, p.get(0), felipao, "A", new Date(15, 1, 1), 1, "s1", null, null, null, null, null, null));
        selecaoDao.adicionar(s1.get(0));
        s1.add(new Selecao(null, p.get(0), felipao, "B", new Date(16, 1, 1), 1, "s1", null, null, null, null, null, null));
        selecaoDao.adicionar(s1.get(1));
        s1.add(new Selecao(null, p.get(0), felipao, "C", new Date(17, 1, 1), 1, "s1", null, null, null, null, null, null));
        selecaoDao.adicionar(s1.get(2));
        
        s2.add(new Selecao(null, p.get(1), felipao, "A", new Date(15, 1, 1), 1, "s2", null, null, null, null, null, null));
        selecaoDao.adicionar(s2.get(0));
        
        s2.add(new Selecao(null, p.get(1), felipao, "A", new Date(16, 1, 1), 1, "s2", null, null, null, null, null, null));
        selecaoDao.adicionar(s2.get(1));
        
        s3 = new Selecao(null, p.get(2), felipao, "A", new Date(15, 1, 1), 1, "s3", null, null, null, null, null, null);
        selecaoDao.adicionar(s3);
        s4 = new Selecao(null, p.get(3), felipao, "A", new Date(15, 1, 1), 1, "s4", null, null, null, null, null, null);
        selecaoDao.adicionar(s4);
        s5 = new Selecao(null, p.get(4), felipao, "A", new Date(15, 1, 1), 1, "s5", null, null, null, null, null, null);
        selecaoDao.adicionar(s5);
        s6 = new Selecao(null, p.get(5), felipao, "A", new Date(15, 1, 1), 1, "s6", null, null, null, null, null, null);
        selecaoDao.adicionar(s6);
        s7 = new Selecao(null, p.get(6), felipao, "A", new Date(15, 1, 1), 1, "s7", null, null, null, null, null, null);
        selecaoDao.adicionar(s7);
        s8 = new Selecao(null, p.get(7), felipao, "A", new Date(15, 1, 1), 1, "s8", null, null, null, null, null, null);
        selecaoDao.adicionar(s8);
        s9 = new Selecao(null, p.get(8), felipao, "A", new Date(15, 1, 1), 1, "s9", null, null, null, null, null, null);
        selecaoDao.adicionar(s9);
        s0 = new Selecao(null, p.get(9), felipao, "A", new Date(15, 1, 1), 1, "s0", null, null, null, null, null, null);
        selecaoDao.adicionar(s0);
        //Se os resultados sao iguais nao temos  um criterio desempate
        List<Pais> lista = sistema.listarPaisesComMaisParticipacoes();
        assertEquals(lista.get(0).toString(), p.get(0).toString());
        assertEquals(lista.get(1), p.get(1));
        assertTrue(lista.contains(p.get(2)));
        assertTrue(lista.contains(p.get(3)));
        assertTrue(lista.contains(p.get(4)));
        assertTrue(lista.contains(p.get(5)));
        assertTrue(lista.contains(p.get(6)));
        assertTrue(lista.contains(p.get(7)));
        assertTrue(lista.contains(p.get(8)));
        assertTrue(lista.contains(p.get(9)));
    }

    /**
     * Test of listarPaisesComMaiorNumeroDeViceCampeonatos method, of class
     * Sistema.
     */
    @Test
    public void testListarPaisesComMaiorNumeroDeViceCampeonatos() {  //M
        paisDao.adicionar(brasil);
        paisDao.adicionar(coreia);
        paisDao.adicionar(africa);
        selecaoA1.setPosicao(2);
        selecaoB1.setPosicao(1);
        selecaoC1.setPosicao(3);
        selecaoA2.setPosicao(2);
        selecaoB2.setPosicao(3);
        selecaoC2.setPosicao(1);
        selecaoA3.setPosicao(1);
        selecaoB3.setPosicao(2);
        selecaoC3.setPosicao(3);
        selecaoDao.adicionar(selecaoA1);
        selecaoDao.adicionar(selecaoB1);
        selecaoDao.adicionar(selecaoC1);
        selecaoDao.adicionar(selecaoA2);
        selecaoDao.adicionar(selecaoB2);
        selecaoDao.adicionar(selecaoC2);
        selecaoDao.adicionar(selecaoA3);
        selecaoDao.adicionar(selecaoB3);
        selecaoDao.adicionar(selecaoC3);
        List<Pais> lista = sistema.listarPaisesComMaiorNumeroDeViceCampeonatos();
        assertEquals(africa, lista.get(0));
        assertEquals(brasil, lista.get(1));
    }

    /**
     * Test of listarPaisesComMaiorPercentualDeDerrotas method, of class
     * Sistema.
     */
    @Test
    public void testListarPaisesComMaiorPercentualDeDerrotas() {
        
        brasil = new Pais("brasil", "america");
        africa = new Pais("egito", "africa");
        coreia = new Pais("coreia", "asia");
        Pais nippon = new Pais("nippon", "asia");
        
        paisDao.adicionar(brasil);
        paisDao.adicionar(africa);
        paisDao.adicionar(coreia);
        paisDao.adicionar(nippon);
        copa.setPais(brasil);
        copaDao.adicionar(copa);
        
        selecaoA1 = sistema.cadastrarSelecao(5, new Date(50, 1, 1), "D", brasil);
        selecaoA2 = sistema.cadastrarSelecao(5, new Date(70, 1, 1), "D", brasil);
        
        selecaoB1 = sistema.cadastrarSelecao(5, new Date(50, 1, 1), "D", africa);
        selecaoB2 = sistema.cadastrarSelecao(5, new Date(70, 1, 1), "D", africa);
        
        selecaoC1 = sistema.cadastrarSelecao(5, new Date(50, 1, 1), "D", coreia);
        selecaoC2 = sistema.cadastrarSelecao(5, new Date(70, 1, 1), "D", coreia);
        
        Selecao selecaoD1 = sistema.cadastrarSelecao(5, new Date(50, 1, 1), "F", nippon);
        Selecao selecaoD2 = sistema.cadastrarSelecao(5, new Date(70, 1, 1), "F", nippon);
        
        sistema.cadastrarJogo(new Date(150, 1, 1), "nenhum", copa, selecaoA1, selecaoB1, FaseCopa.OITAVAS.getFase(), 5, 1);
        sistema.cadastrarJogo(new Date(190, 1, 1), "Killarea", copa, selecaoA2, selecaoB1, FaseCopa.OITAVAS.getFase(), 7, 1);
        sistema.cadastrarJogo(new Date(110, 1, 1), "Tamu", copa, selecaoA1, selecaoB2, FaseCopa.OITAVAS.getFase(), 2, 1);
        sistema.cadastrarJogo(new Date(160, 1, 1), "Aqui", copa, selecaoA2, selecaoC1, FaseCopa.OITAVAS.getFase(), 2, 1);
        sistema.cadastrarJogo(new Date(20, 1, 1), "Acchou?", copa, selecaoA1, selecaoC2, FaseCopa.FINAL.getFase(), 56, 0);
        sistema.cadastrarJogo(new Date(20, 1, 1), "lgum?", copa, selecaoA1, selecaoD1, FaseCopa.FINAL.getFase(), 5, 2);
        sistema.cadastrarJogo(new Date(20, 1, 1), "illumi?", copa, selecaoA1, selecaoD2, FaseCopa.FINAL.getFase(), 1, 0);
        sistema.cadastrarJogo(new Date(20, 1, 1), "ou Ilumi?", copa, selecaoA2, selecaoC2, FaseCopa.FINAL.getFase(), 99, 56);
        sistema.cadastrarJogo(new Date(20, 1, 1), "ou Ilumi?", copa, selecaoA2, selecaoC1, FaseCopa.FINAL.getFase(), 200, 5);
        
        List<Pais> pis = sistema.listarPaisesComMaiorPercentualDeDerrotas();
        System.out.println(pis.get(0));
        System.out.println(pis.get(1));
        System.out.println(pis.get(2));
        System.out.println(pis.get(3));
        
        assertEquals(coreia, pis.get(0));
        assertEquals(africa, pis.get(1));
        assertEquals(nippon, pis.get(2));
        assertEquals(brasil, pis.get(3));
    }

    /**
     * Test of listarJogadoresComMaiorNumeroDeGolPorPartida method, of class
     * Sistema.
     */
    @Test
    public void testListarJogadoresComMaiorNumeroDeGolPorPartida() {
        sistema.listarJogadoresComMaiorNumeroDeGolPorPartida(jogo1);
    }

    /**
     * Test of listarJogadorComMaiorMediaDeGolPorPartidaNasCopas method, of
     * class Sistema.
     */
    @Test
    public void testListarJogadorComMaiorMediaDeGolPorPartidaNasCopas() {
        sistema.listarJogadorComMaiorMediaDeGolPorPartidaNasCopas();
    }

    /**
     * Test of listarJogadorComMaiorQuantidadeDeJogosEmCopas method, of class
     * Sistema.
     */
    @Test
    public void testListarJogadorComMaiorQuantidadeDeJogosEmCopas() { //M
        sistema.listarJogadorComMaiorQuantidadeDeJogosEmCopas();
    }

    /**
     * Test of consultarGolMaisRapidoNasCopas method, of class Sistema.
     */
    @Test
    public void testConsultarGolMaisRapidoNasCopas() {
        
        selecaoA1 = new Selecao("H", new Date(100, 1, 1), 1);
        selecaoA1.setNome("Brasil");
        selecaoB1 = new Selecao("H", new Date(100, 1, 1), 1);
        selecaoB1.setNome("Nippon");
        
        jogo1 = new Jogo(new Date(102, 5, 2), "Campo Minado", FaseCopa.SEMI.getFase());
        
        Jogador jogador1 = new Jogador(new Date(60, 1, 1), "Kishin", 1, FuncaoJogador.ATACANTE.getFuncao());
        Jogador jogador2 = new Jogador(new Date(50, 1, 1), "Kulilin", 2, FuncaoJogador.ATACANTE.getFuncao());
        
        selecaoDao.adicionar(selecaoA1);
        selecaoDao.adicionar(selecaoB1);
        
        jogoDao.adicionar(jogo1);
        
        jogadorDao.adicionar(jogador1);
        jogadorDao.adicionar(jogador2);
        
        gol1 = sistema.cadastrarGol(jogo1, new Time(0, 10, 0), true, jogador1, selecaoA1);
        gol2 = sistema.cadastrarGol(jogo1, new Time(1, 10, 2), false, jogador1, selecaoA1);
        gol3 = sistema.cadastrarGol(jogo1, new Time(1, 20, 50), true, jogador1, selecaoA1);
        gol3 = sistema.cadastrarGol(jogo1, new Time(0, 1, 2), false, jogador2, selecaoB1);
        
        Gol gols = sistema.consultarGolMaisRapidoNasCopas();
        String saiu = gols.toString();
        assertEquals("Gol Nippon, 1:02, Kulilin[Normal]", saiu);
        
        sistema.consultarGolMaisRapidoNasCopas();
    }

    /**
     * Test of listarJogadoresComMaiorNumeroDeJogosComoReserva method, of class
     * Sistema.
     */
    @Test
    public void testListarJogadoresComMaiorNumeroDeJogosComoReserva() {
        sistema.listarJogadoresComMaiorNumeroDeJogosComoReserva();
    }

    /**
     * Test of listarJogadoresReservaQueFizeramGols method, of class Sistema.
     */
    @Test
    public void testListarJogadoresReservaQueFizeramGols() {
        
        selecaoDao.adicionar(selecaoA1);
        selecaoDao.adicionar(selecaoA2);
        Jogador b1 = new Jogador(new Date(80, 5, 15), "julio", 1, FuncaoJogador.LATERAL_DIREITO.getFuncao());
        b1.setSelecao(selecaoA1);
        Jogador b2 = new Jogador(new Date(80, 5, 15), "Cezar", 2, FuncaoJogador.MEIO_ATACANTE.getFuncao());
        b2.setSelecao(selecaoA1);
        Jogador b3 = new Jogador(new Date(80, 5, 15), "Camilo", 3, FuncaoJogador.LATERAL.getFuncao());
        b3.setSelecao(selecaoA2);
        
        jogoDao.adicionar(jogo1);
        jogadorDao.adicionar(b1);
        jogadorDao.adicionar(b2);
        jogadorDao.adicionar(b3);
        
        Escalacao esc1 = new Escalacao();
        Escalacao esc2 = new Escalacao();
        esc1.setJogador(b1);
        esc2.setJogador(b2);
        
        escalacaoDao.adicionar(esc1);
        escalacaoDao.adicionar(esc2);
        
        Gol gol1 = sistema.cadastrarGol(jogo1, new Time(0, 0, 1), false, b1, selecaoA1);
        Gol gol2 = sistema.cadastrarGol(jogo1, new Time(0, 0, 1), false, b2, selecaoA1);
        Gol gol3 = sistema.cadastrarGol(jogo1, new Time(0, 0, 1), false, b3, selecaoA2);
        
        golDao.adicionar(gol1);
        golDao.adicionar(gol2);
        golDao.adicionar(gol3);
        substituicao1 = new Substituicao(b1, selecaoA2, jogo1, b3, new Time(1));
        substituicaoDao.adicionar(substituicao1);
        List<Jogador> lista = sistema.listarJogadoresReservaQueFizeramGols();
        
        assertEquals(b3, lista.get(0));
    }

    /**
     * Test of listarPaisesQueMaisParticiparamDeFinais method, of class Sistema.
     */
    @Test
    public void testListarPaisesQueMaisParticiparamDeFinais() {
        sistema.listarPaisesQueMaisParticiparamDeFinais();
    }

    /**
     * Test of listarPaisesComMaisEliminacoesPrimeiraFase method, of class
     * Sistema.
     */
    @Test
    public void testListarPaisesComMaisEliminacoesPrimeiraFase() {
        
        Pais pais1 = new Pais("Brasil", "continente");
        Pais pais2 = new Pais("Argentina", "continente");
        Pais pais3 = new Pais("Alemanha", "continente");
        Pais pais4 = new Pais("Holanda", "continente");
        Pais pais5 = new Pais("Colombia", "continente");
        Pais pais6 = new Pais("França", "continente");
        Pais pais7 = new Pais("Argelia", "continente");
        
        paisDao.adicionar(pais1);
        paisDao.adicionar(pais2);
        paisDao.adicionar(pais3);
        paisDao.adicionar(pais4);
        paisDao.adicionar(pais5);
        paisDao.adicionar(pais6);
        paisDao.adicionar(pais7);
        
        Selecao sele1 = new Selecao("A", new Date(50, 1, 1), 32);
        sele1.setPais(pais1);
        sele1.setNome("Brasil");
        Selecao sele2 = new Selecao("A", new Date(194, 1, 1), 16);
        sele2.setPais(pais1);
        sele2.setNome("Brasil");
        Selecao sele3 = new Selecao("A", new Date(202, 1, 1), 30);
        sele3.setPais(pais1);
        sele3.setNome("Brasil");
        Selecao sele8 = new Selecao("A", new Date(50, 1, 1), 1);
        sele8.setPais(pais1);
        sele8.setNome("Brasil");
        Selecao sele10 = new Selecao("A", new Date(250, 1, 1), 18);
        sele10.setPais(pais1);
        sele10.setNome("Brasil");
        
        Selecao sele4 = new Selecao("A", new Date(64, 1, 1), 32);
        sele4.setPais(pais2);
        sele4.setNome("Argentina");
        Selecao sele5 = new Selecao("A", new Date(69, 1, 1), 16);
        sele5.setPais(pais2);
        sele5.setNome("Argentina");
        Selecao sele7 = new Selecao("A", new Date(150, 1, 1), 19);
        sele7.setPais(pais2);
        sele7.setNome("Argentina");
        Selecao sele11 = new Selecao("A", new Date(70, 1, 1), 1);
        sele11.setPais(pais2);
        sele11.setNome("Argentina");
        
        Selecao sele6 = new Selecao("A", new Date(10, 1, 1), 19);
        sele6.setPais(pais3);
        sele6.setNome("Alemanha");
        Selecao sele9 = new Selecao("A", new Date(200, 1, 1), 19);
        sele9.setPais(pais3);
        sele9.setNome("Alemanha");
        Selecao sele12 = new Selecao("A", new Date(20, 1, 1), 1);
        sele12.setPais(pais3);
        sele12.setNome("Alemanha");
        
        Selecao sele13 = new Selecao("A", new Date(15, 1, 1), 25);
        sele13.setPais(pais4);
        sele13.setNome("Holanda");
        Selecao sele14 = new Selecao("A", new Date(19, 1, 1), 1);
        sele14.setPais(pais4);
        sele14.setNome("Holanda");

        ///////////////////////////////(15~13~5)
        Selecao sele15 = new Selecao("A", new Date(25, 1, 1), 15);
        sele15.setPais(pais5);
        sele15.setNome("Colombia");
        Selecao sele16 = new Selecao("A", new Date(8, 1, 1), 13);
        sele16.setPais(pais6);
        sele16.setNome("França");
        Selecao sele17 = new Selecao("A", new Date(4, 1, 1), 5);
        sele17.setPais(pais7);
        sele17.setNome("Argelia");
        
        selecaoDao.adicionar(sele1);
        selecaoDao.adicionar(sele2);
        selecaoDao.adicionar(sele3);
        selecaoDao.adicionar(sele4);
        selecaoDao.adicionar(sele5);
        selecaoDao.adicionar(sele6);
        selecaoDao.adicionar(sele7);
        selecaoDao.adicionar(sele8);
        selecaoDao.adicionar(sele9);
        selecaoDao.adicionar(sele10);
        selecaoDao.adicionar(sele11);
        selecaoDao.adicionar(sele12);
        selecaoDao.adicionar(sele13);
        selecaoDao.adicionar(sele14);
        selecaoDao.adicionar(sele15);
        selecaoDao.adicionar(sele16);
        selecaoDao.adicionar(sele17);
        
        List<Pais> perdeu = sistema.listarPaisesComMaisEliminacoesPrimeiraFase();
        
        assertEquals("Brasil", perdeu.get(0).getNome()); // [...]
        assertEquals("Argentina", perdeu.get(1).getNome());
        assertEquals("Alemanha", perdeu.get(2).getNome());
        assertEquals("Holanda", perdeu.get(3).getNome());

        /* assertEquals(pais1, campeoes.get(0));
         assertEquals(pais2, campeoes.get(1));
         assertEquals(pais3, campeoes.get(2));
         assertEquals(pais4, campeoes.get(3)); */ // Assim nao, [...]
    }

    /**
     * Test of listarPaisesComTotalDeVitoriasNaCopa method, of class Sistema.
     */
    @Test
    public void testListarPaisesComTotalDeVitoriasNaCopa() {
        sistema.listarPaisesComTotalDeVitoriasNaCopa();
    }

    /**
     * Test of listarPaisesQuePerderamPartidaEGanharamACopa method, of class
     * Sistema.
     */
    @Test
    public void testListarPaisesQuePerderamPartidaEGanharamACopa() {
        Selecao a, b, c;
        
        Pais p1, p2, p3;
        p1 = new Pais("a", "a1");
        p2 = new Pais("b", "b1");
        p3 = new Pais("c", "c1");
        paisDao.adicionar(p1);
        paisDao.adicionar(p2);
        paisDao.adicionar(p3);

        a = new Selecao(null, p1, null, "A", new Date(15, 1, 1), 1, "fr", null, null, null, null, null, null);
        b = new Selecao(null, p2, null, "B", new Date(25, 1, 1), 2, "br", null, null, null, null, null, null);
        c = new Selecao(null, p3, null, "C", new Date(35, 1, 1), 3, "ger", null, null, null, null, null, null);
        selecaoDao.adicionar(a);
        selecaoDao.adicionar(b);
        selecaoDao.adicionar(c);
        
        Jogo a1, a2, a3;
        a1 = new Jogo(null, a, b, new Date(25, 1, 1), "Amazonia", "primeira", 1, 5, null, null, null);
        a2 = new Jogo(null, a, c, new Date(25, 1, 1), "Amazonia", "primeira", 4, 1, null, null, null);
        a3 = new Jogo(null, c, b, new Date(25, 1, 1), "Amazonia", "primeira", 1, 5, null, null, null);
        jogoDao.adicionar(a1);
        jogoDao.adicionar(a2);
        jogoDao.adicionar(a3);
        
        List<Pais> paises = sistema.listarPaisesQuePerderamPartidaEGanharamACopa();
        assertEquals(p1, paises.get(0));
    }

    /**
     * Test of cadastrarJogo method, of class Sistema.
     */
    @Test
    public void testCadastrarJogo() {
        selecaoDao.adicionar(selecaoB1);
        selecaoDao.adicionar(selecaoA1);
        copaDao.adicionar(copa);
        Jogo jogo = sistema.cadastrarJogo(new Date(114, 7, 1), "maracana", copa, selecaoA1, selecaoB1, FaseCopa.GRUPOS.getFase(), 5, 5);
        List<Jogo> lista = sistema.getJogoDao().listar();
        assertEquals(jogo, lista.get(0));
    }

    /**
     * Test of listarEscalacoes method, of class Sistema.
     */
    @Test
    public void testListarEscalacoes() {
        selecaoDao.adicionar(selecaoB1);
        selecaoDao.adicionar(selecaoA2);
        selecaoDao.adicionar(selecaoC3);
        jogoDao.adicionar(jogo1);
        jogoDao.adicionar(jogo2);
        jogoDao.adicionar(jogo3);
        jogadorDao.adicionar(jogB1);
        jogadorDao.adicionar(jogB2);
        jogadorDao.adicionar(jogB3);
        escA1 = sistema.cadastrarEscalacao(jogo1, selecaoB1, jogB1);
        escA2 = sistema.cadastrarEscalacao(jogo2, selecaoA2, jogB2);
        escA3 = sistema.cadastrarEscalacao(jogo3, selecaoC3, jogB3);
        List<Escalacao> escalacoes = sistema.getEscalacaoDao().listar();
        assertFalse(escalacoes.isEmpty());
        assertEquals(escA1, escalacoes.get(0));
        assertEquals(escA2, escalacoes.get(1));
        assertEquals(escA3, escalacoes.get(2));
    }

    /**
     * Test of listaGols method, of class Sistema.
     */
    @Test
    public void testListaGols() {
        selecaoDao.adicionar(selecaoB1);
        jogoDao.adicionar(jogo1);
        jogadorDao.adicionar(jogB1);
        gol1 = sistema.cadastrarGol(jogo1, new Time(1, 1, 1), true, jogB1, selecaoB1);
        gol2 = sistema.cadastrarGol(jogo1, new Time(1, 1, 1), true, jogB1, selecaoB1);
        gol3 = sistema.cadastrarGol(jogo1, new Time(1, 1, 1), true, jogB1, selecaoB1);
        List<Gol> gols = sistema.getGolDao().listar();
        assertFalse(gols.isEmpty());
        assertEquals(gol1, gols.get(0));
        assertEquals(gol2, gols.get(1));
        assertEquals(gol3, gols.get(2));
        
    }

    /**
     * Test of listarSubstituicoes method, of class Sistema.
     */
    @Test
    public void testListarSubstituicoes() {
        selecaoDao.adicionar(selecaoB1);
        jogoDao.adicionar(jogo1);
        jogadorDao.adicionar(jogB2);
        jogadorDao.adicionar(jogB3);
        jogadorDao.adicionar(jogB4);
        jogadorDao.adicionar(jogB5);
        jogadorDao.adicionar(jogB10);
        jogadorDao.adicionar(jogB11);
        substituicao1 = sistema.cadastrarSubstituicao(new Time(1, 1, 1), jogB5, jogB10, jogo1, selecaoB1);
        substituicao2 = sistema.cadastrarSubstituicao(new Time(0, 40, 1), jogB2, jogB11, jogo1, selecaoB1);
        substituicao3 = sistema.cadastrarSubstituicao(new Time(1, 15, 1), jogB3, jogB4, jogo1, selecaoB1);
        List<Substituicao> substituicoes = sistema.getSubstituicaoDao().listar();
        assertFalse(substituicoes.isEmpty());
        assertEquals(substituicao1, substituicoes.get(0));
        assertEquals(substituicao2, substituicoes.get(1));
        assertEquals(substituicao3, substituicoes.get(2));
    }
}
