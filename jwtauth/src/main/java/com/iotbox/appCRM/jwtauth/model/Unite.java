package com.iotbox.appCRM.jwtauth.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.NaturalId;

@Entity
public class Unite {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idUnite;
	@NaturalId
	private String nomUnité;
	private Long IMEI;
	private Etat_Unite etatUnite;
	
	
	
	
	
	public Unite() {
	
	}



	public Unite(String nomUnité, Long iMEI, Etat_Unite etatUnite) {
		super();
		this.nomUnité = nomUnité;
		IMEI = iMEI;
		this.etatUnite = etatUnite;
	}



	public Unite(Long idUnite, String nomUnité, Long iMEI, Etat_Unite etatUnite) {
		super();
		this.idUnite = idUnite;
		this.nomUnité = nomUnité;
		IMEI = iMEI;
		this.etatUnite = etatUnite;
	}
	
	
	
	//Getters & Setters
	public Long getIdUnite() {
		return idUnite;
	}
	public void setIdUnite(Long idUnite) {
		this.idUnite = idUnite;
	}
	public String getNomUnité() {
		return nomUnité;
	}
	public void setNomUnité(String nomUnité) {
		this.nomUnité = nomUnité;
	}
	public Long getIMEI() {
		return IMEI;
	}
	public void setIMEI(Long iMEI) {
		IMEI = iMEI;
	}
	public Etat_Unite getEtatUnite() {
		return etatUnite;
	}
	public void setEtatUnite(Etat_Unite etatUnite) {
		this.etatUnite = etatUnite;
	}
	
	
	
	
	
	
}
