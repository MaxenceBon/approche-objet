package fr.diginamic.banque.entites;

public class Credit extends Operation{

	public Credit(String dateOperation, int montantOperation) {
		super(dateOperation, montantOperation);
		// TODO Auto-generated constructor stub
	}

	public String getType() {
		// TODO Auto-generated method stub
		return "CREDIT";
	}
	
}
