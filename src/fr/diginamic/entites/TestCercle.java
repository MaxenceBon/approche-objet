package fr.diginamic.entites;

import fr.diginamic.utils.CercleFactory;

public class TestCercle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cercle cercle1 = new Cercle(4);
		Cercle cercle2 = new Cercle(7);
		
		System.out.println(cercle1.perimetre());
		System.out.println(cercle2.perimetre());
		System.out.println(cercle1.surface());
		System.out.println(cercle2.surface());
		
		Cercle cercle3 = CercleFactory.factoryCercle(8);
		Cercle cercle4 = CercleFactory.factoryCercle(30);
		
		System.out.println(cercle3.perimetre());
		System.out.println(cercle4.perimetre());
		System.out.println(cercle3.surface());
		System.out.println(cercle4.surface());
	}

}
