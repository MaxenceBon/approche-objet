package fr.diginamic.operations;

public class Operations {

	double a;
	double b;
	char operateur;

	public static double calcul(double a, double b, char operateur) {
		if (operateur == '+') {
			return a + b;
		} else if (operateur == '-') {
			return a - b;
		} else if (operateur == '*') {
			return a * b;
		} else if (operateur == '/') {
			return a / b;
		}
		return operateur;
	}
}
