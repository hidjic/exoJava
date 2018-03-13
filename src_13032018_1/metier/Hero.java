package metier;

/**
 * @author St�phane
 * H�ro h�rite de Caractere et permet de faire un joueur
 *
 */
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
	public Item getMonItem() {
		return monItem;
	}
	public void setMonItem(Item monItem) {
		this.monItem = monItem;
	}
	

	public String toString() {
		return "Etat de l'objet : "+this.id+","+this.nom+","+this.pv+", encore plein d'autre... Il fallait regarder les différents affichages...";
	}
	

	
	
}
