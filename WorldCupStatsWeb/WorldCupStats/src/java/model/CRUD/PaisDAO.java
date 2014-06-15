/*
 * Classe desenvolvida como componente integrante do projeto: Sistema
 * de estatisticas de Copas do Mundo (WCupStats), que trata-se de um
 * trabalho proposto pela disciplina de Padroes e Frameworks. Todo este
 * codigo foi desenvolvido pelos integrantes desta equipe: Diego Leite,
 * Lucas Santana, Oto Antonio e Lucas Vinicius.
 */

package model.CRUD;

import Util.HibernateUtil;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import model.Enuns.FaseCopa;
import model.pojo.Copa;
import model.pojo.Pais;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Classe que representa um pais.
 *
 * @author D.L.O.L
 *
 * @version 1.0
 *
 * @see TimeDAO
 */
public class PaisDAO{
   
  
	Session sessao = null;
	Transaction transacao = null;
	
	public void adicionar(Pais pais) {
		try {
			sessao = HibernateUtil.getSessionFactory().openSession();
					
			transacao = sessao.beginTransaction();
			sessao.save(pais);
			transacao.commit();
		} catch (HibernateException e) {
			System.err.println("Nao foi possivel inserir o objeto. Erro: " + e.getMessage());
		} finally {
			try {
				sessao.close();
			} catch (Throwable e) {
				System.err.println("Erro ao fechar operacao de insercao. Mensagem: " + e.getMessage());				
			}
		}
	}
	
	
	public void atualizar(Pais pais) {
		try {
			sessao = HibernateUtil.getSessionFactory().openSession();
					
			transacao = sessao.beginTransaction();
			sessao.update(pais);
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
	
	public void remover(Pais pais) {
		try {
			sessao = HibernateUtil.getSessionFactory().openSession();
					
			transacao = sessao.beginTransaction();
			sessao.delete(pais);
			transacao.commit();
		} catch (HibernateException e) {
			System.err.println("Nao foi possivel excluir o objeto. Erro: " + e.getMessage());
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

			Query consulta = sessao.createQuery("delete from Pais");

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
	public List<Pais> listar() {
		List<Pais> resultado = null;
		try {
			sessao = HibernateUtil.getSessionFactory().openSession();

			Query consulta = sessao.createQuery("from Pais");

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
	
	
	public Pais buscar(String nome) {
		Pais pais = null;
		try {
			sessao = HibernateUtil.getSessionFactory().openSession();

			Query consulta = sessao.createQuery("from Pais where nome = :parametro");
			consulta.setString("parametro", nome);

			transacao = sessao.beginTransaction();
			pais = (Pais) consulta.uniqueResult();
			transacao.commit();
			return pais;
			
		} catch (HibernateException e) {
			System.err.println("Nao foi possivel buscar o objeto. Erro: " + e.getMessage());
		} finally {
			try {
				sessao.close();
			} catch (Throwable e) {
				System.err.println("Erro ao fechar operacao de busca. Mensagem: " + e.getMessage());				
			}
		}
		return pais;
	}
    
}
