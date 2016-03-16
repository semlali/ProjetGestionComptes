package org.gestion.bp.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="CLIENTS")
public class Client implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
      
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long codeClient;
	private String nomClient;
	private String adresseClient;
	private Collection<Compte> comptes;
	
	public Client() {
		
	}
	
	public Client(String nomClient, String adresseClient) {
		super();
		
		this.nomClient = nomClient;
		this.adresseClient = adresseClient;
		
	}
	

	public Long getCodeClient() {
		return codeClient;
	}
	
	public void setCodeClient(Long codeClient) {
		this.codeClient = codeClient;
	}
	public String getNomClient() {
		return nomClient;
	}
	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}
	public String getAdresseClient() {
		return adresseClient;
	}
	public void setAdresseClient(String adresseClient) {
		this.adresseClient = adresseClient;
	}
	public Collection<Compte> getComptes() {
		return comptes;
	}
	public void setComptes(Collection<Compte> comptes) {
		this.comptes = comptes;
	}
	
}
