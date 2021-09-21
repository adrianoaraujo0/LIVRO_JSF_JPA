package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import entidades.Automovel;
import util.JPAUtil;

public class PersistidorDeAutomovel {

	EntityManager em = JPAUtil.getEntityManager();
	EntityTransaction et = em.getTransaction();
	

	public void cadastrar(Automovel auto) {
		et.begin();
		em.persist(auto);
		et.commit();
		em.close();
	}
	
	public void remover(Automovel auto, Long id) {
		auto = em.getReference(Automovel.class, id);
		
		et.begin();
		em.remove(auto);
		et.commit();
		em.close();
	}
	
	public List<Automovel> selecionar(){
		
		Query q = em.createQuery("select p from Automovel p", Automovel.class);
		List<Automovel> lista = q.getResultList();
		
		return lista;
		
	} 
	

}
