/*
 * Classe desenvolvida como componente integrante do projeto: Sistema
 * de estatisticas de Copas do Mundo (WCupStats), que trata-se de um
 * trabalho proposto pela disciplina de Padroes e Frameworks. Todo este
 * codigo foi desenvolvido pelos integrantes desta equipe: Diego Leite,
 * Lucas Santana, Oto Antonio e Lucas Vinicius.
 */

package model.CRUD;

import Util.HibernateUtil;
import java.util.List;
import model.pojo.Escalacao;
import model.pojo.Jogo;
import model.pojo.Selecao;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Classe que representa a EscalacaoDAO de uma Selecao durante um JogoDAO.
 * 
 * @author D.L.O.L
 * 
 * @version 1.0
 * 
 * @see JogoDAO
 * @see Jogadores
 */
public class EscalacaoDAO {

    Session sessao = null;
    Transaction transacao = null;

    public void adicionar(Escalacao escalacao) {
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();

            transacao = sessao.beginTransaction();
            sessao.save(escalacao);
            transacao.commit();
        } catch (HibernateException e) {
            System.err.println("Nao foi possivel inserir a escalacao. Erro: " + e.getMessage());
        } finally {
            try {
                sessao.close();
            } catch (HibernateException e) {
                System.err.println("Erro ao fechar operacao de insercao. Mensagem: " + e.getMessage());
            }
        }
    }

    public void atualizar(Escalacao escalacao) {
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();

            transacao = sessao.beginTransaction();
            sessao.update(escalacao);
            transacao.commit();
        } catch (HibernateException e) {
            System.err.println("Nao foi possivel atualizar o objeto Escalacao. Erro: " + e.getMessage());
        } finally {
            try {
                sessao.close();
            } catch (HibernateException e) {
                System.err.println("Erro ao fechar operacao de atualizacao. Mensagem: " + e.getMessage());
            }
        }
    }

    public void remover(Escalacao escalacao) {
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();

            transacao = sessao.beginTransaction();
            sessao.delete(escalacao);
            transacao.commit();
        } catch (HibernateException e) {
            System.err.println("Nao foi possivel excluir a escalacao. Erro: " + e.getMessage());
        } finally {
            try {
                sessao.close();
            } catch (HibernateException e) {
                System.err.println("Erro ao fechar operacao de exclusao. Mensagem: " + e.getMessage());
            }
        }
    }

    public void removerTodos() {
        try {

            sessao = HibernateUtil.getSessionFactory().openSession();

            Query consulta = sessao.createQuery("delete from Escalacao");

            transacao = sessao.beginTransaction();
            consulta.executeUpdate();
            transacao.commit();
        } catch (HibernateException e) {
            System.err.println("Nao foi possivel excluir os objetos. Erro: " + e.getMessage());
        } finally {
            try {
                sessao.close();
            } catch (HibernateException e) {
                System.err.println("Erro ao fechar operacao de exclusao. Mensagem: " + e.getMessage());
            }
        }
    }

    @SuppressWarnings("unchecked")
    public List<Escalacao> listar() {
        List<Escalacao> resultado = null;
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();

            Query consulta = sessao.createQuery("from Escalacao");

            transacao = sessao.beginTransaction();
            resultado = (List<Escalacao>) consulta.list();
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

    public Escalacao buscar(Jogo jogo, Selecao selecao) {
        Escalacao escalacao = null;
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();

            Query consulta = sessao.createQuery("from Escalacao where jogo = " + jogo.getId() +" and selecao= " + selecao.getId());

            transacao = sessao.beginTransaction();
             escalacao = (Escalacao) consulta.uniqueResult();
            transacao.commit();
            
            
            return escalacao;

        } catch (HibernateException e) {
            System.err.println("Nao foi possivel buscar o objeto. Erro: " + e.getMessage());
        } finally {
            try {
                sessao.close();
            } catch (HibernateException e) {
                System.err.println("Erro ao fechar operacao de busca. Mensagem: " + e.getMessage());
            }
        }
        return escalacao;
    }

}
