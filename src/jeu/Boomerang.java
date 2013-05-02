package jeu;

public class Boomerang extends Hotel{
	
	public Boomerang(){
		this.nom="Boomerang";
		this.emplacementExt=true;
		this.prixTerrain=500;
		this.prixEntree=100;
		this.prixBatimentPrinc=1800;
		this.nbAnnexe=0;
		this.loyer = new int [this.nbAnnexe+2][6];
		this.prixBaseLoisir=250;
		this.loyer[0][0]=400;
		this.loyer[1][0]=600;
		for(int i=1;i<6;i++){
			this.loyer[0][i]=this.loyer[0][i-1]+400;
			this.loyer[1][i]=this.loyer[1][i-1]+600;
		}
		casePlateau.add(Plateau.plateau.get(2));
		casePlateau.add(Plateau.plateau.get(3));
		casePlateau.add(Plateau.plateau.get(4));
		casePlateau.add(Plateau.plateau.get(5));
	}

}
