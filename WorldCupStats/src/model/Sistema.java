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
    //    copas.add(new Copa(i));
    }
    
    void listarPaises() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void listarCopas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
