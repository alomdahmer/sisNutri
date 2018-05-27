package br.edu.unisep.model.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import br.edu.unisep.hibernate.HibernateSessionFactory;
import br.edu.unisep.model.vo.AlimentoVO;

public class AlimentoDAO {

	public List<AlimentoVO> listar(){
		Session session = HibernateSessionFactory.getSession();
		Query<AlimentoVO> q = session.createQuery("from AlimentoVO order by ds_alimento", AlimentoVO.class);
		List<AlimentoVO> resultado = q.list();
		session.close();
		return resultado;
	}
}
