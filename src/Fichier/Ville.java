package Fichier;

public class Ville {

	private String nom;
	private String codeDepartement;
	private String nomRegion;
	private String population;
	
	public Ville(String nom, String codeDepartement, String nomRegion, String population) {
		this.nom = nom;
		this.codeDepartement = codeDepartement;
		this.nomRegion = nomRegion;
		this.population = population;
	}

	public String toString() {
		return "Nom de la commune : "+nom+", Code du département : "+codeDepartement+", Département : "+nomRegion+", Population totale : "+population;
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCodeDepartement() {
		return codeDepartement;
	}

	public void setCodeDepartement(String codeDepartement) {
		this.codeDepartement = codeDepartement;
	}

	public String getNomRegion() {
		return nomRegion;
	}

	public void setNomRegion(String nomRegion) {
		this.nomRegion = nomRegion;
	}

	public String getPopulation() {
		return population;
	}

	public void setPopulation(String population) {
		this.population = population;
	}

	public String toCSV() {
		return nom+";"+codeDepartement+";"+nomRegion+";"+population;
	}
	
}