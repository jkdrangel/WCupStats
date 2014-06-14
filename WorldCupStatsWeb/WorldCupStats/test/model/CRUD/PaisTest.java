/*
 * Classe desenvolvida como componente integrante do projeto: Sistema
 * de estatisticas de Copas do Mundo (WCupStats), que trata-se de um
 * trabalho proposto pela disciplina de Padroes e Frameworks. Todo este
 * codigo foi desenvolvido pelos integrantes desta equipe: Diego Leite,
 * Lucas Santana, Oto Antonio e Lucas Vinicius.
 */

package model.CRUD;

import model.CRUD.PaisDAO;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lsantana
 */
public class PaisTest {
    
 PaisDAO p= new PaisDAO("Brasil","America");
    
    public PaisTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void cadastrarSelecao() {
    p.cadastrarSelecao("A",2014);
    
    }
    
    @Test
    public void consultarQtdJogos() {
    p.consultarQtdJogos();
    }
    
    
}
