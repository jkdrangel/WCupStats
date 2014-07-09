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
    TecnicoDAO tecnico = new TecnicoDAO();
    EscalacaoDAO escalacao = new EscalacaoDAO();
    GolDAO gol = new GolDAO();
    JogadorDAO jogador = new JogadorDAO();
    JogoDAO jogo = new JogoDAO();
    SelecaoDAO selecao = new SelecaoDAO();
    SubstituicaoDAO substituicao = new SubstituicaoDAO();
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
        Pais p = new Pais(nome, continente);
        pais.adicionar(p);
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
        List<Jogo> resultado = new ArrayList<>();
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();

            Query consulta = sessao.createQuery("from Selecao where copa=:parametro");
            consulta.setEntity("parametro", copa);
            transacao = sessao.beginTransaction();
            List<Selecao> s = (List<Selecao>) consulta.list();
            transacao.commit();
            for (Selecao se : s) {
                consulta = sessao.createQuery("from Jogo where selecaoBySelecaoA=:parametro OR selecaoBySelecaoB=:parametro");
                consulta.setEntity("parametro", se);
                transacao = sessao.beginTransaction();
                resultado.addAll((List<Jogo>) consulta.list());
                transacao.commit();
            }
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

            Query consulta = sessao.createQuery("select count(ID_PAIS) from Jogo join Selecao where (selecaoBySelecaoA = Selecao or selecaoBySelecaoB = Selecao) and ID_PAIS = :p");
            consulta.setEntity("p", pais);
            transacao = sessao.beginTransaction();
            resultado = (int) consulta.uniqueResult();
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
        jogador.adicionar(j);
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
        tecnico.adicionar(t);
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
        selecao.adicionar(s);
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
        escalacao.adicionar(e);
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
        gol.adicionar(g);
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
        substituicao.adicionar(s);

        return s;
    }

    /**
     *
     * @return
     */
    public List<Jogador> listarJogadores() {
        return jogador.listar();
    }

    /**
     *
     * @return
     */
    public List<Tecnico> listarTecnicos() {
        return tecnico.listar();
    }

    /**
     *
     * @return
     */
    public List<Selecao> listarSelecoes() {
        return selecao.listar();
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
    public String consultarPlacarJogo(Jogo j) {//Esse

        try {
            sessao = HibernateUtil.getSessionFactory().openSession();

            String r = "";
            Query consulta = sessao.createQuery("select count() from Gol where jogo=:parametro and selecao=:s");
            consulta.setEntity("parametro", j);
            consulta.setEntity("s", j.getSelecaoBySelecaoA());
            r = " " + consulta.uniqueResult() + " X ";
            consulta = sessao.createQuery("select count() from Gol where jogo=:parametro and selecao=:s");
            consulta.setEntity("parametro", j);
            consulta.setEntity("s", j.getSelecaoBySelecaoB());
            r = r + "" + consulta.uniqueResult();
            transacao = sessao.beginTransaction();
            transacao.commit();

            return r;
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
     * @param p
     * @return
     */
    public int consultarQuatidadeDeJogoPais(Pais p) {
        int resultado = 0;
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();

            Query consulta = sessao.createQuery("select count(*) from Jogo inner join Selecao where Selecao.pais=:parametro");
            consulta.setEntity("parametro", p);
            transacao = sessao.beginTransaction();
            resultado = (int) consulta.uniqueResult();
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
    public String consultarQuantidadeEMediaDeGols(Copa c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @return
     */
    public List<Jogo> consultarMaioresGoleadas() {//Esse
        throw new UnsupportedOperationException("Not supported yet.");

    }

    /**
     *
     * @param c
     * @return
     */
    public List<Jogo> listarJogosEmpatados(Copa c) {

        List<Jogo> resultado = null;
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @return
     */
    public List<String> consultaArtilheiros() {//Esse
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @return
     */
    public List<Gol> listaGolsContra() {//Esse
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
    public int quatidadeDeParticipacoesEmCopas(Pais p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @return
     */
    public List<Pais> listarPaisesComMaisParticipacoes() {//Esse
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
    public List<Jogador> listarJogadorComMaiorMediaDeGolPorPartidaNasCopas() {//esse
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
    public List<Jogador> listarJogadoresComMaiorNumeroDeJogosComoReserva() {//esse
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
    public List<Pais> listarPaisesQuePerderamPartidaEGanharamACopa() {//esse
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Jogo cadastrarJogo(Date data, String local, Copa copa, Selecao primeira, Selecao segunda, String fase, Integer golA, Integer golB) {
        Jogo j = new Jogo(data, local, fase);
        j.setCopa(copa);
        j.setSelecaoBySelecaoA(primeira);
        j.setSelecaoBySelecaoB(segunda);
        j.setGolA(golA);
        j.setGolB(golB);
        jogo.adicionar(j);
        return j;
    }

    public List<Escalacao> listarEscalacoes() {
        return escalacao.listar();
    }

    public List<Gol> listaGols() {
        return gol.listar();
    }

    public List<Substituicao> listarSubstituicoes() {
        return substituicao.listar();
    }

    public List<Jogo> listarJogos() {
        return jogo.listar();
    }

}
