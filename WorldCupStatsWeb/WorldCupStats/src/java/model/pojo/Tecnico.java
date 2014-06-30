package model.pojo;
// Generated 27/06/2014 16:47:37 by Hibernate Tools 3.6.0


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Tecnico generated by hbm2java
 */
public class Tecnico  implements java.io.Serializable {


     private int id;
     private String nome;
     private Date dataNascimento;
     private Set selecaos = new HashSet(0);

    /**
     *
     */
    public Tecnico() {
    }

    /**
     *
     * @param id
     * @param nome
     * @param dataNascimento
     */
    public Tecnico(int id, String nome, Date dataNascimento) {
        this.id = id;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    /**
     *
     * @param id
     * @param nome
     * @param dataNascimento
     * @param selecaos
     */
    public Tecnico(int id, String nome, Date dataNascimento, Set selecaos) {
       this.id = id;
       this.nome = nome;
       this.dataNascimento = dataNascimento;
       this.selecaos = selecaos;
    }
   
    /**
     *
     * @return
     */
    public int getId() {
        return this.id;
    }
    
    /**
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     *
     * @return
     */
    public String getNome() {
        return this.nome;
    }
        /**
     *
     * @param nome
     */

    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     *
     * @return
     */
    public Date getDataNascimento() {
        return this.dataNascimento;
    }
    
    /**
     *
     * @param dataNascimento
     */
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
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




}


