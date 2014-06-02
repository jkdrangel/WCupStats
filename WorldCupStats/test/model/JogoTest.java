/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;
import java.util.List;
import model.Enuns.FaseCopa;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

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
        tecnico = new Tecnico("Alguem", new Date(10));
        Brasil = new Pais("Brasil", "America do Sul");
        Alemanha = new Pais("Alemanha", "Asia");

        brazil = new Time('J', 2014, 2, tecnico, Brasil, copa);
        alemanha = new Time('H', 2014, 3, tecnico, Alemanha, copa);

        doBrazil = null;
        daAlemanha = null;

        jogo = new Jogo(FaseCopa.SEMI, new Date(), "Fonte Nova - Salvador", copa, brazil, alemanha, doBrazil, daAlemanha);
    }

    @Test
    public void testFASE() {
        assertTrue(false);
    }

    @Test
    public void testGetEscalacaoA() {
        assertTrue(false);
    }

    @Test
    public void testGetEscalacaoB() {
        assertTrue(false);
    }

    @Test
    public void testGetSubstis() {
        assertTrue(false);
    }

    @Test
    public void testAddSubstis() {
        assertTrue(false);
    }

    @Test
    public void testAddGol() {
        assertTrue(false);
    }

    @Test
    public void testPlacarJogo() {

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
    public void testVencedor() {
        assertTrue(false);
    }
}
