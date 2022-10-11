package fr.diginamic.banque.entites;

public class Compte {
	private String numeroCompte;
	private float soldeCompte;
	
	public Compte(String nvNumeroCompte, float nvSoldeCompte) {
		this.numeroCompte = nvNumeroCompte;
		this.soldeCompte = nvSoldeCompte;
	}
	
	public String getNumeroCompte() {
		return numeroCompte;
	}

	public float getSoldeCompte() {
		return soldeCompte;
	}
}
