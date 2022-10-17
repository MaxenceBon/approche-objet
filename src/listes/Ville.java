package listes;

public class Ville implements Comparable<Ville>{

	private String nom;
	private int nbHabitants;

	public Ville(String nom, int nbHabitant) {
		this.nom = nom;
		this.nbHabitants = nbHabitant;
	}

	public String toString() {
		return "Ville : " + nom + ", nombre d'habitants : " + nbHabitants;
	}
	
	@Override
	public int compareTo(Ville autre) {
		int result = this.nom.compareTo(autre.getNom());
		return result;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNbHabitants() {
		return nbHabitants;
	}

	public void setNbHabitants(int nbHabitants) {
		this.nbHabitants = nbHabitants;
	}
}