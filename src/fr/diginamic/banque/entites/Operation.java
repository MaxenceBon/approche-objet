package fr.diginamic.banque.entites;

public abstract class Operation {

	private String dateOperation;
	private int montantOperation;

	public Operation(String dateOperation, int montantOperation) {
		this.dateOperation=dateOperation;
		this.montantOperation=montantOperation;
	}

	public String toString() {
		return "date de l'opération : "+dateOperation + ", montant de l'opération : " + montantOperation+" € "+getType();
	}
	
	public abstract String getType();
	
	public String getDateOperation() {
		return dateOperation;
	}

	public void setDateOperation(String dateOperation) {
		this.dateOperation = dateOperation;
	}

	public int getMontantOperation() {
		return montantOperation;
	}

	public void setMontantOperation(int montantOperation) {
		this.montantOperation = montantOperation;
	}

}
