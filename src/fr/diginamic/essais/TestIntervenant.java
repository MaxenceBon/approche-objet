package fr.diginamic.essais;

import fr.diginamic.salaire.Pigiste;
import fr.diginamic.salaire.Salarie;

public class TestIntervenant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Salarie intervenant1 = new Salarie("John", "DOE", 2000);
		Pigiste intervenant2 = new Pigiste("jane", "Doe", 20, 150);
		
		System.out.println(intervenant1.getSalaire());
		System.out.println(intervenant2.getSalaire());
		
		System.out.println(intervenant1.afficherDonnees());
		System.out.println(intervenant2.afficherDonnees());
		
	}

}
