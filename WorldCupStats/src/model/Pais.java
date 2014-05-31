/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

/**
 * Classe que representa um pais.
 *
 * @author D.L.O.L
 *
 * @version 1.0
 *
 * @see Time
 */
public class Pais {
    
    private final String nome;
    private final String continente;
    private int ID;

    public Pais(String nome, String continente) {
        this.nome = nome;
        this.continente = continente;
    }

    public String getNome() {
        return nome;
    }

    public String getContinente() {
        return continente;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Pais{" + "nome=" + nome + '}';
    }
}
