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
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author lsantana
 */
public class CopaDAO {

  
	Session sessao = null;
	Transaction transacao = null;
	
	public void adicionar(CopaDAO copa) {
		try {
			sessao = HibernateUtil.getSessionFactory().openSession();
					
			transacao = sessao.beginTransaction();
			sessao.save(copa);
			transacao.commit();
		} catch (HibernateException e) {
			System.err.println("Nao foi possivel inserir o copa. Erro: " + e.getMessage());
		} finally {
			try {
				sessao.close();
			} catch (Throwable e) {
				System.err.println("Erro ao fechar operacao de insercao. Mensagem: " + e.getMessage());				
			}
		}
	}
	
	
	public void atualizar(CopaDAO copa) {
		try {
			sessao = HibernateUtil.getSessionFactory().openSession();
					
			transacao = sessao.beginTransaction();
			sessao.update(copa);
			transacao.commit();
		} catch (HibernateException e) {
			System.err.println("Nao foi possivel atualizar o objeto. Erro: " + e.getMessage());
		} finally {
			try {
				sessao.close();
			} catch (Throwable e) {
				System.err.println("Erro ao fechar operacao de atualizacao. Mensagem: " + e.getMessage());				
			}
		}
	}
	
	public void remover(CopaDAO copa) {
		try {
			sessao = HibernateUtil.getSessionFactory().openSession();
					
			transacao = sessao.beginTransaction();
			sessao.delete(copa);
			transacao.commit();
		} catch (HibernateException e) {
			System.err.println("Nao foi possivel excluir o copa. Erro: " + e.getMessage());
		} finally {
			try {
				sessao.close();
			} catch (Throwable e) {
				System.err.println("Erro ao fechar operacao de exclusao. Mensagem: " + e.getMessage());				
			}
		}
	}
	
	
	public void removerTodos() {
		try {
			sessao = HibernateUtil.getSessionFactory().openSession();

			Query consulta = sessao.createQuery("delete from Copa");

			transacao = sessao.beginTransaction();
			consulta.executeUpdate();
			transacao.commit();
		} catch (HibernateException e) {
			System.err.println("Nao foi possivel excluir os objetos. Erro: " + e.getMessage());
		} finally {
			try {
				sessao.close();
			} catch (Throwable e) {
				System.err.println("Erro ao fechar operacao de exclusao. Mensagem: " + e.getMessage());				
			}
		}
	}

	@SuppressWarnings("unchecked")
	public List<CopaDAO> listar() {
		List<CopaDAO> resultado = null;
		try {
			sessao = HibernateUtil.getSessionFactory().openSession();

			Query consulta = sessao.createQuery("from Copa");

			transacao = sessao.beginTransaction();
			resultado = (List<CopaDAO>) consulta.list();
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
	
	
	public CopaDAO buscar(String nome) {
		CopaDAO copa = null;
		try {
			sessao = HibernateUtil.getSessionFactory().openSession();

			Query consulta = sessao.createQuery("from Copa where nome = :parametro");
			consulta.setString("parametro", nome);

			transacao = sessao.beginTransaction();
			copa = (CopaDAO) consulta.uniqueResult();
			transacao.commit();
			return copa;
			
		} catch (HibernateException e) {
			System.err.println("Nao foi possivel buscar o objeto. Erro: " + e.getMessage());
		} finally {
			try {
				sessao.close();
			} catch (Throwable e) {
				System.err.println("Erro ao fechar operacao de busca. Mensagem: " + e.getMessage());				
			}
		}
		return copa;
	}



}
