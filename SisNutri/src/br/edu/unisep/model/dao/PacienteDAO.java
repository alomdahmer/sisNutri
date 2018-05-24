package br.edu.unisep.model.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import br.edu.unisep.hibernate.HibernateSessionFactory;
import br.edu.unisep.model.vo.PacienteVO;

public class PacienteDAO {

	public void salvar(PacienteVO paciente){

		Session session = HibernateSessionFactory.getSession();

		Transaction trans = session.beginTransaction();

		try {
			session.save(paciente);
			trans.commit();
		} catch (Exception e) {
			trans.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	public List<PacienteVO> listar(){

		Session session = HibernateSessionFactory.getSession();

		Query<PacienteVO> q = session.createQuery("from PacienteVO", PacienteVO.class);

		List<PacienteVO> resultado = q.list();

		session.close();

		return resultado;
	}

}
