package maps;

import java.util.ArrayList;
import java.util.HashMap;
//import java.util.Iterator;

import listes.Ville;

public class MapVilles {

	public static void main(String[] args) {
		
		int plusPetitHabitant=Integer.MAX_VALUE;
		
		ArrayList<Ville> villes = new ArrayList<Ville>();
		villes.add(new Ville("Nice", 343000));
		villes.add(new Ville("Carcassonne", 47800));
		villes.add(new Ville("Narbonne", 53400));
		villes.add(new Ville("Lyon", 484000));
		villes.add(new Ville("Foix", 9700));
		villes.add(new Ville("Pau", 77200));
		villes.add(new Ville("Marseille", 850700));
		villes.add(new Ville("Tarbes", 40600));
		
		
		HashMap<String, Ville> mapVilles = new HashMap<>();
//		for (Ville v: villes) {
//			mapVilles.put(v.getNom(), v);
//		}
		
		for (int i=0;i<villes.size();i++) {
			Ville v= villes.get(i);
			MapVilles.put(v.getNom(),v);
		}
		
		Integer min= Integer.MAX_VALUE;
		String nomVilleMin = null;
		for (String nomVille : mapVilles.keySet()) {
			Ville v = mapVilles.get(nomVille);
			if (v.getNbHabitants()<min) {
				min = v.getNbHabitants();
				nomVilleMin=v.getNom();
			}
		}
		mapVilles.remove(nomVilleMin);
		
//		Iterator<Integer> valeurs = villes.values().iterator();
//		while (valeurs.hasNext()) {
//			Integer valeur = valeurs.next();
//			if (valeur < plusPetitHabitant) {
//				plusPetitHabitant = valeur;
//			}
//		}
//		
//		Iterator<Integer> iter = villes.values().iterator();
//		while (iter.hasNext()) {
//			Integer valeur = iter.next();
//			if (valeur == plusPetitHabitant) {
//				iter.remove();		
//			}
//		}
		System.out.println(villes);
	}

	private static void put(String nom, Ville v) {
		// TODO Auto-generated method stub
		
	}
}
