package entites;

import entites2.Personne;

public class TestPersonne {

	public static String prenom;
	public static String nom;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personne personne1 = new Personne("Doe", "John", new AdressePostale(2, "premier chemin", 44001, "Nantes"));
		prenom = personne1.modifPrenom(personne1.prenom);
		nom = personne1.modifNom(personne1.nom);
		
		AdressePostale adr2 = new AdressePostale(4, "deuxieme chemin", 44002, "Nantes");
		Personne personne2 = new Personne("Loe", "Jane", adr2);
		prenom = personne2.modifPrenom(personne2.prenom);
		nom = personne2.modifNom(personne2.nom);
	}
}