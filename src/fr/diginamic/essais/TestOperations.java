package fr.diginamic.essais;

import fr.diginamic.operations.Operations;

public class TestOperations {

	public static void main(String[] args) {
		
		double addition = Operations.calcul(4,6,'+');
		System.out.println(addition);
	
		double soustraction = Operations.calcul(4,6,'-');
		System.out.println(soustraction);
		
		double multiplication = Operations.calcul(4,6,'*');
		System.out.println(multiplication);
		
		double division = Operations.calcul(4,6,'/');
		System.out.println(division);
	}

}
