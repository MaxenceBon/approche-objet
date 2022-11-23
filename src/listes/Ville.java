package listes;

import fr.diginamic.testenumeration.Continent;

public class Ville implements Comparable<Ville>{

	private String nom;
	private int nbHabitants;
	private Continent continent;

	public Ville(String nom, int nbHabitant, Continent continent) {
		this.nom = nom;
		this.nbHabitants = nbHabitant;
		this.setContinent(continent);
	}
	
	public Ville(String nom, int nbHabitant) {
		this.nom=nom;
		this.nbHabitants=nbHabitant;
	}

	public String toString() {
		return " Ville : " + nom + ", nombre d'habitants : " + nbHabitants+", Continent : "+continent;
	}
	
//	@Override
//	public int compareTo(Ville autre) {
//		int result = this.nom.compareTo(autre.getNom());
//		return result;
//	}
	
	public int compareTo(Ville autre) {
		if (this.getNbHabitants() > autre.getNbHabitants()) {
			return 1;
		}
		else if (this.getNbHabitants() > autre.getNbHabitants()) {
		return -1;
		}
		return 0;
	}
	
	public boolean equals(Object obj) {
		if (!(obj instanceof Ville)) {
			return false;
		}
		
		Ville autre = (Ville)obj;
		return autre.nom.equals(this.nom) && autre.getNbHabitants()==this.getNbHabitants();
	}

	
	/** Getter pour nom
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter pour nom
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/** Getter pour nbHabitants
	 * @return the nbHabitants
	 */
	public int getNbHabitants() {
		return nbHabitants;
	}

	/** Setter pour nbHabitants
	 * @param nbHabitants the nbHabitants to set
	 */
	public void setNbHabitants(int nbHabitants) {
		this.nbHabitants = nbHabitants;
	}

	public Continent getContinent() {
		return continent;
	}

	public void setContinent(Continent continent) {
		this.continent = continent;
	}
		
}