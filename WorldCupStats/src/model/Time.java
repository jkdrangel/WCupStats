/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe que representa a selecao de um pais em um determinado ano de copa.
 *
 * @author D.L.O.L
 *
 * @version 1.0
 *
 * @see
 * @see
 */
public class Time {

    /**
     * Grupo da selecao em uma determinada copa.
     */
    private final char grupo;
    /**
     * Ano em que o time esteve na copa (ID);
     */
    private final int ano;
    /**
     * Classificacao do time em uma determinada copa.
     */
    private final int rank;
    /**
     * Tecnico da selecao em um ano de copa.
     */
    private final Pessoa tecnico
;    /**
     * Selecao de jogadores para uma copa.
     */
    private List<Pessoa> jogadores;
    /**
     * Gols feitos pela selecao em uma copa.
     */
    private List<Gol> gols;

    /**
     * Construtor da classe.
     *
     * @param group
     * @param era
     * @param rank
     * @param coach
     */
    public Time(char grupo, int ano, int rank, Pessoa tecnico) {

        this.grupo = grupo;
        this.ano = ano;
        this.rank = rank;
        this.tecnico = tecnico;

        jogadores = new ArrayList<Pessoa>();
        gols = new ArrayList<Gol>();
    }

    /**
     * @return the grupo
     */
    public char getGrupo() {
        return grupo;
    }

    /**
     * @return the ano
     */
    public int getAno() {
        return ano;
    }

    /**
     * @return the rank
     */
    public int getRank() {
        return rank;
    }

    /**
     * @return the tecnico
     */
    public Pessoa getTecnico() {
        return tecnico;
    }

    /**
     * @return the jogadores
     */
    public List<Pessoa> getJogadores() {
        return jogadores;
    }

    /**
     * @param player the jogadores to insert
     */
    public void addPlayers(Pessoa player) {
        jogadores.add(player);
    }

    /**
     * @return the gols
     */
    public List<Gol> getGols() {
        return gols;
    }

    /**
     * @param goal the gols to insert
     */
    public void addGoals(Gol goal) {
        gols.add(goal);
    }

    /**
     * Recupano o Gol mais rápido da selecao em uma copa.
     *
     * @return
     */
    public Gol golRapido() {

        Gol maisRapido = null;
        if (! gols.isEmpty()) {
            maisRapido = gols.get(0);
            float tempo = maisRapido.getTempo();

            for (Gol goal : gols) {
                if (tempo < goal.getTempo()) {
                    maisRapido = goal;
                    tempo = goal.gettempo();
                }
            }
        }
        
        return maisRapido;
    }

}
