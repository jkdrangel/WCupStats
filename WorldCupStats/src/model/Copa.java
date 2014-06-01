/*
 * Classe desenvolvida como componente integrante do projeto: Sistema
 * de estatisticas de Copas do Mundo (WCupStats), que trata-se de um
 * trabalho proposto pela disciplina de Padroes e Frameworks. Todo este
 * codigo foi desenvolvido pelos integrantes desta equipe: Diego Leite,
 * Lucas Santana, Oto Antonio e Lucas Vinicius.
 */

package model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author lsantana
 */
public class Copa {
    
    private Date data;
    private int ID;
    private final Pais paisSede;
    private final ArrayList<Time> timesParticipantes= new ArrayList<Time>(); 
    
    public Copa(Date data, Pais sede) {
        this.data = data;
        paisSede=sede;
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

    void listarJogos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void consultarQtdMediaGols() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void listarJogosEmpatados() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void consultarClassificacao() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void consultarMediaIdade() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
