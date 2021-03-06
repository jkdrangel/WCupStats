/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Enuns;

import model.CRUD.JogoDAO;

/**
 * Fases de uma copa.
 *
 * @author D.L.O.L
 *
 * @version 1.0
 *
 * @see JogoDAO
 */
public enum FaseCopa {
    
    /**
     *
     */
    GRUPOS("Fase de Grupos"),

    /**
     *
     */
    OITAVAS("Oitavas de Final"),

    /**
     *
     */
    QUARTAS("Quartas de Final"),

    /**
     *
     */
    SEMI("Semifinal"),

    /**
     *
     */
    FINAL("Final");

    /**
     * Fase na copa.
     */
    private final String fase;

    /**
     * Construtor do Enum.
     *
     * @param funcao
     */
    private FaseCopa(String fase) {
        this.fase = fase;
    }

    /**
     *
     * @return
     */
    public String getFase() {
        return fase;
    }
}
