package model.pojo;
// Generated 03/07/2014 09:33:32 by Hibernate Tools 3.6.0


import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * Pais generated by hbm2java
 */
public class Pais  implements java.io.Serializable {


     private Integer id;
     private String nome;
     private String continente;
     private Set selecaos = new HashSet(0);
     private Set copas = new HashSet(0);

    public Pais() {
    }

	
    public Pais(String nome, String continente) {
        this.nome = nome;
        this.continente = continente;
    }
    public Pais(String nome, String continente, Set selecaos, Set copas) {
       this.nome = nome;
       this.continente = continente;
       this.selecaos = selecaos;
       this.copas = copas;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
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
        hash = 23 * hash + Objects.hashCode(this.id);
        hash = 23 * hash + Objects.hashCode(this.nome);
        hash = 23 * hash + Objects.hashCode(this.continente);
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
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.continente, other.continente)) {
            return false;
        }
        return true;
    }




}


