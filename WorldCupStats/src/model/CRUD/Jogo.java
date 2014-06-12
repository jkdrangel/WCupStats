/*
 * Classe desenvolvida como componente integrante do projeto: Sistema
 * de estatisticas de Copas do Mundo (WCupStats), que trata-se de um
 * trabalho proposto pela disciplina de Padroes e Frameworks. Todo este
 * codigo foi desenvolvido pelos integrantes desta equipe: Diego Leite,
 * Lucas Santana, Oto Antonio e Lucas Vinicius.
 */
package model.CRUD;

import java.util.ArrayList;
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
     * CopaDAO que houve este jogo.
     */
    private Copa copa;
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
    /**
     * Gols do time A no jogo.
     */
    private List<Gol> golsTimeA;
    /**
     * Gols do time B no jogo.
     */
    private List<Gol> golsTimeB;

    
    /**
     * Construtor da classe.
     * 
     * @param FASE
     * @param data
     * @param local
     * @param copa
     * @param timeA
     * @param timeB
     * @param escalacaoA
     * @param escalacaoB 
     */
    public Jogo(FaseCopa FASE, Date data, String local, Copa copa, Time timeA,
            Time timeB, Escalacao escalacaoA, Escalacao escalacaoB) {
        this.FASE = FASE;
        this.data = data;
        this.local = local;
        this.copa = copa;
        this.timeA = timeA;
        this.timeB = timeB;
        this.escalacaoA = escalacaoA;
        this.escalacaoB = escalacaoB;

        substis = new ArrayList<Substituicao>();
        golsTimeA = new ArrayList<Gol>();
        golsTimeB = new ArrayList<Gol>();
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
    public List<Substituicao> getSubstituicao() {
        return substis;
    }

    /**
     * @param substis the substis to set
     */
    public void addSubstituicao(Substituicao substis) {
        this.substis.add(substis);
    }

    /**
     *
     * @param gol
     */
    public void addGolTimeA(Gol gol) {

        this.golsTimeA.add(gol);
    }

    /**
     *
     * @param gol
     */
    public void addGolTimeB(Gol gol) {

        this.golsTimeB.add(gol);
    }

    /**
     *
     * @return
     */
    public int[] golsLiquidos() {

        int gols[] = new int[2];
        gols[0] = golsTimeA.size();
        gols[1] = golsTimeB.size();

        for (Gol golA : golsTimeA) {
            if (golA.isFoiContra()) { 
                gols[0]--; // Diminui um gol no placar do Time A
                gols[1]++; // Aumenta um gol no placar do Time B
            }
        }
        for (Gol golB : golsTimeB) {
            if (golB.isFoiContra()) {
                gols[0]++; // Aumenta um gol no placar do Time A
                gols[1]--; // Diminui um gol no placar do Time B
            }
        }

        return gols;
    }

    public String placarJogo() {

        int gols[] = this.golsLiquidos();
        
        String a = timeA.toString();
        int gA = gols[0];
        String b = timeB.toString();
        int gB = gols[1];

        return a + " " + gA + "x" + gB + " " + b;
    }

    public boolean timeParticipouJogo(Time timeC) {

        return (timeA.equals(timeC) || timeB.equals(timeC));
    }

    public boolean vitoriaIncontestavel() {

        int diff = this.diferencaGols();
        
        return (diff >= 3);
    }

    public int diferencaGols() {

        System.out.println("OS GOLS CONTRA SÃO COMPUTADOS PARA QUAL TIME ???");
        
        int gols[] = this.golsLiquidos();
        
        int golLiquidoTimeA = gols[0];
        int golLiquidoTimeB = gols[1];

        int diff = (golLiquidoTimeA > golLiquidoTimeB) ? golLiquidoTimeA - golLiquidoTimeB
                                                                         : 
                                                         golLiquidoTimeB - golLiquidoTimeA;
        return diff;
    }

    public boolean empatou() {

        return ( 0 == this.diferencaGols() );
    }

    public Time vencedor() {

        Time vencedor = null;
        
        if (!empatou()) {
            int gols[] = this.golsLiquidos();
            vencedor = (gols[0] > gols[1])? timeA : timeB;
        }

        return vencedor;
    }
    
      public Time Derrotado() {

        Time derrotado = null;
        
        if (!empatou()) {
            int gols[] = this.golsLiquidos();
            derrotado = (gols[0] > gols[1])? timeB : timeA;
        }

        return derrotado;
    }
}
