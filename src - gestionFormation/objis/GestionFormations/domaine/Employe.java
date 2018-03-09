package objis.GestionFormations.domaine;

public class Employe {
	private String nom;
	private String prenom;
	private int id;
	
	// Constructor
	public Employe(String nom, String prenom, int id) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.id = id;
	}
	
	// getter / setter
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
	
	// methode
	public void demanderFormation(String theme) {
		System.out.println("L'employé "+this.prenom+" "+this.nom+" demande une formation sur "+theme+".");
	}
	
	public String toString() {
		return "Employe [id=" + id + ", nom=" + nom + ", prenom=" + prenom
				+ "]";
	}
}

