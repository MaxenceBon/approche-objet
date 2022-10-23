package fr.diginamic.maison;

public class Maison {
	
	private Piece[] pieces;
	
	public Maison() {
		pieces = new Piece[0];
	}
	
	public void ajouterPiece (Piece piece) {
		
		Piece[] nvTableau= new Piece[pieces.length+1];
		for (int i=0 ; i < pieces.length ; i++) {
			nvTableau[i]=pieces[i];
		}
		
		nvTableau[nvTableau.length-1]=piece;
		this.pieces=nvTableau;
	}
	
	public double calculerSurface() {
		double superficieTot = 0;

		for (int i = 0; i < pieces.length; i++) {
			superficieTot = superficieTot + this.pieces[i].getSuperficie();
		}

		return superficieTot;
	}
	
}
