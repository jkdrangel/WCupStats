/*
 * Classe desenvolvida como componente integrante do projeto: Sistema
 * de estatisticas de Copas do Mundo (WCupStats), que trata-se de um
 * trabalho proposto pela disciplina de Padroes e Frameworks. Todo este
 * codigo foi desenvolvido pelos integrantes desta equipe: Diego Leite,
 * Lucas Santana, Oto Antonio e Lucas Vinicius.
 */

package model.CRUD;

import java.util.Date;
import model.Enuns.FuncaoJogador;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Vinícius
 */
public class JogadorTest {
    private JogadorDAO j1, j2, j3;
    private Date d1, d2, d3;
    private FuncaoJogador funcao;

    @Before
    public void setUp(){
        d1 = new Date(1984, 9, 1);
        d2 = new Date(1974, 12, 5);
        d3 = new Date(1978, 11, 9);
        j1 =new JogadorDAO("Carlos Alberto", d1, 11, funcao.VOLANTE);
        j2=new JogadorDAO("Alberto", d2, 1, funcao.ATACANTE);
     j3= new JogadorDAO("Joao", d3, 15, funcao.LATERAL);
    }
    
    @Test
    public void testJogadorIgual(){
        JogadorDAO j4 = new JogadorDAO("Carlos Alberto", d1, 11, funcao.VOLANTE);
        assertEquals(j4, j1);
    }
    
}
