package org.gestion.bp.dao;



import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.gestion.bp.entities.Caisse;


public class BanqueDaoImp implements IBanqueDao{
	
    @PersistenceContext
	EntityManager em;
	
	@Override
	public Caisse addCaisse(Caisse c) {
		em.persist(c);
		return c;
	}

	

}
