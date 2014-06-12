/*
 * Classe desenvolvida como componente integrante do projeto: Sistema
 * de estatisticas de Copas do Mundo (WCupStats), que trata-se de um
 * trabalho proposto pela disciplina de Padroes e Frameworks. Todo este
 * codigo foi desenvolvido pelos integrantes desta equipe: Diego Leite,
 * Lucas Santana, Oto Antonio e Lucas Vinicius.
 */
package model.CRUD;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;

/**
 *
 * @author lsantana
 */
public class Copa {

    private Date data;
    private int ID;
    private final Pais paisSede;
    private final ArrayList<Time> timesParticipantes = new ArrayList<Time>();
    private final ArrayList<Jogo> jogos = new ArrayList<Jogo>();

    public Copa(Date data, Pais sede) {
        this.data = data;
        paisSede = sede;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Pais getPaisSede() {
        return paisSede;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Copa{" + "data=" + data + '}';
    }

    void cadastrarSelecao(String a) {

    }

    Iterator<Jogo> listarJogos() {
        return jogos.iterator();
    }

    int consultarQtdMediaGols() {
        int media = 0;
        for (Jogo jogo : jogos) {
            media += jogo.golsLiquidos().length;
        }
        if (!jogos.isEmpty()) {
            return media / jogos.size();
        }
        return 0;
    }

    Iterator<Jogo> listarJogosEmpatados() {
    ArrayList<Jogo> empatados=new ArrayList<Jogo>();
    for(Jogo jogo : jogos){    
    if(jogo.empatou()){
        empatados.add(jogo);
        }
    }
    return empatados.iterator();
    }

    ArrayList<Time> consultarClassificacao() {
    if(timesParticipantes.isEmpty()){
        return null; 
    }
    //Collections.sort(timesParticipantes.subList(0, timesParticipantes.size()));
     return (ArrayList<Time>)timesParticipantes;
    }

    float consultarMediaIdade() {
        float media=0;
    for(Time time : timesParticipantes){
        for(Pessoa j: time.getJogadores()){
        int i=j.getDataDeNascimento().getYear();
        media+=2014-i;
    }
        media+=media/(time.getJogadores().size());
    }
    media=media/(timesParticipantes.size());
    return media;
    }

}
