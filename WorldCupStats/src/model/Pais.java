/*
 * Classe desenvolvida como componente integrante do projeto: Sistema
 * de estatisticas de Copas do Mundo (WCupStats), que trata-se de um
 * trabalho proposto pela disciplina de Padroes e Frameworks. Todo este
 * codigo foi desenvolvido pelos integrantes desta equipe: Diego Leite,
 * Lucas Santana, Oto Antonio e Lucas Vinicius.
 */

package model;

import java.util.ArrayList;
import model.Enuns.FaseCopa;

/**
 * Classe que representa um pais.
 *
 * @author D.L.O.L
 *
 * @version 1.0
 *
 * @see Time
 */
public class Pais {
    
    ArrayList<Time> selecoes=new ArrayList<Time>();
    
    public void cadastrarSelecao(String a, int i) {
    selecoes.add(new Time(FaseCopa.GRUPOS.getFase().charAt(0), 0, 0, null, this, null));
    }
    
    private final String nome;
    private final String continente;
    private int ID;

    public Pais(String nome, String continente) {
        this.nome = nome;
        this.continente = continente;
    }

    public String getNome() {
        return nome;
    }

    public String getContinente() {
        return continente;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Pais{" + "nome=" + nome + '}';
    }

    void consultarQtdJogos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
