package fr.diginamic.operations;

public class Operations {

	public static double calcul(double a, double b, char operateur) throws Exception {
		if (operateur == '+') {
			return a + b ;
		} else if (operateur == '-') {
			return a - b;
		} else if (operateur == '*') {
			return a * b;
		} else if (operateur == '/') {
			return a / b;
		} else {
			throw new Exception("Opérateur non reconnu");
		}
	}
}