/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model.CRUD;

import java.util.Date;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lsantana
 */
public class PessoaDAOTest {
    
    public PessoaDAOTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getNome method, of class PessoaDAO.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        PessoaDAO instance = null;
        String expResult = "";
        String result = instance.getNome();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDataDeNascimento method, of class PessoaDAO.
     */
    @Test
    public void testGetDataDeNascimento() {
        System.out.println("getDataDeNascimento");
        PessoaDAO instance = null;
        Date expResult = null;
        Date result = instance.getDataDeNascimento();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNome method, of class PessoaDAO.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "";
        PessoaDAO instance = null;
        instance.setNome(nome);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDataDeNascimento method, of class PessoaDAO.
     */
    @Test
    public void testSetDataDeNascimento() {
        System.out.println("setDataDeNascimento");
        Date dataDeNascimento = null;
        PessoaDAO instance = null;
        instance.setDataDeNascimento(dataDeNascimento);
        fail("The test case is a prototype.");
    }

    public class PessoaDAOImpl extends PessoaDAO {

        public PessoaDAOImpl() {
            super("", null);
        }
    }
    
}
