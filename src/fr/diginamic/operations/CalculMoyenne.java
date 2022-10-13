package fr.diginamic.operations;

public class CalculMoyenne {
	
	private double total = 0;
	private double[] tableau = new double[1];
	
	public double[] ajoutTableau(double valeur) {
		
		double[] newTableau = new double[tableau.length+1];
		for (int i = 0; i < tableau.length; i++) {
			newTableau[i] = tableau[i];
		}
		
		newTableau[tableau.length-1] = valeur;
		tableau = newTableau;
		return tableau  ;
	}
	
	public double moyenne() {
		
		for (int i = 0; i<tableau.length;i++) {
			total += tableau[i];
		}
		double moyenne = total/tableau.length;
		return moyenne;	
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}
}