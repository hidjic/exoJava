package metier;

public class Hero extends Caractere {
	private int gold;
//	private 
	
	public Hero(String newName) {
		super();
		this.id = 666;
		this.level = 1;
		this.nom = newName;
		this.pv = 100;
		this.degatMini = 5;
		this.degatMax = 10;
		this.gold = 10;
		this.arme = "Main nue";
		this.armure = 0;
		this.typeArmure = "vetement";
	}
	
	public int getGold() {
		return gold;
	}
	public void setGold(int gold) {
		this.gold = gold;
	}
	
	
	public void afficheInventaire() {}



	
	
}
