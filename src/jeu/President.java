package jeu;

public class President extends Hotel{

	int prixAnnexe1, prixAnnexe2, prixAnnexe3;
	boolean annexe1Construit=false;
	boolean annexe2Construit=false;
	boolean annexe3Construit=false;
	
	public President(){
		this.nom="President";
		this.emplacementExt=true;
		this.prixTerrain=3500;
		this.prixEntree=250;
		this.prixBatimentPrinc=5000;
		this.nbAnnexe=3;
		this.loyer = new int [this.nbAnnexe+2][6];
		this.prixAnnexe1=3000;
		this.prixAnnexe2=2250;
		this.prixAnnexe3=1750;
		this.prixBaseLoisir=5000;
		this.loyer[0][0]=200;
		this.loyer[1][0]=400;
		this.loyer[2][0]=600;
		this.loyer[3][0]=800;
		this.loyer[4][0]=1100;
		for(int i=1;i<6;i++){
			this.loyer[0][i]=this.loyer[0][i-1]+200;
			this.loyer[1][i]=this.loyer[1][i-1]+400;
			this.loyer[2][i]=this.loyer[2][i-1]+600;
			this.loyer[3][i]=this.loyer[3][i-1]+800;
			this.loyer[4][i]=this.loyer[4][i-1]+1100;
		}
		casePlateau.add(Plateau.plateau.get(9));
		casePlateau.add(Plateau.plateau.get(10));
		casePlateau.add(Plateau.plateau.get(11));
		casePlateau.add(Plateau.plateau.get(12));
		casePlateau.add(Plateau.plateau.get(13));
		casePlateau.add(Plateau.plateau.get(14));
		casePlateau.add(Plateau.plateau.get(15));
	}
	
}
