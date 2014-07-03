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
import model.pojo.Jogo;
import model.pojo.Selecao;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Classe que representa um jogo entre duas selecoes em uma copa.
 *
 * @author D.L.O.L
 *
 * @version 1.0
 *
 * @see
 * @see
 */
public class JogoDAO {

    Session sessao = null;
    Transaction transacao = null;

    /**
     *
     * @param jogo
     */
    public void adicionar(Jogo jogo) {
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();

            transacao = sessao.beginTransaction();
            sessao.save(jogo);
            transacao.commit();
        } catch (HibernateException e) {
            System.err.println("Nao foi possivel inserir o jogo. Erro: " + e.getMessage());
        } finally {
            try {
                sessao.close();
            } catch (HibernateException e) {
                System.err.println("Erro ao fechar operacao de insercao. Mensagem: " + e.getMessage());
            }
        }
    }

    /**
     *
     * @param jogo
     */
    public void atualizar(Jogo jogo) {
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();

            transacao = sessao.beginTransaction();
            sessao.update(jogo);
            transacao.commit();
        } catch (HibernateException e) {
            System.err.println("Nao foi possivel atualizar o objeto Jogo. Erro: " + e.getMessage());
        } finally {
            try {
                sessao.close();
            } catch (HibernateException e) {
                System.err.println("Erro ao fechar operacao de atualizacao. Mensagem: " + e.getMessage());
            }
        }
    }

    /**
     *
     * @param jogo
     */
    public void remover(Jogo jogo) {
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();

            transacao = sessao.beginTransaction();
            sessao.delete(jogo);
            transacao.commit();
        } catch (HibernateException e) {
            System.err.println("Nao foi possivel excluir o jogo. Erro: " + e.getMessage());
        } finally {
            try {
                sessao.close();
            } catch (HibernateException e) {
                System.err.println("Erro ao fechar operacao de exclusao. Mensagem: " + e.getMessage());
            }
        }
    }

    /**
     *
     */
    public void removerTodos() {
        try {

            sessao = HibernateUtil.getSessionFactory().openSession();

            Query consulta = sessao.createQuery("delete from Jogo");

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

    /**
     *
     * @return
     */
    @SuppressWarnings("unchecked")
    public List<Jogo> listar() {
        List<Jogo> resultado = null;
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();

            Query consulta = sessao.createQuery("from Jogo");

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
            } catch (HibernateException e) {
                System.err.println("Erro ao fechar operacao de listagem. Mensagem: " + e.getMessage());
            }
        }
    }

    /**
     *
     * @param data
     * @param local
     * @return
     */
    public Jogo buscar(java.sql.Date data, String local) {
        Jogo jogo = null;
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();

            Query consulta = sessao.createQuery("from Jogo where data = :parametro1 and local = :parametro2");
            consulta.setDate("parametro1", data);
            consulta.setString("parametro2", local);


            transacao = sessao.beginTransaction();
            jogo = (Jogo) consulta.uniqueResult();
            transacao.commit();
            return jogo;

        } catch (HibernateException e) {
            System.err.println("Nao foi possivel buscar o objeto. Erro: " + e.getMessage());
        } finally {
            try {
                sessao.close();
            } catch (HibernateException e) {
                System.err.println("Erro ao fechar operacao de busca. Mensagem: " + e.getMessage());
            }
        }
        return jogo;
    }

}
