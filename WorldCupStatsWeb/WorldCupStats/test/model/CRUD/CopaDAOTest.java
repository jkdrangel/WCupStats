/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.CRUD;

import java.util.Date;
import java.util.List;
import model.pojo.Copa;
import model.pojo.Pais;
import model.pojo.Selecao;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author lsantana
 */
public class CopaDAOTest {

    CopaDAO copaDAO;
    PaisDAO paisdao;
    Copa copa, copa1, copa2;
    Pais brasil, africa, coreia;
    Selecao selecao;

    @Before
    public void setUp() throws Exception {
        copaDAO = new CopaDAO();
        paisdao = new PaisDAO();
        brasil = new Pais();
        africa = new Pais();
        coreia = new Pais();
        paisdao.adicionar(brasil);
        paisdao.adicionar(africa);
        paisdao.adicionar(coreia);

        copa = new Copa();
        copa.setAno(new Date(2014, 0, 0));
        copa.setPais(brasil);
        copa.setSelecao(selecao);

        copa1 = new Copa();
        copa1.setAno(new Date(2010, 0, 0));
        copa1.setPais(africa);
        copa1.setSelecao(selecao);

        copa2 = new Copa();
        copa2.setAno(new Date(2002, 0, 0));
        copa2.setPais(coreia);
        copa2.setSelecao(selecao);

        copaDAO.removerTodos();

    }

    @Test
    public void testAdicionar() {
        copaDAO.adicionar(copa);
        List<Copa> copas = copaDAO.listar();
        assertEquals(copa, copas.get(0));
    }

    @Test
    public void testAtualizar() {
        copaDAO.adicionar(copa);
        copa.setAno(new Date(2013, 0, 0));
        copaDAO.atualizar(copa);
        List<Copa> copas = copaDAO.listar();
        assertEquals(copa, copas.get(0));
    }

    @Test
    public void testRemover() {
        copaDAO.adicionar(copa);
        copaDAO.remover(copa);
        List<Copa> copas = copaDAO.listar();
        assertTrue(copas.isEmpty());
    }

    @Test
    public void testRemoverTodos() {
        copaDAO.removerTodos();
        List<Copa> copas = copaDAO.listar();
        assertTrue(copas.isEmpty());
    }

    @Test
    public void listar() {
        copaDAO.adicionar(copa);
        copaDAO.adicionar(copa1);
        copaDAO.adicionar(copa2);

        List<Copa> copas = copaDAO.listar();
        assertFalse(copas.isEmpty());
        assertEquals(copa, copas.get(0));
        assertEquals(copa1, copas.get(1));
        assertEquals(copa2, copas.get(2));
    }

    @Test
    public void buscar() {
        copaDAO.adicionar(copa);
        copaDAO.adicionar(copa1);
        copaDAO.adicionar(copa2);

        Copa resultadoBusca = copaDAO.buscar(copa1.getAno());
        assertEquals(copa1, resultadoBusca);
    }
}
