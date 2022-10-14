package fr.diginamic.formes;

public abstract class Forme {

	private String forme;

	public Forme(String forme) {
		this.forme = forme;
	}
	
	public abstract void afficher();

	public abstract double calculerSurface();

	public abstract double calculerPerimetre();

	public String getForme() {
		return forme;
	}

	public void setForme(String forme) {
		this.forme = forme;
	}

}
