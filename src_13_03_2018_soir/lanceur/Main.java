package lanceur;

import java.util.Scanner;

import communication.textEtEchange;
import metier.Hero;
import service.ServiceHero;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		char res = '0';
		Hero theHero = null;
		ServiceHero servHero = new ServiceHero();
		
	
		do {
			res = servHero.lancementJeu(sc);
			switch(res) {
				case '0' : res = textEtEchange.lancementJeu(sc);
					break;
				case '1' :
						String name;
						System.out.println("*** Création de ton Héro ***");
						System.out.println("Son nom : ");
						name = sc.nextLine();
						if(name.trim().equals("")) {
							theHero = new Hero();
						}else {
							theHero = new Hero(name.trim());
						}
						res = '2';
					break;
				case '2' :	res = textEtEchange.startAventure(sc,theHero,servHero);
					/*
						System.out.println("");
						System.out.println("*** Menu ***");
						System.out.println("3. afficher votre Héro");
						System.out.println("4. afficher votre sac à dos");
						System.out.println("Q. Quitter");
						System.out.println("Si ton Hero avait attaqué, il aurait fait : "+theHero.attaque()+" points de dégat...");
						res = sc.nextLine().charAt(0);
						if(res == '3') {
							servHero.afficheInventaire(theHero);
						}else if(res == '4') {
							servHero.afficherSacHero(theHero);
						}
					*/
						if(res != 'q' && res != 'Q') {res = '2';}
					break;
			}
		}while(res != 'Q' && res != 'q');
		
		if(theHero != null) {
			System.out.println("Le toString time :");
			System.out.println(theHero);
		}
		
		sc.close();
		System.out.println("au revoir...");
		
	}

}
