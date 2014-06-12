/*
 * Classe desenvolvida como componente integrante do projeto: Sistema
 * de estatisticas de Copas do Mundo (WCupStats), que trata-se de um
 * trabalho proposto pela disciplina de Padroes e Frameworks. Todo este
 * codigo foi desenvolvido pelos integrantes desta equipe: Diego Leite,
 * Lucas Santana, Oto Antonio e Lucas Vinicius.
 */
package model.CRUD;

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
 * @see PessoaDAO
 * @see Goal
 * @see PaisDAO
 */
public class TimeDAO {

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
    private final PessoaDAO tecnico;
    /**
     * Selecao de jogadores para uma copa.
     */
    private List<PessoaDAO> jogadores;
    /**
     * Gols feitos pela selecao em uma copa.
     */
    private List<GolDAO> gols;
    /**
    PaisDAOais ao qual o time representa.
     */
    private PaisDAO pais;
    /**
     * CopaDAO em que esta selecao participou.
     */
    private CopaDAO copa;

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
    public TimeDAO(char grupo, int ano, int rank, PessoaDAO tecnico, PaisDAO pais, CopaDAO copa) {

        this.grupo = grupo;
        this.ano = ano;
        this.rank = rank;
        this.tecnico = tecnico;
        this.pais = pais;
        this.copa = copa;

        jogadores = new ArrayList<PessoaDAO>();
        gols = new ArrayList<GolDAO>();
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
  TimeDAO  oo;
        if (o instanceof TimeDAO) {
       oo = (TimeDAO) o;
            if (this.toString().equals(o.toString()) && this.getAno() == oo.getAno() 
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
     * @return
     **/
    public PessoaDAO getTecnico() {
        return tecnico;
    }

    /**
     * @return the jogadores
     **/
    public List<PessoaDAO> getJogadores() {
        return jogadores;
    }

    /**
     * @param player the jogadores to insert
     */
    public void addPlayers(PessoaDAO player) {
        jogadores.add(player);
    }

    /**
     * @return the gols
     */
    public List<GolDAO> getGols() {
        return gols;
    }

    /**
     * @param goal the gols to insert
     */
    public void Goals(GolDAO goal) {
        gols.add(goal);
    }

    /**
     * @return the pais
     */ public PaisDAO getPais() {
        return pais;
    }

    /**
     * @return the copa
     */
    public CopaDAO getCopa() {
        return copa;
    }

    /**
     *cupano o Gol mais rápido da selecao em uma copa.
     *
     * @return
    **/
    public GolDAO golRapido() {

        GolDAO maisRapido = null;
        if (!this.gols.isEmpty()) {
            maisRapido = this.gols.get(0);
            Date tempo = maisRapido.getTempo();
            for (GolDAO goal : this.getGols()) {                
                if (tempo.getTime() > goal.getTempo().getTime()) {
                    maisRapido = goal;
                    tempo = goal.getTempo();
                }
            }
        }

        return maisRapido;
    }

}
