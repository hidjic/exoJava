package lanceur;

import java.util.Scanner;

import communication.textEtEchange;
import metier.Hero;

public class Main {

	public static void main(String[] args) {
//		textEtEchange.lancementJeu();
		
		Scanner sc = new Scanner(System.in);
		char res = '0';
//		int i = 0;
		Hero theHero;
		do {			
			switch(res) {
				case '0' : res = textEtEchange.lancementJeu(sc);
					break;
				case '1' : res = textEtEchange.creationHero(sc);
					break;
				case '2' : res = textEtEchange.startAventure(sc);
					break;
				case '3' : res = textEtEchange.market(sc);
			}
			System.out.println("avant while : "+res);
//			i++;
		}while(res != 'Q' && res != 'q'/*i<5*/);
		sc.close();
		System.out.println("au revoir...");
		
	}

}
