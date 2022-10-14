package fr.diginamic.entites;

public class Theatre {

	private String nom;
	private int capaciteMax;
	private int totalClients;
	private double recette;
	
	public Theatre(String nom, int capaciteMax, int totalClients, double recette) {
		this.nom=nom;
		this.capaciteMax=capaciteMax;
		this.totalClients=totalClients;
		this.recette=recette;
	}
	
	public void inscrire(int nombreClients, double prixPlace) {
		if (nombreClients + totalClients < capaciteMax+1) {
			totalClients += nombreClients;
			recette += nombreClients * prixPlace;
		}
		else {
			System.out.println("Capacité max atteinte");
		}
	}
	@Override
	public String toString() {
		return "Nom du theatre = "+nom+", Capacité maximal = "+capaciteMax+", nombre de clients = "+totalClients+", recette = "+recette;
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getCapaciteMax() {
		return capaciteMax;
	}

	public void setCapaciteMax(int capaciteMax) {
		this.capaciteMax = capaciteMax;
	}

	public int getTotalClients() {
		return totalClients;
	}

	public void setTotalClients(int totalClients) {
		this.totalClients = totalClients;
	}

	public double getRecette() {
		return recette;
	}

	public void setRecette(double recette) {
		this.recette = recette;
	}
}
