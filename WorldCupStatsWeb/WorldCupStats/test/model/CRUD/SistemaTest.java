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
    PaisDAO paisDao = sistema.pais;
    CopaDAO copaDao = sistema.copa;
    TecnicoDAO tecnicoDao = sistema.tecnico;
    EscalacaoDAO escalacaoDao = sistema.escalacao;
    GolDAO golDao = sistema.gol;
    JogadorDAO jogadorDao = sistema.jogador;
    JogoDAO jogoDao = sistema.jogo;
    SelecaoDAO selecaoDao = sistema.selecao;
    SubstituicaoDAO substituicaoDao = sistema.substituicao;

    Pais brasil, africa, coreia;
    Selecao selecaoB1, selecaoA1, selecaoC1,selecaoB2, selecaoA2, selecaoC2,
            selecaoB3, selecaoA3, selecaoC3;
    Escalacao escA1, escB1, escC1,escA2, escB2, escC2,escA3, escB3, escC3;
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
        
        copa =new Copa(new Date(114, 1, 1));
        copa1 =new Copa(new Date(110, 1, 1));
        copa2 =new Copa(new Date(106, 1, 1));
        
        brasil = new Pais("brasil", "america");
        africa = new Pais("Africa", "africa");
        coreia = new Pais("coreia", "asia");
        
        
        copa.setPais(brasil);
        copa.setPais(africa);
        copa.setPais(coreia);
        copa1.setPais(brasil);
        copa1.setPais(africa);
        copa1.setPais(coreia);
        copa2.setPais(brasil);
        copa2.setPais(africa);
        copa2.setPais(coreia);
        
        selecaoB1 = new Selecao("brasil", new Date(114), 1);
        selecaoA1 = new Selecao("africa", new Date(114), 2);
        selecaoC1 = new Selecao("coreia", new Date(114), 3);
        selecaoB2 = new Selecao("brasil", new Date(110), 1);
        selecaoA2 = new Selecao("africa", new Date(110), 3);
        selecaoC2 = new Selecao("coreia", new Date(110), 2);
        selecaoB3 = new Selecao("brasil", new Date(106), 2);
        selecaoA3 = new Selecao("africa", new Date(106), 1);
        selecaoC3 = new Selecao("coreia", new Date(106), 3);
        
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
        
        jogB1=new Jogador(new Date(80, 5, 15), "julio", 1, FuncaoJogador.GOLEIRO.getFuncao());
        jogB2=new Jogador(new Date(83, 3, 20), "daniel", 2, FuncaoJogador.LATERAL.getFuncao()); 
        jogB3=new Jogador(new Date(90, 11, 2), "tiago", 3, FuncaoJogador.LATERAL.getFuncao()); 
        jogB4=new Jogador(new Date(81, 3, 5), "david", 4, FuncaoJogador.ZAGUEIRO.getFuncao()); 
        jogB5=new Jogador(new Date(89, 8, 21), "fernandinho", 5, FuncaoJogador.VOLANTE.getFuncao()); 
        jogB6=new Jogador(new Date(97, 6, 13), "marcelo", 6, FuncaoJogador.LATERAL.getFuncao()); 
        jogB7=new Jogador(new Date(95, 1, 11), "hulk", 7, FuncaoJogador.ATACANTE.getFuncao()); 
        jogB8=new Jogador(new Date(82, 6, 8), "paulinho", 8, FuncaoJogador.VOLANTE.getFuncao()); 
        jogB9=new Jogador(new Date(84, 2, 27), "fred", 9, FuncaoJogador.ATACANTE.getFuncao()); 
        jogB10=new Jogador(new Date(79, 8, 12), "neymar", 10, FuncaoJogador.ATACANTE.getFuncao()); 
        jogB11=new Jogador(new Date(91, 7, 30), "oscar", 11, FuncaoJogador.MEIO_DE_CAMPO.getFuncao()); 
     
        jogo1= new Jogo(new Date(114, 6, 20), "Maracana", FaseCopa.GRUPOS.getFase());
        jogo2= new Jogo(new Date(114, 6, 21), "dunas", FaseCopa.GRUPOS.getFase());
        jogo3= new Jogo(new Date(114, 6, 22), "fonte nova", FaseCopa.GRUPOS.getFase());
        
        felipao= new Tecnico("felipao", new Date(84, 6, 22));
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
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarJogosCopa method, of class Sistema.
     */
    @Test
    public void testListarJogosCopa() {
        fail("The test case is a prototype.");
    }

    /**
     * Test of qtdJogosPais method, of class Sistema.
     */
    @Test
    public void testQtdJogosPais() {
        fail("The test case is a prototype.");
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
        selecaoB1 = sistema.cadastrarSelecao(1, new Date(114,1,1), "A", brasil);
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
        List<Escalacao> lista = sistema.listarEscalacoes();
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
        Gol gol = sistema.cadastrarGol(jogo1, new Time(0,0,1), true, jogB1, selecaoA1);
        List<Gol> lista = sistema.listaGols();
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
        Substituicao substituicao = sistema.cadastrarSubstituicao(new Time(1,30,1), jogB1, jogB11, jogo1,selecaoB1);
        List<Substituicao> lista = sistema.listarSubstituicoes();
        assertEquals(substituicao, lista.get(0));
    }

    /**
     * Test of listarJogadores method, of class Sistema.
     */
    @Test
    public void testListarJogadores() {
        Jogador jogador = sistema.cadastrarJogador(new Date(90,1,1), "neimar", 1, FuncaoJogador.ATACANTE.getFuncao());
        Jogador jogador1 = sistema.cadastrarJogador(new Date(80,1,1), "fred", 2,FuncaoJogador.ATACANTE.getFuncao());
        Jogador jogador2 = sistema.cadastrarJogador(new Date(85,1,1), "david", 3, FuncaoJogador.ZAGUEIRO.getFuncao());
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
        
        selecaoB1 = sistema.cadastrarSelecao(1, new Date(110,1,1), "A", brasil);
        Selecao selecao1 = sistema.cadastrarSelecao(2, new Date(110,1,1), "B", africa);
        Selecao selecao2 = sistema.cadastrarSelecao(3, new Date(110,1,1), "C", coreia);
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
        assertEquals(jogB1,result.get(0));
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
        fail("The test case is a prototype.");
    }

    /**
     * Test of consultarEscalacaoSelecao method, of class Sistema.
     */
    @Test
    public void testConsultarEscalacaoSelecao() {
        fail("The test case is a prototype.");
    }

    /**
     * Test of listaSubstituicoesJogo method, of class Sistema.
     */
    @Test
    public void testListaSubstituicoesJogo() {
        fail("The test case is a prototype.");
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
        
        gol1 = sistema.cadastrarGol(jogo1, new Time(0,10,0), true, jogador, selecaoA1);
        gol2 = sistema.cadastrarGol(jogo1, new Time(1,10,2), false, jogador, selecaoA1);
        gol3 = sistema.cadastrarGol(jogo1, new Time(1,20,50), true, jogador, selecaoA1);
       
        List<Gol> gols = sistema.listaGols();
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
     * Test of consultarQuatidadeDeJogoPais method, of class Sistema.
     */
    @Test
    public void testConsultarQuatidadeDeJogoPais() {
        fail("The test case is a prototype.");
    }

    /**
     * Test of consultarCaracteristicasJogador method, of class Sistema.
     */
    @Test
    public void testConsultarCaracteristicasJogador() {
        
        fail("The test case is a prototype.");
    }

    /**
     * Test of consultarQuantidadeEMediaDeGols method, of class Sistema.
     */
    @Test
    public void testConsultarQuantidadeEMediaDeGols() {
        fail("The test case is a prototype.");
    }

    /**
     * Test of consultarMaioresGoleadas method, of class Sistema.
     */
    @Test
    public void testConsultarMaioresGoleadas() {
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarJogosEmpatados method, of class Sistema.
     */
    @Test
    public void testListarJogosEmpatados() {
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarVitoriasIncontestaveis method, of class Sistema.
     */
    @Test
    public void testListarVitoriasIncontestaveis() {
        fail("The test case is a prototype.");
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
    public void testConsultaMediaIdadeSelecoes() {
        fail("The test case is a prototype.");
    }

    /**
     * Test of listaTodasFinais method, of class Sistema.
     */
    @Test
    public void testListaTodasFinais() {
        fail("The test case is a prototype.");
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
        fail("The test case is a prototype.");
    }

    /**
     * Test of listaCopasComPaisSedeCampeao method, of class Sistema.
     */
    @Test
    public void testListaCopasComPaisSedeCampeao() {
        fail("The test case is a prototype.");
    }

    /**
     * Test of listaDecrescenteDePaisesComMaisTitulos method, of class Sistema.
     */
    @Test
    public void testListaDecrescenteDePaisesComMaisTitulos() {
        fail("The test case is a prototype.");
    }

    /**
     * Test of quatidadeDeParticipacoesEmCopas method, of class Sistema.
     */
    @Test
    public void testQuatidadeDeParticipacoesEmCopas() {
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarPaisesComMaisParticipacoes method, of class Sistema.
     */
    @Test
    public void testListarPaisesComMaisParticipacoes() {
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarPaisesComMaiorNumeroDeViceCampeonatos method, of class
     * Sistema.
     */
    @Test
    public void testListarPaisesComMaiorNumeroDeViceCampeonatos() {
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarPaisesComMaiorPercentualDeDerrotas method, of class
     * Sistema.
     */
    @Test
    public void testListarPaisesComMaiorPercentualDeDerrotas() {
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarJogadoresComMaiorNumeroDeGolPorPartida method, of class
     * Sistema.
     */
    @Test
    public void testListarJogadoresComMaiorNumeroDeGolPorPartida() {
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarJogadorComMaiorMediaDeGolPorPartidaNasCopas method, of
     * class Sistema.
     */
    @Test
    public void testListarJogadorComMaiorMediaDeGolPorPartidaNasCopas() {
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarJogadorComMaiorQuantidadeDeJogosEmCopas method, of class
     * Sistema.
     */
    @Test
    public void testListarJogadorComMaiorQuantidadeDeJogosEmCopas() {
        fail("The test case is a prototype.");
    }

    /**
     * Test of consultarGolMaisRapidoNasCopas method, of class Sistema.
     */
    @Test
    public void testConsultarGolMaisRapidoNasCopas() {
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarJogadoresComMaiorNumeroDeJogosComoReserva method, of class
     * Sistema.
     */
    @Test
    public void testListarJogadoresComMaiorNumeroDeJogosComoReserva() {
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarJogadoresReservaQueFizeramGols method, of class Sistema.
     */
    @Test
    public void testListarJogadoresReservaQueFizeramGols() {
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarPaisesQueMaisParticiparamDeFinais method, of class Sistema.
     */
    @Test
    public void testListarPaisesQueMaisParticiparamDeFinais() {
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarPaisesComMaisEliminacoesPrimeiraFase method, of class
     * Sistema.
     */
    @Test
    public void testListarPaisesComMaisEliminacoesPrimeiraFase() {
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarPaisesComTotalDeVitoriasNaCopa method, of class Sistema.
     */
    @Test
    public void testListarPaisesComTotalDeVitoriasNaCopa() {
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarPaisesQuePerderamPartidaEGanharamACopa method, of class
     * Sistema.
     */
    @Test
    public void testListarPaisesQuePerderamPartidaEGanharamACopa() {
        fail("The test case is a prototype.");
    }

    /**
     * Test of cadastrarJogo method, of class Sistema.
     */
    @Test
    public void testCadastrarJogo() {
        selecaoDao.adicionar(selecaoB1);
        selecaoDao.adicionar(selecaoA1);
        copaDao.adicionar(copa);
        Jogo jogo = sistema.cadastrarJogo(new Date(114, 7, 1), "maracana", copa, selecaoA1, selecaoB1, FaseCopa.GRUPOS.getFase());
        List<Jogo> lista = sistema.listarJogos();
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
        List<Escalacao> escalacoes = sistema.listarEscalacoes();
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
        gol1 = sistema.cadastrarGol(jogo1, new Time(1,1,1), true, jogB1, selecaoB1);
        gol2 = sistema.cadastrarGol(jogo1, new Time(1,1,1), true, jogB1, selecaoB1);
        gol3 = sistema.cadastrarGol(jogo1, new Time(1,1,1), true, jogB1, selecaoB1);
        List<Gol> gols = sistema.listaGols();
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
        substituicao1 = sistema.cadastrarSubstituicao(new Time(1,1,1), jogB5, jogB10, jogo1,selecaoB1);
        substituicao2 = sistema.cadastrarSubstituicao(new Time(0,40,1), jogB2, jogB11, jogo1,selecaoB1);
        substituicao3 = sistema.cadastrarSubstituicao(new Time(1,15,1), jogB3, jogB4, jogo1, selecaoB1);
        List<Substituicao> substituicoes = sistema.listarSubstituicoes();
        assertFalse(substituicoes.isEmpty());
        assertEquals(substituicao1, substituicoes.get(0));
        assertEquals(substituicao2, substituicoes.get(1));
        assertEquals(substituicao3, substituicoes.get(2));
    }
}
