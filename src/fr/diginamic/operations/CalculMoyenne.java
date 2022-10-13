package fr.diginamic.operations;

import java.util.Arrays;

public class CalculMoyenne {
	
	static double[] tableau = new double[1];
	
	public void double ajoutTableau(double valeur){
		
		double[] newTableau = new double[tableau.length+1];
		for (int i = 0; i < tableau.length; i++) {
			newTableau[i] = tableau[i];
		}
		
		newTableau[tableau.length-1] = valeur;
		tableau = newTableau;
	}
}