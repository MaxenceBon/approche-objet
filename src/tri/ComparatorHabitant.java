package tri;

import java.util.Comparator;

import listes.Ville;

public class ComparatorHabitant implements Comparator<Ville> {

	public int compare(Ville o1, Ville o2) {
		int result= o1.getNbHabitants() - o2.getNbHabitants();
		return result;
	}
	
}