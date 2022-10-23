package entites;

public class Personne {

	private String nom;
	private String prenom;
	private AdressePostale adressePostale;

	public String modifNom(String nom) {
		return nom.toUpperCase();
	}
	
	public String modifAdresse(AdressePostale adressePostale) {
		return adressePostale.getNumeroRue()+" "+adressePostale.getLibelleRue().substring(0, 1).toUpperCase()+""+adressePostale.getLibelleRue().substring(1).toLowerCase()+", "+adressePostale.getCodePostal()+" "+adressePostale.getVille().toUpperCase();
	}
	
	public String modifPrenom(String prenom) {
		return prenom.substring(0, 1).toUpperCase()+""+prenom.substring(1).toLowerCase();
	}
	
	public void afficherIdentite() {
		System.out.println(prenom+" "+nom.toUpperCase());
		}

	public Personne(String nvNom, String nvPrenom) {
		this.nom = nvNom;
		this.prenom = nvPrenom;
		
		System.out.println(modifPrenom(prenom)+" "+modifNom(nom));
	}

	public Personne(String nvNom, String nvPrenom, AdressePostale nvAdressePostale) {
		this.nom = nvNom;
		this.prenom = nvPrenom;
		this.adressePostale = nvAdressePostale;
		
		System.out.println(modifPrenom(prenom)+" "+modifNom(nom)+" "+modifAdresse(adressePostale));
	}

	public String getNom() {
		return nom.toUpperCase();
	}
	
	public String adressePersonne() {
		return "habite au : "+getAdressePostale().getNumeroRue()+" "+getAdressePostale().getLibelleRue()+", "+getAdressePostale().getCodePostal()+" "+getAdressePostale().getVille();
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public AdressePostale getAdressePostale() {
		return adressePostale;
	}

	public void setAdressePostale(AdressePostale adressePostale) {
		this.adressePostale = adressePostale;
	}
}