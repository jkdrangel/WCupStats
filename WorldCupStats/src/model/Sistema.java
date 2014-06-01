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
import java.util.Iterator;

/**
 *
 * @author lsantana
 */
class Sistema {

    private int ID;
    ArrayList<Pais> paises = new ArrayList<Pais>();
    ArrayList<Copa> copas = new ArrayList<Copa>();

    Sistema() {
    }

    void cadastrarPais(String brazil, String america_do_sul) {
        paises.add(new Pais(brazil, america_do_sul));
    }

    void cadastrarCopa(Date ano) {
    copas.add(new Copa(ano, null));
    }
    
    public Iterator<Pais> listarPaises() {
    return paises.iterator();
    }

    public Iterator<Copa> listarCopas() {
    return copas.iterator();
    }

    void eMarmelada() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void eDoBrasil() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void toDentro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void arrozDeCopa() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void sempreVice() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void fregues() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void timeRuim() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void timeBom() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void invictos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void perdeuGanhou() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
