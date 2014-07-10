/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.sql.Time;
import java.sql.Date;
import java.util.List;
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
    
    /**
     * Um novo pais eh cadastrado no sistema
     * @param nome
     * @param continente
     * @return 
     */
    public Pais cadastrarPais(String nome, String continente) {
        return sistema.cadastrarPais(nome, continente);
    }
    /**
     * Um novo jogador eh cadastrado no sistema
     * @param dataNascimento
     * @param nome
     * @param numero
     * @param posicao
     * @return 
     */
    public Jogador cadastrarJogador(Date dataNascimento, String nome, int numero, String posicao) {
        return sistema.cadastrarJogador(dataNascimento, nome, numero, posicao);
    }
    /**
     * Um novo tecnico eh cadastrado no sistema
     * @param nome
     * @param dataNascimento
     * @return 
     */
    public Tecnico cadastrarTecnico(String nome, Date dataNascimento) {
        return sistema.cadastrarTecnico(nome, dataNascimento);
    }
    /**
     * Uma nova selecao eh cadastrada no sistema.
     * @param posicao
     * @param ano
     * @param grupo
     * @param pais
     * @return 
     */
    public Selecao cadastrarSelecao(int posicao, Date ano, String grupo, Pais pais) {
        return sistema.cadastrarSelecao(posicao, ano, grupo, pais);
    }
    
    /**
     * Uma nova copa do mundo eh cadastrada no sistema
     * @param ano
     * @param p
     * @return 
     */
    public Copa cadastrarCopa(Date ano, Pais p) {
        return sistema.cadastrarCopa(ano, p);
    }
    /**
     * A partir dos jogadores que compoem uma selecao,
     * a escalacao para um jogo deve ser cadastrar escolhendo-se 11 jogadores
     * @param j
     * @param s
     * @return 
     */
    public Escalacao cadastrarEscalacao(Jogo j, Selecao s, Jogador jo) {
        return sistema.cadastrarEscalacao(j, s, jo);
    }
    /**
     * Um novo jogo é inserido em uma copa do mundo,
     * deve ser informado a fase na qual o jogo foi realizado (grupos, final, quartas...)
     * @param d
     * @param local
     * @param copa
     * @param primeira
     * @param segunda
     * @param fase
     * @param golA
     * @param golB
     * @return 
     */
    public Jogo cadastrarJogo(Date d, String local,Copa  copa, Selecao primeira, Selecao segunda, String fase, Integer golA, Integer golB){
        return sistema.cadastrarJogo(d,local,copa, primeira, segunda, fase, golA, golB);
    }
    
    /**
     * Um novo jogo eh inserido em uma copa do mundo,
     * deve ser informada a fase na qual o jogo foi realizado (grupos, final, quartas...)
     * @param j
     * @param tempo
     * @param foiContra
     * @param jogador
     * @param s
     * @return 
     */
    public Gol cadastrarGolEmJogo(Jogo j, Time tempo, boolean foiContra, Jogador jogador, Selecao s) {
        return sistema.cadastrarGol(j, tempo, foiContra, jogador, s);
    }
    /**
     * Um gol eh computado para uma das equipes,
     * o gol pode ter sido contra, 
     * o tempo é informado em minutos e segundos de partida.
     * @param t
     * @param entrou
     * @param saiu
     * @param j
     * @return 
     */
    public Substituicao cadastrarSubstituicao(Time t, Jogador entrou, Jogador saiu, Jogo j, Selecao s) {
        return sistema.cadastrarSubstituicao(t, entrou, saiu, j, s);
    }   
    /**
     * 
     * @return 
     */
    public List<Pais> listarPaises() {
        return sistema.listarPaises();
    }
    /**
     * 
     * @return 
     */
    public List<Jogador> listarJogadores() {
        return sistema.listarJogadores();
    }
    /**
     * 
     * @return 
     */
    public List<Tecnico> listarTecnicos() {
        return sistema.listarTecnicos();
    }
    /**
     * 
     * @return 
     */
    public List<Selecao> listarSelecoes() {
        return sistema.listarSelecoes();
    }
    /**
     * 
     * @param selecao
     * @return 
     */
    public List<Jogador> listarJogadoresDaSelecao(Selecao selecao) {
        return sistema.listarJogadoresDaSelecao(selecao);
    }
    /**
     * 
     * @param s
     * @return 
     */
    public Tecnico consultarTecnicoSelecao(Selecao s) {
        return sistema.consultarTecnicoSelecao(s);
    }
    /**
     * 
     * @return 
     */
    public List<Copa> listarCopas() {
        return sistema.listarCopas();
    }
    /**
     * Listar selecoes participantes de uma copa
     * @param copa
     * @return 
     */
    public List<Selecao> listarPaisesCopa(Copa copa) {
        return sistema.listarPaisesCopa(copa);
    }
    /**
     * 
     * @param data
     * @param local
     * @param j
     * @return 
     */
    public Jogo consultarPlacarJogo(Date data, String local) {
        Jogo j = sistema.getJogoDao().buscar(data, local);
        return sistema.consultarPlacarJogo(j);
    }
    /**
     * 
     * @param copa
     * @return 
     */
    public List<Jogo> listarJogosCopa(Copa copa) {
        return sistema.listarJogosCopa(copa);
    }
    /**
     * 
     * @param s
     * @param j
     * @return 
     */
    public List<Jogador> consultarEscalacaoSelecao(Selecao s, Jogo j) {
        return sistema.consultarEscalacaoSelecao(s, j);
    }
    /**
     * 
     * @param j
     * @return 
     */
    public List<Substituicao> listaSubstituicoesJogo(Jogo j) {
        return sistema.listaSubstituicoesJogo(j);
    }
    /**
     * 
     * @param j
     * @return 
     */
    public List<Gol> listaGolsDaPartida(Jogo j) {
        return sistema.listaGolsDaPartida(j);
    }
    /**
     * 
     * @param j
     * @return 
     */
    public String consultarCaracteristicasJogador(Jogador j, Copa c){
        return sistema.consultarCaracteristicasJogador(j,c);
    }

    /**
     *
     * @param pais
     * @return
     */
    public int qtdJogosPais(Pais pais) {
        return sistema.qtdJogosPais(pais);
    }
    
    /**
     * 
     * @param c
     * @return 
     */
    public String consultarQuantidadeEMediaDeGols(Copa c){
        return sistema.consultarQuantidadeEMediaDeGols(c);
    }
    
    /**
     * 
     * @return 
     */
    public List<Jogo> consultarMaioresGoleadas(){
        return sistema.consultarMaioresGoleadas();
    }
    /**
     * 
     * @param c
     * @return 
     */
    public List<Jogo> listarJogosEmpatados(Copa c){
        return sistema.listarJogosEmpatados(c);
    }
    /**
     * 
     * @return 
     */
    public List<Jogo> listarVitoriasIncontestaveis(){
        return sistema.listarVitoriasIncontestaveis();
    }
    /**
     * 
     * @param c
     * @return 
     */
    public List<Selecao> consutarOrdemClassificacao(Copa c){
        return sistema.consutarOrdemClassificacao(c);
    }
    /**
     * 
     * @return 
     */
    public List<String> consultaArtilheiros(){
        return sistema.consultaArtilheiros();
    }
    /**
     * 
     * @param c
     * @return 
     */
    public double consultaMediaIdadeSelecoes(Copa c){
        return sistema.consultaMediaIdadeSelecoes(c);
    }
    /**
     * 
     * @return 
     */
    public List<Jogo> listaTodasFinais(){
        return sistema.listaTodasFinais();
    }
    /**
     * 
     * @return 
     */
    public List<Tecnico> listaTecnicosCampeoes(){
        return sistema.listaTecnicosCampeoes();
    }
    /**
     * 
     * @return 
     */
    public List<Gol> listaGolsContra(){
        return sistema.listaGolsContra();
    }
    /**
     * 
     * @return 
     */
    public List<Copa> listaCopasComPaisSedeCampeao(){
        return sistema.listaCopasComPaisSedeCampeao();
    }
    /**
     * 
     * @return 
     */
    public List<Pais> listaDecrescenteDePaisesComMaisTitulos(){
        return sistema. listaDecrescenteDePaisesComMaisTitulos();
    }

    /**
     *
     * @param p
     * @return
     */
    public int quatidadeDeParticipacoesEmCopas(Pais p){
         return sistema.quatidadeDeParticipacoesEmCopas(p);
    }
    
    /**
     *
     * @return
     */
    public List<Pais> listarPaisesComMaisParticipacoes(){
        return sistema.listarPaisesComMaisParticipacoes();
    }

    /**
     *
     * @return
     */
    public List<Pais> listarPaisesComMaiorNumeroDeViceCampeonatos(){
        return sistema.listarPaisesComMaiorNumeroDeViceCampeonatos();
    }
    
    /**
     *
     * @return
     */
    public List<Pais> listarPaisesComMaiorPercentualDeDerrotas(){
        return sistema.listarPaisesComMaiorPercentualDeDerrotas();
    }
    
    /**
     *
     * @param j
     * @return
     */
    public List<Jogador> listarJogadoresComMaiorNumeroDeGolNaPartida(Jogo j){
        return sistema.listarJogadoresComMaiorNumeroDeGolPorPartida(j);
    }
    
    /**
     *
     * @return
     */
    public List<Jogador> listarJogadorComMaiorMediaDeGolPorPartidaNasCopas(){
        return sistema.listarJogadorComMaiorMediaDeGolPorPartidaNasCopas();
    }
    
    /**
     *
     * @return
     */
    public List<Jogador> listarJogadorComMaiorQuantidadeDeJogosEmCopas(){
        return sistema.listarJogadorComMaiorQuantidadeDeJogosEmCopas();
    }
    /**
     * 
     * @return 
     */
    public Gol consultarGolMaisRapidoNasCopas(){
        return sistema.consultarGolMaisRapidoNasCopas();
    }
    /**
     * 
     * @return 
     */
    public List<Jogador> listarJogadoresComMaiorNumeroDeJogosComoReserva(){
        return sistema.listarJogadoresComMaiorNumeroDeJogosComoReserva();
    }
    /**
     * 
     * @return 
     */
    public List<Jogador> listarJogadoresReservaQueFizeramGols(){
        return sistema.listarJogadoresReservaQueFizeramGols();
    }
    /**
     * 
     * @return 
     */
    public List<Pais> listarPaisesQueMaisParticiparamDeFinais(){
        return sistema.listarPaisesQueMaisParticiparamDeFinais();
    }
    /**
     * 
     * @return 
     */
    public List<Pais> listarPaisesComMaisEliminacoesPrimeiraFase(){
        return sistema.listarPaisesComMaisEliminacoesPrimeiraFase();
    }
    /**
     * 
     * @return 
     */
    public List<Pais> listarPaisesComTotalDeVitoriasNaCopa(){
        return sistema.listarPaisesComTotalDeVitoriasNaCopa();
    }
    /**
     * 
     * @return 
     */
    public List<Pais> listarPaisesQuePerderamPartidaEGanharamACopa(){
        return sistema.listarPaisesQuePerderamPartidaEGanharamACopa();
    }
    
}
