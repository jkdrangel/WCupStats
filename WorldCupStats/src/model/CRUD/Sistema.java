/*
 * Classe desenvolvida como componente integrante do projeto: Sistema
 * de estatisticas de Copas do Mundo (WCupStats), que trata-se de um
 * trabalho proposto pela disciplina de Padroes e Frameworks. Todo este
 * codigo foi desenvolvido pelos integrantes desta equipe: Diego Leite,
 * Lucas Santana, Oto Antonio e Lucas Vinicius.
 */
package model.CRUD;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

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

    void cadastrarCopa(Date ano, Pais sede) {
        copas.add(new Copa(ano, sede));
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

    public ArrayList<Pais> eDoBrasil() {
        ArrayList<Pais> cinco;
        cinco = (ArrayList<Pais>) paises.clone();
        Collections.sort((List) cinco);
        if (cinco.isEmpty()) {
            return null;
        } else if (cinco.size() <= 5) {
            return cinco;
        }
        return (ArrayList<Pais>) cinco.subList(0, 4);
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
