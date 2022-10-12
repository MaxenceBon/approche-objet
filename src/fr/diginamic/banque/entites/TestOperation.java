package fr.diginamic.banque.entites;

public class TestOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int total;
		
		Credit operation1 = new Credit("01/01/2000", 50);
		Credit operation2 = new Credit("02/01/2000", 100);
		Debit operation3 = new Debit("03/01/2000", 150);
		Debit operation4 = new Debit("04/01/2000", 200);
		
		String[] operations = new String [4];
		operations[0]=operation1.toString()+" "+operation1.getType();
		operations[1]=operation2.toString()+" "+operation2.getType();
		operations[2]=operation3.toString()+" "+operation3.getType();
		operations[3]=operation4.toString()+" "+operation4.getType();
		
		for (int i = 0; i < operations.length; i++) {
			System.out.println(operations[i]);
		}
		
		
	}

}
