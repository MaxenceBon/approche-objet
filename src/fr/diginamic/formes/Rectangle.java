package fr.diginamic.formes;

public class Rectangle extends Forme {

	private double longueur;
	private double largeur;
	
	public Rectangle(double longueur, double largeur) {
		super("Rectangle");
		this.longueur=longueur;
		this.largeur=largeur;
	}

	public double calculerSurface() {
		double surface = longueur * largeur;
		return surface;
	}

	public double calculerPerimetre() {
		double perimetre = (longueur + largeur) * 2;
		return perimetre;
	}
	
	public void afficher() {
	    System.out.println("C'est un rectangle");
	}
}
