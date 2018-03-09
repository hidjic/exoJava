package launch;

import classTest.Roue;
import classTest.Velo;
import domaine.DemandeFormation;
import domaine.Employe;
import domaine.Manager;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Velo myV = new Velo();
		myV.setName("veloToto...");
		Roue myR = new Roue();
		myR.setName("roueToto...");
		myV.setMyR(myR);
		System.out.println(myV.recupNameRoue());
		
		
		
		Employe emp1 = new Employe("Employé", "un", 1);
		Employe emp2 = new Employe("Employé", "deux", 2);
		Manager mana = new Manager("Manager", "CeCroisBo", 0);
		DemandeFormation df1 = new DemandeFormation("javascript", "01/01/2018", "01/02/2018", "01/082018", "01/10/2018");
				
		emp1.demanderFormation("C#");
		emp2.demanderFormation("nodeJS");
		mana.demandeFormation("J2EE");
		
		mana.validerFormation();
		
	}

}
