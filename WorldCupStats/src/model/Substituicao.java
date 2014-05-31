/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

/**
 * Classe que representa uma substituicao, de uma determinada
 * selecao, realizada em um jogo.
 * 
 * @author D.L.O.L
 * 
 * @see 
 * @see 
 */
public class Substituicao {
    
    /**
     * Time que fez a substituicao.
    */ private final Time time;
    /** Jogador que entra em jogo.
    */ private final Jogador qEntra;
    /** Jogador substituido (que sai do jogo).
    */ private final Jogador qSai;
    /** Tempo em que a substituicao foi realizada.
    */ private final double tempo;
    
    
    
    /**
     * Construtor da classe.
     *
     * @param time 
     * @param qEntra 
     * @param qSai 
     * @param tempo 
     */
    public Substituicao(Time time, Jogador qEntra, Jogador qSai, double tempo) {
        
        this.time = time;
        this.qEntra = qEntra;
        this.qSai = qSai; 
        this.tempo = tempo;
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
    public double getTempo() {
        return tempo;
    }
}
