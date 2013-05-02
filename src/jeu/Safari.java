package jeu;

public class Safari extends Hotel{
	
	static int prixAnnexe1, prixAnnexe2;
	static boolean annexe1Construit=false;
	static boolean annexe2Construit=false;
	
	public Safari(){
		this.nom="Fujiyama";
		this.emplacementExt=true;
		this.prixTerrain=2000;
		this.prixEntree=150;
		this.prixBatimentPrinc=2600;
		this.nbAnnexe=2;
		this.loyer = new int [this.nbAnnexe+2][6];
		this.prixAnnexe1=1200;
		this.prixAnnexe2=1200;
		this.prixBaseLoisir=2000;
		this.loyer[0][0]=100;
		this.loyer[1][0]=100;
		this.loyer[2][0]=250;
		this.loyer[3][0]=500;
		for(int i=1;i<6;i++){
			this.loyer[0][i]=this.loyer[0][i-1]+100;
			this.loyer[1][i]=this.loyer[1][i-1]+100;
			this.loyer[2][i]=this.loyer[2][i-1]+250;
			this.loyer[3][i]=this.loyer[3][i-1]+500;
		}
		casePlateau.add(Plateau.plateau.get(26));
		casePlateau.add(Plateau.plateau.get(27));
		casePlateau.add(Plateau.plateau.get(28));
		casePlateau.add(Plateau.plateau.get(29));
		casePlateau.add(Plateau.plateau.get(30));
	}
	
	public static void construireAnnexe(int numJoueur){
		if(nbAnnexeConstruite == 1){
			annexe1Construit=true;
			InterfaceGraphique.joueurs.get(numJoueur-1).setArgentJoueur(InterfaceGraphique.joueurs.get(numJoueur-1).getArgentJoueur()-prixAnnexe1);	
		}
		if(nbAnnexeConstruite == 2){
			annexe2Construit=true;
			InterfaceGraphique.joueurs.get(numJoueur-1).setArgentJoueur(InterfaceGraphique.joueurs.get(numJoueur-1).getArgentJoueur()-prixAnnexe2);	
		}
	}

}
