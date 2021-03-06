/*
 * Classe desenvolvida como componente integrante do projeto: SistemaDAO
 * de estatisticas de Copas do Mundo (WCupStats), que trata-se de um
 * trabalho proposto pela disciplina de Padroes e Frameworks. Todo este
 * codigo foi desenvolvido pelos integrantes desta equipe: Diego Leite,
 * Lucas Santana, Oto Antonio e Lucas Vinicius.
 */
package model.CRUD;

import Util.HibernateUtil;
import static java.lang.Math.abs;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Calendar;
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

    private PaisDAO paisDao;
    private CopaDAO copaDao;
    private TecnicoDAO tecnicoDao;
    private EscalacaoDAO escalacaoDao;
    private GolDAO golDao;
    private JogadorDAO jogadorDao;
    private JogoDAO jogoDao;
    private SelecaoDAO selecaoDao;
    private SubstituicaoDAO substituicaoDao;
    
    Session sessao = null;
    Transaction transacao = null;

    /**
     *
     */
    public Sistema() {
        paisDao = new PaisDAO();
        copaDao = new CopaDAO();
        tecnicoDao = new TecnicoDAO();
        escalacaoDao = new EscalacaoDAO();
        golDao = new GolDAO();
        jogadorDao = new JogadorDAO();
        jogoDao = new JogoDAO();
        selecaoDao = new SelecaoDAO();
        substituicaoDao = new SubstituicaoDAO();
    }

    /**
     *
     * @param nome
     * @param continente
     * @return
     */
    public Pais cadastrarPais(String nome, String continente) {
        Pais p = new Pais(nome, continente);
        paisDao.adicionar(p);
        return p;
    }

    /**
     *
     * @param ano
     * @param sede
     * @return
     */
    public Copa cadastrarCopa(Date ano, Pais sede) {
        Copa c = new Copa();
        c.setAno(ano);
        c.setPais(sede);
        copaDao.adicionar(c);
        return c;
    }

    /**
     *
     * @return
     */
    public List<Pais> listarPaises() {
        return paisDao.listar();
    }

    /**
     *
     * @return
     */
    public List<Copa> listarCopas() {
        return copaDao.listar();
    }

    /**
     *
     * @param copa
     * @return
     */
    public List<Selecao> listarPaisesCopa(Copa copa) {
        List<Selecao> resultado = null;
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();

            Query consulta = sessao.createQuery("from Selecao where copa=:parametro");
            consulta.setEntity("parametro", copa);
            transacao = sessao.beginTransaction();
            resultado = (List<Selecao>) consulta.list();
            transacao.commit();
            return resultado;
        } catch (HibernateException e) {
            System.err.println("Nao foi possivel listar os objetos. Erro: " + e.getMessage());
            throw new HibernateException(e);
        } finally {
            try {
                sessao.close();
            } catch (HibernateException e) {
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

            Query consulta = sessao.createQuery("from Jogo where copa =:parametro");
            consulta.setEntity("parametro", copa);
            transacao = sessao.beginTransaction();
            resultado = (List<Jogo>) consulta.list();
            
            Selecao sele;
            for (Jogo j : resultado) {
                consulta = sessao.createQuery("from Selecao where id = :p");
                consulta.setInteger("p", j.getSelecaoBySelecaoA().getId());
                sele = (Selecao) consulta.uniqueResult();
                j.setSelecaoBySelecaoA(sele);
            }
            for (Jogo j : resultado) {
                consulta = sessao.createQuery("from Selecao where id = :p");
                consulta.setInteger("p", j.getSelecaoBySelecaoB().getId());
                sele = (Selecao) consulta.uniqueResult();
                j.setSelecaoBySelecaoB(sele);
            }

            transacao.commit();
            return resultado;
        } catch (HibernateException e) {
            System.err.println("Nao foi possivel listar os objetos. Erro: " + e.getMessage());
            throw new HibernateException(e);
        } finally {
            try {
                sessao.close();
            } catch (HibernateException e) {
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

        int resultado = 0;
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();
            String hql = "select count(s.pais) from Selecao s, Jogo j where (j.selecaoBySelecaoA = s or j.selecaoBySelecaoB = s) and s.pais = :p";
            Query consulta = sessao.createQuery(hql);
            consulta.setEntity("p", pais);
            transacao = sessao.beginTransaction();
            resultado = Integer.parseInt(""+consulta.uniqueResult());
            transacao.commit();
            return resultado;
        } catch (HibernateException e) {
            System.err.println("Nao foi possivel listar os objetos. Erro: " + e.getMessage());
            throw new HibernateException(e);
        } finally {
            try {
                sessao.close();
            } catch (HibernateException e) {
                System.err.println("Erro ao fechar operacao de listagem. Mensagem: " + e.getMessage());
            }
        }
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
        Jogador j = new Jogador(dataNascimento, nome, numero, posicao);
        jogadorDao.adicionar(j);
        return j;
    }

    /**
     *
     * @param nome
     * @param dataNascimento
     * @return
     */
    public Tecnico cadastrarTecnico(String nome, Date dataNascimento) {
        Tecnico t = new Tecnico(nome, dataNascimento);
        tecnicoDao.adicionar(t);
        return t;
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
        Selecao s = new Selecao(grupo, ano, posicao);
        s.setPais(pais);
        selecaoDao.adicionar(s);
        return s;
    }

    /**
     *
     * @param j
     * @param s
     * @return
     */
    public Escalacao cadastrarEscalacao(Jogo j, Selecao s, Jogador jo) {
        Escalacao e = new Escalacao();
        e.setJogo(j);
        e.setSelecao(s);
        e.setJogador(jo);
        escalacaoDao.adicionar(e);
        return e;

    }

    /**
     *
     * @param j
     * @param tempo
     * @param foiContra
     * @param jogador
     * @param s
     * @return
     */
    public Gol cadastrarGol(Jogo j, Time tempo, boolean foiContra, Jogador jogador, Selecao s) {
        Gol g = new Gol(jogador, s, j, tempo, foiContra);
        golDao.adicionar(g);
        return g;
    }

    /**
     *
     * @param t
     * @param entrou
     * @param saiu
     * @param j
     * @return
     */
    public Substituicao cadastrarSubstituicao(Time t, Jogador entrou, Jogador saiu, Jogo j, Selecao selecao) {
        Substituicao s = new Substituicao(t);
        s.setJogadorByJogadorEntra(entrou);
        s.setJogadorByJogadorSai(saiu);
        s.setJogo(j);
        s.setSelecao(selecao);
        substituicaoDao.adicionar(s);

        return s;
    }

    /**
     *
     * @return
     */
    public List<Jogador> listarJogadores() {
        return jogadorDao.listar();
    }

    /**
     *
     * @return
     */
    public List<Tecnico> listarTecnicos() {
        return tecnicoDao.listar();
    }

    /**
     *
     * @return
     */
    public List<Selecao> listarSelecoes() {
        return selecaoDao.listar();
    }

    /**
     *
     * @param selecao
     * @return
     */
    public List<Jogador> listarJogadoresDaSelecao(Selecao selecao) {
        List<Jogador> resultado = null;
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();

            Query consulta = sessao.createQuery("from Jogador where selecao=:parametro");
            consulta.setEntity("parametro", selecao);
            transacao = sessao.beginTransaction();
            resultado = (List<Jogador>) consulta.list();
            transacao.commit();
            return resultado;
        } catch (HibernateException e) {
            System.err.println("Nao foi possivel listar os objetos. Erro: " + e.getMessage());
            throw new HibernateException(e);
        } finally {
            try {
                sessao.close();
            } catch (HibernateException e) {
                System.err.println("Erro ao fechar operacao de listagem. Mensagem: " + e.getMessage());
            }
        }

    }

    /**
     *
     * @param s
     * @return
     */
    public Tecnico consultarTecnicoSelecao(Selecao s) {
        Tecnico resultado = null;
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();

            Query consulta = sessao.createQuery("from Tecnico where id=:parametro");
            consulta.setInteger("parametro", s.getTecnico().getId());
            transacao = sessao.beginTransaction();
            resultado = (Tecnico) consulta.uniqueResult();
            transacao.commit();
            return resultado;
        } catch (HibernateException e) {
            System.err.println("Nao foi possivel consultar o objeto. Erro: " + e.getMessage());
            throw new HibernateException(e);
        } finally {
            try {
                sessao.close();
            } catch (HibernateException e) {
                System.err.println("Erro ao fechar operacao de consulta. Mensagem: " + e.getMessage());
            }
        }

    }

    /**
     *
     * @param j
     * @return
     */
    public Jogo consultarPlacarJogo(Jogo j) {//Esse
    
        Jogo resultado;
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();

            Query consulta = sessao.createQuery("from Jogo where id = :p");
            consulta.setEntity("p", j);
            transacao = sessao.beginTransaction();
            resultado = (Jogo) consulta.uniqueResult();

            Selecao sele;
            
            consulta = sessao.createQuery("from Selecao where id = :p");
            consulta.setInteger("p", j.getSelecaoBySelecaoA().getId());
            sele = (Selecao) consulta.uniqueResult();
            j.setSelecaoBySelecaoA(sele);

            consulta = sessao.createQuery("from Selecao where id = :p");
            consulta.setInteger("p", j.getSelecaoBySelecaoB().getId());
            sele = (Selecao) consulta.uniqueResult();
            j.setSelecaoBySelecaoB(sele);
            

            transacao.commit();
            return resultado;
        } catch (HibernateException e) {
            System.err.println("Nao foi possivel listar os objetos. Erro: " + e.getMessage());
            throw new HibernateException(e);
        } finally {
            try {
                sessao.close();
            } catch (HibernateException e) {
                System.err.println("Erro ao fechar operacao de listagem. Mensagem: " + e.getMessage());
            }
        }
    }

    /**
     *
     * @param s
     * @return
     */
    public List<Jogador> consultarEscalacaoSelecao(Selecao s, Jogo j) {
        List<Escalacao> resulParcial = null;
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();

            Query consulta = sessao.createQuery("from Escalacao where selecao = :p1 and jogo = :p2");
            consulta.setEntity("p1", s);
            consulta.setEntity("p2", j);
            transacao = sessao.beginTransaction();
            resulParcial = (List<Escalacao>) consulta.list();
            
            List<Jogador> resultado = new ArrayList<>();
            Jogador jog;
            for (Escalacao esc : resulParcial) {

                consulta = sessao.createQuery("from Jogador where id = :p");
                consulta.setInteger("p", esc.getJogador().getId());
                jog = (Jogador) consulta.uniqueResult(); 
                resultado.add(jog);
             }

            transacao.commit();
            return resultado;
        } catch (HibernateException e) {
            System.err.println("Nao foi possivel consultar o objeto. Erro: " + e.getMessage());
            throw new HibernateException(e);
        } finally {
            try {
                sessao.close();
            } catch (HibernateException e) {
                System.err.println("Erro ao fechar operacao de consulta. Mensagem: " + e.getMessage());
            }
        }
    }

    /**
     *
     * @param j
     * @return
     */
    public List<Substituicao> listaSubstituicoesJogo(Jogo j) {
        List<Substituicao> resultado = null;
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();

            Query consulta = sessao.createQuery("select Substituicao where jogo=:parametro");
            consulta.setEntity("parametro", j);
            transacao = sessao.beginTransaction();
            resultado = (List<Substituicao>) consulta.list();
            transacao.commit();
            return resultado;
        } catch (HibernateException e) {
            System.err.println("Nao foi possivel consultar o objeto. Erro: " + e.getMessage());
            throw new HibernateException(e);
        } finally {
            try {
                sessao.close();
            } catch (HibernateException e) {
                System.err.println("Erro ao fechar operacao de consulta. Mensagem: " + e.getMessage());
            }
        }
    }

    /**
     *
     * @param j
     * @return
     */
    public List<Gol> listaGolsDaPartida(Jogo j) {//Esse
        List<Gol> resultado = null;
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();

            Query consulta = sessao.createQuery("from Gol where jogo = :j");
            consulta.setEntity("j", j);
            transacao = sessao.beginTransaction();
            resultado = (List<Gol>) consulta.list();

            Selecao sele;
            Jogador joga;
            for (Gol goll : resultado) {
                consulta = sessao.createQuery("from Selecao where id = :parametro");
                consulta.setInteger("parametro", goll.getSelecao().getId());
                sele = (Selecao) consulta.uniqueResult();
                goll.setSelecao(sele);
            }
            for (Gol goll : resultado) {
                consulta = sessao.createQuery("from Jogador where id=:parametro");
                consulta.setInteger("parametro", goll.getJogador().getId());
                joga = (Jogador) consulta.uniqueResult();
                goll.setJogador(joga);
            }

            transacao.commit();
            return resultado;
        } catch (HibernateException e) {
            System.err.println("Nao foi possivel consultar o objeto. Erro: " + e.getMessage());
            throw new HibernateException(e);
        } finally {
            try {
                sessao.close();
            } catch (HibernateException e) {
                System.err.println("Erro ao fechar operacao de consulta. Mensagem: " + e.getMessage());
            }
        }
    }

    /**
     *
     * @param j
     * @param c
     * @return
     */
    public String consultarCaracteristicasJogador(Jogador j, Copa c) {
        String resultado = null;
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();
            Query consulta = sessao.createQuery("from Jogador where Id=:parametro");
            consulta.setInteger("parametro", j.getId());
            transacao = sessao.beginTransaction();
            resultado = ((Jogador) consulta.uniqueResult()).toString();
            transacao.commit();
            return resultado;
        } catch (HibernateException e) {
            System.err.println("Nao foi possivel consultar o objeto. Erro: " + e.getMessage());
            throw new HibernateException(e);
        } finally {
            try {
                sessao.close();
            } catch (HibernateException e) {
                System.err.println("Erro ao fechar operacao de consulta. Mensagem: " + e.getMessage());
            }
        }
    }

    /**
     *
     * @param c
     * @return
     */
    public double[] consultarQuantidadeEMediaDeGols(Copa c) {
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();

            Query consulta = sessao.createQuery("from Jogo where copa =:parametro");
            consulta.setEntity("parametro", c);
            transacao = sessao.beginTransaction();
            
            List<Jogo> jogos = (List<Jogo>) consulta.list();
            int gols = 0, nJogos = jogos.size();
            
            for(Jogo j: jogos){
                gols = gols + j.getGolA() + j.getGolB();
            }
            
            transacao.commit();
            return new double[] {gols, gols/nJogos};  
        } catch (HibernateException e) {
            System.err.println("Nao foi possivel listar os objetos. Erro: " + e.getMessage());
            throw new HibernateException(e);
        } finally {
            try {
                sessao.close();
            } catch (HibernateException e) {
                System.err.println("Erro ao fechar operacao de listagem. Mensagem: " + e.getMessage());
            }
        }
    }

    /**
     *
     * @return
     */
    public List<Jogo> consultarMaioresGoleadas() {//Esse
        List<Jogo> resultado = new ArrayList<>();
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();

            Query consulta = sessao.createQuery("from Jogo");
            transacao = sessao.beginTransaction();
            
            List<Jogo> jogos = (List<Jogo>) consulta.list();
            int goleada = 0, temp = 0;
            
            for(Jogo j: jogos){
                temp = Math.abs(j.getGolA() - j.getGolB());
                if(temp > goleada) {
                   goleada = temp;
                }
            }
            for(Jogo j: jogos){
                if(Math.abs(j.getGolA() - j.getGolB()) == goleada){
                    resultado.add(j);
                }
                
            }
            transacao.commit();
            return resultado;
        } catch (HibernateException e) {
            System.err.println("Nao foi possivel listar os objetos. Erro: " + e.getMessage());
            throw new HibernateException(e);
        } finally {
            try {
                sessao.close();
            } catch (HibernateException e) {
                System.err.println("Erro ao fechar operacao de listagem. Mensagem: " + e.getMessage());
            }
        }
    }

    /**
     *
     * @param c
     * @return
     */
    public List<Jogo> listarJogosEmpatados(Copa c) {

        List<Jogo> resultado;
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();

            Query consulta = sessao.createQuery("from Jogo where copa =:parametro");
            consulta.setEntity("parametro", c);
            transacao = sessao.beginTransaction();
            resultado = (List<Jogo>) consulta.list();

            List<Jogo> jogosEmpatados = new ArrayList<Jogo>();
            for (Jogo jogo1 : resultado) {
                if (jogo1.getGolA() == jogo1.getGolB()) {
                    jogosEmpatados.add(jogo1);
                }
            }
            Selecao sele;
            for (Jogo j : jogosEmpatados) {
                consulta = sessao.createQuery("from Selecao where id = :p");
                consulta.setInteger("p", j.getSelecaoBySelecaoA().getId());
                sele = (Selecao) consulta.uniqueResult();
                j.setSelecaoBySelecaoA(sele);
            }
            for (Jogo j : jogosEmpatados) {
                consulta = sessao.createQuery("from Selecao where id = :p");
                consulta.setInteger("p", j.getSelecaoBySelecaoB().getId());
                sele = (Selecao) consulta.uniqueResult();
                j.setSelecaoBySelecaoB(sele);
            }

            transacao.commit();
            return jogosEmpatados;
        } catch (HibernateException e) {
            System.err.println("Nao foi possivel listar os objetos. Erro: " + e.getMessage());
            throw new HibernateException(e);
        } finally {
            try {
                sessao.close();
            } catch (HibernateException e) {
                System.err.println("Erro ao fechar operacao de listagem. Mensagem: " + e.getMessage());
            }
        }
    }

    /**
     *
     * @return
     */
    public List<Jogo> listarVitoriasIncontestaveis() {
         List<Jogo> resParcial = null;
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();

            Query consulta = sessao.createQuery("from Jogo");
            transacao = sessao.beginTransaction();
            resParcial = (List<Jogo>) consulta.list();

            List<Jogo> lavada = new ArrayList<>();
            for (Jogo jogo1 : resParcial) {
                if (abs(jogo1.getGolA() - jogo1.getGolB()) >= 3) {
                    lavada.add(jogo1);
                }
            }
            Selecao sele;
            for (Jogo j : lavada) {
                consulta = sessao.createQuery("from Selecao where id = :p");
                consulta.setInteger("p", j.getSelecaoBySelecaoA().getId());
                sele = (Selecao) consulta.uniqueResult();
                j.setSelecaoBySelecaoA(sele);
            }
            for (Jogo j : lavada) {
                consulta = sessao.createQuery("from Selecao where id = :p");
                consulta.setInteger("p", j.getSelecaoBySelecaoB().getId());
                sele = (Selecao) consulta.uniqueResult();
                j.setSelecaoBySelecaoB(sele);
            }

            transacao.commit();
            return lavada;
        } catch (HibernateException e) {
            System.err.println("Nao foi possivel listar os objetos. Erro: " + e.getMessage());
            throw new HibernateException(e);
        } finally {
            try {
                sessao.close();
            } catch (HibernateException e) {
                System.err.println("Erro ao fechar operacao de listagem. Mensagem: " + e.getMessage());
            }
        }
        
    }

    /**
     *
     * @param c
     * @return
     */
    public List<Selecao> consutarOrdemClassificacao(Copa c) {
    List<Selecao> res = null;
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();

            Query consulta = sessao.createQuery("from Selecao s where s.copa=:p order by s.posicao asc");
            consulta.setEntity("p", c);
            transacao = sessao.beginTransaction();
            res = (List<Selecao>) consulta.list();

            transacao.commit();
            return res;
        } catch (HibernateException e) {
            System.err.println("Nao foi possivel listar os objetos. Erro: " + e.getMessage());
            throw new HibernateException(e);
        } finally {
            try {
                sessao.close();
            } catch (HibernateException e) {
                System.err.println("Erro ao fechar operacao de listagem. Mensagem: " + e.getMessage());
            }
        }
    }

    /**
     *
     * @return
     */
    public List<Jogador> consultaArtilheiros() {
        
        List<Jogador> res = null;
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();

            String hql = "select g.jogador from Gol g group by g.jogador order by count(g.jogador) desc"; 
            Query consulta = sessao.createQuery(hql);
            
            transacao = sessao.beginTransaction();
            
            res = (List<Jogador>) consulta.list();
            return res;
        } catch (HibernateException e) {
            System.err.println("Nao foi possivel listar os objetos. Erro: " + e.getMessage());
            throw new HibernateException(e);
        } finally {
            try {
                sessao.close();
            } catch (HibernateException e) {
                System.err.println("Erro ao fechar operacao de listagem. Mensagem: " + e.getMessage());
            }
        }
    }

    /**
     *
     * @param c
     * @return
     */
    public double consultaMediaIdadeSelecoes(Copa c) {
      
        double res = 0;
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();

            Query consulta = sessao.createQuery("select s.ano from Selecao s, Copa c where s.copa = c and c = :p");
            consulta.setEntity("p", c);
            transacao = sessao.beginTransaction();
            List<Date> data = (List<Date>) consulta.list();
            transacao.commit();
            
            Date auxD = Calendar.getInstance().getTime();
            int auxAno = auxD.getYear(); // -1900
            for(Date d : data){
                res += d.getYear();
            }
            
            res = res / data.size();
           
            return res;
        } catch (HibernateException e) {
            System.err.println("Nao foi possivel listar os objetos. Erro: " + e.getMessage());
            throw new HibernateException(e);
        } finally {
            try {
                sessao.close();
            } catch (HibernateException e) {
                System.err.println("Erro ao fechar operacao de listagem. Mensagem: " + e.getMessage());
            }
        }
    }

    /**
     *
     * @return
     */
    public List<Jogo> listaTodasFinais() {

        List<Jogo> resultado = new ArrayList<>();
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();

            Query consulta = sessao.createQuery("from Jogo where fase = 'Final'");
            transacao = sessao.beginTransaction();
            List<Jogo> jogos = (List<Jogo>) consulta.list();

            Selecao sele;
            for (Jogo jg : jogos) {
                consulta = sessao.createQuery("from Selecao where id = :parametro");
                consulta.setInteger("parametro", jg.getSelecaoBySelecaoA().getId());
                sele = (Selecao) consulta.uniqueResult();
                jg.setSelecaoBySelecaoA(sele);
            }
            for (Jogo jg : jogos) {
                consulta = sessao.createQuery("from Selecao where id = :parametro");
                consulta.setInteger("parametro", jg.getSelecaoBySelecaoB().getId());
                sele = (Selecao) consulta.uniqueResult();
                jg.setSelecaoBySelecaoB(sele);
            }

            for (Jogo jg : jogos) {
                resultado.add(jg);
            }

            transacao.commit();
            return resultado;
        } catch (HibernateException e) {
            System.err.println("Nao foi possivel consultar o objeto. Erro: " + e.getMessage());
            throw new HibernateException(e);
        } finally {
            try {
                sessao.close();
            } catch (HibernateException e) {
                System.err.println("Erro ao fechar operacao de consulta. Mensagem: " + e.getMessage());
            }
        }
    }

    /**
     *
     * @return
     */
    public List<Tecnico> listaTecnicosCampeoes() {
   List<Tecnico> res = null;
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();

            Query consulta = sessao.createQuery("select t from Selecao  s, Tecnico t where s.tecnico=t AND s.posicao = 1");
            transacao = sessao.beginTransaction();
            res = (List<Tecnico>) consulta.list();
            transacao.commit();
            return res;
        } catch (HibernateException e) {
            System.err.println("Nao foi possivel listar os objetos. Erro: " + e.getMessage());
            throw new HibernateException(e);
        } finally {
            try {
                sessao.close();
            } catch (HibernateException e) {
                System.err.println("Erro ao fechar operacao de listagem. Mensagem: " + e.getMessage());
            }
        }
    }

    /**
     *
     * @return
     */
    public List<Gol> listaGolsContra() {//Esse
        List<Gol> resultado = null;
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();

            Query consulta = sessao.createQuery("from Gol gol where gol.foiContra = :parametro");
            consulta.setBoolean("parametro", true);
            transacao = sessao.beginTransaction();

            resultado = (List<Gol>) consulta.list();
            transacao.commit();
            return resultado;
            
        } catch (HibernateException e) {
            System.err.println("Nao foi possivel consultar o objeto. Erro: " + e.getMessage());
            throw new HibernateException(e);
        } finally {
            try {
                sessao.close();
            } catch (HibernateException e) {
                System.err.println("Erro ao fechar operacao de consulta. Mensagem: " + e.getMessage());
            }
        }
    }

    /**
     *
     * @return
     */
    public List<Copa> listaCopasComPaisSedeCampeao() {
     
        List<Copa> res = null;
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();

            String hql = "select s.copa from Selecao s, Copa c where (c.pais = s.pais AND s.posicao = 1)";
            Query consulta = sessao.createQuery(hql);
            transacao = sessao.beginTransaction();
            res = (List<Copa>) consulta.list();
            return res;
        } catch (HibernateException e) {
            System.err.println("Nao foi possivel listar os objetos. Erro: " + e.getMessage());
            throw new HibernateException(e);
        } finally {
            try {
                sessao.close();
            } catch (HibernateException e) {
                System.err.println("Erro ao fechar operacao de listagem. Mensagem: " + e.getMessage());
            }
        }
    }

    /**
     *
     * @return
     */
    public List<Pais> listaDecrescenteDePaisesComMaisTitulos() {

        List<Pais> resultado = null;
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();

            Query consulta = sessao.createQuery("from Selecao where posicao = 1 group by pais order by count(pais) desc");
            transacao = sessao.beginTransaction();

            List<Selecao> selecoes = (List<Selecao>) consulta.list();
            resultado = new ArrayList<>();
            Pais pis;
            for (Selecao sele : selecoes) {
                consulta = sessao.createQuery("from Pais where id = :p");
                consulta.setInteger("p", sele.getPais().getId());
                pis = (Pais) consulta.uniqueResult(); // model.pojo.Pais_$$_javassist_5
                resultado.add(pis);
             }

            transacao.commit();
            return resultado;
        } catch (HibernateException e) {
            System.err.println("Nao foi possivel consultar o objeto. Erro: " + e.getMessage());
            throw new HibernateException(e);
        } finally {
            try {
                sessao.close();
            } catch (HibernateException e) {
                System.err.println("Erro ao fechar operacao de consulta. Mensagem: " + e.getMessage());
            }
        }
    }

    /**
     *
     * @param p
     * @return
     */
    public long quatidadeDeParticipacoesEmCopas(Pais p) {
    long res = 0;
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();

            Query consulta = sessao.createQuery("select count(pais) from Selecao s, Pais pais where s.pais = pais AND pais=:parametro");
            consulta.setEntity("parametro", p);
            transacao = sessao.beginTransaction();
            res = (long) consulta.uniqueResult();
            System.out.println(res);
            return res;
        } catch (HibernateException e) {
            System.err.println("Nao foi possivel listar os objetos. Erro: " + e.getMessage());
            throw new HibernateException(e);
        } finally {
            try {
                sessao.close();
            } catch (HibernateException e) {
                System.err.println("Erro ao fechar operacao de listagem. Mensagem: " + e.getMessage());
            }
        }
    }

    /**
     *
     * @return
     */
    public List<Pais> listarPaisesComMaisParticipacoes() {//Esse
        List<Pais> resultado = null;
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();
            
            
            Query consulta = sessao.createQuery("select sel.pais from Selecao sel"
                                            + " group by sel.pais"
                                            + " order by count(sel.pais) desc AND"
            );
            transacao = sessao.beginTransaction();
             List<Pais> paises = (List<Pais>) consulta.list();
             resultado = new ArrayList<>();
            for(int i = 0; i < 10 && i < paises.size(); i++){
                resultado.add(paises.get(i));
            }
            
            return resultado;
        } catch (HibernateException e) {
            System.err.println("Nao foi possivel consultar o objeto. Erro: " + e.getMessage());
            throw new HibernateException(e);
        } finally {
            try {
                sessao.close();
            } catch (HibernateException e) {
                System.err.println("Erro ao fechar operacao de consulta. Mensagem: " + e.getMessage());
            }
        }
    }

    /**
     *
     * @return
     */
    public List<Pais> listarPaisesComMaiorNumeroDeViceCampeonatos() {
      List<Pais> resultado = null;
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();

            Query consulta = sessao.createQuery("select s.pais from Selecao s where s.posicao = 2 group by s.pais order by count(s.pais) desc");
            transacao = sessao.beginTransaction();
            resultado = (List<Pais>) consulta.list();
            transacao.commit();
            return resultado;
        } catch (HibernateException e) {
            System.err.println("Nao foi possivel consultar o objeto. Erro: " + e.getMessage());
            throw new HibernateException(e);
        } finally {
            try {
                sessao.close();
            } catch (HibernateException e) {
                System.err.println("Erro ao fechar operacao de consulta. Mensagem: " + e.getMessage());
            }
        } 
    }

    /**
     *
     * @return
     */
    public List<Pais> listarPaisesComMaiorPercentualDeDerrotas() {

        List<Pais> resultado = null;
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();
// "select s.pais from Jogo j, Selecao s where (j.selecaoBySelecaoA = s or j.selecaoBySelecaoB = s) group by s.pais order by count( case when (j.golA > j.golB and j.selecaoBySelecaoB = s) or (j.golA < j.golB and j.selecaoBySelecaoA = s) then s.pais else NULL end)) ) desc";
            String hql = "select s.pais from Jogo j, Selecao s where ( (j.selecaoBySelecaoA = s or j.selecaoBySelecaoB = s) and (j.golA > j.golB and j.selecaoBySelecaoB = s) or (j.golA < j.golB and j.selecaoBySelecaoA = s) ) group by s.pais order by count(s.pais) desc";
            Query consulta = sessao.createQuery(hql);
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
            } catch (HibernateException e) {
                System.err.println("Erro ao fechar operacao de listagem. Mensagem: " + e.getMessage());
            }
        }
    }

    /**
     *
     * @param j
     * @return
     */
    public List<Jogador> listarJogadoresComMaiorNumeroDeGolPorPartida(Jogo j) {
        
        List<Jogador> res = null;
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();

            String hql = "select g.jogador from Gol g where g.jogo = :p group by g.jogador order by count(g.jogador) desc"; 
            Query consulta = sessao.createQuery(hql);
            consulta.setEntity("p", j);
            
            transacao = sessao.beginTransaction();
            
            res = (List<Jogador>) consulta.list();
            return res;
        } catch (HibernateException e) {
            System.err.println("Nao foi possivel listar os objetos. Erro: " + e.getMessage());
            throw new HibernateException(e);
        } finally {
            try {
                sessao.close();
            } catch (HibernateException e) {
                System.err.println("Erro ao fechar operacao de listagem. Mensagem: " + e.getMessage());
            }
        }
    }

    /**
     *
     * @return
     */
    public List<Jogador> listarJogadorComMaiorMediaDeGolPorPartidaNasCopas() {//esse
        
        List<Jogador> res = null;
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();

            String hql = "select g.jogador from Gol g group by g.jogador order by count(g.jogador) desc"; 
            Query consulta = sessao.createQuery(hql);
            
            
            
            transacao = sessao.beginTransaction();
            
            res = (List<Jogador>) consulta.list();
            return res;
        } catch (HibernateException e) {
            System.err.println("Nao foi possivel listar os objetos. Erro: " + e.getMessage());
            throw new HibernateException(e);
        } finally {
            try {
                sessao.close();
            } catch (HibernateException e) {
                System.err.println("Erro ao fechar operacao de listagem. Mensagem: " + e.getMessage());
            }
        }
    }

    /**
     *
     * @return
     */
    public List<Jogador> listarJogadorComMaiorQuantidadeDeJogosEmCopas() {
   
        // Ajeitar isso pra unir com COPA
        List<Jogador> res = null;
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();

            String hql = "select g.jogador from Gol g group by g.jogador order by count(g.jogador) desc"; 
            Query consulta = sessao.createQuery(hql);
            
            transacao = sessao.beginTransaction();
            
            res = (List<Jogador>) consulta.list();
            return res;
        } catch (HibernateException e) {
            System.err.println("Nao foi possivel listar os objetos. Erro: " + e.getMessage());
            throw new HibernateException(e);
        } finally {
            try {
                sessao.close();
            } catch (HibernateException e) {
                System.err.println("Erro ao fechar operacao de listagem. Mensagem: " + e.getMessage());
            }
        }
    }

    /**
     *
     * @return
     */
    public Gol consultarGolMaisRapidoNasCopas() {
        Gol resultado = null;
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();

            Query consulta = sessao.createQuery("from Gol order by tempo asc");
            transacao = sessao.beginTransaction();
            resultado = ((List<Gol>) consulta.list()).get(0);

            Selecao sele;
            Jogador joga;
            consulta = sessao.createQuery("from Selecao where id = :parametro");
            consulta.setInteger("parametro", resultado.getSelecao().getId());
            sele = (Selecao) consulta.uniqueResult();
            resultado.setSelecao(sele);

            consulta = sessao.createQuery("from Jogador where id=:parametro");
            consulta.setInteger("parametro", resultado.getJogador().getId());
            joga = (Jogador) consulta.uniqueResult();
            resultado.setJogador(joga);

            transacao.commit();
            return resultado;
        } catch (HibernateException e) {
            System.err.println("Nao foi possivel consultar o objeto. Erro: " + e.getMessage());
            throw new HibernateException(e);
        } finally {
            try {
                sessao.close();
            } catch (HibernateException e) {
                System.err.println("Erro ao fechar operacao de consulta. Mensagem: " + e.getMessage());
            }
        }
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
    public List<Jogador> listarJogadoresReservaQueFizeramGols() {//esse
        List<Jogador> resultado = null;
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();

            Query consulta = sessao.createQuery("select gol.jogador from Gol gol, Substituicao sub"
                    + " where gol.jogador = sub.jogadorByJogadorEntra");
            
            transacao = sessao.beginTransaction();
            
            resultado = (List<Jogador>) consulta.list();
            
            transacao.commit();
            return resultado;
        } catch (HibernateException e) {
            System.err.println("Nao foi possivel consultar o objeto. Erro: " + e.getMessage());
            throw new HibernateException(e);
        } finally {
            try {
                sessao.close();
            } catch (HibernateException e) {
                System.err.println("Erro ao fechar operacao de consulta. Mensagem: " + e.getMessage());
            }
        }
    }

    /**
     *
     * @return
     */
    public List<Pais> listarPaisesQueMaisParticiparamDeFinais() {
        List<Pais> resultado = null;
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();

            Query consulta = sessao.createQuery("select s.pais from Selecao s, Jogo j where "
                    + "(j.selecaoBySelecaoA = s OR j.selecaoBySelecaoB = s) AND j.fase = 'Final'"
                    + " group by s.pais order by (count (s.pais)) desc");
            
            transacao = sessao.beginTransaction();
            resultado = (List<Pais>) consulta.list();
            for(Pais p: resultado){
                System.out.println(p.getNome());
            }
            transacao.commit();
            return resultado;
        } catch (HibernateException e) {
            System.err.println("Nao foi possivel consultar o objeto. Erro: " + e.getMessage());
            throw new HibernateException(e);
        } finally {
            try {
                sessao.close();
            } catch (HibernateException e) {
                System.err.println("Erro ao fechar operacao de consulta. Mensagem: " + e.getMessage());
            }
        }
    }

    /**
     *
     * @return
     */
    public List<Pais> listarPaisesComMaisEliminacoesPrimeiraFase() {
        
        List<Pais> resultado;
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();

            String hql = "from Selecao where posicao between 16 and 32 group by pais order by count(pais) desc";
            Query consulta = sessao.createQuery(hql);
            transacao = sessao.beginTransaction();

            List<Selecao> selecoes = (List<Selecao>) consulta.list();
            resultado = new ArrayList<>();
            Pais pis;
            for (Selecao sele : selecoes) {
                consulta = sessao.createQuery("from Pais where id = :p");
                consulta.setInteger("p", sele.getPais().getId());
                pis = (Pais) consulta.uniqueResult(); 
                resultado.add(pis);
             }

            transacao.commit();
            return resultado;
        } catch (HibernateException e) {
            System.err.println("Nao foi possivel consultar o objeto. Erro: " + e.getMessage());
            throw new HibernateException(e);
        } finally {
            try {
                sessao.close();
            } catch (HibernateException e) {
                System.err.println("Erro ao fechar operacao de consulta. Mensagem: " + e.getMessage());
            }
        }
    }

    /**
     *
     * @return
     */
    public List<Pais> listarPaisesQuePerderamPartidaEGanharamACopa() {//esse
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();

            String hql = "select s.pais from Jogo j, "
                    + "Selecao s where ((j.selecaoBySelecaoA = s and j.golA < j.golB) or"
                    + " (j.selecaoBySelecaoB = s and j.golB < j.golA)) and "
                    + " s.posicao = 1 group by s.pais";
            Query consulta = sessao.createQuery(hql);
            transacao = sessao.beginTransaction();

            List<Pais> paises = (List<Pais>) consulta.list();
                        
            transacao.commit();
            return paises;
        } catch (HibernateException e) {
            System.err.println("Nao foi possivel consultar o objeto. Erro: " + e.getMessage());
            throw new HibernateException(e);
        } finally {
            try {
                sessao.close();
            } catch (HibernateException e) {
                System.err.println("Erro ao fechar operacao de consulta. Mensagem: " + e.getMessage());
            }
        }

    }

    public Jogo cadastrarJogo(Date data, String local, Copa copa, Selecao primeira, Selecao segunda, String fase, Integer golA, Integer golB) {
        Jogo j = new Jogo(data, local, fase);
        j.setCopa(copa);
        j.setSelecaoBySelecaoA(primeira);
        j.setSelecaoBySelecaoB(segunda);
        j.setGolA(golA);
        j.setGolB(golB);
        jogoDao.adicionar(j);
        return j;
    }

   public List<Escalacao> listarEscalacoes() {
        return escalacaoDao.listar();
    }

    public List<Gol> listaGols() {
        return golDao.listar();
    }

    public List<Substituicao> listarSubstituicoes(Jogo j) {
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();

            Query consulta = sessao.createQuery("from Substituicao where jogo =:parametro");
            consulta.setEntity("parametro", j);
            transacao = sessao.beginTransaction();
            
            List<Substituicao> subs = (List<Substituicao>) consulta.list();
            
            transacao.commit();
            return subs;
        } catch (HibernateException e) {
            System.err.println("Nao foi possivel listar os objetos. Erro: " + e.getMessage());
            throw new HibernateException(e);
        } finally {
            try {
                sessao.close();
            } catch (HibernateException e) {
                System.err.println("Erro ao fechar operacao de listagem. Mensagem: " + e.getMessage());
            }
        }
    }

    public List<Jogo> listarJogos() {
        return jogoDao.listar();
    }

    
    // GETTERS E SETTERS
    public PaisDAO getPaisDao() {
        return paisDao;
    }

    public void setPaisDao(PaisDAO paisDao) {
        this.paisDao = paisDao;
    }

    public CopaDAO getCopaDao() {
        return copaDao;
    }

    public void setCopaDao(CopaDAO copaDao) {
        this.copaDao = copaDao;
    }

    public TecnicoDAO getTecnicoDao() {
        return tecnicoDao;
    }

    public void setTecnicoDao(TecnicoDAO tecnicoDao) {
        this.tecnicoDao = tecnicoDao;
    }

    public EscalacaoDAO getEscalacaoDao() {
        return escalacaoDao;
    }

    public void setEscalacaoDao(EscalacaoDAO escalacao) {
        this.escalacaoDao = escalacao;
    }

    public GolDAO getGolDao() {
        return golDao;
    }

    public void setGolDao(GolDAO gol) {
        this.golDao = gol;
    }

    public JogadorDAO getJogadorDao() {
        return jogadorDao;
    }

    public void setJogadorDao(JogadorDAO jogadorDao) {
        this.jogadorDao = jogadorDao;
    }

    public JogoDAO getJogoDao() {
        return jogoDao;
    }

    public void setJogoDao(JogoDAO jogoDao) {
        this.jogoDao = jogoDao;
    }

    public SelecaoDAO getSelecaoDao() {
        return selecaoDao;
    }

    public void setSelecaoDao(SelecaoDAO selecaoDao) {
        this.selecaoDao = selecaoDao;
    }

    public SubstituicaoDAO getSubstituicaoDao() {
        return substituicaoDao;
    }

    public void setSubstituicaoDao(SubstituicaoDAO substituicaoDao) {
        this.substituicaoDao = substituicaoDao;
    }
}
