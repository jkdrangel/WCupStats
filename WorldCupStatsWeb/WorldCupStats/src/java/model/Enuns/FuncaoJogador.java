/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Enuns;

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

    /**
     *
     */
    GOLEIRO("Goleiro"),

    /**
     *
     */
    LATERAL("Lateral"),

    /**
     *
     */
    LATERAL_ESQUERDO("Lateral Esquerdo"),

    /**
     *
     */
    LATERAL_DIREITO("Lateral DIreito"),

    /**
     *
     */
    ZAGUEIRO("Zagueiro"),

    /**
     *
     */
    MEIO_DE_CAMPO("Meio de Campo"),

    /**
     *
     */
    VOLANTE("Volante"),

    /**
     *
     */
    MEIO_ATACANTE("Meia Atacante"),

    /**
     *
     */
    ATACANTE("Atacante"),

    /**
     *
     */
    PONTA("Ponta"),

    /**
     *
     */
    CENTRO_AVANTE("Centro Avante"),
    
    RESERVA("Reserva");

    /**
     * Funcao do jogador.
     */
    private final String funcao;

    /**
     * Construtor do Enum.
     *
     * @param funcao
     */
    FuncaoJogador(String funcao) {
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
