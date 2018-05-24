package br.edu.unisep.model.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import br.edu.unisep.hibernate.HibernateSessionFactory;
import br.edu.unisep.model.vo.NutricionistaVO;

public class NutricionistaDAO {

	public void salvar(NutricionistaVO nutricionista) {

		Session session = HibernateSessionFactory.getSession();

		Transaction trans = session.beginTransaction();

		try {
			session.save(nutricionista);
			trans.commit();

		} catch (Exception e) {
			trans.rollback();
			e.printStackTrace();

		} finally {
			session.close();

		}
	}

	public List<NutricionistaVO> listar(){

		Session session = HibernateSessionFactory.getSession();

		Query<NutricionistaVO> q = session.createQuery("from NutricionistaVO", NutricionistaVO.class);

		List<NutricionistaVO> resultado = q.list();

		session.close();

		return resultado;
	}

}
