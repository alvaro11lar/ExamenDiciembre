package ejercicio4.dao;

import java.util.Date;
import java.util.List;

import ejercicio4.JpaUtil;
import ejercicio4.entity.Contrato;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

public class ContratoDAO {
	
	private EntityManager em;

	public ContratoDAO() {
		em = JpaUtil.getEntityManager("ejemploOracle");
	}
	
	
	public List<Contrato> getUsers (){
		List<Contrato> usuarios;
		
		usuarios = em.createQuery("from Contrato", Contrato.class)
			.getResultList();
		
		return usuarios;
	}
	
	public List<Contrato> getUsersByName (String name){
		List<Contrato> usuarios;
		
		Query query = em.createQuery(
				"from Contrato ue where ue.nombre=?1", 
				Contrato.class);
		
		
//		Query query2 = em.createQuery(
//				"select new UserVip(ue.id) from UserEntity ue where ue.vip=?1", 
//				UserVip.class);
		
		query.setParameter(1, name);
		usuarios = query.getResultList();
		
		return usuarios;
	}
	
	public List<Contrato> getUsersByDate (Date fechaConsulta){
		List<Contrato> usuarios;
		
		Query query = em.createQuery(
				"from Contrato ue where ue.fechaFin>=?1", 
				Contrato.class);
		
		query.setParameter(1, fechaConsulta);
		usuarios = query.getResultList();
		
		return usuarios;
	}
	
	public void insertarUsuario (Contrato user) {
		 em.getTransaction().begin();
		 try {
			 em.persist(user);
			 
			 em.getTransaction().commit();
		 }catch(Exception e) {
			 
			 em.getTransaction().rollback();
			 e.printStackTrace();
		 }
	     
	}
	
	public List<Contrato> getUsersByImporte (int importe){
		List<Contrato> usuarios;
		
		Query query = em.createQuery(
				"from Contrato ue where ue.importe=?1", 
				Contrato.class);
		
		
//		Query query2 = em.createQuery(
//				"select new UserVip(ue.id) from UserEntity ue where ue.vip=?1", 
//				UserVip.class);
		
		query.setParameter(1, importe);
		usuarios = query.getResultList();
		
		return usuarios;
	}
	
	
	
}


