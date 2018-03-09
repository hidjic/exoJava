package domaine;

public class Manager {
	private String nom;
	private String prenom;
	private int id;
	
	// Constructor
	public Manager(String nom, String prenom, int id) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.id = id;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public void demandeFormation(String theme) {
		System.out.println("L'employé "+this.prenom+" "+this.nom+" demande une formation sur "+theme+".");
	}
	
	public void manager(String nom,String prenom, int id) {}
	
	public void validerFormation() {
		System.out.println("Le manager "+ this.prenom + " "+ this.nom+" valide les demandes de formation.");
	}
	
	
}
