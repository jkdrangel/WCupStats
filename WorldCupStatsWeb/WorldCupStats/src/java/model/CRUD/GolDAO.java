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
import model.pojo.Gol;
import model.pojo.Jogo;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Classe que representa um GolDAO feito por um Jogador durante uma partida.
 *
 * @author D.L.O.L
 *
 * @version 1.0
 *
 * @see JogoDAO
 * @see Jogador
 */
public class GolDAO {

    Session sessao = null;
    Transaction transacao = null;

    public void adicionar(Gol gol) {
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();

            transacao = sessao.beginTransaction();
            sessao.save(gol);
            transacao.commit();
        } catch (HibernateException e) {
            System.err.println("Nao foi possivel inserir o gol. Erro: " + e.getMessage());
        } finally {
            try {
                sessao.close();
            } catch (HibernateException e) {
                System.err.println("Erro ao fechar operacao de insercao. Mensagem: " + e.getMessage());
            }
        }
    }

    public void atualizar(Gol gol) {
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();

            transacao = sessao.beginTransaction();
            sessao.update(gol);
            transacao.commit();
        } catch (HibernateException e) {
            System.err.println("Nao foi possivel atualizar o objeto Gol. Erro: " + e.getMessage());
        } finally {
            try {
                sessao.close();
            } catch (HibernateException e) {
                System.err.println("Erro ao fechar operacao de atualizacao. Mensagem: " + e.getMessage());
            }
        }
    }

    public void remover(Gol gol) {
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();

            transacao = sessao.beginTransaction();
            sessao.delete(gol);
            transacao.commit();
        } catch (HibernateException e) {
            System.err.println("Nao foi possivel excluir o gol. Erro: " + e.getMessage());
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

            Query consulta = sessao.createQuery("delete from Gol");

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
    public List<Gol> listar() {
        List<Gol> resultado = null;
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();

            Query consulta = sessao.createQuery("from Gol");

            transacao = sessao.beginTransaction();
            resultado = (List<Gol>) consulta.list();
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

    public Gol buscar(Jogo jogo, java.sql.Date tempo) {
        Gol gol = null;
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();

            Query consulta = sessao.createQuery("from Gol where jogo = " + jogo.getId() + " and tempo = " + tempo);

            transacao = sessao.beginTransaction();
            gol = (Gol) consulta.uniqueResult();
            transacao.commit();
            return gol;

        } catch (HibernateException e) {
            System.err.println("Nao foi possivel buscar o objeto. Erro: " + e.getMessage());
        } finally {
            try {
                sessao.close();
            } catch (HibernateException e) {
                System.err.println("Erro ao fechar operacao de busca. Mensagem: " + e.getMessage());
            }
        }
        return gol;
    }

}
