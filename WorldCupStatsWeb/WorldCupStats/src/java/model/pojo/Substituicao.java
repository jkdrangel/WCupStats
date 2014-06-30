package model.pojo;
// Generated 30/06/2014 12:17:05 by Hibernate Tools 3.6.0


import java.util.Date;
import java.util.Objects;

/**
 * Substituicao generated by hbm2java
 */
public class Substituicao  implements java.io.Serializable {


     private int id;
     private Jogador jogadorByJogadorSai;
     private Selecao selecao;
     private Jogo jogo;
     private Jogador jogadorByJogadorEntra;
     private Date tempo;

    public Substituicao() {
    }

    public Substituicao(int id, Jogador jogadorByJogadorSai, Selecao selecao, Jogo jogo, Jogador jogadorByJogadorEntra, Date tempo) {
       this.id = id;
       this.jogadorByJogadorSai = jogadorByJogadorSai;
       this.selecao = selecao;
       this.jogo = jogo;
       this.jogadorByJogadorEntra = jogadorByJogadorEntra;
       this.tempo = tempo;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public Jogador getJogadorByJogadorSai() {
        return this.jogadorByJogadorSai;
    }
    
    public void setJogadorByJogadorSai(Jogador jogadorByJogadorSai) {
        this.jogadorByJogadorSai = jogadorByJogadorSai;
    }
    public Selecao getSelecao() {
        return this.selecao;
    }
    
    public void setSelecao(Selecao selecao) {
        this.selecao = selecao;
    }
    public Jogo getJogo() {
        return this.jogo;
    }
    
    public void setJogo(Jogo jogo) {
        this.jogo = jogo;
    }
    public Jogador getJogadorByJogadorEntra() {
        return this.jogadorByJogadorEntra;
    }
    
    public void setJogadorByJogadorEntra(Jogador jogadorByJogadorEntra) {
        this.jogadorByJogadorEntra = jogadorByJogadorEntra;
    }
    public Date getTempo() {
        return this.tempo;
    }
    
    public void setTempo(Date tempo) {
        this.tempo = tempo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.jogadorByJogadorSai);
        hash = 43 * hash + Objects.hashCode(this.jogo);
        hash = 43 * hash + Objects.hashCode(this.jogadorByJogadorEntra);
        hash = 43 * hash + Objects.hashCode(this.tempo);
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
        final Substituicao other = (Substituicao) obj;
        if (!Objects.equals(this.jogadorByJogadorSai, other.jogadorByJogadorSai)) {
            return false;
        }
        if (!Objects.equals(this.jogo, other.jogo)) {
            return false;
        }
        if (!Objects.equals(this.jogadorByJogadorEntra, other.jogadorByJogadorEntra)) {
            return false;
        }
        if (!Objects.equals(this.tempo, other.tempo)) {
            return false;
        }
        return true;
    }




}


