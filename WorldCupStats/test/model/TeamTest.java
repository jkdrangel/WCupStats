/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.util.List;
import junit.framework.TestCase;

/**
 * 
 * @author D.L.O.L
 * 
 * @version 1.0
 */
public class TeamTest extends TestCase {
    
    Team brazil;
    Goal goal;
    Person coach;
    Person player;
    
    @Override
    protected void setUp() {
        
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }



    /**
     * Test of addPlayers method, of class Team.
     */
    public void testAddPlayers() {
        System.out.println("addPlayers");
        Person player = null;
        Team instance = null;
        instance.addPlayers(player);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGoals method, of class Team.
     */
    public void testGetGoals() {
        System.out.println("getGoals");
        Team instance = null;
        List<Goal> expResult = null;
        List<Goal> result = instance.getGoals();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addGoals method, of class Team.
     */
    public void testAddGoals() {
        System.out.println("addGoals");
        Goal goal = null;
        Team instance = null;
        instance.addGoals(goal);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
