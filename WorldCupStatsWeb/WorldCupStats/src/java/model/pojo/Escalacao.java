package model.pojo;
// Generated Jul 5, 2014 1:28:30 PM by Hibernate Tools 3.6.0

import java.util.Objects;




/**
 * Escalacao generated by hbm2java
 */
public class Escalacao  implements java.io.Serializable {


     private Integer id;
     private Selecao selecao;
     private Jogador jogadorByJogador6;
     private Jogador jogadorByJogador5;
     private Jogador jogadorByJogador4;
     private Jogador jogadorByJogador3;
     private Jogador jogadorByJogador2;
     private Jogador jogadorByJogador1;
     private Jogador jogadorByJogador10;
     private Jogo jogo;
     private Jogador jogadorByJogador11;
     private Jogador jogadorByJogador9;
     private Jogador jogadorByJogador8;
     private Jogador jogadorByJogador7;

    public Escalacao() {
    }

    public Escalacao(Selecao selecao, Jogador jogadorByJogador6, Jogador jogadorByJogador5, Jogador jogadorByJogador4, Jogador jogadorByJogador3, Jogador jogadorByJogador2, Jogador jogadorByJogador1, Jogador jogadorByJogador10, Jogo jogo, Jogador jogadorByJogador11, Jogador jogadorByJogador9, Jogador jogadorByJogador8, Jogador jogadorByJogador7) {
       this.selecao = selecao;
       this.jogadorByJogador6 = jogadorByJogador6;
       this.jogadorByJogador5 = jogadorByJogador5;
       this.jogadorByJogador4 = jogadorByJogador4;
       this.jogadorByJogador3 = jogadorByJogador3;
       this.jogadorByJogador2 = jogadorByJogador2;
       this.jogadorByJogador1 = jogadorByJogador1;
       this.jogadorByJogador10 = jogadorByJogador10;
       this.jogo = jogo;
       this.jogadorByJogador11 = jogadorByJogador11;
       this.jogadorByJogador9 = jogadorByJogador9;
       this.jogadorByJogador8 = jogadorByJogador8;
       this.jogadorByJogador7 = jogadorByJogador7;
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
    public Jogador getJogadorByJogador6() {
        return this.jogadorByJogador6;
    }
    
    public void setJogadorByJogador6(Jogador jogadorByJogador6) {
        this.jogadorByJogador6 = jogadorByJogador6;
    }
    public Jogador getJogadorByJogador5() {
        return this.jogadorByJogador5;
    }
    
    public void setJogadorByJogador5(Jogador jogadorByJogador5) {
        this.jogadorByJogador5 = jogadorByJogador5;
    }
    public Jogador getJogadorByJogador4() {
        return this.jogadorByJogador4;
    }
    
    public void setJogadorByJogador4(Jogador jogadorByJogador4) {
        this.jogadorByJogador4 = jogadorByJogador4;
    }
    public Jogador getJogadorByJogador3() {
        return this.jogadorByJogador3;
    }
    
    public void setJogadorByJogador3(Jogador jogadorByJogador3) {
        this.jogadorByJogador3 = jogadorByJogador3;
    }
    public Jogador getJogadorByJogador2() {
        return this.jogadorByJogador2;
    }
    
    public void setJogadorByJogador2(Jogador jogadorByJogador2) {
        this.jogadorByJogador2 = jogadorByJogador2;
    }
    public Jogador getJogadorByJogador1() {
        return this.jogadorByJogador1;
    }
    
    public void setJogadorByJogador1(Jogador jogadorByJogador1) {
        this.jogadorByJogador1 = jogadorByJogador1;
    }
    public Jogador getJogadorByJogador10() {
        return this.jogadorByJogador10;
    }
    
    public void setJogadorByJogador10(Jogador jogadorByJogador10) {
        this.jogadorByJogador10 = jogadorByJogador10;
    }
    public Jogo getJogo() {
        return this.jogo;
    }
    
    public void setJogo(Jogo jogo) {
        this.jogo = jogo;
    }
    public Jogador getJogadorByJogador11() {
        return this.jogadorByJogador11;
    }
    
    public void setJogadorByJogador11(Jogador jogadorByJogador11) {
        this.jogadorByJogador11 = jogadorByJogador11;
    }
    public Jogador getJogadorByJogador9() {
        return this.jogadorByJogador9;
    }
    
    public void setJogadorByJogador9(Jogador jogadorByJogador9) {
        this.jogadorByJogador9 = jogadorByJogador9;
    }
    public Jogador getJogadorByJogador8() {
        return this.jogadorByJogador8;
    }
    
    public void setJogadorByJogador8(Jogador jogadorByJogador8) {
        this.jogadorByJogador8 = jogadorByJogador8;
    }
    public Jogador getJogadorByJogador7() {
        return this.jogadorByJogador7;
    }
    
    public void setJogadorByJogador7(Jogador jogadorByJogador7) {
        this.jogadorByJogador7 = jogadorByJogador7;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.id);
        hash = 29 * hash + Objects.hashCode(this.selecao.getId());
        hash = 29 * hash + Objects.hashCode(this.jogo.getId());
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
        final Escalacao other = (Escalacao) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.selecao.getId(), other.selecao.getId())) {
            return false;
        }
        if (!Objects.equals(this.jogo.getId(), other.jogo.getId())) {
            return false;
        }
        return true;
    }




}


