package model.pojo;
// Generated 06/07/2014 15:27:33 by Hibernate Tools 3.6.0


import java.sql.Time;
import java.util.Objects;

/**
 * Gol generated by hbm2java
 */
public class Gol  implements java.io.Serializable {


     private Integer id;
     private Jogador jogador;
     private Selecao selecao;
     private Jogo jogo;
     private Time tempo;
     private boolean foiContra;

    public Gol() {
    }

	
    public Gol(Time tempo, boolean foiContra) {
        this.tempo = tempo;
        this.foiContra = foiContra;
    }
    public Gol(Jogador jogador, Selecao selecao, Jogo jogo, Time tempo, boolean foiContra) {
       this.jogador = jogador;
       this.selecao = selecao;
       this.jogo = jogo;
       this.tempo = tempo;
       this.foiContra = foiContra;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Jogador getJogador() {
        return this.jogador;
    }
    
    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
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
    public Time getTempo() {
        return this.tempo;
    }
    
    public void setTempo(Time tempo) {
        this.tempo = tempo;
    }
    public boolean isFoiContra() {
        return this.foiContra;
    }
    
    public void setFoiContra(boolean foiContra) {
        this.foiContra = foiContra;
    }

 @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.id);
        hash = 97 * hash + Objects.hashCode(this.jogador.getId());
        hash = 97 * hash + Objects.hashCode(this.jogo.getId());
        hash = 97 * hash + Objects.hashCode(this.tempo);
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
        final Gol other = (Gol) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.jogador.getId(), other.jogador.getId())) {
            return false;
        }
        if (!Objects.equals(this.jogo.getId(), other.jogo.getId())) {
            return false;
        }
        if (!Objects.equals(this.tempo, other.tempo)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        String oqFoi = (this.isFoiContra())? "Contra":"Normal";
        
        int hora = this.getTempo().getHours();
        int minutos = this.getTempo().getMinutes() + hora*60;
        int s = this.getTempo().getSeconds();
        String segundos = ""+s;
        if(s < 10) {
            segundos = "0"+s;
        }
        
        return "Gol "+ selecao.getNome() +", "+ minutos+":"+segundos +", "+ this.getJogador().getNome() 
                +"["+oqFoi+"]";
    }

}


