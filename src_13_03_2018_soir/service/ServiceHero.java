package service;



import java.util.Scanner;


import communication.textEtEchange;
import metier.Hero;
import metier.Item;

public class ServiceHero {
	
	public char lancementJeu(Scanner sc) {
		char res;
		System.out.println("Bienvenue dans ce RPG");
		System.out.println("*** MENU ***");
		System.out.println("1. Créer un Héro");
		System.out.println("Q. Quitter");
		res = sc.nextLine().charAt(0);
		if(res == '1') {
			createHero(sc);
		}
		if(res != '1' && res != 'Q' && res != 'q') {res = '0';}
		return res;
	}
	public void createHero(Scanner sc) {
		String name;
		System.out.println("*** Création de ton Héro ***");
		System.out.println("Son nom : ");
		name = sc.nextLine();
		if(name.trim().equals("")) {
			Hero theHero = new Hero();
		}else {
			Hero theHero = new Hero(name.trim());
		}
//		res = '2';
		// TODO faire le liens avec startAventure dans le service
		// TODO faire un service jeu ou menu pour séparer avec le serviceHero
		// TODO comme sa inctenciation dans le nouveau service 
	}
	public void afficheInventaire(Hero monHero) {
		monHero.afficheInventaire();
		System.out.println("Vos pièces d'or : "+monHero.getGold());
	}
	public void afficherSacHero(Hero leHero) {
		int i = 1;
		System.out.println("");
		System.out.println("*** objet se trouvant dans votre sac à dos ***");
		for(Item lesItems : leHero.getSacHero()) {
			System.out.println("");
			System.out.println("item numéro : "+i);
			System.out.println("Nom objet : "+ lesItems.getName());
			System.out.println("Prix d'achat : "+ lesItems.getBuyPrice()+" pièce d'or");
			System.out.println("Prix de vente : "+ lesItems.getSellPrice()+" pièce d'or");
			System.out.println("Description : "+ lesItems.getDescription());
			i++;
		}
	}
	/**
	 * Affiche la liste des objets que le user veut vendre
	 * et les vends si voulu
	 * @param sc
	 * @param leHero
	 * @param servH
	 */
	public void vendreObjet(Scanner sc,Hero leHero, ServiceHero servH) {
		int i = 1;
		char res = '0';
		System.out.println("");
		System.out.println("*** Liste des objets que vous pouvez vendre ***");
		for(Item item : leHero.getSacHero()) {
			System.out.println("");
			System.out.println("Objet N° :"+i);
			System.out.println("Nom objet : "+item.getName());
			System.out.println("Description : "+item.getDescription());
			System.out.println("Prix de vente : "+item.getSellPrice());
			i++;
		}
		System.out.println("");
		System.out.println("Numero de l'ojet a vendre, sinon "+i+" pour revenir au marché et ne rien vendre");
		res = sc.nextLine().charAt(0);
		System.out.println("res = "+res);
		// si le choix user correspond  a i ou plus on retourne au menu du marché
		if(Integer.toString(i).charAt(0) <= res) {
			textEtEchange.marketTime(sc, leHero, servH);
		}else {	// sinon on vend l'objet
			int j = Character.getNumericValue(res);
			int or = leHero.getGold();
			leHero.setGold(or+leHero.getSacHero().get(i-1).getSellPrice());
			leHero.getSacHero().remove(i-1);
		}
	}
	
}
