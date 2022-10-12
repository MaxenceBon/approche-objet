package fr.diginamic.banque.entites;

public class Cercle {

	private double rayon;
	
	public Cercle(double rayon) {
		// TODO Auto-generated constructor stub
		this.rayon=rayon;
	}
	
	public double perimetre() {
		return 2*Math.PI*rayon;
	}
	
	public double surface() {
		return rayon*Math.pow(Math.PI, 2);
	}

	public double getRayon() {
		return rayon;
	}

	public void setRayon(double rayon) {
		this.rayon = rayon;
	}
}
