package model.pojo;
// Generated Jul 5, 2014 1:28:30 PM by Hibernate Tools 3.6.0


import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * Jogador generated by hbm2java
 */
public class Jogador  implements java.io.Serializable {


     private Integer id;
     private Date dataNascimento;
     private String nome;
     private int numero;
     private String posicao;
     private Set selecaosForJogador17 = new HashSet(0);
     private Set substituicaosForJogadorSai = new HashSet(0);
     private Set selecaosForJogador8 = new HashSet(0);
     private Set selecaosForJogador10 = new HashSet(0);
     private Set selecaosForJogador9 = new HashSet(0);
     private Set selecaosForJogador12 = new HashSet(0);
     private Set selecaosForJogador11 = new HashSet(0);
     private Set selecaosForJogador14 = new HashSet(0);
     private Set escalacaosForJogador2 = new HashSet(0);
     private Set selecaosForJogador13 = new HashSet(0);
     private Set selecaosForJogador16 = new HashSet(0);
     private Set selecaosForJogador15 = new HashSet(0);
     private Set escalacaosForJogador3 = new HashSet(0);
     private Set gols = new HashSet(0);
     private Set escalacaosForJogador6 = new HashSet(0);
     private Set escalacaosForJogador11 = new HashSet(0);
     private Set escalacaosForJogador7 = new HashSet(0);
     private Set escalacaosForJogador4 = new HashSet(0);
     private Set escalacaosForJogador9 = new HashSet(0);
     private Set selecaosForJogador7 = new HashSet(0);
     private Set selecaosForJogador6 = new HashSet(0);
     private Set selecaosForJogador3 = new HashSet(0);
     private Set selecaosForJogador19 = new HashSet(0);
     private Set selecaosForJogador5 = new HashSet(0);
     private Set escalacaosForJogador8 = new HashSet(0);
     private Set selecaosForJogador18 = new HashSet(0);
     private Set selecaosForJogador1 = new HashSet(0);
     private Set selecaosForJogador2 = new HashSet(0);
     private Set substituicaosForJogadorEntra = new HashSet(0);
     private Set escalacaosForJogador5 = new HashSet(0);
     private Set escalacaosForJogador1 = new HashSet(0);
     private Set selecaosForJogador4 = new HashSet(0);
     private Set selecaosForJogador23 = new HashSet(0);
     private Set selecaosForJogador22 = new HashSet(0);
     private Set selecaosForJogador21 = new HashSet(0);
     private Set selecaosForJogador20 = new HashSet(0);
     private Set escalacaosForJogador10 = new HashSet(0);

    public Jogador() {
    }

	
    public Jogador(Date dataNascimento, String nome, int numero, String posicao) {
        this.dataNascimento = dataNascimento;
        this.nome = nome;
        this.numero = numero;
        this.posicao = posicao;
    }
    public Jogador(Date dataNascimento, String nome, int numero, String posicao, Set selecaosForJogador17, Set substituicaosForJogadorSai, Set selecaosForJogador8, Set selecaosForJogador10, Set selecaosForJogador9, Set selecaosForJogador12, Set selecaosForJogador11, Set selecaosForJogador14, Set escalacaosForJogador2, Set selecaosForJogador13, Set selecaosForJogador16, Set selecaosForJogador15, Set escalacaosForJogador3, Set gols, Set escalacaosForJogador6, Set escalacaosForJogador11, Set escalacaosForJogador7, Set escalacaosForJogador4, Set escalacaosForJogador9, Set selecaosForJogador7, Set selecaosForJogador6, Set selecaosForJogador3, Set selecaosForJogador19, Set selecaosForJogador5, Set escalacaosForJogador8, Set selecaosForJogador18, Set selecaosForJogador1, Set selecaosForJogador2, Set substituicaosForJogadorEntra, Set escalacaosForJogador5, Set escalacaosForJogador1, Set selecaosForJogador4, Set selecaosForJogador23, Set selecaosForJogador22, Set selecaosForJogador21, Set selecaosForJogador20, Set escalacaosForJogador10) {
       this.dataNascimento = dataNascimento;
       this.nome = nome;
       this.numero = numero;
       this.posicao = posicao;
       this.selecaosForJogador17 = selecaosForJogador17;
       this.substituicaosForJogadorSai = substituicaosForJogadorSai;
       this.selecaosForJogador8 = selecaosForJogador8;
       this.selecaosForJogador10 = selecaosForJogador10;
       this.selecaosForJogador9 = selecaosForJogador9;
       this.selecaosForJogador12 = selecaosForJogador12;
       this.selecaosForJogador11 = selecaosForJogador11;
       this.selecaosForJogador14 = selecaosForJogador14;
       this.escalacaosForJogador2 = escalacaosForJogador2;
       this.selecaosForJogador13 = selecaosForJogador13;
       this.selecaosForJogador16 = selecaosForJogador16;
       this.selecaosForJogador15 = selecaosForJogador15;
       this.escalacaosForJogador3 = escalacaosForJogador3;
       this.gols = gols;
       this.escalacaosForJogador6 = escalacaosForJogador6;
       this.escalacaosForJogador11 = escalacaosForJogador11;
       this.escalacaosForJogador7 = escalacaosForJogador7;
       this.escalacaosForJogador4 = escalacaosForJogador4;
       this.escalacaosForJogador9 = escalacaosForJogador9;
       this.selecaosForJogador7 = selecaosForJogador7;
       this.selecaosForJogador6 = selecaosForJogador6;
       this.selecaosForJogador3 = selecaosForJogador3;
       this.selecaosForJogador19 = selecaosForJogador19;
       this.selecaosForJogador5 = selecaosForJogador5;
       this.escalacaosForJogador8 = escalacaosForJogador8;
       this.selecaosForJogador18 = selecaosForJogador18;
       this.selecaosForJogador1 = selecaosForJogador1;
       this.selecaosForJogador2 = selecaosForJogador2;
       this.substituicaosForJogadorEntra = substituicaosForJogadorEntra;
       this.escalacaosForJogador5 = escalacaosForJogador5;
       this.escalacaosForJogador1 = escalacaosForJogador1;
       this.selecaosForJogador4 = selecaosForJogador4;
       this.selecaosForJogador23 = selecaosForJogador23;
       this.selecaosForJogador22 = selecaosForJogador22;
       this.selecaosForJogador21 = selecaosForJogador21;
       this.selecaosForJogador20 = selecaosForJogador20;
       this.escalacaosForJogador10 = escalacaosForJogador10;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
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
    public Set getSelecaosForJogador17() {
        return this.selecaosForJogador17;
    }
    
    public void setSelecaosForJogador17(Set selecaosForJogador17) {
        this.selecaosForJogador17 = selecaosForJogador17;
    }
    public Set getSubstituicaosForJogadorSai() {
        return this.substituicaosForJogadorSai;
    }
    
    public void setSubstituicaosForJogadorSai(Set substituicaosForJogadorSai) {
        this.substituicaosForJogadorSai = substituicaosForJogadorSai;
    }
    public Set getSelecaosForJogador8() {
        return this.selecaosForJogador8;
    }
    
    public void setSelecaosForJogador8(Set selecaosForJogador8) {
        this.selecaosForJogador8 = selecaosForJogador8;
    }
    public Set getSelecaosForJogador10() {
        return this.selecaosForJogador10;
    }
    
    public void setSelecaosForJogador10(Set selecaosForJogador10) {
        this.selecaosForJogador10 = selecaosForJogador10;
    }
    public Set getSelecaosForJogador9() {
        return this.selecaosForJogador9;
    }
    
    public void setSelecaosForJogador9(Set selecaosForJogador9) {
        this.selecaosForJogador9 = selecaosForJogador9;
    }
    public Set getSelecaosForJogador12() {
        return this.selecaosForJogador12;
    }
    
    public void setSelecaosForJogador12(Set selecaosForJogador12) {
        this.selecaosForJogador12 = selecaosForJogador12;
    }
    public Set getSelecaosForJogador11() {
        return this.selecaosForJogador11;
    }
    
    public void setSelecaosForJogador11(Set selecaosForJogador11) {
        this.selecaosForJogador11 = selecaosForJogador11;
    }
    public Set getSelecaosForJogador14() {
        return this.selecaosForJogador14;
    }
    
    public void setSelecaosForJogador14(Set selecaosForJogador14) {
        this.selecaosForJogador14 = selecaosForJogador14;
    }
    public Set getEscalacaosForJogador2() {
        return this.escalacaosForJogador2;
    }
    
    public void setEscalacaosForJogador2(Set escalacaosForJogador2) {
        this.escalacaosForJogador2 = escalacaosForJogador2;
    }
    public Set getSelecaosForJogador13() {
        return this.selecaosForJogador13;
    }
    
    public void setSelecaosForJogador13(Set selecaosForJogador13) {
        this.selecaosForJogador13 = selecaosForJogador13;
    }
    public Set getSelecaosForJogador16() {
        return this.selecaosForJogador16;
    }
    
    public void setSelecaosForJogador16(Set selecaosForJogador16) {
        this.selecaosForJogador16 = selecaosForJogador16;
    }
    public Set getSelecaosForJogador15() {
        return this.selecaosForJogador15;
    }
    
    public void setSelecaosForJogador15(Set selecaosForJogador15) {
        this.selecaosForJogador15 = selecaosForJogador15;
    }
    public Set getEscalacaosForJogador3() {
        return this.escalacaosForJogador3;
    }
    
    public void setEscalacaosForJogador3(Set escalacaosForJogador3) {
        this.escalacaosForJogador3 = escalacaosForJogador3;
    }
    public Set getGols() {
        return this.gols;
    }
    
    public void setGols(Set gols) {
        this.gols = gols;
    }
    public Set getEscalacaosForJogador6() {
        return this.escalacaosForJogador6;
    }
    
    public void setEscalacaosForJogador6(Set escalacaosForJogador6) {
        this.escalacaosForJogador6 = escalacaosForJogador6;
    }
    public Set getEscalacaosForJogador11() {
        return this.escalacaosForJogador11;
    }
    
    public void setEscalacaosForJogador11(Set escalacaosForJogador11) {
        this.escalacaosForJogador11 = escalacaosForJogador11;
    }
    public Set getEscalacaosForJogador7() {
        return this.escalacaosForJogador7;
    }
    
    public void setEscalacaosForJogador7(Set escalacaosForJogador7) {
        this.escalacaosForJogador7 = escalacaosForJogador7;
    }
    public Set getEscalacaosForJogador4() {
        return this.escalacaosForJogador4;
    }
    
    public void setEscalacaosForJogador4(Set escalacaosForJogador4) {
        this.escalacaosForJogador4 = escalacaosForJogador4;
    }
    public Set getEscalacaosForJogador9() {
        return this.escalacaosForJogador9;
    }
    
    public void setEscalacaosForJogador9(Set escalacaosForJogador9) {
        this.escalacaosForJogador9 = escalacaosForJogador9;
    }
    public Set getSelecaosForJogador7() {
        return this.selecaosForJogador7;
    }
    
    public void setSelecaosForJogador7(Set selecaosForJogador7) {
        this.selecaosForJogador7 = selecaosForJogador7;
    }
    public Set getSelecaosForJogador6() {
        return this.selecaosForJogador6;
    }
    
    public void setSelecaosForJogador6(Set selecaosForJogador6) {
        this.selecaosForJogador6 = selecaosForJogador6;
    }
    public Set getSelecaosForJogador3() {
        return this.selecaosForJogador3;
    }
    
    public void setSelecaosForJogador3(Set selecaosForJogador3) {
        this.selecaosForJogador3 = selecaosForJogador3;
    }
    public Set getSelecaosForJogador19() {
        return this.selecaosForJogador19;
    }
    
    public void setSelecaosForJogador19(Set selecaosForJogador19) {
        this.selecaosForJogador19 = selecaosForJogador19;
    }
    public Set getSelecaosForJogador5() {
        return this.selecaosForJogador5;
    }
    
    public void setSelecaosForJogador5(Set selecaosForJogador5) {
        this.selecaosForJogador5 = selecaosForJogador5;
    }
    public Set getEscalacaosForJogador8() {
        return this.escalacaosForJogador8;
    }
    
    public void setEscalacaosForJogador8(Set escalacaosForJogador8) {
        this.escalacaosForJogador8 = escalacaosForJogador8;
    }
    public Set getSelecaosForJogador18() {
        return this.selecaosForJogador18;
    }
    
    public void setSelecaosForJogador18(Set selecaosForJogador18) {
        this.selecaosForJogador18 = selecaosForJogador18;
    }
    public Set getSelecaosForJogador1() {
        return this.selecaosForJogador1;
    }
    
    public void setSelecaosForJogador1(Set selecaosForJogador1) {
        this.selecaosForJogador1 = selecaosForJogador1;
    }
    public Set getSelecaosForJogador2() {
        return this.selecaosForJogador2;
    }
    
    public void setSelecaosForJogador2(Set selecaosForJogador2) {
        this.selecaosForJogador2 = selecaosForJogador2;
    }
    public Set getSubstituicaosForJogadorEntra() {
        return this.substituicaosForJogadorEntra;
    }
    
    public void setSubstituicaosForJogadorEntra(Set substituicaosForJogadorEntra) {
        this.substituicaosForJogadorEntra = substituicaosForJogadorEntra;
    }
    public Set getEscalacaosForJogador5() {
        return this.escalacaosForJogador5;
    }
    
    public void setEscalacaosForJogador5(Set escalacaosForJogador5) {
        this.escalacaosForJogador5 = escalacaosForJogador5;
    }
    public Set getEscalacaosForJogador1() {
        return this.escalacaosForJogador1;
    }
    
    public void setEscalacaosForJogador1(Set escalacaosForJogador1) {
        this.escalacaosForJogador1 = escalacaosForJogador1;
    }
    public Set getSelecaosForJogador4() {
        return this.selecaosForJogador4;
    }
    
    public void setSelecaosForJogador4(Set selecaosForJogador4) {
        this.selecaosForJogador4 = selecaosForJogador4;
    }
    public Set getSelecaosForJogador23() {
        return this.selecaosForJogador23;
    }
    
    public void setSelecaosForJogador23(Set selecaosForJogador23) {
        this.selecaosForJogador23 = selecaosForJogador23;
    }
    public Set getSelecaosForJogador22() {
        return this.selecaosForJogador22;
    }
    
    public void setSelecaosForJogador22(Set selecaosForJogador22) {
        this.selecaosForJogador22 = selecaosForJogador22;
    }
    public Set getSelecaosForJogador21() {
        return this.selecaosForJogador21;
    }
    
    public void setSelecaosForJogador21(Set selecaosForJogador21) {
        this.selecaosForJogador21 = selecaosForJogador21;
    }
    public Set getSelecaosForJogador20() {
        return this.selecaosForJogador20;
    }
    
    public void setSelecaosForJogador20(Set selecaosForJogador20) {
        this.selecaosForJogador20 = selecaosForJogador20;
    }
    public Set getEscalacaosForJogador10() {
        return this.escalacaosForJogador10;
    }
    
    public void setEscalacaosForJogador10(Set escalacaosForJogador10) {
        this.escalacaosForJogador10 = escalacaosForJogador10;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.id);
        hash = 97 * hash + Objects.hashCode(this.dataNascimento);
        hash = 97 * hash + Objects.hashCode(this.nome);
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
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.dataNascimento, other.dataNascimento)) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return true;
    }




}


