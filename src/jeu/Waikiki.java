package jeu;

public class Waikiki extends Hotel{

	int prixAnnexe1, prixAnnexe2, prixAnnexe3, prixAnnexe4;
	boolean annexe1Construit=false;
	boolean annexe2Construit=false;
	boolean annexe3Construit=false;
	boolean annexe4Construit=false;
	
	public Waikiki(){
		this.nom="Waikiki";
		this.emplacementExt=true;
		this.prixTerrain=2500;
		this.prixEntree=200;
		this.prixBatimentPrinc=3500;
		this.nbAnnexe=4;
		this.loyer = new int [this.nbAnnexe+2][6];
		this.prixAnnexe1=2500;
		this.prixAnnexe2=2500;
		this.prixAnnexe3=1750;
		this.prixAnnexe4=1750;
		this.prixBaseLoisir=2500;
		this.loyer[0][0]=200;
		this.loyer[1][0]=350;
		this.loyer[2][0]=500;
		this.loyer[3][0]=500;
		this.loyer[4][0]=650;
		this.loyer[5][0]=1000;
		for(int i=1;i<6;i++){
			this.loyer[0][i]=this.loyer[0][i-1]+200;
			this.loyer[1][i]=this.loyer[1][i-1]+350;
			this.loyer[2][i]=this.loyer[2][i-1]+500;
			this.loyer[3][i]=this.loyer[3][i-1]+500;
			this.loyer[4][i]=this.loyer[4][i-1]+650;
			this.loyer[5][i]=this.loyer[5][i-1]+1000;
		}
		casePlateau.add(Plateau.plateau.get(16));
		casePlateau.add(Plateau.plateau.get(17));
		casePlateau.add(Plateau.plateau.get(18));
		casePlateau.add(Plateau.plateau.get(19));
		casePlateau.add(Plateau.plateau.get(20));
	}

}
