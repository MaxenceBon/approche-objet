package listes;

import java.util.ArrayList;

public class TestListeString {

	public static void main(String[] args) {

		String plusGrand = "";

		ArrayList<String> villes = new ArrayList<String>();
		villes.add("Nice");
		villes.add("Carcassonne");
		villes.add("Narbonne");
		villes.add("Lyon");
		villes.add("Foix");
		villes.add("Pau");
		villes.add("Marseille");
		villes.add("Tarbes");

		for (int i = 0; i < villes.size(); i++) {
			if (villes.get(i).length() > plusGrand.length()) {
				plusGrand = villes.get(i);
			}
		}

		for (int i = 0; i < villes.size(); i++) {
			villes.set(i, villes.get(i).toUpperCase());
		}

		for (int i = 0; i < villes.size(); i++) {
			if (villes.get(i).charAt(0) == 'N') {
				villes.remove(i);
			}
		}

		System.out.println(villes);

	}

}
