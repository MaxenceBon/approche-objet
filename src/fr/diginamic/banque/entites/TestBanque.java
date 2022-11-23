package fr.diginamic.banque.entites;

public class TestBanque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compte compteNormal1 = new Compte("16B56S445", 200.45f);
		CompteTaux compteTaux1 = new CompteTaux("16B56S445", 200.45f, 3);
		Compte compteNormal2 = new Compte("16sd5", 154f);

		System.out.println(compteTaux1.toString());
		
		String[] tableauCompte = new String[3];
		tableauCompte[0]=compteNormal1.toString();
		tableauCompte[1]=compteTaux1.toString();
		tableauCompte[2]=compteNormal2.toString();
		
		String[] tableauCompteTest= {compteNormal1.toString(),compteTaux1.toString()};
		
		for(int i = 0 ; i < tableauCompte.length ; i++) {
			System.out.println(tableauCompte[i]);
		}
			
		for(int i = 0 ; i < tableauCompteTest.length ; i++) {
			System.out.println(tableauCompteTest[i]);
		}
	}
}
