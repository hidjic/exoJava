package metier;

/**
 * @author Stéphane
 * 
 * C'est une class abstraite pour définir tout les personnages
 *
 */
abstract class Caractere {
	protected int id;
	protected String nom;
	protected int pv;
	protected int degatMini;
	protected int degatMax;
	protected int level;
	protected String arme;
	protected int pointArmure;
	protected String typeArmure;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getPv() {
		return pv;
	}
	public void setPv(int pv) {
		this.pv = pv;
	}
	public int getDegatMini() {
		return degatMini;
	}
	public void setDegatMini(int degatMini) {
		this.degatMini = degatMini;
	}
	public int getDegatMax() {
		return degatMax;
	}
	public void setDegatMax(int degatMax) {
		this.degatMax = degatMax;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public String getArme() {
		return arme;
	}
	public void setArme(String arme) {
		this.arme = arme;
	}
	public int getPointArmure() {
		return pointArmure;
	}
	public void setPointArmure(int pointArmure) {
		this.pointArmure = pointArmure;
	}
	public String getTypeArmure() {
		return typeArmure;
	}
	public void setTypeArmure(String typeArmure) {
		this.typeArmure = typeArmure;
	}
	
	
//	protected void action() {}
//	protected void attaque() {}
//	protected void defence() {}
//	protected void parade() {}
//	protected void esquive() {}
	
	public void afficheInventaire() {
		System.out.println("*** INVENTAIRE ***");
		System.out.println("Nom : "+this.nom);
		System.out.println("Votre niveau : "+this.level);
		System.out.println("Vos point de vie : "+this.pv);
		System.out.println("Votre armure : "+this.typeArmure);
		System.out.println("Vos point d'armure : "+this.pointArmure);
		System.out.println("Votre arme : "+this.arme);
		System.out.println("Vos degats : entre "+this.degatMini+" et "+this.degatMax);
	}
	
	
	
}
