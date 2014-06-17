/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.util.Date;
import java.util.List;
import model.CRUD.CopaDAO;
import model.CRUD.PaisDAO;
import model.CRUD.Sistema;
import model.pojo.Copa;
import model.pojo.Jogo;
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

     public List<Pais> listarPaises (){
         return sistema.listarPaises();
     }
     
     public List<Copa> listarCopas(){
     return sistema.listarCopas();
     } 
     
     public List<Pais> listarPaisesCopa(Copa copa){
     return sistema.listarPaisesCopa(copa);
     }
     
     public List<Jogo> listarJogosCopa(Copa copa){
     return sistema.listarJogosCopa(copa);
     }
     
     public int qtdJogosPais(Pais pais){
     return sistema.qtdJogosPais(pais);
     }
}
