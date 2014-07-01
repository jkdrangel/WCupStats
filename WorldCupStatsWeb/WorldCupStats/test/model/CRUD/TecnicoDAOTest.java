/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model.CRUD;

import java.sql.Date;
import java.util.List;
import model.Enuns.FuncaoJogador;
import model.pojo.Jogador;
import model.pojo.Selecao;
import model.pojo.Tecnico;
import org.junit.After;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author lsantana
 */
public class TecnicoDAOTest {
    
    
    TecnicoDAO tecnicoDao;
    Tecnico felipao, titi, zagalo;
    Selecao selecao;

    @Before
    public void setUp() throws Exception {
        tecnicoDao = new TecnicoDAO();
       
        felipao = new Tecnico();
        felipao.setNome("Felipao");
        felipao.setDataNascimento(new Date(100,2,1));
        
        titi = new Tecnico();
        titi.setNome("Titi");
        titi.setDataNascimento(new Date(100,1,1));
        
        zagalo = new Tecnico();
        zagalo.setNome("Zagalo");
        zagalo.setDataNascimento(new Date(100,3,1));

        tecnicoDao.removerTodos();
       
    }
     @After
    public void tearDown() {
        tecnicoDao.removerTodos();
    }

    /**
     * Teste simples de adicao de componentes em banco de dados
     */
    @Test
    public void testAdicionar() {
        tecnicoDao.adicionar(felipao);
        List<Tecnico> jogadores = tecnicoDao.listar();
        assertEquals(felipao, jogadores.get(0));
    }

    /**
     * Verifica se o nome do tecnico foi atualizado no banco de dados
     */
    @Test
    public void testAtualizar() {
        tecnicoDao.adicionar(felipao);
        List<Tecnico> tecnicos = tecnicoDao.listar();
        assertEquals("Felipao", tecnicos.get(0).getNome());
        felipao.setNome("Tecnico Felipao");
        
        tecnicoDao.atualizar(felipao);
        tecnicos = tecnicoDao.listar();
        assertEquals("Tecnico Felipao", tecnicos.get(0).getNome());
    }

    @Test
    public void testRemover() {
        tecnicoDao.adicionar(felipao);
        tecnicoDao.remover(felipao);
        List<Tecnico> tecnicos = tecnicoDao.listar();
        assertTrue(tecnicos.isEmpty());
    }

    @Test
    public void testRemoverTodos() {
        tecnicoDao.removerTodos();
        List<Tecnico> tecnicos = tecnicoDao.listar();
        assertTrue(tecnicos.isEmpty());
    }

    @Test
    public void listar() {
        tecnicoDao.adicionar(felipao);
        tecnicoDao.adicionar(titi);
        tecnicoDao.adicionar(zagalo);

        List<Tecnico> tecnicos = tecnicoDao.listar();
        assertFalse(tecnicos.isEmpty());
        assertEquals(felipao, tecnicos.get(0));
        assertEquals(titi, tecnicos.get(1));
        assertEquals(zagalo, tecnicos.get(2));
    }

    @Test
    public void buscar() {
        tecnicoDao.adicionar(felipao);
        tecnicoDao.adicionar(titi);
        tecnicoDao.adicionar(zagalo);

        Tecnico resultadoBusca = tecnicoDao.buscar(titi.getNome());
        assertEquals(titi, resultadoBusca);
    }
    
}
