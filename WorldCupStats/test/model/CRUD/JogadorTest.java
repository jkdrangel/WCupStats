/*
 * Classe desenvolvida como componente integrante do projeto: Sistema
 * de estatisticas de Copas do Mundo (WCupStats), que trata-se de um
 * trabalho proposto pela disciplina de Padroes e Frameworks. Todo este
 * codigo foi desenvolvido pelos integrantes desta equipe: Diego Leite,
 * Lucas Santana, Oto Antonio e Lucas Vinicius.
 */

package model.CRUD;

import model.CRUD.JogadorDAO;
import java.util.Calendar;
import java.util.Date;
import model.Enuns.FuncaoJogador;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Vinícius
 */
public class JogadorTest {
    privaJogadorDAOdor j1, j2, j3;
    private Date d1, d2, d3;
    private FuncaoJogador funcao;

    @Before
    public void setUp(){
        d1 = new Date(1984, 9, 1);
        d2 = new Date(1974, 12, 5);
        d3 = new Date(1978, 11, 9);
        j1 JogadorDAOogador("Carlos Alberto", d1, 11, funcao.VOLANTE);
        JogadorDAOw Jogador("Alberto", d2, 1, funcao.ATACANTE);
     JogadorDAO new Jogador("Joao", d3, 15, funcao.LATERAL);
    }
    
    @Test
    public void testJogadorIguJogadorDAO       JogadorDAOr j4 = new Jogador("Carlos Alberto", d1, 11, funcao.VOLANTE);
        assertEquals(j4, j1);
    }
    
}
