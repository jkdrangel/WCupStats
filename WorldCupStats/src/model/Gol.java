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
 * Classe que representa um Gol feito por um Jogador durante uma partida.
 *
 * @author D.L.O.L
 *
 * @version 1.0
 *
 * @see Jogo
 * @see Jogador
 * @see Selecao
 */
public class Gol {
    private int ID;
    private final Jogo jogo;
    private final Jogador jogador;
    private final Time selecao;
    private final Date tempo;
    private final boolean foiContra;
    
    
    /**
     * Construtor da classe.
     * @param jogo, Jogo em que o Gol foi feito.
     * @param jogador, Jogador que fez o Gol.
     * @param selecao, Selecao que tem o Jogador que fez o Gol.
     * @param tempo
     * @param foiContra
     */
    public Gol(Jogo jogo, Jogador jogador, Time selecao, Date tempo, boolean foiContra) {
        this.jogo = jogo;
        this.jogador = jogador;
        this.selecao = selecao;
        this.tempo = tempo;
        this.foiContra = foiContra;
    }
    
    /**
     * Getter para o ID da classe.
     * @return, Retorna o ID da classe.
     */
    public int getID(){
        return this.ID;
    }
    
    /**
     * Getter para o Jogo da classe.
     * @return, Retorna o jogo em que o Gol foi feito.
     */
    public Jogo getJogo(){
        return this.jogo;
    }
    
    /**
     * Getter para o Jogador da classe.
     * @return, Retorna o Jogador que fez o Gol.
     */
    public Jogador getJogador(){
        return this.jogador;
    }
    
    /**
     * Getter para o Selecao da classe.
     * @return, Retorna a Selecao que possui o Jogador que fez o Gol.
     */
    public Time getSelecao(){
        return this.selecao;
    }

    /**
     * @return the tempo
     */
    public Date getTempo() {
        return tempo;
    }

    /**
     * @return the foiContra
     */
    public boolean isFoiContra() {
        return foiContra;
    }

}
