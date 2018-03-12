package metier;

public class Hero extends Caractere {
	private int gold;
	private Item monItem;
	
	
	// constructor
	public Hero() {
		super();
		this.id = 123;
		this.level = 1;
		this.nom = "Toto le Zéro";
		this.pv = 50;
		this.degatMini = 2;
		this.degatMax = 5;
		this.gold = 5;
		this.arme = "à main nue";
		this.pointArmure = 0;
		this.typeArmure = "simple vetement";
		monItem = new Item();
	}
	public Hero(String newName) {
		this();
		this.nom = newName;
		this.pv = 100;
		this.degatMini = 5;
		this.degatMax = 10;
		this.gold = 10;
	}
	
	public int getGold() {
		return gold;
	}
	public void setGold(int gold) {
		this.gold = gold;
	}
	
	
	public void afficheInventaire() {
		super.afficheInventaire();
		System.out.println("Vos pièces d'or : "+this.getGold());
	}
	
	public void afficherItem() {
		System.out.println("*** objet potion de votre hero ***");
		System.out.println("Nom objet : "+ monItem.getName());
		System.out.println("Prix d'achat : "+ monItem.getBuyPrice()+" pièce d'or");
		System.out.println("Prix de vente : "+ monItem.getSellPrice()+" pièce d'or");
		System.out.println("Description : "+ monItem.getDescription());
	}

	public String toString() {
		return "Etat de l'objet : "+this.id+","+this.nom+","+this.pv+", encore plein d'autre... Il fallait regarder les différents affichages...";
	}

	
	
}
