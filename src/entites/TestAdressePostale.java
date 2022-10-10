package entites;

public class TestAdressePostale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdressePostale adr1 = new AdressePostale();
		adr1.numeroRue=2;
		adr1.libelleRue="premier chemin";
		adr1.codePostal=44001;
		adr1.ville="Nantes";
		
		AdressePostale adr2 = new AdressePostale();
		adr2.numeroRue=4;
		adr2.libelleRue="deuxieme chemin";
		adr2.codePostal=44002;
		adr2.ville="Nantes";
	}

}
