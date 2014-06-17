/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.util.Date;
import model.CRUD.CopaDAO;
import model.CRUD.PaisDAO;
import model.CRUD.Sistema;
import model.pojo.Copa;
import model.pojo.Pais;
import model.pojo.Selecao;

/**
 *
 * @author lsantana
 */
public class Controller {
    
    Sistema sistema= new Sistema();

    public Pais CadastrarPais(String nome, String continente) {
        return sistema.cadastrarPais(nome, continente);
    }

    public Copa CadastrarCopa(Date ano, Pais p, Selecao s) {
        return sistema.cadastrarCopa(ano, p, s);
        
    }

     public void listarPaises (){
         
     }
}
