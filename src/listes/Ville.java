package listes;

import java.util.ArrayList;

public class Ville {

	String nom;
	int nbHabitants;
	static int plusGrand;
	static int plusPetitHabitant = 1000000;
	static String villePlusGrande;

	public Ville(String nom, int nbHabitant) {
		this.nom = nom;
		this.nbHabitants = nbHabitant;
	}

	public String toString() {
		return "Ville : " + nom + ", nombre d'habitants : " + nbHabitants;
	}

	public static void main(String[] args) {

		Ville ville1 = new Ville("Nice", 343000);
		Ville ville2 = new Ville("Carcassonne", 47800);
		Ville ville3 = new Ville("Narbonne", 53400);
		Ville ville4 = new Ville("Lyon", 484000);
		Ville ville5 = new Ville("Foix", 9700);
		Ville ville6 = new Ville("Pau", 77200);
		Ville ville7 = new Ville("Marseille", 850700);
		Ville ville8 = new Ville("Tarbes", 40600);

		ArrayList<Ville> villes = new ArrayList<Ville>();
		villes.add(ville1);
		villes.add(ville2);
		villes.add(ville3);
		villes.add(ville4);
		villes.add(ville5);
		villes.add(ville6);
		villes.add(ville7);
		villes.add(ville8);

		for (Ville ville : villes) {
			System.out.println(ville);
		}

		for (int i = 0; i < villes.size(); i++) {
			if (villes.get(i).nbHabitants > plusGrand) {
				plusGrand = villes.get(i).nbHabitants;
				villePlusGrande = villes.get(i).nom;
			}
		}
		System.out.println("La ville la plus peuplée est : " + villePlusGrande);

		for (int i = 0; i < villes.size(); i++) {
			if (villes.get(i).nbHabitants < plusPetitHabitant) {
				plusPetitHabitant = villes.get(i).nbHabitants;
			}

		}

		for (int i = 0; i < villes.size(); i++) {
			if (villes.get(i).nbHabitants == plusPetitHabitant) {
				villes.remove(i);
			}

		}

		for (int i = 0; i < villes.size(); i++) {
			if (villes.get(i).nbHabitants > 100000) {
				villes.set(i, new Ville(villes.get(i).nom.toUpperCase(), villes.get(i).nbHabitants));
			}
		}

		for (Ville ville : villes) {
			System.out.println(ville);
		}
	}
}
