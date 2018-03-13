package communication;

import java.util.Scanner;

import metier.Hero;
import service.ServiceHero;

public class textEtEchange {
//	public static char lancementJeu(Scanner sc) {
//		char res;
//		System.out.println("Bienvenue dans ce RPG");
//		System.out.println("*** MENU ***");
//		System.out.println("1. Créer un Héro");
//		System.out.println("Q. Quitter");
//		res = sc.nextLine().charAt(0);
//		if(res != '1' && res != 'Q' && res != 'q') {res = '0';}
//		return res;
//	}
/*	
	public static char creationHero(Scanner sc) {
		String name;
		System.out.println("*** Création de ton Héro ***");
		System.out.println("Son nom : ");
		name = sc.nextLine();
//		if(check) {
			Hero myHero = new Hero(name);
//		}
			
		System.out.println("Bienvenu dans cette aventure "+myHero.getNom());
		System.out.println("*** Menu ***");
		System.out.println("2. afficher votre Héro");
		System.out.println("3. afficher votre objet");
		System.out.println("Q. Quitter");
		return sc.nextLine().charAt(0);
	}
*/
	public static char startAventure(Scanner sc, Hero theHero, ServiceHero servHero) {
		char res = '2';

		System.out.println("");
		System.out.println("*** Menu ***");
		System.out.println("3. afficher votre Héro");
		System.out.println("4. afficher votre sac à dos");
		System.out.println("5. aller au marché");
		System.out.println("6. partir en quete");
		System.out.println("Q. Quitter");
//		System.out.println("Si ton Hero avait attaqué, il aurait fait : "+theHero.attaque()+" points de dégat...");
		res = sc.nextLine().charAt(0);
		switch(res) {
			case '3' : servHero.afficheInventaire(theHero);
				break;
			case '4' : servHero.afficherSacHero(theHero);
				break;
			case '5' : res = marketTime(sc,theHero,servHero);
		}
		
		if(res != 'q' && res != 'Q') {res = '2';}
		return res;
	}
	
	public static char marketTime(Scanner sc, Hero theHero, ServiceHero servHero) {
		char res = '2';
		System.out.println("");
		System.out.println("*** Bienvenue au marché ***");
		System.out.println("1. vendre");
		System.out.println("2. acheter");
		System.out.println("3. revenir en ville");
		res = sc.nextLine().charAt(0);
		switch(res) {
			case '1': servHero.vendreObjet(sc, theHero, servHero);
				break;
			case '2': ;
				break;
			case '3' : res = '2';
		}
		
		return res;
	}

}
