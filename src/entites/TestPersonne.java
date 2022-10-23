package entites;

public class TestPersonne {

	public static String prenom;
	public static String nom;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personne personne1 = new Personne("Doe", "John", new AdressePostale(2, "premier chemin", 44001, "Nantes"));
	
		AdressePostale adr2 = new AdressePostale(4, "deuxieme chemin", 44002, "Nantes");
		Personne personne2 = new Personne("Loe", "Jane", adr2);
		
		AdressePostale adr3 = new AdressePostale(7, "rue", 44007, "NaNtEs");
		
		AdressePostale.pays = "Belgique"; //change pays pour TOUS
		System.out.println(AdressePostale.pays);

		personne1.afficherIdentite();
		personne1.setNom("DOd");
		personne1.afficherIdentite();
		personne1.setPrenom("Bob");
		personne2.setPrenom("marie");
		personne1.afficherIdentite();

		personne2.setAdressePostale(adr3);
		
		String nom = personne1.getNom();
		System.out.println(nom);
		
		String prenom = personne2.getPrenom();
		System.out.println(prenom);

		int adressePersonne1 = personne1.getAdressePostale().getCodePostal();
		System.out.println(adressePersonne1);
	
		String adressePersonne2 = personne2.getAdressePostale().getVille();
		System.out.println(adressePersonne2);
		
//		int numeroRuePersonne1 = personne1.getAdressePostale().getNumeroRue();
//		String libelleRuePersonne1 = personne1.getAdressePostale().getLibelleRue();
//		int codePostalPersonne1 = personne1.getAdressePostale().getCodePostal();
//		String villePersonne1 = personne1.getAdressePostale().getVille();
//		String adresseCompletePersonne1 = "habite au :"+numeroRuePersonne1+" "+libelleRuePersonne1+", "+codePostalPersonne1+" "+villePersonne1;
//		System.out.println(adresseCompletePersonne1);
		System.out.println(personne1.adressePersonne());
	}
}