/*
 * Classe desenvolvida como componente integrante do projeto: Sistema
 * de estatisticas de Copas do Mundo (WCupStats), que trata-se de um
 * trabalho proposto pela disciplina de Padroes e Frameworks. Todo este
 * codigo foi desenvolvido pelos integrantes desta equipe: Diego Leite,
 * Lucas Santana, Oto Antonio e Lucas Vinicius.
 */

package model;

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
    private Jogo jogo;
    private Jogador jogador;
    private Selecao selecao;
    
    /**
     * Construtor da classe.
     * @param jogo, Jogo em que o Gol foi feito.
     * @param jogador, Jogador que fez o Gol.
     * @param selecao, Selecao que tem o Jogador que fez o Gol.
     */
    public Gol(Jogo jogo, Jogador jogador, Selecao selecao){
        this.jogo = jogo;
        this.jogador = jogador;
        this.selecao = selecao;
    }
    
    /**
     * Getter para o ID da classe.
     * @return, Retorna o ID da classe.
     */
    public int getID(){
        return this.ID;
    }
    
    /**
     * Setter para o ID da classe.
     * @param ID, ID da classe.
     */
    public void setID(int ID){
        this.ID = ID;
    }
    
    /**
     * Getter para o Jogo da classe.
     * @return, Retorna o jogo em que o Gol foi feito.
     */
    public Jogo getJogo(){
        return this.jogo;
    }
    
    /**
     * Setter para o Jogo da classe.
     * @param jogo, Jogo em que o Gol foi feito.
     */
    public void setJogo(Jogo jogo){
        this.jogo = jogo;
    }
    
    /**
     * Getter para o Jogador da classe.
     * @return, Retorna o Jogador que fez o Gol.
     */
    public Jogador getJogador(){
        return this.jogador;
    }
    
    /**
     * Setter para o Jogador da classe.
     * @param jogador, Jogador que fez o Gol.
     */
    public void setJogador(Jogador jogador){
        this.jogador = jogador;
    }
    
    /**
     * Getter para o Selecao da classe.
     * @return, Retorna a Selecao que possui o Jogador que fez o Gol.
     */
    public Selecao getSelecao(){
        return this.selecao;
    }
    
    /**
     * Setter para a Selecao da classe.
     * @param selecao, Selecao que possui o Jogador que fez o Gol.
     */
    public void setSelecao(Selecao selecao){
        this.selecao = selecao;
    }
}
