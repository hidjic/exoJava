package metier;

import java.util.ArrayList;
//import java.util.Collection;

import service.IAttaque;

/**
 * @author Stéphane
 * Héro hérite de Caractere et permet de faire un joueur
 *
 */
public class Hero extends Caractere implements IAttaque{
	private int gold;
//	private Item monItem;
//	private Collection<Item> sacHero;
	private ArrayList<Item> sacHero;
	
	
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
		this.arme = "à  main nue";
		this.pointArmure = 0;
		this.typeArmure = "simple vetement";
		
		Item monItem = new Item();		
		Item monItem2 = new Item("Potion inutile");
		
//		this.sacHero.add(this.monItem);
		sacHero = new ArrayList<Item>();
		sacHero.add(monItem);
		sacHero.add(monItem2);
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
	public ArrayList<Item> getSacHero() {
		return sacHero;
	}
	public void setSacHero(ArrayList<Item> sacHero) {
		this.sacHero = sacHero;
	}
	

	public String toString() {
		return "Etat de l'objet : "+this.id+","+this.nom+","+this.pv+", encore plein d'autre... Il fallait regarder les différents affichages...";
	}
	
	
	@Override
	public int attaque() {
		int res = 0;
		res = (int)(Math.random()*(this.getDegatMax()-this.getDegatMini()))+this.getDegatMini();
		return res;
	}
	
	
	
	
	

	
	
}
