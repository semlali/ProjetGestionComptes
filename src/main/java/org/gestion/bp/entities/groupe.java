package org.gestion.bp.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class groupe implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long codeGroupe;
	private String nomGroupe;
	
	@ManyToMany(mappedBy="groupes")
	Collection<employe> employes;
	
	
	public groupe() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public groupe(String nomGroupe) {
		super();
		this.nomGroupe = nomGroupe;
	}
	public Long getCodeGroupe() {
		return codeGroupe;
	}
	public void setCodeGroupe(Long codeGroupe) {
		this.codeGroupe = codeGroupe;
	}
	public String getNomGroupe() {
		return nomGroupe;
	}
	public void setNomGroupe(String nomGroupe) {
		this.nomGroupe = nomGroupe;
	}
	public Collection<employe> getEmployes() {
		return employes;
	}
	public void setEmployes(Collection<employe> employes) {
		this.employes = employes;
	}

}
