package entites2;

import entites.AdressePostale;

public class Personne {

	public String nom;
	public String prenom;
	public AdressePostale adressePostale;

	public String modifNom(String nom) {
		return nom.toUpperCase();
	}
	
	public String modifPrenom(String prenom) {
		return prenom.substring(0, 1).toUpperCase()+""+prenom.substring(1).toLowerCase();
	}
	
	public String modifAdresse(AdressePostale adressePostale) {
		return adressePostale.numeroRue+" "+adressePostale.libelleRue.substring(0, 1).toUpperCase()+""+adressePostale.libelleRue.substring(1).toLowerCase()+", "+adressePostale.codePostal+" "+adressePostale.ville.toUpperCase();
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
}