package fr.diginamic.testenumeration;

public enum Continent {
	
	EUROPE("Europe"),
	ASIE("Asie"),
	AMERIQUE("Amerique"),
	AFRIQUE("Afrique"),
	OCEANIE("Océanie");
	
	private String libelle;

	private Continent(String libelle) {
		this.libelle = libelle;
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
	
	

}
