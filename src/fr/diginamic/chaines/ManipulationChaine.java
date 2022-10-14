package fr.diginamic.chaines;

import fr.diginamic.entites.Salarie;

public class ManipulationChaine {

	public static void main(String[] args) {

		String chaineString = "Durand; Marcel; 2 523.5";
		String chaineString1 = chaineString.replace(" ", "");
		System.out.println("Premier caractère: " + chaineString1.charAt(0));
		System.out.println(chaineString1.length());
		System.out.println(chaineString1.indexOf(';'));
		System.out.println(chaineString1.substring(2, 5));
		System.out.println(chaineString1.substring(0, chaineString1.indexOf(';')));
		System.out.println(chaineString1.substring(0, chaineString1.indexOf(';')).toUpperCase());
		System.out.println(chaineString1.substring(0, chaineString1.indexOf(';')).toLowerCase());
		String[] words = chaineString1.split(";"); // decoupe String selon séparateur
		for (String word : words) {
			System.out.println(word);
		}
		Salarie chaineStringTest = new Salarie(words[0], words[1], Double.parseDouble(words[2]));
		System.out.println(chaineStringTest);
	}

}