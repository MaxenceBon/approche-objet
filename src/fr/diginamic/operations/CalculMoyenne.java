package fr.diginamic.operations;

import java.util.Arrays;

public class CalculMoyenne {
	Double[] tableau = new Double[1];
	
	public double ajoutTableau(){
		tableau = Arrays.copyOf(tableau, tableau.length + 1);
		return 0;
	}
	
}
