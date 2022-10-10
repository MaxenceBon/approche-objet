package entites;

public class TestAdressePostale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdressePostale adr1 = new AdressePostale(2, "premier chemin", 44001, "Nantes");
		AdressePostale adr2 = new AdressePostale(4, "deuxieme chemin", 44002, "Nantes");
		System.out.println(adr1.libelleRue);
		System.out.println(adr2.codePostal);
	}

}
