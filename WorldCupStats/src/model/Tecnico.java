/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.util.Date;

/**
 * Classe que representa os tecnicos das selecoes de cada pais nas diversas copas.
 ** A classe possui atributos em comum com Pessoa e por isso extende dela
 * 
 * @author D.L.O.L
 *
 * @version 1.0
 *
 * @see Pessoa
 */
public class Tecnico extends Pessoa{
    
    public Tecnico(String nome, Date dataDeNascimento) {
        super(nome, dataDeNascimento);
    }
}
