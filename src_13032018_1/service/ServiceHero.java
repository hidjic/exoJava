package service;

import metier.Hero;

public class ServiceHero {
	
	public void afficheInventaire(Hero monHero) {
		monHero.afficheInventaire();
		System.out.println("Vos pièces d'or : "+monHero.getGold());
	}
	
	public void afficherItem(Hero monHero) {
		System.out.println("*** objet potion de votre hero ***");
		System.out.println("Nom objet : "+ monHero.getMonItem().getName());
		System.out.println("Prix d'achat : "+ monHero.getMonItem().getBuyPrice()+" pièce d'or");
		System.out.println("Prix de vente : "+ monHero.getMonItem().getSellPrice()+" pièce d'or");
		System.out.println("Description : "+ monHero.getMonItem().getDescription());
	}
	
}
