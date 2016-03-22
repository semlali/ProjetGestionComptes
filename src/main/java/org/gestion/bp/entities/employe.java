package org.gestion.bp.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class employe implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long codeEmploye;
	private String nomEmploye;
	
	@ManyToOne
	@JoinColumn(name="CODE_EMPLOYE_SUP")
	private employe employeSup;
	
	@ManyToMany
	@JoinTable(name="EMPLOYE_GROUPE",joinColumns=@JoinColumn(name="CODE_EMPLOYE"),inverseJoinColumns=@JoinColumn(name="CODE_GROUPE"))
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
