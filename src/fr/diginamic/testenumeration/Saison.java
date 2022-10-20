package fr.diginamic.testenumeration;

public enum Saison {

	PRINTEMPS("printemps",1),
	ETE("été",2),
	AUTOMNE("automne",3),
	HIVER("hiver",4);
	
	private String libelle;
	private int numeroOrdre;

	private Saison(String libelle, int numeroOrdre) {
		this.libelle = libelle;
		this.numeroOrdre = numeroOrdre;
	}

	static Saison[] saisons = Saison.values();
	
	public static Saison affichage(String libelle) {
		for (Saison saison : saisons) {
			if (saison.getLibelle().equals(libelle)) {
				return saison;
			}
		}
		return null;
	}
	
	
	/** Getter pour libelle
	 * @return the libelle
	 */
	public String getLibelle() {
		return libelle;
	}
	
	

	/** Setter pour libelle
	 * @param libelle the libelle to set
	 */
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	/** Getter pour numeroOrdre
	 * @return the numeroOrdre
	 */
	public int getNumeroOrdre() {
		return numeroOrdre;
	}

	/** Setter pour numeroOrdre
	 * @param numeroOrdre the numeroOrdre to set
	 */
	public void setNumeroOrdre(int numeroOrdre) {
		this.numeroOrdre = numeroOrdre;
	}
}