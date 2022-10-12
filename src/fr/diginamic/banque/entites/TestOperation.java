package fr.diginamic.banque.entites;

public class TestOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int total=0;
		
		Operation[] operations = new Operation [4];
		operations[0]=new Credit("01/01/2000", 50);
		operations[1]=new Credit("02/01/2000", 500);
		operations[2]=new Debit("03/01/2000", 150);
		operations[3]=new Debit("04/01/2000", 200);
		
		for (int i = 0; i < operations.length; i++) {
			if (operations[i].getType().equals("CREDIT")) {
				total += operations[i].getMontantOperation();
			} else if (operations[i].getType().equals("DEBIT")) {
				total -= operations[i].getMontantOperation();
			}
		System.out.println(operations[i]);
		}
		
//		for (Operation i : operations) {   Similaire à boucle for
//			System.out.println(i);
//		}
		
		System.out.println(total);	
	}

}
