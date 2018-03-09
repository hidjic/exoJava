package com.objis.gestionformations.presentation;

import com.objis.gestionformations.domaine.Manager;

public class LanceurGestionFormations {

	/**
	 * Classe principale = point d'entr�e de l'application = classe poss�dant m�thode main()
	 * www.objis.com  --> Nous allons vous faire aimer JAVA
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// 1) D�claration 
		Manager manager1 ;

		// 2) Instanciation 	
		manager1 = new Manager("nom", "prenom", 0);

		// 3) Utilisation (Les employ�s et le manager demandent une formation)
		manager1.setId(3);
		manager1.setNom("Fall");
		manager1.setPrenom("Ousmane");

		System.out.println(manager1); // cette ligne de code d�clenche l'ex�cution de toString()

	}
}
