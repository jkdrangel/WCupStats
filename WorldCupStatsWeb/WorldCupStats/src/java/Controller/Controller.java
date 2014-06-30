/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.util.Date;
import java.util.List;
import model.CRUD.CopaDAO;
import model.CRUD.PaisDAO;
import model.CRUD.Sistema;
import model.pojo.Copa;
import model.pojo.Escalacao;
import model.pojo.Gol;
import model.pojo.Jogador;
import model.pojo.Jogo;
import model.pojo.Pais;
import model.pojo.Selecao;
import model.pojo.Substituicao;
import model.pojo.Tecnico;

/**
 *
 * @author lsantana
 */
public class Controller {

    Sistema sistema = new Sistema();

    public Pais cadastrarPais(String nome, String continente) {
        return sistema.cadastrarPais(nome, continente);
    }

    public Jogador cadastrarJogador(Date dataNascimento, String nome, int numero, String posicao) {
        return sistema.cadastrarJogador(dataNascimento, nome, numero, posicao);
    }

    public Tecnico cadastrarTecnico(String nome, Date dataNascimento) {
        return sistema.cadastrarTecnico(nome, dataNascimento);
    }

    public Selecao cadastrarSelecao(int posicao, Date ano, String grupo, Pais pais) {
        return sistema.cadastrarSelecao(posicao, ano, grupo, pais);
    }

    public Copa cadastrarCopa(Date ano, Pais p, Selecao s) {
        return sistema.cadastrarCopa(ano, p, s);
    }

    public Escalacao cadastrarEscalacao(Jogo j) {
        return sistema.cadastrarEscalacao(j);
    }

    public Gol cadastrarGolEmJogo(Jogo j, Date tempo, boolean foiContra) {
        return sistema.cadastrarGol(j, tempo, foiContra);
    }

    public Substituicao cadastrarSubstituicao(Date t, Jogador entrou, Jogador saiu) {
        return sistema.cadastrarSubstituicao(t, entrou, saiu);
    }

    public List<Pais> listarPaises() {
        return sistema.listarPaises();
    }

    public List<Jogador> listarJogadores() {
        return sistema.listarJogadores();
    }

    public List<Tecnico> listarTecnicos() {
        return sistema.listarTecnicos();
    }

    public List<Selecao> listarSelecoes() {
        return sistema.listarSelecoes();
    }

    public List<Jogador> listarJogadoresDaSelecao(Selecao selecao) {
        return sistema.listarJogadoresDaSelecao(selecao);
    }

    public Tecnico consultarTecnicoSelecao(Selecao s) {
        return sistema.consultarTecnicoSelecao(s);
    }

    public List<Copa> listarCopas() {
        return sistema.listarCopas();
    }

    public List<Pais> listarPaisesCopa(Copa copa) {
        return sistema.listarPaisesCopa(copa);
    }

    public String consultarPlacarJogo(Jogo j) {
        return sistema.consultarPlacarJogo(j);
    }

    public List<Jogo> listarJogosCopa(Copa copa) {
        return sistema.listarJogosCopa(copa);
    }

    public Escalacao consultarEscalacaoSelecao(Selecao s) {
        return sistema.consultarEscalacaoSelecao(s);
    }

    public List<Substituicao> listaSubstituicoesJogo(Jogo j) {
        return sistema.listaSubstituicoesJogo(j);
    }

    public List<Gol> listaGolsDaPartida(Jogo j) {
        return sistema.listaGolsDaPartida(j);
    }

    public int consultarQuatidadeDeJogoPais(Pais p){
        return sistema.consultarQuatidadeDeJogoPais(p);
    }
    
    public int qtdJogosPais(Pais pais) {
        return sistema.qtdJogosPais(pais);
    }
}
