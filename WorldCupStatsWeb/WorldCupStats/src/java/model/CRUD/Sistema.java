/*
 * Classe desenvolvida como componente integrante do projeto: SistemaDAO
 * de estatisticas de Copas do Mundo (WCupStats), que trata-se de um
 * trabalho proposto pela disciplina de Padroes e Frameworks. Todo este
 * codigo foi desenvolvido pelos integrantes desta equipe: Diego Leite,
 * Lucas Santana, Oto Antonio e Lucas Vinicius.
 */
package model.CRUD;

import Util.HibernateUtil;
import java.util.Date;
import java.util.List;
import model.pojo.Copa;
import model.pojo.Escalacao;
import model.pojo.Gol;
import model.pojo.Jogador;
import model.pojo.Jogo;
import model.pojo.Pais;
import model.pojo.Selecao;
import model.pojo.Substituicao;
import model.pojo.Tecnico;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author lsantana
 */
public class Sistema {

    PaisDAO pais = new PaisDAO();
    CopaDAO copa = new CopaDAO();
    Session sessao = null;
    Transaction transacao = null;

    /**
     *
     */
    public Sistema() {
    }

    /**
     *
     * @param nome
     * @param continente
     * @return
     */
    public Pais cadastrarPais(String nome, String continente) {
        Pais p = new Pais();
        p.setContinente(continente);
        p.setNome(nome);
        pais.adicionar(p);
        return p;
    }

    /**
     *
     * @param ano
     * @param sede
     * @param selecao
     * @return
     */
    public Copa cadastrarCopa(Date ano, Pais sede, Selecao selecao) {
        Copa c = new Copa();
        c.setAno(ano);
        c.setPais(sede);
        c.setSelecao(selecao);
        copa.adicionar(c);
        return c;
    }

    /**
     *
     * @return
     */
    public List<Pais> listarPaises() {
        return pais.listar();
    }

    /**
     *
     * @return
     */
    public List<Copa> listarCopas() {
        return copa.listar();
    }

    /**
     *
     * @param copa
     * @return
     */
    public List<Pais> listarPaisesCopa(Copa copa) {
        List<Pais> resultado = null;
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();

            Query consulta = sessao.createQuery("select Pais from Selecoes join Copa where ano=" + copa.getAno());

            transacao = sessao.beginTransaction();
            resultado = (List<Pais>) consulta.list();
            transacao.commit();
            return resultado;
        } catch (HibernateException e) {
            System.err.println("Nao foi possivel listar os objetos. Erro: " + e.getMessage());
            throw new HibernateException(e);
        } finally {
            try {
                sessao.close();
            } catch (Throwable e) {
                System.err.println("Erro ao fechar operacao de listagem. Mensagem: " + e.getMessage());
            }
        }
    }

    /**
     *
     * @param copa
     * @return
     */
    public List<Jogo> listarJogosCopa(Copa copa) {
     List<Jogo> resultado = null;
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();

            Query consulta = sessao.createQuery("select Jogo from Copa where ano=" + copa.getAno());

            transacao = sessao.beginTransaction();
            resultado = (List<Jogo>) consulta.list();
            transacao.commit();
            return resultado;
        } catch (HibernateException e) {
            System.err.println("Nao foi possivel listar os objetos. Erro: " + e.getMessage());
            throw new HibernateException(e);
        } finally {
            try {
                sessao.close();
            } catch (Throwable e) {
                System.err.println("Erro ao fechar operacao de listagem. Mensagem: " + e.getMessage());
            }
        } 
    }
    
    /**
     *
     * @param pais
     * @return
     */
    public int qtdJogosPais(Pais pais) {
         throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
    /*int resultado = 0;
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();

            Query consulta = sessao.createQuery("select sum() from Copa where ano=");

            transacao = sessao.beginTransaction();
            resultado = (int)consulta.uniqueResult();
            transacao.commit();
            return resultado;
        } catch (HibernateException e) {
            System.err.println("Nao foi possivel listar os objetos. Erro: " + e.getMessage());
            throw new HibernateException(e);
        } finally {
            try {
                sessao.close();
            } catch (Throwable e) {
                System.err.println("Erro ao fechar operacao de listagem. Mensagem: " + e.getMessage());
            }
        }*/
       // return 0;
    }

    /**
     *
     */
    public void eMarmelada() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     */
    public void eDoBrasil() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
    }

    /**
     *
     */
    public void toDentro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     */
    public void arrozDeCopa() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     */
    public void sempreVice() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     */
    public void fregues() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     */
    public void timeRuim() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     */
    public void timeBom() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     */
    public void invictos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     */
    public void perdeuGanhou() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @param nome
     * @param dataNascimento
     * @return
     */
    public Tecnico cadastrarTecnico(String nome, Date dataNascimento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @param j
     * @param s
     * @return
     */
    public Escalacao cadastrarEscalacao(Jogo j, Selecao s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @param j
     * @param tempo
     * @param foiContra
     * @return
     */
    public Gol cadastrarGol(Jogo j, Date tempo, boolean foiContra) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @param t
     * @param entrou
     * @param saiu
     * @return
     */
    public Substituicao cadastrarSubstituicao(Date t, Jogador entrou, Jogador saiu) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @return
     */
    public List<Jogador> listarJogadores() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @return
     */
    public List<Tecnico> listarTecnicos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @return
     */
    public List<Selecao> listarSelecoes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @param selecao
     * @return
     */
    public List<Jogador> listarJogadoresDaSelecao(Selecao selecao) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @param s
     * @return
     */
    public Tecnico consultarTecnicoSelecao(Selecao s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @param j
     * @return
     */
    public String consultarPlacarJogo(Jogo j) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @param s
     * @return
     */
    public Escalacao consultarEscalacaoSelecao(Selecao s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @param j
     * @return
     */
    public List<Substituicao> listaSubstituicoesJogo(Jogo j) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @param j
     * @return
     */
    public List<Gol> listaGolsDaPartida(Jogo j) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @param p
     * @return
     */
    public int consultarQuatidadeDeJogoPais(Pais p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @param j
     * @return
     */
    public String consultarCaracteristicasJogador(Jogador j) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @param c
     * @return
     */
    public String consultarQuantidadeEMediaDeGols(Copa c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @return
     */
    public List<Jogo> consultarMaioresGoleadas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @param c
     * @return
     */
    public List<Jogo> listarJogosEmpatados(Copa c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @return
     */
    public List<String> listarVitoriasIncontestaveis() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @param c
     * @return
     */
    public List<Selecao> consutarOrdemClassificacao(Copa c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @return
     */
    public List<String> consultaArtilheiros() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @param c
     * @return
     */
    public double consultaMediaIdadeSelecoes(Copa c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @return
     */
    public List<String> listaTodasFinais() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @return
     */
    public List<Tecnico> listaTecnicosCampeoes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @return
     */
    public List<String> listaGolsContra() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @return
     */
    public List<Copa> listaCopasComPaisSedeCampeao() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @return
     */
    public List<Pais> listaDecrescenteDePaisesComMaisTitulos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @param p
     * @return
     */
    public int quatidadeDeParticipacoesEmCopas(Pais p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @return
     */
    public List<Pais> listarPaisesComMaisParticipacoes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @return
     */
    public List<Pais> listarPaisesComMaiorNumeroDeViceCampeonatos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @return
     */
    public List<Pais> listarPaisesComMaiorPercentualDeDerrotas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @param j
     * @return
     */
    public List<Jogador> listarJogadoresComMaiorNumeroDeGolPorPartida(Jogo j) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @return
     */
    public List<Jogador> listarJogadorComMaiorMediaDeGolPorPartidaNasCopas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @return
     */
    public List<Jogador> listarJogadorComMaiorQuantidadeDeJogosEmCopas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @return
     */
    public Gol consultarGolMaisRapidoNasCopas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @return
     */
    public List<Jogador> listarJogadoresComMaiorNumeroDeJogosComoReserva() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @return
     */
    public List<Jogador> listarJogadoresReservaQueFizeramGols() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @return
     */
    public List<Pais> listarPaisesQueMaisParticiparamDeFinais() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @return
     */
    public List<Pais> listarPaisesComMaisEliminacoesPrimeiraFase() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @return
     */
    public List<Pais> listarPaisesComTotalDeVitoriasNaCopa() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @return
     */
    public List<Pais> listarPaisesQuePerderamPartidaEGanharamACopa() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Jogo cadastrarJogo(Copa copa, Selecao primeira, Selecao segunda, String fase) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    List<Escalacao> listarEscalacoes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    List<Escalacao> listaGols(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    List<Substituicao> listarSubstituicoes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

}
