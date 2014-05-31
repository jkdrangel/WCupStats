/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 * Posicoes de um jogador em um jogo.
 *
 * @author D.L.O.L
 *
 * @version 1.0
 *
 * @see Jogador
 */
public enum FuncaoJogador {

    GOLEIRO("Goleiro"),
    LATERAL("Lateral"),
    ZAGUEIRO("Zagueiro"),
    VOLANTE("Volante"),
    MEIO_DE_CAMPO("Meio de Campo"),
    ATACANTE("Atacante");

    /**
     * Funcao do jogador.
     */
    private final String funcao;

    /**
     * Construtor do Enum.
     *
     * @param funcao
     */
    private FuncaoJogador(String funcao) {
        this.funcao = funcao;
    }

    /**
     *
     * @return
     */
    public String getFuncao() {
        return funcao;
    }
}
