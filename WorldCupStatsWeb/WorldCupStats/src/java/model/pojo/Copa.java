package model.pojo;
// Generated 27/06/2014 16:47:37 by Hibernate Tools 3.6.0


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

    /**
     *
     */
    public Copa() {
    }

    /**
     *
     * @param ano
     */
    public Copa(Date ano) {
        this.ano = ano;
    }

    /**
     *
     * @param selecao
     * @param pais
     * @param ano
     * @param selecaos
     * @param jogos
     */
    public Copa(Selecao selecao, Pais pais, Date ano, Set selecaos, Set jogos) {
       this.selecao = selecao;
       this.pais = pais;
       this.ano = ano;
       this.selecaos = selecaos;
       this.jogos = jogos;
    }
   
    /**
     *
     * @return
     */
    public Integer getId() {
        return this.id;
    }
    
    /**
     *
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     *
     * @return
     */
    public Selecao getSelecao() {
        return this.selecao;
    }
    
    /**
     *
     * @param selecao
     */
    public void setSelecao(Selecao selecao) {
        this.selecao = selecao;
    }

    /**
     *
     * @return
     */
    public Pais getPais() {
        return this.pais;
    }
    
    /**
     *
     * @param pais
     */
    public void setPais(Pais pais) {
        this.pais = pais;
    }

    /**
     *
     * @return
     */
    public Date getAno() {
        return this.ano;
    }
    
    /**
     *
     * @param ano
     */
    public void setAno(Date ano) {
        this.ano = ano;
    }

    /**
     *
     * @return
     */
    public Set getSelecaos() {
        return this.selecaos;
    }
    
    /**
     *
     * @param selecaos
     */
    public void setSelecaos(Set selecaos) {
        this.selecaos = selecaos;
    }

    /**
     *
     * @return
     */
    public Set getJogos() {
        return this.jogos;
    }
    
    /**
     *
     * @param jogos
     */
    public void setJogos(Set jogos) {
        this.jogos = jogos;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + Objects.hashCode(this.ano);
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
        if (!Objects.equals(this.ano, other.ano)) {
            return false;
        }
        return true;
    }

    




}


