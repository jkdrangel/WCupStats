package model.pojo;
// Generated 12/06/2014 11:49:37 by Hibernate Tools 3.6.0


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Copa generated by hbm2java
 */
public class Copa implements java.io.Serializable {


     private int id;
     private Selecao selecao;
     private Pais pais;
     private Date ano;
     private Set selecaos = new HashSet(0);
     private Set jogos = new HashSet(0);

    public Copa() {
    }

	
    public Copa(int id, Selecao selecao, Pais pais, Date ano) {
        this.id = id;
        this.selecao = selecao;
        this.pais = pais;
        this.ano = ano;
    }
    public Copa(int id, Selecao selecao, Pais pais, Date ano, Set selecaos, Set jogos) {
       this.id = id;
       this.selecao = selecao;
       this.pais = pais;
       this.ano = ano;
       this.selecaos = selecaos;
       this.jogos = jogos;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
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
        int hash = 7;
        hash = 37 * hash + this.id;
        hash = 37 * hash + (this.selecao != null ? this.selecao.hashCode() : 0);
        hash = 37 * hash + (this.pais != null ? this.pais.hashCode() : 0);
        hash = 37 * hash + (this.ano != null ? this.ano.hashCode() : 0);
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
        if (this.id != other.id) {
            return false;
        }
        if (this.selecao != other.selecao && (this.selecao == null || !this.selecao.equals(other.selecao))) {
            return false;
        }
        if (this.pais != other.pais && (this.pais == null || !this.pais.equals(other.pais))) {
            return false;
        }
        if (this.ano != other.ano && (this.ano == null || !this.ano.equals(other.ano))) {
            return false;
        }
        return true;
    }




}


