/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe que representa a selecao de um pais em um determinado
 era de copa.
 * 
 * @author D.L.O.L
 * 
 * @version 1.0
 * 
 * @see 
 * @see 
 */
public class Team {
    
    /** 
     * Grupo da selecao em uma determinada copa.
    */ private final char group; 
    /**
     * Ano em que o time esteve na copa (ID);
     */ private final int era; 
    /**
     * Classificacao do time em uma determinada copa.
     */ private final String rank;
     /**
      * Tecnico da selecao em um era de copa.
     */private final Person coach;
     /**
      * Selecao de jogadores para uma copa.
     */private List<Person> players;
     /**
      * Gols feitos pela selecao em uma copa.
     */private List<Goal> goals;
          
     
     
    /**
     * Construtor da classe.
     * 
     * @param group
     * @param era
     * @param rank 
     * @param coach 
     */
    public Team(char group, int era, String rank, Person coach) {
        
        this.group = group;
        this.era = era;
        this.rank = rank;
        this.coach = coach;
        
        players = new ArrayList<Person>();
        goals = new ArrayList<Goal>();
    }

    /**
     * @return the group
     */
    public char getGroup() {
        return group;
    }

    /**
     * @return the era
     */
    public int getEra() {
        return era;
    }

    /**
     * @return the rank
     */
    public String getRank() {
        return rank;
    }

    /**
     * @return the coach
     */
    public Person getCoach() {
        return coach;
    }

    /**
     * @return the players
     */
    public List<Person> getPlayers() {
        return players;
    }

    /**
     * @param player the players to insert
     */
    public void addPlayers(Person player) {
        players.add(player);
    }

    /**
     * @return the goals
     */
    public List<Goal> getGoals() {
        return goals;
    }

    /**
     * @param goal the goals to insert
     */
    public void addGoals(Goal goal) {
        goals.add(goal);
    }
    
    
}
