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
import org.junit.After;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Lucas Vinicius
 */
public class JogadorDAOTest {
    
    JogadorDAO jogadorDao;
    Jogador neimar, tafarel, birubiru;
    Selecao selecao;

    @Before
    public void setUp() throws Exception {
        jogadorDao = new JogadorDAO();
       
        neimar = new Jogador();
        neimar.setNome("neimar");
        neimar.setDataNascimento(new Date(100,1,1));
        neimar.setNumero(10);
        neimar.setPosicao(FuncaoJogador.ATACANTE.getFuncao());
        
        tafarel = new Jogador();
        tafarel.setNome("brasil");
        tafarel.setDataNascimento(new Date(100,1,1));
        tafarel.setNumero(11);
        tafarel.setPosicao(FuncaoJogador.ATACANTE.getFuncao());
        
        birubiru = new Jogador();
        birubiru.setNome("birubiru");
        birubiru.setDataNascimento(new Date(100,1,1));
        birubiru.setNumero(12);
        birubiru.setPosicao(FuncaoJogador.ATACANTE.getFuncao());

        jogadorDao.removerTodos();
       
    }
     @After
    public void tearDown() {
        jogadorDao.removerTodos();
    }

    /**
     * Teste simples de adicao de componente em banco de dados
     */
    @Test
    public void testAdicionar() {
        jogadorDao.adicionar(neimar);
        List<Jogador> jogadores = jogadorDao.listar();
        assertEquals(neimar, jogadores.get(0));
    }

    /**
     * Verifica se o nome do jogador foi atualizado no banco de dados
     */
    @Test
    public void testAtualizar() {
        jogadorDao.adicionar(neimar);
        neimar.setNome("Neimar Junior");
        jogadorDao.atualizar(neimar);
        List<Jogador> jogadores = jogadorDao.listar();
        assertEquals(neimar, jogadores.get(0));
    }

    @Test
    public void testRemover() {
        jogadorDao.adicionar(neimar);
        jogadorDao.remover(neimar);
        List<Jogador> jogadores = jogadorDao.listar();
        assertTrue(jogadores.isEmpty());
    }

    @Test
    public void testRemoverTodos() {
        jogadorDao.removerTodos();
        List<Jogador> jogadores = jogadorDao.listar();
        assertTrue(jogadores.isEmpty());
    }

    @Test
    public void listar() {
        jogadorDao.adicionar(neimar);
        jogadorDao.adicionar(tafarel);
        jogadorDao.adicionar(birubiru);

        List<Jogador> jogadores = jogadorDao.listar();
        assertFalse(jogadores.isEmpty());
        assertEquals(neimar, jogadores.get(0));
        assertEquals(tafarel, jogadores.get(1));
        assertEquals(birubiru, jogadores.get(2));
    }

    @Test
    public void buscar() {
        jogadorDao.adicionar(neimar);
        jogadorDao.adicionar(tafarel);
        jogadorDao.adicionar(birubiru);

        Jogador resultadoBusca = jogadorDao.buscar(tafarel.getNome());
        assertEquals(tafarel, resultadoBusca);
    }
}
