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
 * Classe que representa a EscalacaoDAO de uma Selecao durante um JogoDAO.
 * 
 * @author D.L.O.L
 * 
 * @version 1.0
 * 
 * @see JogoDAO
 * @see Jogadores
 */
public class EscalacaoDAO {
    private int ID;
    private JogoDAO jogo;
    private List<JogadorDAO> jogadores;
    
    /**
     * Construtor da classe.
     * @param jogo, JogoDAO em que os jogadores foram Escalados.
     * @param jogadores, Jogadores que foram Escalados para o JogoDAO.
     */
    public EscalacaoDAO(JogoDAO jogo, List<JogadorDAO> jogadores){
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
     * Getter para o JogoDAO da classe.
     * @return, Retorna o jogo em que o Gol foi feito.
     */
    public JogoDAO getJogo(){
        return this.jogo;
    }
    
    /**
     * Setter para o JogoDAO da classe.
     * @param jogo, JogoDAO em que o Gol foi feito.
     */
    public void setJogo(JogoDAO jogo){
        this.jogo = jogo;
    }
    
    /**
     * Getter para os Jogadores da classe.
     * @return, Retorna o Jogador que fez o Gol.
     */
    public List<JogadorDAO> getJogador(){
        return this.jogadores;
    }
}
