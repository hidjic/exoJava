package service;

public class DemandeFormation {
	private String theme;
	private String dateDemande;
	private String etatValidation;
	private String dateDebut;
	private String dateFin;
	
	public final static String REFUS = "refus";
	public final static String ACCORDE = "valide";
	public final static String ATTENTE = "en attente";
	
	// Constructor
	public DemandeFormation(String theme, String dateDemande, String etatValidation, String dateDebut, String dateFin) {
//		super();
		this.theme = theme;
		this.dateDemande = dateDemande;
		this.etatValidation = etatValidation;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
	}
	
	public DemandeFormation(String newDateDebut,String newDateFin,String newEtat) {
		this.dateDebut = newDateDebut;
		this.dateFin = newDateFin;
		this.etatValidation = newEtat;
	}
	
	public DemandeFormation(String newDateDebut,String newDateFin) {
		this(newDateDebut, newDateFin, DemandeFormation.ATTENTE);
	}
	
	// getter / setter
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
	public String getEtatValidation() {
		return etatValidation;
	}
	public void setEtatValidation(String etatValidation) {
		this.etatValidation = etatValidation;
	}
	public String getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(String dateDebut) {
		this.dateDebut = dateDebut;
	}
	public String getDateFin() {
		return dateFin;
	}
	public void setDateFin(String dateFin) {
		this.dateFin = dateFin;
	}
	
	// methode
	public void demandeFormation(String theme,String dateDemande,String etat) {
		
	}
	
}
