package org.gestion.bp.metier;

import java.util.Date;
import java.util.List;

import org.gestion.bp.dao.IBanqueDao;
import org.gestion.bp.entities.Client;
import org.gestion.bp.entities.versement;
import org.gestion.bp.entities.retrait;
import org.gestion.bp.entities.Compte;
import org.gestion.bp.entities.Operation;
import org.gestion.bp.entities.employe;
import org.gestion.bp.entities.groupe;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class BanqueMetierImp implements IBanqueMetier{
	
  private IBanqueDao dao;

	public void setDao(IBanqueDao dao) {
		this.dao = dao;
	}
	
	@Override
	public Client addClient(Client c) {
		// TODO Auto-generated method stub
		return dao.addClient(c);
	}

	@Override
	public employe addEmploye(employe employe, Long codeSup) {
		// TODO Auto-generated method stub
		return dao.addEmploye(employe, codeSup);
	}

	@Override
	public groupe addGroupe(groupe groupe) {
		// TODO Auto-generated method stub
		return dao.addGroupe(groupe);
	}

	@Override
	public void addEmployeToGroupe(Long codeEmploye, Long codeGroupe) {
		// TODO Auto-generated method stub
		dao.addEmployeToGroupe(codeEmploye, codeGroupe);
	}

	@Override
	public Compte addCompte(Compte cp, Long codeClient, Long codeEmploye) {
		// TODO Auto-generated method stub
		return dao.addCompte(cp, codeClient, codeEmploye);
	}

	@Override
	public void versement(String codeCompte, double montant, Long codeEmploye) {
		// TODO Auto-generated method stub
		dao.addOperation(new versement(new Date(), montant), codeCompte, codeEmploye);
		Compte cp= dao.ConsulterCompte(codeCompte);
		cp.setSolde(cp.getSolde()+montant);
	}

	@Override
	public void retrait(String codeCompte, double montant, Long codeEmploye) {
		// TODO Auto-generated method stub
		dao.addOperation(new retrait(new Date(), montant), codeCompte, codeEmploye);
		Compte cp= dao.ConsulterCompte(codeCompte);
		cp.setSolde(cp.getSolde()-montant);
	}

	@Override
	public void virement(String codeCompte1, String codeCompte2,
			double montant, Long codeEmploye) {
		// TODO Auto-generated method stub
		retrait(codeCompte1, montant, codeEmploye);
		versement(codeCompte2, montant, codeEmploye);
		
	}

	@Override
	public Compte ConsulterCompte(String codeCompte) {
		// TODO Auto-generated method stub
		return dao.ConsulterCompte(codeCompte);
	}

	@Override
	public List<Operation> consulterOprations(String codeCompte) {
		// TODO Auto-generated method stub
		return dao.consulterOprations(codeCompte);
	}

	@Override
	public Client consulterClient(Long codeClient) {
		// TODO Auto-generated method stub
		return dao.consulterClient(codeClient);
	}

	@Override
	public List<Client> consulterClients(String motCle) {
		// TODO Auto-generated method stub
		return dao.consulterClients(motCle);
	}

	@Override
	public List<Compte> getComptesParClient(Long codeClient) {
		// TODO Auto-generated method stub
		return dao.getComptesParClient(codeClient);
	}

	@Override
	public List<Compte> getComptesParEmploye(Long codeEmploye) {
		// TODO Auto-generated method stub
		return dao.getComptesParEmploye(codeEmploye);
	}

	@Override
	public List<employe> getEmployes() {
		// TODO Auto-generated method stub
		return dao.getEmployes();
	}

	@Override
	public List<groupe> getGroupes() {
		// TODO Auto-generated method stub
		return dao.getGroupes();
	}

	@Override
	public List<employe> getEmployesParGroupe(Long codeGroupe) {
		// TODO Auto-generated method stub
		return dao.getEmployesParGroupe(codeGroupe);
	}

	


}
