package Fichier;

public class Ville {

	private String nom;
	private int codeDepartement;
	private String nomRegion;
	private int population;
	
	public Ville(String nom, int codeDepartement, String nomRegion, int population) {
		this.nom = nom;
		this.codeDepartement = codeDepartement;
		this.nomRegion = nomRegion;
		this.population = population;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getCodeDepartement() {
		return codeDepartement;
	}

	public void setCodeDepartement(int codeDepartement) {
		this.codeDepartement = codeDepartement;
	}

	public String getNomRegion() {
		return nomRegion;
	}

	public void setNomRegion(String nomRegion) {
		this.nomRegion = nomRegion;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}
	
}