package service;



import java.util.Scanner;


//import communication.textEtEchange;
import metier.Hero;
import metier.Item;

public class ServiceHero {
	
	
	public Hero createHero(Scanner sc,ServiceHero servH,ServiceJeux servJ) {
		String name;
		Hero theHero;
		System.out.println("*** Création de ton Héro ***");
		System.out.println("Son nom : ");
		name = sc.nextLine();
		if(name.trim().equals("")) {
			theHero = new Hero();
		}else {
			theHero = new Hero(name.trim());
		}

		//		res = '2';
		// TODO faire le liens avec startAventure dans le service
//		char res = servJ.startAventure(sc, theHero, servH, servJ);
		// TODO faire un service jeu ou menu pour s�parer avec le serviceHero
		// TODO comme sa inctenciation dans le nouveau service 
//		return res;
		return theHero;
	}
	
	public void afficheInventaire(Hero monHero) {
		monHero.afficheInventaire();
		System.out.println("Vos pi�ces d'or : "+monHero.getGold());
	}
	public void afficherSacHero(Hero leHero) {
		int i = 1;
		System.out.println("");
		System.out.println("*** objet se trouvant dans votre sac � dos ***");
		for(Item lesItems : leHero.getSacHero()) {
			System.out.println("");
			System.out.println("item num�ro : "+i);
			System.out.println("Nom objet : "+ lesItems.getName());
			System.out.println("Prix d'achat : "+ lesItems.getBuyPrice()+" pi�ce d'or");
			System.out.println("Prix de vente : "+ lesItems.getSellPrice()+" pi�ce d'or");
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
	public void vendreObjet(Scanner sc,Hero leHero, ServiceHero servH, ServiceJeux servJ) {
		int i = 1;
		char res = '0';
		System.out.println("");
		System.out.println("*** Liste des objets que vous pouvez vendre ***");
		for(Item item : leHero.getSacHero()) {
			System.out.println("");
			System.out.println("Objet N� :"+i);
			System.out.println("Nom objet : "+item.getName());
			System.out.println("Description : "+item.getDescription());
			System.out.println("Prix de vente : "+item.getSellPrice());
			i++;
		}
		System.out.println("");
		System.out.println("Numero de l'ojet a vendre, sinon "+i+" pour revenir au march� et ne rien vendre");
		res = sc.nextLine().charAt(0);
		System.out.println("res = "+res);
		// si le choix user correspond  a i ou plus on retourne au menu du march�
		if(Integer.toString(i).charAt(0) <= res) {
			servJ.marketTime(sc, leHero, servH,servJ);
		}else {	// sinon on vend l'objet
//			int j = Character.getNumericValue(res);
			int or = leHero.getGold();
			leHero.setGold(or+leHero.getSacHero().get(i-1).getSellPrice());
			leHero.getSacHero().remove(i-1);
		}
	}
	
}
