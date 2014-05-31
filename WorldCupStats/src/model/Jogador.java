/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import exceptions.FuncaoJogadorNaoEncontradaException;
import java.util.Date;
import model.Enuns.FuncaoJogador;

/**
 * Classe que representa os jogadores das selecoes de cada pais nas diversas copas.
 * A classe possui atributos em comum com Pessoa e por isso extende dela
 *
 * @author D.L.O.L
 *
 * @version 1.0
 *
 * @see Pessoa
 */
public class Jogador extends Pessoa{
    private int numero;
    FuncaoJogador funcao;
    
    public Jogador(String nome, Date dataDeNascimento, int numero, String funcao) throws FuncaoJogadorNaoEncontradaException{
        super(nome, dataDeNascimento);
        this.numero = numero;
        this.atribuiPosicao(funcao);
    }

    private void atribuiPosicao(String funcao) throws FuncaoJogadorNaoEncontradaException {
        if(funcao.equals(FuncaoJogador.ATACANTE.getFuncao())){
            this.funcao = FuncaoJogador.ATACANTE;
        }
        else if(funcao.equals(FuncaoJogador.GOLEIRO.getFuncao())){
            this.funcao = FuncaoJogador.GOLEIRO;
        }
        else if(funcao.equals(FuncaoJogador.LATERAL.getFuncao())){
            this.funcao = FuncaoJogador.LATERAL;
        }
        else if(funcao.equals(FuncaoJogador.MEIO_DE_CAMPO.getFuncao())){
            this.funcao = FuncaoJogador.MEIO_DE_CAMPO;
        }
        else if(funcao.equals(FuncaoJogador.VOLANTE.getFuncao())){
            this.funcao = FuncaoJogador.VOLANTE;
        }
        else if(funcao.equals(FuncaoJogador.ZAGUEIRO.getFuncao())){
            this.funcao = FuncaoJogador.ZAGUEIRO;
        }
        else{
            throw new FuncaoJogadorNaoEncontradaException("A posicao inserida é inválida");
        }
    }

    public int getNumero() {
        return numero;
    }

    public String getFuncao() {
        return funcao.getFuncao();
    }
    
    public void setNumero(int n){
        this.numero = n;
    }
}
