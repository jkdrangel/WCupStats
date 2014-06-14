/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.CRUD;

import model.CRUD.PessoaDAO;
import model.CRUD.GolDAO;
import model.CRUD.JogoDAO;
import model.CRUD.TimeDAO;
import model.CRUD.PaisDAO;
import model.CRUD.TecnicoDAO;
import model.CRUD.JogadorDAO;
import java.util.Date;
import model.Enuns.FuncaoJogador;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;


/**
 * Testes para verificar funcionalidades da clasTimeDAOime (= Selecao).
 * 
 * @author D.L.O.L
 *
 * @version 1.0
 * 
 *TimeDAOe Time
 */
public class TimeTest {

   private TimeDAO time;
    private CopaDAO copa;
    private PaisDAO pais;
    private PessoaDAO tecnico;
    private char grupo;
    private int ano;
    private int rank;
    
    // Contem 6 Testes.
    @Before
    public void setUp() {

        Date dataQualqer = new Date();
        PaisDAO pais =new PaisDAO("Sertao", "Nordeste");
        tecnico = new TecnicoDAO("Luiz Gonzaga", dataQualqer);
        copa= new CopaDAO();
        grupo = 'A';
        ano = 1994;
        rank = 1;
       time = new TimeDAO(grupo, ano, rank, tecnico, pais, copa);
    }

    @Test
    public void testVerificarGols() {

        assertTrue("Sem gols ainda", 0 == time.getGols().size());

        boolean foiContra = true;
    PessoaDAO jogador = null;
     JogoDAO jogo = null;

        Date tempo = new Date();

     GolDAO gol1 =new GolDAO(jogo, jogador, time, tempo, foiContra);
     GolDAO gol2 = new GolDAO(jogo, jogador, time, tempo, foiContra);
     GolDAO gol3 = new GolDAO(jogo, jogador, time, tempo, foiContra);

        time.addGoals(gol1);
        assertTrue(1 == time.getGols().size());
        assertSame(gol1, time.getGols().get(0));

        time.addGoals(gol2);
        assertTrue(2 == time.getGols().size());
        assertSame(gol1, time.getGols().get(0));
        assertSame(gol2, time.getGols().get(1));

        time.addGoals(gol3);
        assertTrue(3 == time.getGols().size());
        assertSame(gol1, time.getGols().get(0));
        assertSame(gol2, time.getGols().get(1));
        assertSame(gol3, time.getGols().get(2));
    }

    @Test
    public void testGolMaGolDAOapido() {
        GolDAO rapido = time.golRapido();
        assertNull("Se não fez gol não tem o rapido", rapido);

        boolean foiContra = true;
        PessoaDAO jogador = null;
        JogoDAO jogo = null;

        Date tempo1 = new Date(900000); // 15 minutos
        Date tempo2 = new Date(180000); // 3 minutos
        Date tempo3 = new Date(300000);// 5 minutos
        GolDAO gol1 = new GolDAO(jogo, jogador, time, tempo1, foiContra);
        time.addGoals(gol1);
        rapido = time.golRapido();
        assertSame(gol1, rapido);
        assertTrue(15 == rapido.getTempo().getMinutes());

        GolDAO gol2 = new GolDAO(jogo, jogador, time, tempo2, foiContra);
        time.addGoals(gol2);
        rapido = time.golRapido();
        assertSame(gol2, rapido);
        assertTrue(3 == rapido.getTempo().getMinutes());

        GolDAO gol3 = new GolDAO(jogo, jogador, time, tempo3, foiContra);
        time.addGoals(gol3);
        rapido = time.golRapido();
        assertSame(gol2, rapido);
        assertTrue(3 == rapido.getTempo().getMinutes());
    }

    @Test
    public void testVerificarTecnico() {

        assertSame(tecnico, time.getTecnico());
        assertEquals("Luiz Gonzaga", time.getTecnico().getNome());
    }

    @Test
    public void testVerificarJogadores() {

        Date dataQualquer = new Date();
        PessoaDAO jogador1 = new JogadorDAO("Caboré", dataQualquer, 99, FuncaoJogador.GOLEIRO);
        PessoaDAO jogador2 =new JogadorDAO("Biru Biro", dataQualquer, 10, FuncaoJogador.MEIO_DE_CAMPO);
        PessoaDAO jogador3= new JogadorDAO("Não vou colocar os 23 não", dataQualquer, 23, FuncaoJogador.ATACANTE);

        assertTrue("Não tem jogadores ainda", (0 == time.getJogadores().size()));

        time.addPlayers(jogador1);
        assertTrue((1 == time.getJogadores().size()));
        assertSame(jogador1, time.getJogadores().get(00));

        time.addPlayers(jogador2);
        assertTrue((2 == time.getJogadores().size()));
        assertSame(jogador1, time.getJogadores().get(00));
        assertSame(jogador2, time.getJogadores().get(01));

        time.addPlayers(jogador3);
        assertTrue((3 == time.getJogadores().size()));
        assertSame(jogador1, time.getJogadores().get(00));
        assertSame(jogador2, time.getJogadores().get(01));
        assertSame(jogador3, time.getJogadores().get(02));
    }

    @Test
    public void testVerificarCopa() {
        assertSame(copa, time.getCopa());
    }

    @Test
    public void testEqualsTime() {
        TimeDAO mesmoTime = new TimeDAO(grupo, ano, rank, tecnico, pais, copa); // Mesma declaracao para o time.
        assertTrue((time.equals(mesmoTime)));
    }
}
