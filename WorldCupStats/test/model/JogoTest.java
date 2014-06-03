/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import model.Enuns.FaseCopa;
import model.Enuns.FuncaoJogador;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

/**
 * Testes para verificar funcionalidades da classe Jogo.
 *
 * @author D.L.O.L
 *
 * @version 1.0
 *
 * @see Jogo
 */
public class JogoTest {

    private Jogo jogo;
    private Copa copa;
    private Time brazil;
    private Time alemanha;
    private Escalacao doBrazil;
    private Escalacao daAlemanha;
    private Tecnico tecnico;
    private Pais Brasil;
    private Pais Alemanha;

    @Before
    public void setUp() {
        tecnico = new Tecnico("Alguem", new Date());
        Brasil = new Pais("Brasil", "America do Sul");
        Alemanha = new Pais("Alemanha", "Asia");

        brazil = new Time('J', 2014, 2, tecnico, Brasil, copa);
        alemanha = new Time('H', 2014, 3, tecnico, Alemanha, copa);

        List<Pessoa> br = new ArrayList<Pessoa>();
        Pessoa jogador1 = new Jogador("Caboré", new Date(10), 99, FuncaoJogador.GOLEIRO);
        Pessoa jogador2 = new Jogador("Biru Biro", new Date(10), 10, FuncaoJogador.MEIO_DE_CAMPO);
        Pessoa jogador3 = new Jogador("Não vou colocar os 23 não", new Date(10), 23, FuncaoJogador.ATACANTE);
        br.add(jogador1);
        br.add(jogador2);
        br.add(jogador3);

        List<Pessoa> al = new ArrayList<Pessoa>();
        jogador1 = new Jogador("Asnhkci", new Date(10), 05, FuncaoJogador.GOLEIRO);
        jogador2 = new Jogador("Biknov Biroko", new Date(10), 01, FuncaoJogador.MEIO_DE_CAMPO);
        jogador3 = new Jogador("Nain Nain Nain Nain", new Date(10), 11, FuncaoJogador.ATACANTE);
        al.add(jogador1);
        al.add(jogador2);
        al.add(jogador3);

        doBrazil = new Escalacao(jogo, br);
        daAlemanha = new Escalacao(jogo, al);

        jogo = new Jogo(FaseCopa.SEMI, new Date(), "Fonte Nova - Salvador", copa, brazil, alemanha, doBrazil, daAlemanha);
    }

    @Test
    public void testFASE() {
        assertSame("Semifinal", jogo.getFASE());
    }

    @Test
    public void testVerificarEscalacaoA() {

        List<Pessoa> br = jogo.getEscalacaoA().getJogador();

        assertTrue(3 == br.size());
        assertSame("Caboré", br.get(00).getNome());
        assertSame("Biru Biro", br.get(01).getNome());
        assertSame("Não vou colocar os 23 não", br.get(02).getNome());
    }

    @Test
    public void testVerificarEscalacaoB() {

        List<Pessoa> al = jogo.getEscalacaoB().getJogador();

        assertTrue(3 == al.size());
        assertSame("Asnhkci", al.get(00).getNome());
        assertSame("Biknov Biroko", al.get(01).getNome());
        assertSame("Nain Nain Nain Nain", al.get(02).getNome());
    }

    @Test
    public void testVerificarSubstistituicoes() {

        assertTrue("Não houve substituições", 0 == jogo.getSubstituicao().size() );
        
        Pessoa subsBrasil = new Jogador("Gluttony", new Date(10), 00, FuncaoJogador.GOLEIRO);
        List<Pessoa> br = jogo.getEscalacaoA().getJogador();     
        Substituicao saiCabore = new Substituicao(brazil, subsBrasil, br.get(0), new Date(300000));
        jogo.addSubstituicao(saiCabore);
        
        assertTrue( 1 == jogo.getSubstituicao().size() );
        assertEquals("Caboré", jogo.getSubstituicao().get(0).getqSai().getNome());
        assertEquals(subsBrasil, jogo.getSubstituicao().get(0).getqEntra());
        assertTrue( 5 == jogo.getSubstituicao().get(0).getTempo().getMinutes() );
        
        Pessoa subsAlemanha = new Jogador("Envy", new Date(10), 01, FuncaoJogador.ATACANTE);
        List<Pessoa> al = jogo.getEscalacaoB().getJogador();
        Substituicao saiAsnhkci = new Substituicao(brazil, subsAlemanha, al.get(0), new Date(360000));
        jogo.addSubstituicao(saiAsnhkci);
        
        assertTrue( 2 == jogo.getSubstituicao().size() );
        assertEquals("Caboré", jogo.getSubstituicao().get(0).getqSai().getNome());
        assertEquals(subsBrasil, jogo.getSubstituicao().get(0).getqEntra());
        assertTrue( 5 == jogo.getSubstituicao().get(0).getTempo().getMinutes() );
        assertEquals("Asnhkci", jogo.getSubstituicao().get(1).getqSai().getNome());
        assertEquals(subsAlemanha, jogo.getSubstituicao().get(1).getqEntra());
        assertTrue( 6 == jogo.getSubstituicao().get(1).getTempo().getMinutes() );
    }

    @Test
    public void testPlacarJogo() {

        Date tempo = new Date(180000);

        Gol golBR1 = new Gol(jogo, null, brazil, tempo, false);
        Gol golBR2 = new Gol(jogo, null, brazil, tempo, true);
        Gol golBR3 = new Gol(jogo, null, brazil, tempo, false);
        Gol golBR4 = new Gol(jogo, null, brazil, tempo, false);
        Gol golAL1 = new Gol(jogo, null, brazil, tempo, false);
        Gol golAL2 = new Gol(jogo, null, brazil, tempo, true);
        Gol golAL3 = new Gol(jogo, null, brazil, tempo, true);

        jogo.addGolTimeA(golBR1);
        jogo.addGolTimeA(golBR2);
        jogo.addGolTimeA(golBR3);
        jogo.addGolTimeA(golBR4);
        jogo.addGolTimeB(golAL1);
        jogo.addGolTimeB(golAL2);
        jogo.addGolTimeB(golAL3);

        String respEsperada = "Brasil 5x2 Alemanha";
        String placar = jogo.placarJogo();

        assertEquals(respEsperada, placar);
    }

    @Test
    public void testTimeParticipouJogo() {

        Time italia = new Time('B', 2014, 25, tecnico, new Pais("Italia", "Europa"), copa);
        assertEquals(false, jogo.timeParticipouJogo(italia));

        Time mesmoBrazil = new Time('J', 2014, 2, tecnico, Brasil, copa);
        assertEquals(true, jogo.timeParticipouJogo(mesmoBrazil));

        Time mesmaAlemanha = new Time('H', 2014, 3, tecnico, Alemanha, copa);
        assertEquals(true, jogo.timeParticipouJogo(mesmaAlemanha));

        Time outroBrazil = new Time('J', 2002, 2, tecnico, Brasil, copa);
        assertEquals(false, jogo.timeParticipouJogo(outroBrazil));

        Time outraAlemanha = new Time('H', 2002, 3, tecnico, Alemanha, copa);
        assertEquals(false, jogo.timeParticipouJogo(outraAlemanha));
    }

    @Test
    public void testVitoriaIncontestavel() {

        Date tempo = new Date(180000);

        Gol golBR1 = new Gol(jogo, null, brazil, tempo, false);
        Gol golBR2 = new Gol(jogo, null, brazil, tempo, true);
        Gol golBR3 = new Gol(jogo, null, brazil, tempo, false);
        Gol golBR4 = new Gol(jogo, null, brazil, tempo, false);
        Gol golAL1 = new Gol(jogo, null, brazil, tempo, false);
        Gol golAL2 = new Gol(jogo, null, brazil, tempo, true);
        Gol golAL3 = new Gol(jogo, null, brazil, tempo, true);

        jogo.addGolTimeA(golBR1);
        jogo.addGolTimeA(golBR2);
        jogo.addGolTimeA(golBR3);
        jogo.addGolTimeA(golBR4);
        jogo.addGolTimeB(golAL1);
        jogo.addGolTimeB(golAL2);
        jogo.addGolTimeB(golAL3);

        assertEquals(true, jogo.vitoriaIncontestavel());
    }

    @Test
    public void testDiferencaGols() {

        Date tempo1 = new Date(180000); // 3 minutos
        Date tempo2 = new Date(300000); // 5 minutos
        Date tempo3 = new Date(900000); // 15 minutos
        Date tempo4 = new Date(2400000); // 40 minutos
        Date tempo5 = new Date(5400000); // 90 minutos
        Date tempo6 = new Date(5580000); // 93 minutos
        Date tempo7 = new Date(5700000); // 95 minutos

        Gol golBR1 = new Gol(jogo, null, brazil, tempo1, false);
        Gol golBR2 = new Gol(jogo, null, brazil, tempo2, true);
        Gol golBR3 = new Gol(jogo, null, brazil, tempo3, false);
        Gol golBR4 = new Gol(jogo, null, brazil, tempo4, false);
        Gol golAL1 = new Gol(jogo, null, brazil, tempo5, false);
        Gol golAL2 = new Gol(jogo, null, brazil, tempo6, true);
        Gol golAL3 = new Gol(jogo, null, brazil, tempo7, true);

        jogo.addGolTimeA(golBR1);
        jogo.addGolTimeA(golBR2);
        jogo.addGolTimeA(golBR3);
        jogo.addGolTimeA(golBR4);
        jogo.addGolTimeB(golAL1);
        jogo.addGolTimeB(golAL2);
        jogo.addGolTimeB(golAL3);

        assertEquals(3, jogo.diferencaGols());
    }

    @Test
    public void testEmpatou() {

        Date tempo = new Date();

        Gol golBR1 = new Gol(jogo, null, brazil, tempo, false);
        Gol golBR2 = new Gol(jogo, null, brazil, tempo, true);
        Gol golAL1 = new Gol(jogo, null, brazil, tempo, true);
        Gol golAL2 = new Gol(jogo, null, brazil, tempo, true);

        jogo.addGolTimeA(golBR1);
        jogo.addGolTimeA(golBR2);
        jogo.addGolTimeB(golAL1);
        jogo.addGolTimeB(golAL2);

        assertEquals(false, jogo.empatou()); // Brasil 3x1 Alemanha.

        Gol golAL3 = new Gol(jogo, null, brazil, tempo, false);
        Gol golAL4 = new Gol(jogo, null, brazil, tempo, false);
        jogo.addGolTimeB(golAL3);
        jogo.addGolTimeB(golAL4);

        assertEquals(true, jogo.empatou()); // Brasil 3x3 Alemanha.
    }

    @Test
    public void testVencedorEDerrotado() {

        Date tempo = new Date();

        Gol golBR1 = new Gol(jogo, null, brazil, tempo, false);
        Gol golBR2 = new Gol(jogo, null, brazil, tempo, true);
        Gol golAL1 = new Gol(jogo, null, brazil, tempo, true);
        Gol golAL2 = new Gol(jogo, null, brazil, tempo, true);

        jogo.addGolTimeA(golBR1);
        jogo.addGolTimeA(golBR2);
        jogo.addGolTimeB(golAL1);
        jogo.addGolTimeB(golAL2);

        assertEquals(brazil, jogo.vencedor()); // Brasil 3x1 Alemanha.
        assertEquals(alemanha, jogo.Derrotado());

        Gol golAL3 = new Gol(jogo, null, brazil, tempo, false);
        Gol golAL4 = new Gol(jogo, null, brazil, tempo, false);
        jogo.addGolTimeB(golAL3);
        jogo.addGolTimeB(golAL4);

        assertNull(jogo.vencedor()); // Brasil 3x3 Alemanha.
        assertNull(jogo.Derrotado());
    }
}
