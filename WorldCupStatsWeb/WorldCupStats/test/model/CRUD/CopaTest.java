/*
 * Classe desenvolvida como componente integrante do projeto: Sistema
 * de estatisticas de Copas do Mundo (WCupStats), que trata-se de um
 * trabalho proposto pela disciplina de Padroes e Frameworks. Todo este
 * codigo foi desenvolvido pelos integrantes desta equipe: Diego Leite,
 * Lucas Santana, Oto Antonio e Lucas Vinicius.
 */

package model.CRUD;

import java.util.Date;
import java.util.Iterator;
import model.CRUD.JogoDAO;
import model.CRUD.PaisDAO;
import model.pojo.Copa;
import org.junit.After;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author lsantana
 */
public class CopaTest {
 CopaDAO c =new CopaDAO();

 public CopaTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void listarJogos(){
        Iterator<JogoDAO> it=c.buscar(new Date(2014,0,0)).getJogos().iterator();   
        assertFalse(it.hasNext());
        assertTrue(it.hasNext());
    }
    
    @Test
    public void consultarQtdMediaGols(){
    //consultarQtdMediaGols();
    }
    
    @Test
    public void listarJogosEmpatados(){
    //c.listarJogosEmpatados();
    }
    
    @Test
    public void consultarClassificacao(){
    //c.consultarClassificacao();
    }
    
    @Test
    public void consultarMediaIdade(){
    //c.consultarMediaIdade();
    }
    
}
