package org.gestion.bp.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

public class Compte implements Serializable{

	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	
	private String codeCompte;
	private Date dateCreation;
	private double solde;
	private Client client;
	private employe employe;
	private Collection<Operation> operations;
	
	public Compte() {
		
	}
	public Compte(String codeCompte, Date dateCreation, double solde) {
		super();
		this.codeCompte = codeCompte;
		this.dateCreation = dateCreation;
		this.solde = solde;
	}
	public String getCodeCompte() {
		return codeCompte;
	}
	public void setCodeCompte(String codeCompte) {
		this.codeCompte = codeCompte;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public employe getEmploye() {
		return employe;
	}
	public void setEmploye(employe employe) {
		this.employe = employe;
	}
	public Collection<Operation> getOperations() {
		return operations;
	}
	public void setOperations(Collection<Operation> operations) {
		this.operations = operations;
	}

}
