package model.pojo;
// Generated Jul 5, 2014 1:28:30 PM by Hibernate Tools 3.6.0


import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * Copa generated by hbm2java
 */
public class Copa  implements java.io.Serializable {


     private Integer id;
     private Selecao selecao;
     private Pais pais;
     private Date ano;
     private Set selecaos = new HashSet(0);
     private Set jogos = new HashSet(0);

    public Copa() {
    }

	
    public Copa(Date ano) {
        this.ano = ano;
    }
    public Copa(Selecao selecao, Pais pais, Date ano, Set selecaos, Set jogos) {
       this.selecao = selecao;
       this.pais = pais;
       this.ano = ano;
       this.selecaos = selecaos;
       this.jogos = jogos;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Selecao getSelecao() {
        return this.selecao;
    }
    
    public void setSelecao(Selecao selecao) {
        this.selecao = selecao;
    }
    public Pais getPais() {
        return this.pais;
    }
    
    public void setPais(Pais pais) {
        this.pais = pais;
    }
    public Date getAno() {
        return this.ano;
    }
    
    public void setAno(Date ano) {
        this.ano = ano;
    }
    public Set getSelecaos() {
        return this.selecaos;
    }
    
    public void setSelecaos(Set selecaos) {
        this.selecaos = selecaos;
    }
    public Set getJogos() {
        return this.jogos;
    }
    
    public void setJogos(Set jogos) {
        this.jogos = jogos;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.id);
        hash = 89 * hash + Objects.hashCode(this.pais);
        hash = 89 * hash + Objects.hashCode(this.ano);
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
        final Copa other = (Copa) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.pais, other.pais)) {
            return false;
        }
        if (!Objects.equals(this.ano, other.ano)) {
            return false;
        }
        return true;
    }




}


