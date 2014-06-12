/*
 * Classe desenvolvida como componente integrante do projeto: SistemaDAO
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
class SistemaDAO {

    private int ID;
    ArrayList<PaisDAO> paises = new ArrayList<PaisDAO>();
    ArrayList<CopaDAO> copas = new ArrayList<CopaDAO>();

    SistemaDAO() {
    }

    void cadastrarPais(String brazil, String america_do_sul) {
        paises.add(new PaisDAO(brazil, america_do_sul));
    }

    void cadastrarCopa(Date ano, PaisDAO sede) {
        
    }

    public Iterator<PaisDAO> listarPaises() {
        return paises.iterator();
    }

    public Iterator<CopaDAO> listarCopas() {
        return copas.iterator();
    }

    void eMarmelada() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public ArrayList<PaisDAO> eDoBrasil() {
        ArrayList<PaisDAO> cinco;
        cinco = (ArrayList<PaisDAO>) paises.clone();
        Collections.sort((List) cinco);
        if (cinco.isEmpty()) {
            return null;
        } else if (cinco.size() <= 5) {
            return cinco;
        }
        return (ArrayList<PaisDAO>) cinco.subList(0, 4);
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
