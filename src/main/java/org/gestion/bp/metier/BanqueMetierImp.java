package org.gestion.bp.metier;


import org.gestion.bp.dao.IBanqueDao;
import org.gestion.bp.entities.Caisse;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class BanqueMetierImp implements IBanqueMetier{
	
  private IBanqueDao dao;

	public void setDao(IBanqueDao dao) {
		this.dao = dao;
	}
	
	@Override
	public Caisse addCaisse(Caisse c) {
		// TODO Auto-generated method stub
		return dao.addCaisse(c);
	}


	


}
