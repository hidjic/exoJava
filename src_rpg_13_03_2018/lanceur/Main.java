package lanceur;

import java.util.Scanner;

import service.ServiceHero;
import service.ServiceJeux;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		char res = '0';
		ServiceHero servHero = new ServiceHero();
		ServiceJeux servJ = new ServiceJeux();
	
		do {
			res = servJ.lancementJeu(sc,servHero,servJ,false);
		}while(res != 'Q' && res != 'q');
		
//		if(theHero != null) {
//			System.out.println("Le toString time :");
//			System.out.println(theHero);
//		}
		
		sc.close();
		System.out.println("au revoir...");
		
	}

}
