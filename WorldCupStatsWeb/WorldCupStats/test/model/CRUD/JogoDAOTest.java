/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model.CRUD;

import java.sql.Date;
import java.util.List;
import model.Enuns.FaseCopa;
import model.pojo.Copa;
import model.pojo.Jogo;
import model.pojo.Selecao;
import org.junit.After;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author marc
 */
public class JogoDAOTest {
    
    private JogoDAO dao;
    private Jogo jogo1;
    private Jogo jogo2;
    private Jogo jogo3;
    private Selecao selecao1, selecao2, selecao3;
    private Copa copa;
    private CopaDAO daoCopa;
    private SelecaoDAO daoSelecao;
    
    @Before
    public void setUp() {
        dao = new JogoDAO();
        daoCopa = new CopaDAO();
        daoSelecao = new SelecaoDAO();
        
        copa = new Copa(new Date(114, 1, 1));
        
        selecao1=new Selecao("A", copa.getAno(),1);
        selecao2=new Selecao("A", copa.getAno(),2);
        selecao3=new Selecao("A", copa.getAno(),3);
        
        jogo1 = new Jogo(new Date(50, 1, 1), "Fonte Nova", FaseCopa.FINAL.getFase());
        jogo1.setCopa(copa);
        jogo1.setSelecaoBySelecaoA(selecao1);
        jogo1.setSelecaoBySelecaoB(selecao2);
        jogo2 = new Jogo(new Date(104, 1, 1), "Manaus", FaseCopa.OITAVAS.getFase());
        jogo2.setCopa(copa);
        jogo2.setSelecaoBySelecaoA(selecao3);
        jogo2.setSelecaoBySelecaoB(selecao2);
        jogo3 = new Jogo(new Date(4, 1, 1), "Pelourinho", FaseCopa.SEMI.getFase());
        jogo3.setCopa(copa);
        jogo3.setSelecaoBySelecaoA(selecao1);
        jogo3.setSelecaoBySelecaoB(selecao3);
        
        daoSelecao.adicionar(selecao1);
        daoSelecao.adicionar(selecao2);
        daoSelecao.adicionar(selecao3);
        daoCopa.adicionar(copa);
    }

    @After
    public void tearDown() {
        dao.removerTodos();
        daoCopa.removerTodos();
        daoSelecao.removerTodos();
    }
    
    /**
     * Test of adicionar method, of class JogoDAO.
     */
    @Test
    public void testAdicionar() {

        dao.adicionar(jogo1);
        dao.adicionar(jogo2);
        dao.adicionar(jogo3);

        List<Jogo> jogos = dao.listar();
        assertEquals(jogo1, jogos.get(0));
        assertEquals(jogo2, jogos.get(1));
        assertEquals(jogo3, jogos.get(2));
    }

    /**
     * Test of atualizar method, of class JogoDAO.
     */
    @Test
    public void testAtualizar() {

        dao.adicionar(jogo1);
        jogo1.setData(new Date(204, 1, 1));
        dao.atualizar(jogo1);
        List<Jogo> jogos = dao.listar();
        assertEquals(jogo1, jogos.get(0));
    }

    /**
     * Test of remover method, of class JogoDAO.
     */
    @Test
    public void testRemover() {

        dao.adicionar(jogo1);
        dao.adicionar(jogo2);

        dao.remover(jogo1);
        List<Jogo> jogos = dao.listar();
        assertEquals(jogo2, jogos.get(0));
    }

    /**
     * Test of removerTodos method, of class JogoDAO.
     */
    @Test
    public void testRemoverTodos() {
        
        dao.adicionar(jogo1);
        dao.adicionar(jogo2);

        List<Jogo> jogos = dao.listar();
        assertTrue(2 == jogos.size());

        dao.removerTodos();
        
        jogos = dao.listar();
        assertTrue(jogos.isEmpty());
    }

    /**
     * Test of listar method, of class JogoDAO.
     */
    @Test
    public void testListar() {

        List<Jogo> jogos = dao.listar();
        assertTrue(jogos.isEmpty());

        dao.adicionar(jogo1);
        dao.adicionar(jogo2);
        dao.adicionar(jogo3);

        jogos = dao.listar();
        assertFalse(jogos.isEmpty());

        assertEquals(jogo1, jogos.get(0));
        assertEquals(jogo2, jogos.get(1));
        assertEquals(jogo3, jogos.get(2));
    }

    /**
     * Test of buscar method, of class JogoDAO.
     */
    @Test
    public void testBuscar() {

        dao.adicionar(jogo1);
        dao.adicionar(jogo2);
        dao.adicionar(jogo3);

        Jogo jogo = dao.buscar(new Date(50, 1, 1), "Fonte Nova");
        assertEquals(jogo1, jogo);

        jogo = dao.buscar(new Date(104, 1, 1), "Manaus");
        assertEquals(jogo2, jogo);

        jogo = dao.buscar(new Date(4, 1, 1), "Pelourinho");
        assertEquals(jogo3, jogo);
    }
    
}
