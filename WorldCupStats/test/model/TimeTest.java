/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * 
 * @author D.L.O.L
 * 
 * @version 1.0
 */
public class TimeTest {
    
    Time time;
    Gol gol;
    Pessoa tecnico;
    Pessoa jogadores;
    char grupo;
    int ano;
    int rank;
    
    @Before
    public void setUp() {
        
        tecnico = new Tecnico("Luiz Gonzaga");
        grupo = 'A';
        ano = 1994;
        rank = 1;
        time = new Time(grupo, ano, rank, tecnico);
    }

    public void tearDown() {
       
    }

    

    /**
     * Test of addPlayers method, of class Team.
     */
    public void testAddPlayers() {
        System.out.println("addPlayers");
        Pessoa player = null;
        Time instance = null;
        instance.addPlayers(player);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addGoals method, of class Team.
     */
    public void testAddGoals() {
        System.out.println("addGoals");
        Gol goal = null;
        Time instance = null;
        instance.addGoals(goal);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
