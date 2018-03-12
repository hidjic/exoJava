package metier;

abstract class Caractere {
	protected int id;
	protected String nom;
	protected int pv;
	protected int degatMini;
	protected int degatMax;
	protected int level;
	protected String arme;
	protected int armure;
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
	public int getArmure() {
		return armure;
	}
	public void setArmure(int armure) {
		this.armure = armure;
	}
	public String getTypeArmure() {
		return typeArmure;
	}
	public void setTypeArmure(String typeArmure) {
		this.typeArmure = typeArmure;
	}
	
	
	protected void action() {}
	protected void attaque() {}
	protected void defence() {}
	protected void parade() {}
	protected void esquive() {}
	
	
	
}
