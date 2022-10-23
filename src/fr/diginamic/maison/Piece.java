package fr.diginamic.maison;

public abstract class Piece {

	private double superficie;
	private int numeroEtage;
	
	public Piece(double superficie, int numeroEtage) {
		this.superficie=superficie;
		this.numeroEtage=numeroEtage;
	}
	
	public abstract String getType();
	
	/** Getter pour superficie
	 * @return the superficie
	 */
	public double getSuperficie() {
		return superficie;
	}

	/** Setter pour superficie
	 * @param superficie the superficie to set
	 */
	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}

	/** Getter pour numeroEtage
	 * @return the numeroEtage
	 */
	public int getNumeroEtage() {
		return numeroEtage;
	}

	/** Setter pour numeroEtage
	 * @param numeroEtage the numeroEtage to set
	 */
	public void setNumeroEtage(int numeroEtage) {
		this.numeroEtage = numeroEtage;
	}
	
	
	
}
