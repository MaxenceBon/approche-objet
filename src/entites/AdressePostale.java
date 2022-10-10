package entites;

public class AdressePostale {

	public int numeroRue;
	public String libelleRue;
	public int codePostal;
	public String ville;

	public AdressePostale(int nvNumeroRue, String nvLibelleRue, int nvCodePostal, String nvVille) {
		numeroRue = nvNumeroRue;
		libelleRue = nvLibelleRue;
		codePostal = nvCodePostal;
		ville = nvVille;
	}
}
