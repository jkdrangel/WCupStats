/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.CRUD;

import model.CRUD.Pessoa;
import model.CRUD.Substituicao;
import model.CRUD.Time;
import model.CRUD.Tecnico;
import model.CRUD.Pais;
import model.CRUD.Jogador;
import java.util.Date;
import model.Enuns.FuncaoJogador;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Testes para verificar funcionalidades da classe Substituicao.
 *
 * @author D.L.O.L
 *
 * @version 1.0
 *
 * @see
 */
public class SubstituicaoTest {

    private Copa copa;
    private Tecnico tecnico;
    private Pais Brasil;
    private Time brazil;
    private Pessoa fma;
    private Pessoa fmabh;
    private Substituicao substituicao;

    @Before
    public void setUp() {
        tecnico = new Tecnico("Alguem", new Date());
        Brasil = new Pais("Brasil", "America do Sul");
        brazil = new Time('J', 2014, 2, tecnico, Brasil, copa);

        fma = new Jogador("Gluttony", new Date(10), 00, FuncaoJogador.GOLEIRO);
        fmabh = new Jogador("Envy", new Date(10), 01, FuncaoJogador.ATACANTE);
        substituicao = new Substituicao(brazil, fmabh, fma, new Date(360000));
    }

    /**
     * Test of getqSai method, of class Substituicao.
     */
    @Test
    public void testSubstitucao() {

        assertEquals("Brasil; Sai: Gluttony; Entra: Envy", substituicao.toString());
        assertEquals(fma, substituicao.getqSai());
        assertEquals(fmabh, substituicao.getqEntra());
        assertTrue(6 == substituicao.getTempo().getMinutes());
    }
}
