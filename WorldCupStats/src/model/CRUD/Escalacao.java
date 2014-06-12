/*
 * Classe desenvolvida como componente integrante do projeto: Sistema
 * de estatisticas de Copas do Mundo (WCupStats), que trata-se de um
 * trabalho proposto pela disciplina de Padroes e Frameworks. Todo este
 * codigo foi desenvolvido pelos integrantes desta equipe: Diego Leite,
 * Lucas Santana, Oto Antonio e Lucas Vinicius.
 */

package model.CRUD;

import java.util.List;

/**
 * Classe que representa a Escalacao de uma Selecao durante um Jogo.
 * 
 * @author D.L.O.L
 * 
 * @version 1.0
 * 
 * @see Jogo
 * @see Jogadores
 */
public class Escalacao {
    private int ID;
    private Jogo jogo;
    private List<Pessoa> jogadores;
    
    /**
     * Construtor da classe.
     * @param jogo, Jogo em que os jogadores foram Escalados.
     * @param jogadores, Jogadores que foram Escalados para o Jogo.
     */
    public Escalacao(Jogo jogo, List<Pessoa> jogadores){
        this.jogo = jogo;
        this.jogadores = jogadores;
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
     * Getter para os Jogadores da classe.
     * @return, Retorna o Jogador que fez o Gol.
     */
    public List<Pessoa> getJogador(){
        return this.jogadores;
    }
}
