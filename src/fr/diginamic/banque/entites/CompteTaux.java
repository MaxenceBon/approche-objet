package fr.diginamic.banque.entites;

public class CompteTaux extends Compte {

	private int tauxRemuneration;

	public CompteTaux(String numeroCompte, float soldeCompte, int tauxRemuneration) {
		super(numeroCompte, soldeCompte);
		this.tauxRemuneration = tauxRemuneration;
		// TODO Auto-generated constructor stub
	}

	public String toString() {
		String compteOrigine = super.toString();
		return compteOrigine + ", taux de rémuneration : " + tauxRemuneration+"%";
	}

	public int getTauxRemuneration() {
		return tauxRemuneration;
	}

	public void setTauxRemuneration(int tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}
}
