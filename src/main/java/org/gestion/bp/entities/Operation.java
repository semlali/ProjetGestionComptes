package org.gestion.bp.entities;

import java.io.Serializable;
import java.util.Date;

public class Operation implements Serializable{
    
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long numeroOperation;
	private Date dateOperation;
	private double montant;
	private Compte compte;
	private employe employe;
	
	
	
	public Operation() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Operation(Date dateOperation, double montant) {
		super();
		this.dateOperation = dateOperation;
		this.montant = montant;
	}
	public Long getNumeroOperation() {
		return numeroOperation;
	}
	public void setNumeroOperation(Long numeroOperation) {
		this.numeroOperation = numeroOperation;
	}
	public Date getDateOperation() {
		return dateOperation;
	}
	public void setDateOperation(Date dateOperation) {
		this.dateOperation = dateOperation;
	}
	public double getMontant() {
		return montant;
	}
	public void setMontant(double montant) {
		this.montant = montant;
	}
	public Compte getCompte() {
		return compte;
	}
	public void setCompte(Compte compte) {
		this.compte = compte;
	}
	public employe getEmploye() {
		return employe;
	}
	public void setEmploye(employe employe) {
		this.employe = employe;
	}
	
	
	
}
