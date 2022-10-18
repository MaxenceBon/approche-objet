package maps;

import java.util.HashMap;

public class CreationMap {

	public static void main(String[] args) {
		
		HashMap<String, Integer> salaires = new HashMap<>();
		salaires.put("Paul", 1750);
		salaires.put("Hicham", 1825);
		salaires.put("Yu", 2250);
		salaires.put("Ingrid", 2015);
		salaires.put("Chantal", 2418);
		
		System.out.println(salaires.size());

	}

}
