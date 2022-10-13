package fr.diginamic.essais;

import fr.diginamic.entites.Theatre;

public class TestTheatre {
	
	public static void main(String[] args) {
	
	Theatre theatre1= new Theatre("Truc", 500, 0, 0);

	theatre1.inscrire(100,5);
	System.out.println(theatre1.toString());
	theatre1.inscrire(200,10);
	System.out.println(theatre1.toString());
	theatre1.inscrire(50,15);
	System.out.println(theatre1.toString());
	theatre1.inscrire(100,5);
	System.out.println(theatre1.toString());
	theatre1.inscrire(50,10);
	System.out.println(theatre1.toString());
	theatre1.inscrire(1,10);
	System.out.println(theatre1.toString());
	
	}
}