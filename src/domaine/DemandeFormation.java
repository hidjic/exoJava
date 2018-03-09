package domaine;

public class DemandeFormation {
	private String theme;
	private String dateDemande;
	private String etatValidation;
	private String dateDebut;
	private String dateFin;
	
	// Constructor
	public DemandeFormation(String theme, String dateDemande, String etatValidation, String dateDebut, String dateFin) {
		super();
		this.theme = theme;
		this.dateDemande = dateDemande;
		this.etatValidation = etatValidation;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
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
	
	public void demandeFormation(String theme,String dateDemande,String etat) {
		
	}
	
}
