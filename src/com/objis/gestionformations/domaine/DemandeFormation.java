package com.objis.gestionformations.domaine;

/**
 * @author  www.objis.com
 */

public class DemandeFormation {

	// Propri�t�s d'une demande de formation
	private String theme;
	private String dateDemande;
	private String dateDebut;	
	private String dateFin;
	private String etatValidation;
	
	// Constructeur
	public DemandeFormation(String pTheme, String pDateDemande, String pDateDebut, String pDateFin, String pEtatValidation){
		this.theme = pTheme;
		this.dateDemande = pDateDemande;
		this.dateDebut = pDateDebut;
		this.dateFin = pDateFin;
		this.etatValidation = pEtatValidation;
	}

	// Getters et Setters
		
	public String getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(String dateDebut) {
		this.dateDebut = dateDebut;
	}
	
	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	public String getDateDemande() {
		return dateDemande;
	}

	public void setDateDemande(String dateDemande) {
		this.dateDemande = dateDemande;
	}
	
	public String getDateFin() {
		return dateFin;
	}

	public void setDateFin(String dateFin) {
		this.dateFin = dateFin;
	}

	public String getEtatValidation() {
		return etatValidation;
	}
		
	public void setEtatValidation(String etatValidation) {
		this.etatValidation = etatValidation;
	}

}
