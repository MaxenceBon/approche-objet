package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.Collections;

public class TestListeInt {

	public static void main(String[] args) {
		
		ArrayList<Integer> entiers = new ArrayList<Integer>();
		entiers.add(-1);
		entiers.add(5);
		entiers.add(7);
		entiers.add(3);
		entiers.add(-2);
		entiers.add(4);
		entiers.add(8);
		entiers.add(5);
		
		System.out.println(entiers);
		System.out.println(entiers.size());
		System.out.println(Collections.max(entiers));
		
		entiers.remove(Collections.min(entiers));
		
		for (int i=0; i < entiers.size(); i++) {
			if (entiers.get(i)<0) {
				entiers.set(i, entiers.get(i)*(-1));
			}
		}
		
		System.out.println(entiers);
	}
}
