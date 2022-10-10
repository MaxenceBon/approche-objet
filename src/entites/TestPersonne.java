package entites;

import entites2.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personne personne1 = new Personne();
		personne1.nom="Doe";
		personne1.prenom="John";
		personne1.numeroRue=2;
		personne1.libelleRue="premier chemin";
		personne1.codePostal=44001;
		personne1.ville="Nantes";
		
		Personne personne2 = new Personne();
		personne2.nom="Loe";
		personne2.prenom="Jane";
		personne2.numeroRue=4;
		personne2.libelleRue="deuxieme chemin";
		personne2.codePostal=44002;
		personne2.ville="Nantes";
	}

}
