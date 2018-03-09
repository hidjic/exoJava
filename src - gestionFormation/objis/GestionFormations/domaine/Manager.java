package objis.GestionFormations.domaine;

public class Manager extends Employe {

	public Manager(String nom, String prenom, int id) {
		super(nom, prenom, id);
	}
	
	public Manager(String nom, String prenom) {
		this(nom, prenom, 0);
	}
	
	public Manager(String nom) {
		this(nom,"toto",0);
	}
	
	public Manager() {
		this("qzreg","ze",0);
	}
	
	public void validerFormation() {
		System.out.println("Le manager a validé les demandes de formations.");
	}
	
	public void demanderFormation() {
		super.demanderFormation("typescript");
		System.out.println("Etant le manager, il valide ses propres formations.");
	}

}
