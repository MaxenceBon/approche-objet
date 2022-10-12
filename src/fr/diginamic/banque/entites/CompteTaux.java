package fr.diginamic.banque.entites;

public class CompteTaux extends Compte {

	private String tauxRemuneration;

	public CompteTaux(String numeroCompte, float soldeCompte, String tauxRemuneration) {
		super(numeroCompte, soldeCompte);
		this.tauxRemuneration = tauxRemuneration;
		// TODO Auto-generated constructor stub
	}

	public String toString() {
		String compteOrigine = super.toString();
		return compteOrigine + " " + tauxRemuneration;
	}

	public String getTauxRemuneration() {
		return tauxRemuneration;
	}

	public void setTauxRemuneration(String tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}
}
