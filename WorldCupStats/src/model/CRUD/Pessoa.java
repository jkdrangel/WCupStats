/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.CRUD;

import java.util.Date;

/**
 * Classe que representa pessoas generics no sistema
 *
 * @author D.L.O.L
 *
 * @version 1.0
 *
 */
abstract class Pessoa {

    private String nome;
    private Date dataDeNascimento;

    /**
     * Metodo construtor que exigira o nome da pessoa e sua data de nascimento
     *
     * @param nome
     * @param dataDeNascimento
     */
    public Pessoa(String nome, Date dataDeNascimento) {
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getNome() {
        return nome;
    }

    public Date getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataDeNascimento(Date dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }
}
