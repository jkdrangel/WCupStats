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
public class JogoDAO {

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
    private CopaDAO copa;
    /**
     * TimeDAO A.
     */
    private final TimeDAO timeA;
    /**
 TimeDAO* Time B.
     */
    private final TimeDAO timeB;
    /**
     * EscalacaoDAO do time A.
     */
    private final EscalacaoDAO escalacaoA;
    /**
 EscalacaoDAOalacao do time B.
     */
    private final EscalacaoDAO escalacaoB;
    /**
     * Lista de substituicoes no jogo.
     */
    private List<SubstituicaoDAO> substis;
    /**
     * Gols do time A no jogo.
     */
    private List<GolDAO> golsTimeA;
    /**
     * Gols do time B no jogo.
     */
    private List <GolDAO> golsTimeB;

    
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
    public JogoDAO(FaseCopa FASE, Date data, String local, CopaDAO copa, TimeDAO timeA,
            TimeDAO timeB, EscalacaoDAO escalacaoA, EscalacaoDAO escalacaoB) {
        this.FASE = FASE;
        this.data = data;
        this.local = local;
        this.copa = copa;
        this.timeA = timeA;
        this.timeB = timeB;
        this.escalacaoA = escalacaoA;
        this.escalacaoB = escalacaoB;

        substis = new ArrayList<SubstituicaoDAO>();
        golsTimeA = new ArrayList<GolDAO>();
        golsTimeB = new ArrayList<GolDAO>();
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
  public CopaDAO getCopa() {
        return copa;
    }

    /**
     * @return the timeA
     */ public TimeDAO getTimeA() {
        return timeA;
    }

    /**
     * @return the timeB
    TimeDAO    public Time getTimeB() {
        return timeB;
    }

    /**
     * @return the escalacaoA
     */public EscalacaoDAO getEscalacaoA() {
        return escalacaoA;
    }

    /**
     * @return the escalacaoB
    EscalacaoDAOublic Escalacao getEscalacaoB() {
        return escalacaoB;
    }

    /**
     * @return the substis
     */
    public List<SubstituicaoDAO> getSubstituicao() {
        return substis;
    }

    /**
     * @param substis the substis to set
     */
    public void addSubstituicaoDAO (SubstituicaoDAO substis) {
        this.substis.add(substis);
    }

    /**
     *
     * @param gol
     */
    public void addGolTimeA(GolDAO gol) {

        this.golsTimeA.add(gol);
    }

    /**
     *
     * @param gol
     */
    public void addGolTimeB(GolDAO gol) {

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

        for (GolDAO golA : golsTimeA) {
            if (golA.isFoiContra()) { 
                gols[0]--; // Diminui umTimeDAO no placar do Time A
                gols[1]++; // AumentaTimeDAOgol no placar do Time B
            }
   }
        for (GolDAO golB : golsTimeB) {
            if (golB.isFoiContra()) {
                gols[0]++; // AumeTimeDAOum gol no placar do Time A
                gols[1]--; // DTimeDAOui um gol no placar do Time B
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

    public boolean timeParticipouJogo(TimeDAO timeC) {

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

  public TimeDAO vencedor() {

        TimeDAO vencedor = null;
        
        if (!empatou()) {
            int gols[] = this.golsLiquidos();
            vencedor = (gols[0] > gols[1])? timeA : timeB;
        }

        return vencedor;
    }
    public TimeDAO Derrotado() {

        TimeDAO derrotado = null;
        
        if (!empatou()) {
            int gols[] = this.golsLiquidos();
            derrotado = (gols[0] > gols[1])? timeB : timeA;
        }

        return derrotado;
    }
}
