/*
 * Classe desenvolvida como componente integrante do projeto: Sistema
 * de estatisticas de Copas do Mundo (WCupStats), que trata-se de um
 * trabalho proposto pela disciplina de Padroes e Frameworks. Todo este
 * codigo foi desenvolvido pelos integrantes desta equipe: Diego Leite,
 * Lucas Santana, Oto Antonio e Lucas Vinicius.
 */
package model.CRUD;

import Util.HibernateUtil;
import java.sql.Date;
import java.util.List;
import model.pojo.Pais;
import model.pojo.Selecao;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Classe que representa a selecao de um pais em um determinado ano de copa.
 *
 * @author D.L.O.L
 *
 * @version 1.0
 *
 * @see PessoaDAO
 * @see Goal
 * @see PaisDAO
 */
public class SelecaoDAO {

    Session sessao = null;
    Transaction transacao = null;

    /**
     *
     * @param selecao
     */
    public void adicionar(Selecao selecao) {
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();

            transacao = sessao.beginTransaction();
            sessao.save(selecao);
            transacao.commit();
        } catch (HibernateException e) {
            System.err.println("Nao foi possivel inserir a selecao. Erro: " + e.getMessage());
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
     * @param selecao
     */
    public void atualizar(Selecao selecao) {
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();

            transacao = sessao.beginTransaction();
            sessao.update(selecao);
            transacao.commit();
        } catch (HibernateException e) {
            System.err.println("Nao foi possivel atualizar o objeto Selecao. Erro: " + e.getMessage());
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
     * @param selecao
     */
    public void remover(Selecao selecao) {
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();

            transacao = sessao.beginTransaction();
            sessao.delete(selecao);
            transacao.commit();
        } catch (HibernateException e) {
            System.err.println("Nao foi possivel excluir a selecao. Erro: " + e.getMessage());
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

            Query consulta = sessao.createQuery("delete from Selecao");

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
    public List<Selecao> listar() {
        List<Selecao> resultado = null;
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();

            Query consulta = sessao.createQuery("from Selecao");

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
     * @param pais
     * @param ano
     * @return
     */
    public Selecao buscar(Pais pais, Date ano) {
        Selecao selecao = null;
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();

            Query consulta = sessao.createQuery("from Selecao where pais = " + pais.getId() + " and ano = " + ano);

            transacao = sessao.beginTransaction();
            selecao = (Selecao) consulta.uniqueResult();
            transacao.commit();
            return selecao;

        } catch (HibernateException e) {
            System.err.println("Nao foi possivel buscar o objeto. Erro: " + e.getMessage());
        } finally {
            try {
                sessao.close();
            } catch (HibernateException e) {
                System.err.println("Erro ao fechar operacao de busca. Mensagem: " + e.getMessage());
            }
        }
        return selecao;
    }

}
