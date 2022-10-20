package listes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import tri.ComparatorHabitant;
import tri.ComparatorNom;

public class TestVille{
	
	public static void main(String[] args) {
		
		int plusGrand=0;
		int plusPetitHabitant = 1000000;
		String villePlusGrande="";
		
		Ville ville1 = new Ville("Nice", 343000);
		Ville ville2 = new Ville("Nice", 343000);
//		Ville ville2 = new Ville("Carcassonne", 47800);
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
			if (villes.get(i).getNbHabitants() > plusGrand) {
				plusGrand = villes.get(i).getNbHabitants();
				villePlusGrande = villes.get(i).getNom();
			}
		}
		System.out.println("La ville la plus peuplée est : " + villePlusGrande);

		for (int i = 0; i < villes.size(); i++) {
			if (villes.get(i).getNbHabitants() < plusPetitHabitant) {
				plusPetitHabitant = villes.get(i).getNbHabitants();
			}

		}
		
		Iterator<Ville> iter = villes.iterator();
		while (iter.hasNext()) {
			Ville ville = iter.next();
			if (ville.getNbHabitants() == plusPetitHabitant) {
				iter.remove();
			}
		}
		
//		for (int i = 0; i < villes.size(); i++) {
//			if (villes.get(i).nbHabitants == plusPetitHabitant) {
//				villes.remove(i);
//			}
//
//		}

		for (int i = 0; i < villes.size(); i++) {
			if (villes.get(i).getNbHabitants() > 100000) {
				villes.set(i, new Ville(villes.get(i).getNom().toUpperCase(), villes.get(i).getNbHabitants()));
			}
		}

		for (Ville ville : villes) {
			System.out.println(ville);
		}
		System.out.println("fin");
		
//		Collections.sort(villes);
//		for (Ville ville : villes) {
//			System.out.println(ville);
//		}
//		System.out.println("fin");
		
		System.out.println("Tri par nom");
		Collections.sort(villes, new ComparatorNom());
		for (Ville ville : villes) {
			System.out.println(ville);
		}
		
		System.out.println("Tri par nb habitant");
		Collections.sort(villes, new ComparatorHabitant());
		for (Ville ville : villes) {
			System.out.println(ville);
		}
		
		boolean test1 = ville1.equals(ville2);
		System.out.println(test1);
	}
}
