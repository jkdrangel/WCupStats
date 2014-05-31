/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;
import org.junit.After;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author lsantana
 */
public class SistemaTest {

    Sistema sistema = new Sistema();

    public SistemaTest() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void cadastrarPaisTest() {
        sistema.cadastrarPais("Brazil", "America do sul");
    }


    @Test
    public void cadastrarCopaTest() {
        sistema.cadastrarCopa(2014);
    }

    @Test
    public void listarPaisesTest() {
        sistema.listarPaises();
    }

    @Test
    public void listarCopasTest() {
        sistema.listarCopas();
    }
}
