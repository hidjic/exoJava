package launch;

import java.util.Scanner;

import objis.GestionFormations.domaine.Employe;
import objis.GestionFormations.domaine.Manager;

//import domaine.Employe;
//import domaine.Manager;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		// partie pour les tests d'association de class
		Velo myV = new Velo();
		myV.setName("veloToto...");
		Roue myR = new Roue();
		myR.setName("roueToto...");
		myV.setMyR(myR);
		System.out.println(myV.recupNameRoue());
*/
/*		
		// demande au user des données
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Nom du premier employé : ");
		String strNom = sc.nextLine();
		System.out.println("Nom du premier employé : ");
		String strPrenom = sc.nextLine();
		System.out.println("Nom du premier employé : ");
		int strId = sc.nextInt();
*/
		
//		Employe emp1 = new Employe(strNom, strPrenom, strId);
		Employe emp1 = new Employe("toto", "aze", 1);
		Employe emp2 = new Employe("LAMBERT", "Stéphane", 2);
		Manager mana = new Manager("nom", "prenom", 3);
//		DemandeFormation df1 = new DemandeFormation("javascript", "01/01/2018", "01/02/2018", "01/082018", "01/10/2018");
		
		mana.setNom("MARTIN");
		mana.setPrenom("Daniel");
		mana.setId(654);
		
		System.out.println(mana.toString());
		
//		System.out.println();
		
		emp1.demanderFormation("C#");
		emp2.demanderFormation("nodeJS");
		mana.demanderFormation("J2EE");
		
		mana.validerFormation();
		
	}

}
