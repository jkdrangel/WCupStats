package model.pojo;
// Generated 12/06/2014 11:49:37 by Hibernate Tools 3.6.0


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
     private Set copas = new HashSet(0);

    public Pais() {
    }

	
    public Pais(int id, String nome, String continente) {
        this.id = id;
        this.nome = nome;
        this.continente = continente;
    }
    public Pais(int id, String nome, String continente, Set selecaos, Set copas) {
       this.id = id;
       this.nome = nome;
       this.continente = continente;
       this.selecaos = selecaos;
       this.copas = copas;
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
    public Set getCopas() {
        return this.copas;
    }
    
    public void setCopas(Set copas) {
        this.copas = copas;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.id;
        hash = 89 * hash + (this.nome != null ? this.nome.hashCode() : 0);
        hash = 89 * hash + (this.continente != null ? this.continente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pais other = (Pais) obj;
        if (this.id != other.id) {
            return false;
        }
        if ((this.nome == null) ? (other.nome != null) : !this.nome.equals(other.nome)) {
            return false;
        }
        if ((this.continente == null) ? (other.continente != null) : !this.continente.equals(other.continente)) {
            return false;
        }
        if (this.selecaos != other.selecaos && (this.selecaos == null || !this.selecaos.equals(other.selecaos))) {
            return false;
        }
        if (this.copas != other.copas && (this.copas == null || !this.copas.equals(other.copas))) {
            return false;
        }
        return true;
    }




}


