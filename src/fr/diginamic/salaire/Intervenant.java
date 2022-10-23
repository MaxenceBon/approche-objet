package fr.diginamic.salaire;

public abstract class Intervenant {
	
	private String nom;
	private String prenom;
	
	public Intervenant(String nom, String prenom) {
		this.nom=nom;
		this.prenom=prenom;
	}
	
	public abstract double getSalaire();
	
	public abstract String getStatus();
	
	public final String afficherDonnees() {
		return nom+" "+prenom+". Le salaire d'un "+getStatus()+" est de "+getSalaire()+" €";
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

	/** Getter pour prenom
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/** Setter pour prenom
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

		
}
