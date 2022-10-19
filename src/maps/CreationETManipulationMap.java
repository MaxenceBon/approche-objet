package maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class CreationETManipulationMap {

	public static void main(String[] args) {
		
		HashMap<Integer, String> mapVilles = new HashMap<>();
		mapVilles.put(13, "Marseille");
		mapVilles.put(34, "Montpellier");
		mapVilles.put(44, "Nantes");
		mapVilles.put(75, "Paris");
		mapVilles.put(31, "Toulouse");
		mapVilles.put(59, "Lille");
		mapVilles.put(69, "Lyon");
		mapVilles.put(33, "Bordeaux");
		
		Set<Integer> keys = mapVilles.keySet();
		for (Integer key : keys) {
			System.out.println(key);
		}	
		
		Iterator<String> valeurs = mapVilles.values().iterator();
		while (valeurs.hasNext()) {
			String valeur = valeurs.next();
			System.out.println(valeur);
		}
		
		System.out.println(mapVilles.size());

	}
}