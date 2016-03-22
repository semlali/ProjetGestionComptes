package org.gestion.bp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.gestion.bp.entities.Client;
import org.gestion.bp.entities.Compte;
import org.gestion.bp.entities.Operation;
import org.gestion.bp.entities.employe;
import org.gestion.bp.entities.groupe;

public class BanqueDaoImp implements IBanqueDao{
	
    @PersistenceContext
	EntityManager em;
	
	@Override
	public Client addClient(Client c) {
		em.persist(c);
		return c;
	}

	@Override
	public employe addEmploye(employe employe, Long codeSup) {
		if(codeSup!=null) {
			
		employe sup = em.find(employe.class, codeSup);
		employe.setEmployeSup(sup);
		em.persist(employe);
		}
		return employe;
	}

	@Override
	public groupe addGroupe(groupe groupe) {
		em.persist(groupe);
		return groupe;
	}

	@Override
	public void addEmployeToGroupe(Long codeEmploye, Long codeGroupe) {
		
		employe empl = em.find(employe.class, codeEmploye);
		groupe grp= em.find(groupe.class, codeGroupe);
		
		//association bidirectionel : ajouter ds les deux sens
		grp.getEmployes().add(empl);
		empl.getGroupes().add(grp);
		
	}

	@Override
	public Compte addCompte(Compte cp, Long codeClient, Long codeEmploye) {
		
		Client client = em.find(Client.class, codeClient);
		employe emp = em.find(employe.class, codeEmploye);
		
			cp.setClient(client);
			cp.setEmploye(emp);
		
		em.persist(cp);
	
		return cp;
	}

	@Override
	public Operation addOperation(Operation operation, String codeCompte,Long codeEmploye) {
		Compte compte= ConsulterCompte(codeCompte);
		employe emp= em.find(employe.class, codeEmploye);
		
		operation.setCompte(compte);
		operation.setEmploye(emp);
		
		em.persist(operation);
		
		return operation;
	}

	@Override
	public Compte ConsulterCompte(String codeCompte) {
		Compte compte= em.find(Compte.class, codeCompte);
		if(compte==null) throw new RuntimeException("compte introuvable");
		
		return compte;
	}

	@Override
	public List<Operation> consulterOprations(String codeCompte) {
		Query req=em.createQuery("select o from operation o where o.compte.codeCompte=:x");
		req.setParameter("x", codeCompte);
		return  req.getResultList();
	}

	@Override
	public Client consulterClient(Long codeClient) {
		Client client= em.find(Client.class, codeClient);
		if(client==null) throw new RuntimeException("compte introuvable");
		return client;
	}

	@Override
	public List<Client> consulterClients(String motCle) {
		
		Query req=em.createQuery("select c from Client c where c.nom like :x");
		req.setParameter("x", "%"+motCle+"%");
		return  req.getResultList();
	}

	@Override
	public List<Compte> getComptesParClient(Long codeClient) {
		Query req=em.createQuery("select c from Compte c where c.client.codeClient=:x");
		req.setParameter("x", codeClient);
		return  req.getResultList();
		
	}

	@Override
	public List<Compte> getComptesParEmploye(Long codeEmploye) {
		
		Query req=em.createQuery("select c from Compte c where c.employe.codeEmploye=:x");
		req.setParameter("x", codeEmploye);
		return  req.getResultList();
	}

	@Override
	public List<employe> getEmployes() {
		Query req=em.createQuery("select e from employe");
		return  req.getResultList();
	}

	@Override
	public List<groupe> getGroupes() {
		Query req=em.createQuery("select g from groupe");
		return  req.getResultList();
	}

	@Override
	public List<employe> getEmployesParGroupe(Long codeGroupe) {
		Query req=em.createQuery("select e from employe e where e.groupe.codeGroupe=:x");
		req.setParameter("x", codeGroupe);
		return  req.getResultList();
	}

}
