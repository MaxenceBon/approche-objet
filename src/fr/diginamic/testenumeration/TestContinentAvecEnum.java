package fr.diginamic.testenumeration;

import java.util.ArrayList;

import listes.Ville;

public class TestContinentAvecEnum {

	public static void main(String[] args) {
		
		ArrayList<Ville> villes = new ArrayList<>();
		villes.add(new Ville("New York", 8000000, Continent.AMERIQUE));
		villes.add(new Ville("Paris", 2000000, Continent.EUROPE));
		villes.add(new Ville("Pékin", 21540000, Continent.ASIE));
		villes.add(new Ville("Moscou", 12000000, Continent.ASIE));
		villes.add(new Ville("Berlin", 3500000, Continent.EUROPE));
		villes.add(new Ville("Sydney", 5000000, Continent.OCEANIE));
		villes.add(new Ville("Sao Paulo", 2000000, Continent.AMERIQUE));
		villes.add(new Ville("Dakar", 1000000, Continent.AFRIQUE));
		
		for (Ville ville : villes) {
			System.out.println(ville);
		}

	}

}
