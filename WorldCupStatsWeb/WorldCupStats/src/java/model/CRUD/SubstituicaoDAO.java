/*
 * Classe desenvolvida como componente integrante do projeto: Sistema
 * de estatisticas de Copas do Mundo (WCupStats), que trata-se de um
 * trabalho proposto pela disciplina de Padroes e Frameworks. Todo este
 * codigo foi desenvolvido pelos integrantes desta equipe: Diego Leite,
 * Lucas Santana, Oto Antonio e Lucas Vinicius.
 */

package model.CRUD;


import java.util.Date;
import model.pojo.Jogador;
import model.pojo.Selecao;

/**
 * Classe que representa uma substituicao, de uma determinada
 * selecao, realizada em um jogo.
 * 
 * @author D.L.O.L
 * 
 * @see TimeDAO
 * @see Jogador
 */
public class SubstituicaoDAO {
    
    /**
     * TimeDAO que fez a substituicao.
    */
    private final Selecao time;
    /** Jogador que entra em jogo.
    */ 
    private final Jogador qEntra;
    /** Jogador substituido (que sai do jogo).
    */
    private final Jogador qSai;
    /** Tempo em que a substituicao foi realizada.
    */
    private final Date tempo;
    
    
    
    /**
     * Construtor da classe.
     *
     * @param time 
     * @param qEntra 
     * @param qSai 
     * @param tempo 
     */
    public SubstituicaoDAO(Selecao time, Jogador qEntra, Jogador qSai, Date tempo) {
        
        this.time = time;
        this.qEntra = qEntra; // Não a necessidade de testar se o jogador que entra esta no time.
        this.qSai = qSai; 
        this.tempo = tempo;
    }

    @Override
    public String toString() {
        return time.toString()+"; Sai: "+qSai.getNome()+"; Entra: "+qEntra.getNome();
    }

    
    
    /**
     * @return the time
     */
    public TimeDAO getTime() {
        return time;
    }

    /**
     * @return the qEntra
     */
    public Jogador getqEntra() {
        return qEntra;
    }

    /**
     * @return the qSai
     */
    public Jogador getqSai() {
        return qSai;
    }

    /**
     * @return the tempo
     */
    public Date getTempo() {
        return tempo;
    }
}
