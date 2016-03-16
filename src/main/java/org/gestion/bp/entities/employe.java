package org.gestion.bp.entities;

import java.io.Serializable;
import java.util.Collection;

public class employe implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private Long codeEmploye;
	private String nomEmploye;
	private employe employeSup;
	Collection<groupe> groupes;
	
	public employe() {
		super();
		// TODO Auto-generated constructor stub
	}
	public employe(String nomEmploye) {
		super();
		this.nomEmploye = nomEmploye;
	}
	public Long getCodeEmploye() {
		return codeEmploye;
	}
	public void setCodeEmploye(Long codeEmploye) {
		this.codeEmploye = codeEmploye;
	}
	public String getNomEmploye() {
		return nomEmploye;
	}
	public void setNomEmploye(String nomEmploye) {
		this.nomEmploye = nomEmploye;
	}
	public employe getEmployeSup() {
		return employeSup;
	}
	public void setEmployeSup(employe employeSup) {
		this.employeSup = employeSup;
	}
	public Collection<groupe> getGroupes() {
		return groupes;
	}
	public void setGroupes(Collection<groupe> groupes) {
		this.groupes = groupes;
	}
	
	

}
