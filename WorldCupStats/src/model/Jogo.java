/*
 * Classe desenvolvida como componente integrante do projeto: Sistema
 * de estatisticas de Copas do Mundo (WCupStats), que trata-se de um
 * trabalho proposto pela disciplina de Padroes e Frameworks. Todo este
 * codigo foi desenvolvido pelos integrantes desta equipe: Diego Leite,
 * Lucas Santana, Oto Antonio e Lucas Vinicius.
 */

package model;

import java.util.List;
import model.Enuns.FaseCopa;

/**
 * Classe que representa um jogo entre duas selecoes em uma copa.
 *
 * @author D.L.O.L
 *
 * @version 1.0
 *
 * @see
 * @see
 */
public class Jogo {

    /**
     * fase do jogo na copa.
     */
    private final FaseCopa FASE;
    /**
     * Data do jogo.
     */
    private final String data;
    /**
     * Lugar onde ocorreu o jogo.
     */
    private final String local;
    /**
     * Copa que houve este jogo.
     */
    private final Copa copa;
    /**
     * Time A.
     */
    private final Time timeA;
    /**
     * Time B.
     */
    private final Time timeB;
    /**
     * Escalacao do time A.
     */
    private final Escalacao escalacaoA;
    /**
     * Escalacao do time B.
     */
    private final Escalacao escalacaoB;
    /**
     * Lista de substituicoes no jogo.
     */
    private List<Substituicao> substis;

    
     // Construtor da classe.
     
    public Jogo() {

    }
}
