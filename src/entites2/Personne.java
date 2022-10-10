package entites2;

import entites.AdressePostale;

public class Personne {
	
	public String nom;
	public String prenom;
	public AdressePostale adressePostale;
	
	public Personne(String nvNom,String nvPrenom) {
		this.nom = nvNom;
		this.prenom = nvPrenom;
	}
	
	public Personne(String nvNom,String nvPrenom, AdressePostale nvAdressePostale) {
		this.nom = nvNom;
		this.prenom = nvPrenom;
		this.adressePostale = nvAdressePostale;
	}
		// TODO Auto-generated constructor stub
}