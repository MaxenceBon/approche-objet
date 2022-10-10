package entites;

import entites2.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personne personne1 = new Personne("Doe","John",new AdressePostale(2,"premier chemin",44001,"Nantes"));
		
		AdressePostale adr2  = new AdressePostale(4,"deuxieme chemin",44002,"Nantes");
		Personne personne2 = new Personne("Loe","Jane", adr2);
	}

}
