package model.pojo;
// Generated 06/07/2014 15:27:33 by Hibernate Tools 3.6.0


import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * Jogo generated by hbm2java
 */
public class Jogo  implements java.io.Serializable {


     private Integer id;
     private Copa copa;
     private Selecao selecaoBySelecaoB;
     private Selecao selecaoBySelecaoA;
     private Date data;
     private String local;
     private String fase;
     private Integer golA;
     private Integer golB;
     private Set escalacaos = new HashSet(0);
     private Set substituicaos = new HashSet(0);
     private Set gols = new HashSet(0);

    public Jogo() {
    }

	
    public Jogo(Date data, String local, String fase) {
        this.data = data;
        this.local = local;
        this.fase = fase;
    }
    public Jogo(Copa copa, Selecao selecaoBySelecaoA, Selecao selecaoBySelecaoB, Date data, String local, String fase, Integer golA, Integer golB, Set escalacaos, Set substituicaos, Set gols) {
       this.copa = copa;
       this.selecaoBySelecaoB = selecaoBySelecaoB;
       this.selecaoBySelecaoA = selecaoBySelecaoA;
       this.data = data;
       this.local = local;
       this.fase = fase;
       this.golA = golA;
       this.golB = golB;
       this.escalacaos = escalacaos;
       this.substituicaos = substituicaos;
       this.gols = gols;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Copa getCopa() {
        return this.copa;
    }
    
    public void setCopa(Copa copa) {
        this.copa = copa;
    }
    public Selecao getSelecaoBySelecaoB() {
        return this.selecaoBySelecaoB;
    }
    
    public void setSelecaoBySelecaoB(Selecao selecaoBySelecaoB) {
        this.selecaoBySelecaoB = selecaoBySelecaoB;
    }
    public Selecao getSelecaoBySelecaoA() {
        return this.selecaoBySelecaoA;
    }
    
    public void setSelecaoBySelecaoA(Selecao selecaoBySelecaoA) {
        this.selecaoBySelecaoA = selecaoBySelecaoA;
    }
    public Date getData() {
        return this.data;
    }
    
    public void setData(Date data) {
        this.data = data;
    }
    public String getLocal() {
        return this.local;
    }
    
    public void setLocal(String local) {
        this.local = local;
    }
    public String getFase() {
        return this.fase;
    }
    
    public void setFase(String fase) {
        this.fase = fase;
    }
    public Integer getGolA() {
        return this.golA;
    }
    
    public void setGolA(Integer golA) {
        this.golA = golA;
    }
    public Integer getGolB() {
        return this.golB;
    }
    
    public void setGolB(Integer golB) {
        this.golB = golB;
    }
    public Set getEscalacaos() {
        return this.escalacaos;
    }
    
    public void setEscalacaos(Set escalacaos) {
        this.escalacaos = escalacaos;
    }
    public Set getSubstituicaos() {
        return this.substituicaos;
    }
    
    public void setSubstituicaos(Set substituicaos) {
        this.substituicaos = substituicaos;
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
        hash = 89 * hash + Objects.hashCode(this.id);
        hash = 89 * hash + Objects.hashCode(this.data);
        hash = 89 * hash + Objects.hashCode(this.local);
        hash = 89 * hash + Objects.hashCode(this.fase);
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
        final Jogo other = (Jogo) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        
        if (!Objects.equals(this.data, other.data)) {
            return false;
        }
        if (!Objects.equals(this.local, other.local)) {
            return false;
        }
        if (!Objects.equals(this.fase, other.fase)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return selecaoBySelecaoA.getNome() +" "+ golA +"x"+ golB +" "+ selecaoBySelecaoB.getNome();
    }
    
}


