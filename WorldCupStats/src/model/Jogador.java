/*
 * Classe desenvolvida como componente integrante do projeto: Sistema
 * de estatisticas de Copas do Mundo (WCupStats), que trata-se de um
 * trabalho proposto pela disciplina de Padroes e Frameworks. Todo este
 * codigo foi desenvolvido pelos integrantes desta equipe: Diego Leite,
 * Lucas Santana, Oto Antonio e Lucas Vinicius.
 */
package model;

import exceptions.FuncaoJogadorNaoEncontradaException;
import java.util.Date;
import model.Enuns.FuncaoJogador;

/**
 * Classe que representa os jogadores das selecoes de cada pais nas diversas
 * copas. A classe possui atributos em comum com Pessoa e por isso extende dela
 *
 * @author D.L.O.L
 *
 * @version 1.0
 *
 * @see Pessoa
 */
public class Jogador extends Pessoa {

    private int numero;
    private FuncaoJogador funcao;

    public Jogador(String nome, Date dataDeNascimento, int numero, String funcao) throws FuncaoJogadorNaoEncontradaException {
        super(nome, dataDeNascimento);
        this.numero = numero;
        this.atribuiPosicao(funcao);
    }

    private void atribuiPosicao(String funcao) throws FuncaoJogadorNaoEncontradaException {
        if (funcao.equalsIgnoreCase(FuncaoJogador.ATACANTE.getFuncao())) {
            this.funcao = FuncaoJogador.ATACANTE;
        } else if (funcao.equalsIgnoreCase(FuncaoJogador.GOLEIRO.getFuncao())) {
            this.funcao = FuncaoJogador.GOLEIRO;
        } else if (funcao.equalsIgnoreCase(FuncaoJogador.LATERAL.getFuncao())) {
            this.funcao = FuncaoJogador.LATERAL;
        } else if (funcao.equalsIgnoreCase(FuncaoJogador.MEIO_DE_CAMPO.getFuncao())) {
            this.funcao = FuncaoJogador.MEIO_DE_CAMPO;
        } else if (funcao.equalsIgnoreCase(FuncaoJogador.VOLANTE.getFuncao())) {
            this.funcao = FuncaoJogador.VOLANTE;
        } else if (funcao.equalsIgnoreCase(FuncaoJogador.ZAGUEIRO.getFuncao())) {
            this.funcao = FuncaoJogador.ZAGUEIRO;
        } else {
            throw new FuncaoJogadorNaoEncontradaException("A posicao inserida é inválida");
        }
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
        Jogador j;
        if (o instanceof Pessoa) {
            j = (Jogador)o;
            if (j.getNumero() == this.numero && j.getFuncao().equals(this.funcao.getFuncao())
                    && j.getNome().equalsIgnoreCase(super.getNome())
                    && j.getDataDeNascimento().equals(super.getDataDeNascimento())) {
                return true;
            }
        }

        return false;
    }
}
