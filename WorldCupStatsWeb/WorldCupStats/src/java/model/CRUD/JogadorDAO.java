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
import model.pojo.Jogador;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Classe que representa os jogadores das selecoes de cada pais nas diversas
 * copas. A classe possui atributos em comum com PessoaDAO e por isso extende dela
 *
 * @author D.L.O.L
 *
 * @version 1.0
 *
 * @see PessoaDAO
 */
public class JogadorDAO {

    Session sessao = null;
    Transaction transacao = null;

    public void adicionar(Jogador jogador) {
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();

            transacao = sessao.beginTransaction();
            int x=(int) sessao.save(jogador);
            jogador.setId(x);
            System.out.println(jogador.getId());
            System.out.println(x);
            transacao.commit();
        } catch (HibernateException e) {
            System.err.println("Nao foi possivel inserir o Jogador. Erro: " + e.getMessage());
        } finally {
            try {
                sessao.close();
            } catch (HibernateException e) {
                System.err.println("Erro ao fechar operacao de insercao. Mensagem: " + e.getMessage());
            }
        }
    }

    public void atualizar(Jogador jogador) {
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();

            transacao = sessao.beginTransaction();
            sessao.update(jogador);
            transacao.commit();
        } catch (HibernateException e) {
            System.err.println("Nao foi possivel atualizar o objeto Jogador. Erro: " + e.getMessage());
        } finally {
            try {
                sessao.close();
            } catch (HibernateException e) {
                System.err.println("Erro ao fechar operacao de atualizacao. Mensagem: " + e.getMessage());
            }
        }
    }

    public void remover(Jogador jogador) {
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();

            transacao = sessao.beginTransaction();
            sessao.delete(jogador);
            transacao.commit();
        } catch (HibernateException e) {
            System.err.println("Nao foi possivel excluir o jogador. Erro: " + e.getMessage());
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

            Query consulta = sessao.createQuery("delete from Jogador");
            
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
    public List<Jogador> listar() {
        List<Jogador> resultado = null;
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();

            Query consulta = sessao.createQuery("from Jogador");

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

    public Jogador buscar(String nome) {
        Jogador copa = null;
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();

            Query consulta = sessao.createQuery("from Jogador where nome = :parametro");
            consulta.setString("parametro", nome);
            transacao = sessao.beginTransaction();
            copa = (Jogador) consulta.uniqueResult();
            transacao.commit();
            return copa;

        } catch (HibernateException e) {
            System.err.println("Nao foi possivel buscar o objeto. Erro: " + e.getMessage());
        } finally {
            try {
                sessao.close();
            } catch (HibernateException e) {
                System.err.println("Erro ao fechar operacao de busca. Mensagem: " + e.getMessage());
            }
        }
        return copa;
    }
}
