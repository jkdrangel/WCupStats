/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author D.L.O.L
 *
 * @version 1.0
 */
public class TimeTest {

    Time time;
    Copa copa;
    Pais pais;
    Gol gol;
    Pessoa tecnico;
    Pessoa jogadores;
    char grupo;
    int ano;
    int rank;

    @Before
    public void setUp() {

        Date dataQualqer = new Date();
        pais = new Pais("Sertao", "Nordeste");
        tecnico = new Tecnico("Luiz Gonzaga",dataQualqer);
        copa = new Copa(dataQualqer);
        grupo = 'A';
        ano = 1994;
        rank = 1;
        time = new Time(grupo, ano, rank, tecnico, pais, copa);
    }
    

    @Test
    public void testVerificarGols() {

        assertTrue(0 == time.getGols().size());

        Gol gol1 = new Gol(null, null, time);
        Gol gol2 = new Gol(null, null, time);
        Gol gol3 = new Gol(null, null, time);
        time.addGoals(gol1);

        assertTrue(1 == time.getGols().size());
        assertSame(gol1, time.getGols().get(0));

        time.addGoals(gol2);
        assertTrue(2 == time.getGols().size());
        assertSame(gol2, time.getGols().get(1));

        time.addGoals(gol3);
        assertTrue(3 == time.getGols().size());
        assertSame(gol3, time.getGols().get(2));
    }

    @Test
    public void testGolMaisRapido() {
        Gol rapido = time.golRapido();
        assertNull("Se não fez gol não tem o rapido", rapido);

        Gol gol1 = new Gol(null, null, time,);
        time.addGoals(gol1);
        rapido = time.golRapido();
        assertSame(gol1, rapido);
        assertTrue((15.0 == rapido.getTempo()));

        Gol gol2 = new Gol(null, null, time,);
        time.addGoals(gol2);
        rapido = time.golRapido();
        assertSame(gol2, rapido);

        assertTrue((3.0 == rapido.getTempo()));

        Gol gol3 = new Gol(null, null, time,);
        time.addGoals(gol3);
        rapido = time.golRapido();
        assertSame(gol2, rapido);
        assertTrue((3.0 == rapido.getTempo()));
    }

    @Test
    public void testVerificarTecnico() {

        assertSame(tecnico, time.getTecnico());
        assertEquals("Luiz Gonzaga", time.getTecnico().getNome());
    }

    @Test
    public void testVerificarJogadores() {
        assertNull("Esperando informações dos jogadores", time);
    }

    @Test
    public void testVerificarCopa() {
         assertSame(copa, time.getCopa());
    }
}
