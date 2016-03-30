package br.edu.ifpb.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

import br.edu.ifpb.entidade.Voto;
import br.edu.ifpb.hibernate.HibernateUtil;

public class VotoDAO extends GenericDAO<Voto> {
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Voto> getAll() {

		Session session = HibernateUtil.getSessionFactory().openSession();
		List<Voto> votos = null;

		try {
			session.beginTransaction();
			Query query = session.getNamedQuery("Voto.getAll");
			votos = (List<Voto>) query.list();
			session.getTransaction().commit();

		} catch (HibernateException hexp) {
			session.getTransaction().rollback();

		} finally {
			session.clear();
			session.close();
		}

		return votos;
	}

	@Override
	public Voto getById(Integer pk) {

		Session session = HibernateUtil.getSessionFactory().openSession();
		Voto voto = null;

		try {
			session.beginTransaction();
			voto = (Voto) session.get(Voto.class, pk);
			session.getTransaction().commit();

		} catch (HibernateException hexp) {
			session.getTransaction().rollback();

		} finally {
			session.close();
		}

		return voto;
	}
}
