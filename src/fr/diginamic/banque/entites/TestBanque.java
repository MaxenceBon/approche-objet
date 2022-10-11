package fr.diginamic.banque.entites;

public class TestBanque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compte compte1 = new Compte("16B56S445", 200.45f);
		System.out.println(compte1.getNumeroCompte()+" "+compte1.getSoldeCompte());
	}

}
