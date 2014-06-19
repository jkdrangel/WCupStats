package model.pojo;
// Generated 12/06/2014 11:49:37 by Hibernate Tools 3.6.0


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Jogador generated by hbm2java
 */
public class Jogador  implements java.io.Serializable {


     private int id;
     private Date dataNascimento;
     private String nome;
     private int numero;
     private String posicao;
     private Set gols = new HashSet(0);

    public Jogador() {
    }

	
    public Jogador(int id, Date dataNascimento, String nome, int numero, String posicao) {
        this.id = id;
        this.dataNascimento = dataNascimento;
        this.nome = nome;
        this.numero = numero;
        this.posicao = posicao;
    }
    public Jogador(int id, Date dataNascimento, String nome, int numero, String posicao, Set gols) {
       this.id = id;
       this.dataNascimento = dataNascimento;
       this.nome = nome;
       this.numero = numero;
       this.posicao = posicao;
       this.gols = gols;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public Date getDataNascimento() {
        return this.dataNascimento;
    }
    
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getNumero() {
        return this.numero;
    }
    
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getPosicao() {
        return this.posicao;
    }
    
    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }
    public Set getGols() {
        return this.gols;
    }
    
    public void setGols(Set gols) {
        this.gols = gols;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + this.id;
        hash = 37 * hash + (this.dataNascimento != null ? this.dataNascimento.hashCode() : 0);
        hash = 37 * hash + (this.nome != null ? this.nome.hashCode() : 0);
        hash = 37 * hash + this.numero;
        hash = 37 * hash + (this.posicao != null ? this.posicao.hashCode() : 0);
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
        final Jogador other = (Jogador) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.dataNascimento != other.dataNascimento && (this.dataNascimento == null || !this.dataNascimento.equals(other.dataNascimento))) {
            return false;
        }
        if ((this.nome == null) ? (other.nome != null) : !this.nome.equals(other.nome)) {
            return false;
        }
        if (this.numero != other.numero) {
            return false;
        }
        if ((this.posicao == null) ? (other.posicao != null) : !this.posicao.equals(other.posicao)) {
            return false;
        }
        return true;
    }




}


