package model.Enunsd;
// Generated 03/06/2014 10:36:01 by Hibernate Tools 3.6.0


import java.util.HashSet;
import java.util.Set;

/**
 * Pais generated by hbm2java
 */
public class Pais  implements java.io.Serializable {


     private int id;
     private String nome;
     private String continente;
     private Set selecaos = new HashSet(0);

    public Pais() {
    }

	
    public Pais(int id, String nome, String continente) {
        this.id = id;
        this.nome = nome;
        this.continente = continente;
    }
    public Pais(int id, String nome, String continente, Set selecaos) {
       this.id = id;
       this.nome = nome;
       this.continente = continente;
       this.selecaos = selecaos;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getContinente() {
        return this.continente;
    }
    
    public void setContinente(String continente) {
        this.continente = continente;
    }
    public Set getSelecaos() {
        return this.selecaos;
    }
    
    public void setSelecaos(Set selecaos) {
        this.selecaos = selecaos;
    }




}


