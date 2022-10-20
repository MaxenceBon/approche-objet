package fr.diginamic.testenumeration;

public class TestEnumeration {

	public static void main(String[] args) {
		
		Saison[] saisons = Saison.values();
		for (Saison saison : saisons) {
			System.out.println(saison);
		}
		
		Saison saison1=Saison.valueOf("ETE");
		System.out.println(saison1);
		
		System.out.println(Saison.affichage("hiver"));
	}

}
