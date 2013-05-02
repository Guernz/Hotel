package jeu;

public class Etoile extends Hotel{
	
	int prixAnnexe1, prixAnnexe2, prixAnnexe3, prixAnnexe4;
	boolean annexe1Construit=false;
	boolean annexe2Construit=false;
	boolean annexe3Construit=false;
	boolean annexe4Construit=false;
	
	public Etoile(){
		this.nom="Etoile";
		this.emplacementExt=false;
		this.prixTerrain=3000;
		this.prixEntree=250;
		this.prixBatimentPrinc=3300;
		this.nbAnnexe=4;
		this.loyer = new int [this.nbAnnexe+2][6];
		this.prixAnnexe1=2200;
		this.prixAnnexe2=1800;
		this.prixAnnexe3=1800;
		this.prixAnnexe4=1800;
		this.prixBaseLoisir=4000;
		this.loyer[0][0]=150;
		this.loyer[1][0]=300;
		this.loyer[2][0]=300;
		this.loyer[3][0]=300;
		this.loyer[4][0]=450;
		this.loyer[5][0]=750;
		for(int i=1;i<6;i++){
			this.loyer[0][i]=this.loyer[0][i-1]+150;
			this.loyer[1][i]=this.loyer[1][i-1]+300;
			this.loyer[2][i]=this.loyer[2][i-1]+300;
			this.loyer[3][i]=this.loyer[3][i-1]+300;
			this.loyer[4][i]=this.loyer[4][i-1]+450;
			this.loyer[5][i]=this.loyer[5][i-1]+750;
		}
		casePlateau.add(Plateau.plateau.get(8));
		casePlateau.add(Plateau.plateau.get(9));
		casePlateau.add(Plateau.plateau.get(10));
		casePlateau.add(Plateau.plateau.get(21));
		casePlateau.add(Plateau.plateau.get(22));
		casePlateau.add(Plateau.plateau.get(23));
		casePlateau.add(Plateau.plateau.get(24));
		casePlateau.add(Plateau.plateau.get(28));
		casePlateau.add(Plateau.plateau.get(29));
	}


}
