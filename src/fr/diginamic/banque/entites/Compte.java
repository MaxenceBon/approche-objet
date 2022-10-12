package fr.diginamic.banque.entites;

public class Compte {

	protected String numeroCompte;
	protected float soldeCompte;

	public Compte(String numeroCompte, float soldeCompte) {
		this.numeroCompte = numeroCompte;
		this.soldeCompte = soldeCompte;
	}

	public String toString() {
		return numeroCompte + " " + soldeCompte;
	}

	public String getNumeroCompte() {
		return numeroCompte;
	}

	public void setNumeroCompte(String numeroCompte) {
		this.numeroCompte = numeroCompte;
	}

	public float getSoldeCompte() {
		return soldeCompte;
	}

	public void setSoldeCompte(float soldeCompte) {
		this.soldeCompte = soldeCompte;
	}

}
