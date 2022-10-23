package fr.diginamic.salaire;

public class Pigiste extends Intervenant {

	private double nombreJours;
	private double remuneration;
	
	public Pigiste(String nom, String prenom, double nombreJours, double remuneration) {
		super(nom, prenom);
		this.nombreJours=nombreJours;
		this.remuneration=remuneration;
	}
	
	@Override
	public double getSalaire() {
		// TODO Auto-generated method stub
		return nombreJours*remuneration;
	}
	
	public String getStatus() {
		return "pigiste";
	}

}
