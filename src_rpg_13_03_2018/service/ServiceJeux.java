package service;

import java.util.Scanner;

import metier.Hero;

public class ServiceJeux {
	
	public char lancementJeu(Scanner sc,ServiceHero servH,ServiceJeux servJ, boolean leave) {
		char res;
		do {
			Hero leHero = null;
			System.out.println("Bienvenue dans ce RPG");
			System.out.println("*** MENU ***");
			System.out.println("1. Créer un Héro");
			System.out.println("Q. Quitter");
			res = sc.nextLine().charAt(0);
			switch(res) {
				case '1' : leHero = servH.createHero(sc,servH,servJ);
					break;
				case 'Q':
				case 'q': res = 'q';
			}
			if(res == '1') {
				res = servJ.startAventure(sc, leHero, servH, servJ);
//				System.out.println("dans le res du lancement = "+res);
			}
		}while(res != 'Q' && res != 'q');
//		if(res != '1' && res != 'Q' && res != 'q') {servJ.startAventure(sc, leHero, servH, servJ);}
		return res;
	}
	
	public char startAventure(Scanner sc, Hero theHero, ServiceHero servHero, ServiceJeux servJ) {
		char res = 'q';

		System.out.println("");
		System.out.println("*** Menu ***");
		System.out.println("1. afficher votre Héro");
		System.out.println("2. afficher votre sac à dos");
		System.out.println("3. aller au marché");
		System.out.println("4. partir en quete");
		System.out.println("Q. Quitter");
//		System.out.println("Si ton Hero avait attaqu�, il aurait fait : "+theHero.attaque()+" points de d�gat...");
		res = sc.nextLine().charAt(0);
		switch(res) {
			case '1' : servHero.afficheInventaire(theHero);
				break;
			case '2' : servHero.afficherSacHero(theHero);
				break;
			case '3' : res = marketTime(sc,theHero,servHero,servJ);
				break;
			case 'Q' :
			case 'q' :
					res = 'Q';
		}
		
		if(res != 'q' && res != 'Q') {
//			System.out.println("restart laventure..."+res);
			// attention c'est vraiment moche ce relance plein de foid
			res = servJ.startAventure(sc, theHero, servHero, servJ);
		}
//		System.out.println("juste a la fin du start res = "+res);
		return res;
	}
	
	public char marketTime(Scanner sc, Hero theHero, ServiceHero servHero, ServiceJeux servJ) {
		char res = '2';
		System.out.println("");
		System.out.println("*** Bienvenue au marché ***");
		System.out.println("1. vendre");
		System.out.println("2. acheter");
		System.out.println("3. revenir en ville");
		res = sc.nextLine().charAt(0);
		switch(res) {
			case '1': servHero.vendreObjet(sc, theHero, servHero,servJ);
				break;
			case '2': ;
				break;
			case '3' : res = '2';
		}
		
		return res;
	}
	
}
