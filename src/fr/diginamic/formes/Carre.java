package fr.diginamic.formes;

public class Carre extends Rectangle {
	
	private double longueur;
	
	public Carre(double longueur) {
		super(longueur, longueur);
		this.longueur=longueur;
	}

	public double calculerSurface() {
		double surface = longueur * longueur;
		return surface;
	}

	public double calculerPerimetre() {
		double perimetre = longueur * 4;
		return perimetre;
	}
	
	public void afficher() {
	    System.out.println("C'est un carre");
	}
}
