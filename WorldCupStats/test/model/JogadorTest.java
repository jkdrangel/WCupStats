/*
 * Classe desenvolvida como componente integrante do projeto: Sistema
 * de estatisticas de Copas do Mundo (WCupStats), que trata-se de um
 * trabalho proposto pela disciplina de Padroes e Frameworks. Todo este
 * codigo foi desenvolvido pelos integrantes desta equipe: Diego Leite,
 * Lucas Santana, Oto Antonio e Lucas Vinicius.
 */

package model;

import exceptions.FuncaoJogadorNaoEncontradaException;
import java.util.Calendar;
import java.util.Date;
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
public class JogadorTest {
    private Jogador j1, j2, j3;
    private Date d1, d2, d3;

    @Before
    public void setUp() throws FuncaoJogadorNaoEncontradaException{
        d1 = new Date(1984, 9, 1);
        d2 = new Date(1974, 12, 5);
        d3 = new Date(1978, 11, 9);
        j1 = new Jogador("Carlos Alberto", d1, 11, "Volante");
        j2 = new Jogador("Alberto", d2, 1, "Meio de Campo");
        j3 = new Jogador("Joao", d3, 15, "Vendedor de Cachorro quente");
    }
    
    @Test
    public void testJogadorIgual() throws FuncaoJogadorNaoEncontradaException {
        Jogador j4 = new Jogador("Carlos Alberto", d1, 11, "Volante");
        assertEquals(j4, j1);
    }
    
}
