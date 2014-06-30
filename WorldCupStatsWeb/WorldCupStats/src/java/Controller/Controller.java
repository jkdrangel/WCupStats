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
    /**
     * 
     * @param nome
     * @param continente
     * @return 
     */
    public Pais cadastrarPais(String nome, String continente) {
        return sistema.cadastrarPais(nome, continente);
    }
    /**
     * 
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
     * 
     * @param nome
     * @param dataNascimento
     * @return 
     */
    public Tecnico cadastrarTecnico(String nome, Date dataNascimento) {
        return sistema.cadastrarTecnico(nome, dataNascimento);
    }
    /**
     * 
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
     * 
     * @param ano
     * @param p
     * @param s
     * @return 
     */
    public Copa cadastrarCopa(Date ano, Pais p, Selecao s) {
        return sistema.cadastrarCopa(ano, p, s);
    }
    /**
     * 
     * @param j
     * @param s
     * @return 
     */
    public Escalacao cadastrarEscalacao(Jogo j, Selecao s) {
        return sistema.cadastrarEscalacao(j, s);
    }
    /**
     * 
     * @param j
     * @param tempo
     * @param foiContra
     * @return 
     */
    public Gol cadastrarGolEmJogo(Jogo j, Date tempo, boolean foiContra) {
        return sistema.cadastrarGol(j, tempo, foiContra);
    }
    /**
     * 
     * @param t
     * @param entrou
     * @param saiu
     * @return 
     */
    public Substituicao cadastrarSubstituicao(Date t, Jogador entrou, Jogador saiu) {
        return sistema.cadastrarSubstituicao(t, entrou, saiu);
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
     * 
     * @param copa
     * @return 
     */
    public List<Pais> listarPaisesCopa(Copa copa) {
        return sistema.listarPaisesCopa(copa);
    }
    /**
     * 
     * @param j
     * @return 
     */
    public String consultarPlacarJogo(Jogo j) {
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
     * @return 
     */
    public Escalacao consultarEscalacaoSelecao(Selecao s) {
        return sistema.consultarEscalacaoSelecao(s);
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
    public String consultarCaracteristicasJogador(Jogador j){
        return sistema.consultarCaracteristicasJogador(j);
    }
    
    /**
     * 
     * @param p
     * @return 
     */

    public int consultarQuatidadeDeJogoPais(Pais p){
        return sistema.consultarQuatidadeDeJogoPais(p);
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
    public List<String> listarVitoriasIncontestaveis(){
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
    public List<String> listaTodasFinais(){
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
    public List<String> listaGolsContra(){
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
    
    /**
     *
     * @param pais
     * @return
     */
    public int qtdJogosPais(Pais pais) {
        return sistema.qtdJogosPais(pais);
    }
}
