/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model.CRUD;

import java.util.List;
import model.pojo.Pais;
import model.pojo.Selecao;
import org.junit.After;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author lsantana
 */
public class PaisDAOTest {
    
    PaisDAO paisdao;
    Pais brasil, africa, coreia;
    Selecao selecao;

    @Before
    public void setUp() throws Exception {
        paisdao = new PaisDAO();
       
        brasil = new Pais();
        brasil.setNome("brasil");
        brasil.setContinente("America");
        africa =new Pais();
        africa.setNome("africa");
        africa.setContinente("africa");
        coreia = new Pais();
        coreia.setNome("coreia");
        coreia.setContinente("asia");

        paisdao.removerTodos();
       
    }
     @After
    public void tearDown() {
    paisdao.removerTodos();
    }


    @Test
    public void testAdicionar() {
        paisdao.adicionar(brasil);
        List<Pais> paises = paisdao.listar();
        assertEquals(brasil, paises.get(0));
    }

    @Test
    public void testAtualizar() {
        paisdao.adicionar(brasil);
        brasil.setContinente("America do sul");
        paisdao.atualizar(brasil);
        List<Pais> paises = paisdao.listar();
        assertEquals(brasil, paises.get(0));
    }

    @Test
    public void testRemover() {
        paisdao.adicionar(brasil);
        paisdao.remover(brasil);
        List<Pais> paises = paisdao.listar();
        assertTrue(paises.isEmpty());
    }

    @Test
    public void testRemoverTodos() {
        paisdao.removerTodos();
        List<Pais> paises = paisdao.listar();
        assertTrue(paises.isEmpty());
    }

    @Test
    public void listar() {
        paisdao.adicionar(brasil);
        paisdao.adicionar(africa);
        paisdao.adicionar(coreia);

        List<Pais> paises = paisdao.listar();
        assertFalse(paises.isEmpty());
        assertEquals(brasil, paises.get(0));
        assertEquals(africa, paises.get(1));
        assertEquals(coreia, paises.get(2));
    }

    @Test
    public void buscar() {
        paisdao.adicionar(brasil);
        paisdao.adicionar(africa);
        paisdao.adicionar(coreia);

        Pais resultadoBusca = paisdao.buscar(africa.getNome());
        assertEquals(africa, resultadoBusca);
    }
}
