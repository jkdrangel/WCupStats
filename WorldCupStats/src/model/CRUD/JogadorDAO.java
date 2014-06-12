/*
 * Classe desenvolvida como componente integrante do projeto: Sistema
 * de estatisticas de Copas do Mundo (WCupStats), que trata-se de um
 * trabalho proposto pela disciplina de Padroes e Frameworks. Todo este
 * codigo foi desenvolvido pelos integrantes desta equipe: Diego Leite,
 * Lucas Santana, Oto Antonio e Lucas Vinicius.
 */
package model.CRUD;

import java.util.Date;
import model.Enuns.FuncaoJogador;

/**
 * Classe que representa os jogadores das selecoes de cada pais nas diversas
 * copas. A classe possui atributos em comum com PessoaDAO e por isso extende dela
 *
 * @author D.L.O.L
 *
 * @version 1.0
 *
 * @see PessoaDAO
 */
public class JogadorDAO extends PessoaDAO {

    private int numero;
    private FuncaoJogador funcao;

    public JogadorDAO(String nome, Date dataDeNascimento, int numero, FuncaoJogador funcao){
        super(nome, dataDeNascimento);
        this.numero = numero;
        this.funcao = funcao;
    }

    public int getNumero() {
        return numero;
    }

    public String getFuncao() {
        return funcao.getFuncao();
    }

    public void setNumero(int n) {
        this.numero = n;
    }

    /**
     * Retorna verdadeiro se as instancia de jogadores comparada forem iguais
     *
     * @param j
     * @return
     */
    public boolean equals(Object o) {
        JogadorDAO j;
        if (o instanceof PessoaDAO) {
            j = (JogadorDAO)o;
            if (j.getNumero() == this.numero && j.getFuncao().equals(this.funcao.getFuncao())
                    && j.getNome().equalsIgnoreCase(super.getNome())
                    && j.getDataDeNascimento().equals(super.getDataDeNascimento())) {
                return true;
            }
        }

        return false;
    }
}
