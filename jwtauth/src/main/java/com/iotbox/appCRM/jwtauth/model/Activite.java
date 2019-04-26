package com.iotbox.appCRM.jwtauth.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Activite {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idActivite;
	private String nomActivite;
	private String description;
	private String lieu;
	private Etat_Activite etatActivite;
	private Date dateDebut;
	private Date dateFin;
	
	
	
	
	
	
	
	public Activite() {
		super();
	}
	public Activite(String nomActivite, String description, String lieu, Etat_Activite etatActivite, Date dateDebut,
			Date dateFin) {
		super();
		this.nomActivite = nomActivite;
		this.description = description;
		this.lieu = lieu;
		this.etatActivite = etatActivite;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
	}
	public Activite(Long idActivite, String nomActivite, String description, String lieu, Etat_Activite etatActivite,
			Date dateDebut, Date dateFin) {
		super();
		this.idActivite = idActivite;
		this.nomActivite = nomActivite;
		this.description = description;
		this.lieu = lieu;
		this.etatActivite = etatActivite;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
	}
	//Getters & Setters
	public Long getIdActivite() {
		return idActivite;
	}
	public void setIdActivite(Long idActivite) {
		this.idActivite = idActivite;
	}
	public String getNomActivite() {
		return nomActivite;
	}
	public void setNomActivite(String nomActivite) {
		this.nomActivite = nomActivite;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getLieu() {
		return lieu;
	}
	public void setLieu(String lieu) {
		this.lieu = lieu;
	}
	public Etat_Activite getEtatActivite() {
		return etatActivite;
	}
	public void setEtatActivite(Etat_Activite etatActivite) {
		this.etatActivite = etatActivite;
	}
	public Date getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}
	public Date getDateFin() {
		return dateFin;
	}
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}
	
	
	

	
}
