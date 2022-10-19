package fr.diginamic.chaines;

public class TestStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long debut = System.currentTimeMillis();
		
		StringBuilder builder = new StringBuilder();
		for (int i = 1; i<=100000; i++) {
			builder.append(i);
		}

		long fin = System.currentTimeMillis();
		System.out.println("Temps écoulé en millisecondes :"+(fin-debut));
		
		
		
		long debut1 = System.currentTimeMillis();
		
		String builder1="";
		for (int i = 1; i<=100000; i++) {
			builder1 = builder1+String.valueOf(i);
		}

		long fin1 = System.currentTimeMillis();
		System.out.println("Temps écoulé en millisecondes :"+(fin1-debut1));
		
	}
	
}
