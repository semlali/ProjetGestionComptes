package org.gestion.bp.metier;

import java.util.List;

import org.gestion.bp.entities.Client;
import org.gestion.bp.entities.Compte;
import org.gestion.bp.entities.Operation;
import org.gestion.bp.entities.employe;
import org.gestion.bp.entities.groupe;

public interface IBanqueMetier {
	

	public Client addClient(Client c);
	public employe addEmploye(employe employe,Long codeSup);
    public groupe addGroupe(groupe groupe);
    public void addEmployeToGroupe(Long codeEmploye,Long codeGroupe);
    public Compte addCompte(Compte cp,Long codeClient,Long codeEmploye);
    public void versement(String codeCompte, double montant, Long codeEmploye);
    public void retrait(String codeCompte, double montant, Long codeEmploye);
    public void virement(String codeCompte1,String codeCompte2, double montant, Long codeEmploye);
    public Compte ConsulterCompte(String codeCompte);    
    public List<Operation> consulterOprations(String codeCompte);
    public Client consulterClient(Long codeClient);
    public List<Client> consulterClients(String motCle);
    public List<Compte> getComptesParClient(Long codeClient);
    public List<Compte> getComptesParEmploye(Long codeEmploye);
    public List<employe> getEmployes();
    public List<groupe> getGroupes();
    public List<employe> getEmployesParGroupe(Long codeGroupe);

}
