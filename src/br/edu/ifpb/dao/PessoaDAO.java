package br.edu.ifpb.dao;

import java.util.List;

import br.edu.ifpb.entidade.Pessoa;
import br.edu.ifpb.hibernate.HibernateUtil;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;


public class PessoaDAO extends GenericDAO<Pessoa> {
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Pessoa> getAll() {

		Session session = HibernateUtil.getSessionFactory().openSession();
		List<Pessoa> argument = null;

		try {
			session.beginTransaction();
			Query query = session.getNamedQuery("Pessoa.getAll");
			argument = (List<Pessoa>) query.list();
			session.getTransaction().commit();

		} catch (HibernateException hexp) {
			session.getTransaction().rollback();

		} finally {
			session.clear();
			session.close();
		}

		return argument;
	}

	@Override
	public Pessoa getById(Integer pk) {

		Session session = HibernateUtil.getSessionFactory().openSession();
		Pessoa argument = null;

		try {
			session.beginTransaction();
			argument = (Pessoa) session.get(Pessoa.class, pk);
			session.getTransaction().commit();

		} catch (HibernateException hexp) {
			session.getTransaction().rollback();

		} finally {
			session.close();
		}

		return argument;
	}
}
