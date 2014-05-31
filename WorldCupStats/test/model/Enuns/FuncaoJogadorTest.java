/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model.Enuns;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Vinícius
 */
public class FuncaoJogadorTest {
    
    FuncaoJogador atacante, volante, meioCampo, goleiro, zagueiro, lateral;
    
    @Before
    public void setUp() {
        atacante = FuncaoJogador.ATACANTE;
        volante = FuncaoJogador.VOLANTE;
        meioCampo = FuncaoJogador.MEIO_DE_CAMPO;
        goleiro = FuncaoJogador.GOLEIRO;
        zagueiro = FuncaoJogador.ZAGUEIRO;
        lateral = FuncaoJogador.LATERAL;
    }
    public void FuncaoJogadorTestEnumVerdadeiro() {
        assertEquals(atacante, FuncaoJogador.ATACANTE);
        assertEquals(volante, FuncaoJogador.VOLANTE);
        assertEquals(meioCampo, FuncaoJogador.MEIO_DE_CAMPO);
        assertEquals(goleiro, FuncaoJogador.GOLEIRO);
        assertEquals(zagueiro, FuncaoJogador.ZAGUEIRO);
        assertEquals(lateral, FuncaoJogador.LATERAL);
    }
    public void FuncaoJogadorTestEnumFalse() {
        assertFalse(atacante == FuncaoJogador.LATERAL);
        //assertEquals(volante, FuncaoJogador.VOLANTE);
        //assertEquals(meioCampo, FuncaoJogador.MEIO_DE_CAMPO);
        //assertEquals(goleiro, FuncaoJogador.GOLEIRO);
        //assertEquals(zagueiro, FuncaoJogador.ZAGUEIRO);
        //assertEquals(lateral, FuncaoJogador.LATERAL);
    }
    
}
