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
import model.pojo.Jogo;
import model.pojo.Pais;
import model.pojo.Selecao;
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

    public Sistema() {
    }

    public Pais cadastrarPais(String nome, String continente) {
        Pais p = new Pais();
        p.setContinente(continente);
        p.setNome(nome);
        pais.adicionar(p);
        return p;
    }

    public Copa cadastrarCopa(Date ano, Pais sede, Selecao selecao) {
        Copa c = new Copa();
        c.setAno(ano);
        c.setPais(sede);
        c.setSelecao(selecao);
        copa.adicionar(c);
        return c;
    }

    public List<Pais> listarPaises() {
        return pais.listar();
    }

    public List<Copa> listarCopas() {
        return copa.listar();
    }

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
    
    
    public int qtdJogosPais(Pais pais) {
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
        return 0;
    }

    public void eMarmelada() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void eDoBrasil() {

    }

    public void toDentro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void arrozDeCopa() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void sempreVice() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void fregues() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void timeRuim() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void timeBom() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void invictos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void perdeuGanhou() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
