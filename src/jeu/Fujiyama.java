package jeu;

public class Fujiyama extends Hotel{
	
	int prixAnnexe1, prixAnnexe2;
	boolean annexe1Construit=false;
	boolean annexe2Construit=false;
	
	public Fujiyama(){
		this.nom="Fujiyama";
		this.emplacementExt=false;
		this.prixTerrain=1000;
		this.prixEntree=100;
		this.prixBatimentPrinc=2200;
		this.nbAnnexe=2;
		this.loyer = new int [this.nbAnnexe+2][6];
		this.prixAnnexe1=1400;
		this.prixAnnexe2=1400;
		this.prixBaseLoisir=500;
		this.loyer[0][0]=100;
		this.loyer[1][0]=100;
		this.loyer[2][0]=200;
		this.loyer[3][0]=400;
		for(int i=1;i<6;i++){
			this.loyer[0][i]=this.loyer[0][i-1]+100;
			this.loyer[1][i]=this.loyer[1][i-1]+100;
			this.loyer[2][i]=this.loyer[2][i-1]+200;
			this.loyer[3][i]=this.loyer[3][i-1]+400;
		}
		casePlateau.add(Plateau.plateau.get(1));
		casePlateau.add(Plateau.plateau.get(2));
		casePlateau.add(Plateau.plateau.get(3));
		casePlateau.add(Plateau.plateau.get(4));
		casePlateau.add(Plateau.plateau.get(5));
		casePlateau.add(Plateau.plateau.get(6));
	}

}
