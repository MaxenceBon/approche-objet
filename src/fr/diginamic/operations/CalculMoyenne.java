package fr.diginamic.operations;

public class CalculMoyenne {
	
	private double[] tableau = new double[0];
	
	public void ajoutTableau(double valeur) {
		
		double[] newTableau = new double[tableau.length+1];
		for (int i = 0; i < tableau.length; i++) {
			newTableau[i] = tableau[i];
		}
		newTableau[tableau.length] = valeur;
		this.tableau = newTableau;
	}
	
	public double calculMoyenne() {
		double total=0;
		for (int i = 0; i<tableau.length;i++) {
			total += tableau[i];
		}
		double moyenne = total/tableau.length;
		return moyenne;
	}
}