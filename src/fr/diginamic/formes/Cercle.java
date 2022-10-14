package fr.diginamic.formes;

public class Cercle extends Forme {

	private double rayon;
	
	public Cercle(double rayon) {
		super("Cercle");
		this.rayon=rayon;
	}

	public double calculerSurface() {
		double surface = rayon * Math.pow(Math.PI, 2);
		return surface;
	}

	public double calculerPerimetre() {
		double perimetre = 2 * Math.PI * rayon;
		return perimetre;
	}
	
	public void afficher() {
		System.out.println("C'est un cercle");
	}
}