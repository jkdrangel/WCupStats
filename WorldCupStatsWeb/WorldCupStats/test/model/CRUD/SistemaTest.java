/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.CRUD;

import java.sql.Date;
import java.util.List;
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
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author lsantana
 */
public class SistemaTest {

    Sistema sistema = new Sistema();

    public SistemaTest() {
        sistema.copa.removerTodos();
        sistema.pais.removerTodos();
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testCadastrarPais() {
        Pais brasil= sistema.cadastrarPais("Brazil", "America do sul");
        assertNotNull(brasil);
        List<Pais> paises = sistema.listarPaises();
        assertEquals(brasil, paises.get(0));
    }
    

    @Test
    public void testCadastrarCopa() {
        Copa brasil= sistema.cadastrarCopa(new Date(114,1,1),null,null);
        assertNotNull(brasil);
        List<Copa> copas = sistema.listarCopas();
        assertEquals(brasil, copas.get(0));
    }

    @Test
    public void testListarPaises() {
        Pais brasil= sistema.cadastrarPais("brasil", "america");
        Pais africa= sistema.cadastrarPais("africa", "africa");
        Pais coreia= sistema.cadastrarPais("coreia", "asia");
        
        List<Pais> paises = sistema.listarPaises();
        assertFalse(paises.isEmpty());
        assertEquals(brasil, paises.get(0));
        assertEquals(africa, paises.get(1));
        assertEquals(coreia, paises.get(2));
    }

    @Test
    public void testListarCopas() {
        
        Copa copa= sistema.cadastrarCopa(new Date(114,1,1),null,null);
        Copa copa1= sistema.cadastrarCopa(new Date(110,1,1),null,null);
        Copa copa2= sistema.cadastrarCopa(new Date(106,1,1),null,null);
        List<Copa> copas = sistema.listarCopas();
        assertFalse(copas.isEmpty());
        assertEquals(copa, copas.get(0));
        assertEquals(copa1, copas.get(1));
        assertEquals(copa2, copas.get(2));
        
    }
    
    @Test
    public void testEMarmelada(){
    sistema.eMarmelada();
    }
    
    @Test
    public void testEDoBrasil(){
    sistema.eDoBrasil();
    }
    
    @Test
    public void testToDentro(){
    sistema.toDentro();
    }
    
    @Test
    public void testArrozDeCopa(){
    sistema.arrozDeCopa();
    }
    
    @Test
    public void testSempreVice(){
    sistema.sempreVice();
    }
    
    
    @Test
    public void testFregues(){
    sistema.fregues();
    }
    
    
    @Test
    public void testTimeBom(){
    sistema.timeBom();
    }
    
    @Test
    public void testTimeRuim(){
    sistema.timeRuim();
    }
    
    @Test
    public void testInvictos(){
    sistema.invictos();
    }
    
    @Test
    public void testPerdeuGanhou(){
    sistema.perdeuGanhou();
    }
    /**
     * Test of listarPaisesCopa method, of class Sistema.
     */
    @Test
    public void testListarPaisesCopa() {
        System.out.println("listarPaisesCopa");
        Copa copa = null;
        Sistema instance = new Sistema();
        List<Pais> expResult = null;
        List<Pais> result = instance.listarPaisesCopa(copa);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarJogosCopa method, of class Sistema.
     */
    @Test
    public void testListarJogosCopa() {
        System.out.println("listarJogosCopa");
        Copa copa = null;
        Sistema instance = new Sistema();
        List<Jogo> expResult = null;
        List<Jogo> result = instance.listarJogosCopa(copa);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of qtdJogosPais method, of class Sistema.
     */
    @Test
    public void testQtdJogosPais() {
        System.out.println("qtdJogosPais");
        Pais pais = null;
        Sistema instance = new Sistema();
        int expResult = 0;
        int result = instance.qtdJogosPais(pais);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

  
    /**
     * Test of cadastrarJogador method, of class Sistema.
     */
    @Test
    public void testCadastrarJogador() {
       Jogador jogador = sistema.cadastrarJogador(new Date(92,1,1), "neimar", 10, FuncaoJogador.MEIO_DE_CAMPO.getFuncao());
        List<Jogador> lista= sistema.listarJogadores();
        assertEquals(jogador, lista.get(0));
    }

    /**
     * Test of cadastrarTecnico method, of class Sistema.
     */
    @Test
    public void testCadastrarTecnico() {
        Tecnico tecnico = sistema.cadastrarTecnico("felipão", new Date(50,1,1));
        List<Tecnico> lista= sistema.listarTecnicos();
        assertEquals(tecnico, lista.get(0));
    }

    /**
     * Test of cadastrarSelecao method, of class Sistema.
     */
    @Test
    public void testCadastrarSelecao() {
        Selecao selecao = sistema.cadastrarSelecao(1, null, null, null);
        List<Selecao> lista= sistema.listarSelecoes();
        assertEquals(selecao, lista.get(0));
    }

    /**
     * Test of cadastrarEscalacao method, of class Sistema.
     */
    @Test
    public void testCadastrarEscalacao() {
        Escalacao escalacao = sistema.cadastrarEscalacao(null, null);
        List<Escalacao> lista= sistema.listarEscalacoes();
        assertEquals(escalacao, lista.get(0));
    }

    /**
     * Test of cadastrarGol method, of class Sistema.
     */
    @Test
    public void testCadastrarGol() {
       Gol gol = sistema.cadastrarGol(null, null, true);
        List<Escalacao> lista= sistema.listaGols(null);
        assertEquals(gol, lista.get(0));
    }

    /**
     * Test of cadastrarSubstituicao method, of class Sistema.
     */
    @Test
    public void testCadastrarSubstituicao() {
       Substituicao substituicao = sistema.cadastrarSubstituicao(null, null, null);
        List<Substituicao> lista= sistema.listarSubstituicoes();
        assertEquals(substituicao, lista.get(0));
    }

    /**
     * Test of listarJogadores method, of class Sistema.
     */
    @Test
    public void testListarJogadores() {
       Jogador jogador= sistema.cadastrarJogador(null, null, 1, null);
        Jogador jogador1= sistema.cadastrarJogador(null, null, 2, null);
        Jogador jogador2= sistema.cadastrarJogador(null, null, 3, null);
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
        Copa copa= sistema.cadastrarCopa(new Date(114,1,1),null,null);
        Copa copa1= sistema.cadastrarCopa(new Date(110,1,1),null,null);
        Copa copa2= sistema.cadastrarCopa(new Date(106,1,1),null,null);
        List<Copa> copas = sistema.listarCopas();
        assertFalse(copas.isEmpty());
        assertEquals(copa, copas.get(0));
        assertEquals(copa1, copas.get(1));
        assertEquals(copa2, copas.get(2));
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarSelecoes method, of class Sistema.
     */
    @Test
    public void testListarSelecoes() {
        Copa copa= sistema.cadastrarCopa(new Date(114,1,1),null,null);
        Copa copa1= sistema.cadastrarCopa(new Date(110,1,1),null,null);
        Copa copa2= sistema.cadastrarCopa(new Date(106,1,1),null,null);
        List<Copa> copas = sistema.listarCopas();
        assertFalse(copas.isEmpty());
        assertEquals(copa, copas.get(0));
        assertEquals(copa1, copas.get(1));
        assertEquals(copa2, copas.get(2));
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarJogadoresDaSelecao method, of class Sistema.
     */
    @Test
    public void testListarJogadoresDaSelecao() {
        System.out.println("listarJogadoresDaSelecao");
        Selecao selecao = null;
        Sistema instance = new Sistema();
        List<Jogador> expResult = null;
        List<Jogador> result = instance.listarJogadoresDaSelecao(selecao);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of consultarTecnicoSelecao method, of class Sistema.
     */
    @Test
    public void testConsultarTecnicoSelecao() {
        System.out.println("consultarTecnicoSelecao");
        Selecao s = null;
        Sistema instance = new Sistema();
        Tecnico expResult = null;
        Tecnico result = instance.consultarTecnicoSelecao(s);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of consultarPlacarJogo method, of class Sistema.
     */
    @Test
    public void testConsultarPlacarJogo() {
        System.out.println("consultarPlacarJogo");
        Jogo j = null;
        Sistema instance = new Sistema();
        String expResult = "";
        String result = instance.consultarPlacarJogo(j);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of consultarEscalacaoSelecao method, of class Sistema.
     */
    @Test
    public void testConsultarEscalacaoSelecao() {
        System.out.println("consultarEscalacaoSelecao");
        Selecao s = null;
        Sistema instance = new Sistema();
        Escalacao expResult = null;
        Escalacao result = instance.consultarEscalacaoSelecao(s);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listaSubstituicoesJogo method, of class Sistema.
     */
    @Test
    public void testListaSubstituicoesJogo() {
        System.out.println("listaSubstituicoesJogo");
        Jogo j = null;
        Sistema instance = new Sistema();
        List<Substituicao> expResult = null;
        List<Substituicao> result = instance.listaSubstituicoesJogo(j);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listaGolsDaPartida method, of class Sistema.
     */
    @Test
    public void testListaGolsDaPartida() {
        System.out.println("listaGolsDaPartida");
        Jogo j = null;
        Sistema instance = new Sistema();
        List<Gol> expResult = null;
        List<Gol> result = instance.listaGolsDaPartida(j);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of consultarQuatidadeDeJogoPais method, of class Sistema.
     */
    @Test
    public void testConsultarQuatidadeDeJogoPais() {
        System.out.println("consultarQuatidadeDeJogoPais");
        Pais p = null;
        Sistema instance = new Sistema();
        int expResult = 0;
        int result = instance.consultarQuatidadeDeJogoPais(p);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
