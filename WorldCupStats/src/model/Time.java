/*
 * Classe desenvolvida como componente integrante do projeto: Sistema
 * de estatisticas de Copas do Mundo (WCupStats), que trata-se de um
 * trabalho proposto pela disciplina de Padroes e Frameworks. Todo este
 * codigo foi desenvolvido pelos integrantes desta equipe: Diego Leite,
 * Lucas Santana, Oto Antonio e Lucas Vinicius.
 */
package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Classe que representa a selecao de um pais em um determinado ano de copa.
 *
 * @author D.L.O.L
 *
 * @version 1.0
 *
 * @see Pessoa
 * @see Goal
 * @see Pais
 */
public class Time {

    /**
     * Grupo da selecao em uma determinada copa.
     */
    private final char grupo;
    /**
     * Ano em que o time esteve na copa (ID).
     */
    private final int ano;
    /**
     * Classificacao do time em uma determinada copa.
     */
    private final int rank;
    /**
     * Tecnico da selecao em um ano de copa.
     */
    private final Pessoa tecnico;
    /**
     * Selecao de jogadores para uma copa.
     */
    private List<Pessoa> jogadores;
    /**
     * Gols feitos pela selecao em uma copa.
     */
    private List<Gol> gols;
    /**
     * Pais ao qual o time representa.
     */
    private final Pais pais;
    /**
     * Copa em que esta selecao participou.
     */
    private final Copa copa;

    /**
     * Construtor da classe.
     *
     * @param grupo
     * @param ano
     * @param rank
     * @param tecnico
     * @param pais
     * @param copa
     */
    public Time(char grupo, int ano, int rank, Pessoa tecnico, Pais pais, Copa copa) {

        this.grupo = grupo;
        this.ano = ano;
        this.rank = rank;
        this.tecnico = tecnico;
        this.pais = pais;
        this.copa = copa;

        jogadores = new ArrayList<Pessoa>();
        gols = new ArrayList<Gol>();
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "" + pais.getNome();
    }

    @Override
    public boolean equals(Object o) {
        Time oo;
        if (o instanceof Time) {
            oo = (Time) o;
            if (this.toString().equals(oo.toString()) && this.getAno() == oo.getAno() 
                                                      && this.getPais() == oo.getPais()
                                                      && this.getTecnico().equals(oo.getTecnico())
                                                      && this.getGrupo() == oo.getGrupo() ) {
                return true;
            }
        }
        return false;
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
     * @return the pais
     */
    public Pais getPais() {
        return pais;
    }

    /**
     * @return the copa
     */
    public Copa getCopa() {
        return copa;
    }

    /**
     * Recupano o Gol mais rápido da selecao em uma copa.
     *
     * @return
     */
    public Gol golRapido() {

        Gol maisRapido = null;
        if (!this.getGols().isEmpty()) {
            maisRapido = this.getGols().get(0);
            Date tempo = maisRapido.getTempo();

            for (Gol goal : this.getGols()) {
                if (tempo.getSeconds() > goal.getTempo().getSeconds()) {
                    maisRapido = goal;
                    tempo = goal.getTempo();
                }
            }
        }

        return maisRapido;
    }

}
