/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

/**
 * Interface que representa uma pessoa (Tecnico ou Jogador).
 * 
 * @author D.L.O.L
 * 
 * @see Tecnico
 * @see Jogador
 * @see Pais
 */
public abstract class Pessoa {
    
    /**
     * Nome da pessoa. 
    */ 
    private String name;
    /**
     * Data de aniversario da pessoa.
     */ 
    private String dateBirth;
    /**
     * Pais que ele representa.
     */ 
     private Pais pais;
     
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the dateBirth
     */
    public String getDateBirth() {
        return dateBirth;
    }

    /**
     * @param dateBirth the dateBirth to set
     */
    public void setDateBirth(String dateBirth) {
        this.dateBirth = dateBirth;
    }

    /**
     * @return the pais
     */
    public Pais getPais() {
        return pais;
    }

    /**
     * @param pais the pais to set
     */
    public void setPais(Pais pais) {
        this.pais = pais;
    }
    
}
