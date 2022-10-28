package fr.diginamic.essais;

import fr.diginamic.operations.Operations;

public class TestOperations {

	public static void main(String[] args) throws Exception {
		
		System.out.println(Operations.calcul(4,8,'+'));
		System.out.println(Operations.calcul(12,5,'-'));
		System.out.println(Operations.calcul(4,6,'*'));
		System.out.println(Operations.calcul(15,3,'/'));

		double soustraction = Operations.calcul(4, 6, '-');
		System.out.println(soustraction);

		double multiplication = Operations.calcul(4, 6, '*');
		System.out.println(multiplication);

		double division = Operations.calcul(4, 6, '/');
		System.out.println(division);
	}

}
