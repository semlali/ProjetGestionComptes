package org.gestion.bp.entities;

import java.util.Date;

public class CompteCourant extends Compte {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private double decouvert;

	public CompteCourant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CompteCourant(String codeCompte, Date dateCreation, double solde,
			double decouvert) {
		super(codeCompte, dateCreation, solde);
		
		this.setDecouvert(decouvert);
	}

	public double getDecouvert() {
		return decouvert;
	}

	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}
	
	

}
