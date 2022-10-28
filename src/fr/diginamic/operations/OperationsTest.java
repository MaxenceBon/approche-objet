package fr.diginamic.operations;

import org.junit.jupiter.api.Test;

public class OperationsTest {

	@Test
	void testCalcul() throws Exception {

		try {
			Operations.calcul(5,2,'+');
			Operations.calcul(12,5,'-');
			Operations.calcul(4,6,'*');
			Operations.calcul(15,3,'/');
			Operations.calcul(15,3,':');
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
		}
	}

}
