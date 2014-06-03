/*
 * Classe desenvolvida como componente integrante do projeto: Sistema
 * de estatisticas de Copas do Mundo (WCupStats), que trata-se de um
 * trabalho proposto pela disciplina de Padroes e Frameworks. Todo este
 * codigo foi desenvolvido pelos integrantes desta equipe: Diego Leite,
 * Lucas Santana, Oto Antonio e Lucas Vinicius.
 */

package model;

import java.util.Date;
import java.util.Iterator;
import org.junit.After;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author lsantana
 */
public class CopaTest {
    Copa c=new Copa(new Date(2014,0,0), new Pais("Brasil","America do sul"));
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
        Iterator<Jogo> it=c.listarJogos();   
        assertFalse(it.hasNext());
        assertTrue(it.hasNext());
    }
    
    @Test
    public void consultarQtdMediaGols(){
    c.consultarQtdMediaGols();
    }
    
    @Test
    public void listarJogosEmpatados(){
    c.listarJogosEmpatados();
    }
    
    @Test
    public void consultarClassificacao(){
    c.consultarClassificacao();
    }
    
    @Test
    public void consultarMediaIdade(){
    c.consultarMediaIdade();
    }
    
}
