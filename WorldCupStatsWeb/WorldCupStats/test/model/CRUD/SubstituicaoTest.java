/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.CRUD;

import model.CRUD.PessoaDAO;
import model.CRUD.SubstituicaoDAO;
import model.CRUD.TimeDAO;
import model.CRUD.TecnicoDAO;
import model.CRUD.PaisDAO;
import model.CRUD.JogadorDAO;
import java.util.Date;
import model.Enuns.FuncaoJogador;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Testes para verificar funcionalidades da classe SubstituicaoDAO.
 *
 * @author D.L.O.L
 *
 * @version 1.0
 *
 * @see
 */
public class SubstituicaoTest {

    private CopaDAO copa;
    private TecnicoDAO tecnico;
    private PaisDAO Brasil;
    private TimeDAO brazil;
    private PessoaDAO fma;
    private PessoaDAO fmabh;
    private SubstituicaoDAO substituicao;

    @Before
    public void setUp() {
        tecnico = new TecnicoDAO("Alguem", new Date());
        Brasil = new PaisDAO("Brasil", "America do Sul");
        brazil = new TimeDAO('J', 2014, 2, tecnico, Brasil, copa);

        fma = new JogadorDAO("Gluttony", new Date(10), 00, FuncaoJogador.GOLEIRO);
        fmabh = new JogadorDAO("Envy", new Date(10), 01, FuncaoJogador.ATACANTE);
        substituicao = new SubstituicaoDAO(brazil, fmabh, fma, new Date(360000));
    }

    /**
     * Test of getqSai method, of class SubstituicaoDAO.
     */
    @Test
    public void testSubstitucao() {

        assertEquals("Brasil; Sai: Gluttony; Entra: Envy", substituicao.toString());
        assertEquals(fma, substituicao.getqSai());
        assertEquals(fmabh, substituicao.getqEntra());
        assertTrue(6 == substituicao.getTempo().getMinutes());
    }
}
