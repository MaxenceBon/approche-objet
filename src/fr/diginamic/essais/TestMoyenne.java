package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {

	public static void main(String[] args) {
		
		CalculMoyenne tableau1= new CalculMoyenne();

		tableau1.ajoutTableau(3.0);
		System.out.println(tableau1.calculMoyenne());
		tableau1.ajoutTableau(12.0);
		tableau1.ajoutTableau(15.0);
		System.out.println(tableau1.calculMoyenne());
	}

}
