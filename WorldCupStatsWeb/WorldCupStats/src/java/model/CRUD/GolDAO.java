/*
 * Classe desenvolvida como componente integrante do projeto: Sistema
 * de estatisticas de Copas do Mundo (WCupStats), que trata-se de um
 * trabalho proposto pela disciplina de Padroes e Frameworks. Todo este
 * codigo foi desenvolvido pelos integrantes desta equipe: Diego Leite,
 * Lucas Santana, Oto Antonio e Lucas Vinicius.
 */

package model.CRUD;

import java.util.Date;

/**
 * Classe que representa um GolDAO feito por um Jogador durante uma partida.
 *
 * @author D.L.O.L
 *
 * @version 1.0
 *
 * @see JogoDAO
 * @see Jogador
 * @see Selecao
 */
public class GolDAO {
    private int ID;
    private final JogoDAO jogo;
    private final JogadorDAO jogador;
    private final TimeDAO selecao;
    private final Date tempo;
    private final boolean foiContra;
    
    
    /**
     * Construtor da classe.
     * @param jogo, JogoDAO em que o Gol foi feito.
     * @param jogador, Jogador que fez o Gol.
     * @param selecao, Selecao que tem o Jogador que fez o Gol.
     * @param tempo
     * @param foiContra
     */
    public GolDAO(JogoDAO jogo, JogadorDAO jogador, TimeDAO selecao, Date tempo, boolean foiContra) {
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
     * Getter para o JogoDAO da classe.
     * @return, Retorna o jogo em que o GolDAO foi feito.
     */
    public JogoDAO getJogo(){
        return this.jogo;
    }
    
    /**
     * Getter para o Jogador da classe.
     * @return, Retorna o Jogador que fez o GolDAO.
     */
    public JogadorDAO getJogador(){
        return this.jogador;
    }
    
    /**
     * Getter para o Selecao da classe.
     * @return, Retorna a Selecao que possui o Jogador que fez o GolDAO.
     */
    public TimeDAO getSelecao(){
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
