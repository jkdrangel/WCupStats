/*
 * Classe desenvolvida como componente integrante do projeto: Sistema
 * de estatisticas de Copas do Mundo (WCupStats), que trata-se de um
 * trabalho proposto pela disciplina de Padroes e Frameworks. Todo este
 * codigo foi desenvolvido pelos integrantes desta equipe: Diego Leite,
 * Lucas Santana, Oto Antonio e Lucas Vinicius.
 */
package model;

import java.util.Date;
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
    private final Date data;
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
    public Jogo(FaseCopa FASE, Date data, String local, Copa copa, Time timeA,
                                          Time timeB, Escalacao escalacaoA,
                                          Escalacao escalacaoB) {
        this.FASE = FASE;
        this.data = data;
        this.local = local;
        this.copa = copa;
        this.timeA = timeA;
        this.timeB = timeB;
        this.escalacaoA = escalacaoA;
        this.escalacaoB = escalacaoB;
    }

    /**
     * @return the FASE
     */
    public String getFASE() {
        return FASE.getFase();
    }

    /**
     * @return the data
     */
    public Date getData() {
        return data;
    }

    /**
     * @return the local
     */
    public String getLocal() {
        return local;
    }

    /**
     * @return the copa
     */
    public Copa getCopa() {
        return copa;
    }

    /**
     * @return the timeA
     */
    public Time getTimeA() {
        return timeA;
    }

    /**
     * @return the timeB
     */
    public Time getTimeB() {
        return timeB;
    }

    /**
     * @return the escalacaoA
     */
    public Escalacao getEscalacaoA() {
        return escalacaoA;
    }

    /**
     * @return the escalacaoB
     */
    public Escalacao getEscalacaoB() {
        return escalacaoB;
    }

    /**
     * @return the substis
     */
    public List<Substituicao> getSubstis() {
        return substis;
    }

    /**
     * @param substis the substis to set
     */
    public void addSubstis(Substituicao substis) {
        this.substis.add(substis);
    }
}
