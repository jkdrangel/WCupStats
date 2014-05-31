/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

/**
 * Classe que representa os gols da selecao de um pais em uma copa.
 * 
 * @author D.L.O.L
 * 
 * @version 1.0
 * 
 * @see 
 * @see 
 */
public class Gol {
    
    /**
     * Tempo em que o gol foi feito
    */ private final float tempo;
            
    /**
     * Construtor da classe.
     * 
     * @param tempo
     */
    public Gol(float tempo) {
        
        this.tempo = tempo;
    }
    
    public float getTempo() {
        return tempo;
    }
}
