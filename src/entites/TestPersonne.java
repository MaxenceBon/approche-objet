package entites;

import entites2.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personne personne1 = new Personne();
		personne1.nom="Doe";
		personne1.prenom="John";
		personne1.adresse = new AdressePostale();
		personne1.adresse.numeroRue=2;
		personne1.adresse.libelleRue="premier chemin";
		personne1.adresse.codePostal=44001;
		personne1.adresse.ville="Nantes";
		
		Personne personne2 = new Personne();
		personne2.nom="Loe";
		personne2.prenom="Jane";
		personne2.adresse.numeroRue=4;
		personne2.adresse.libelleRue="deuxieme chemin";
		personne2.adresse.codePostal=44002;
		personne2.adresse.ville="Nantes";
	}

}
