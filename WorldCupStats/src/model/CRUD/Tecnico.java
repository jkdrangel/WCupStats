/*
 * Classe desenvolvida como componente integrante do projeto: Sistema
 * de estatisticas de Copas do Mundo (WCupStats), que trata-se de um
 * trabalho proposto pela disciplina de Padroes e Frameworks. Todo este
 * codigo foi desenvolvido pelos integrantes desta equipe: Diego Leite,
 * Lucas Santana, Oto Antonio e Lucas Vinicius.
 */

package model.CRUD;

import java.util.Date;

/**
 * Classe que representa os tecnicos das selecoes de cada pais nas diversas copas.
 ** A classe possui atributos em comum com Pessoa e por isso extende dela
 * 
 * @author D.L.O.L
 *
 * @version 1.0
 *
 * @see Pessoa
 */
public class Tecnico extends Pessoa{
    
    public Tecnico(String nome, Date dataDeNascimento) {
        super(nome, dataDeNascimento);
    }
    
        /**
     * Metodo que verifica se a instancia da classe colocada como atributo é a
     * mesma que a classe que chama esse método
     *
     * @param p
     * @return
     */
    @Override
    public boolean equals(Object o) {
        Tecnico t;
        if (o instanceof Tecnico) {
            t = (Tecnico) o;
            if (t.getNome().equals(super.getNome()) 
                && t.getDataDeNascimento().equals(super.getDataDeNascimento())) {
                return true;
            }
        }
        return false;
    }
}
