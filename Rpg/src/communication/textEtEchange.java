package communication;

import java.util.Scanner;

import metier.Hero;

public class textEtEchange {
	public static char lancementJeu(Scanner sc) {
		char res;
		System.out.println("Bienvenue dans ce RPG");
		System.out.println("*** MENU ***");
		System.out.println("1. Créer un Héro");
		System.out.println("Q. Quitter");
		res = sc.nextLine().charAt(0);
		if(res != '1' && res != 'Q' && res != 'q') {res = '0';}
		return res;
	}
	
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

	public static char startAventure(Scanner sc) {return 'q';}
	
	public static char market(Scanner sc) {
		return 'q';
	}

}
