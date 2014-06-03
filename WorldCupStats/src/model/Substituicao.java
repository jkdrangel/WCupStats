/*
 * Classe desenvolvida como componente integrante do projeto: Sistema
 * de estatisticas de Copas do Mundo (WCupStats), que trata-se de um
 * trabalho proposto pela disciplina de Padroes e Frameworks. Todo este
 * codigo foi desenvolvido pelos integrantes desta equipe: Diego Leite,
 * Lucas Santana, Oto Antonio e Lucas Vinicius.
 */

package model;

import java.util.Date;

/**
 * Classe que representa uma substituicao, de uma determinada
 * selecao, realizada em um jogo.
 * 
 * @author D.L.O.L
 * 
 * @see Time
 * @see Jogador
 */
public class Substituicao {
    
    /**
     * Time que fez a substituicao.
    */
    private final Time time;
    /** Jogador que entra em jogo.
    */ 
    private final Pessoa qEntra;
    /** Jogador substituido (que sai do jogo).
    */
    private final Pessoa qSai;
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
    public Substituicao(Time time, Pessoa qEntra, Pessoa qSai, Date tempo) {
        
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
    public Time getTime() {
        return time;
    }

    /**
     * @return the qEntra
     */
    public Pessoa getqEntra() {
        return qEntra;
    }

    /**
     * @return the qSai
     */
    public Pessoa getqSai() {
        return qSai;
    }

    /**
     * @return the tempo
     */
    public Date getTempo() {
        return tempo;
    }
}
