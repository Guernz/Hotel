package jeu;

public class Royal extends Hotel{

	static int prixAnnexe1, prixAnnexe2, prixAnnexe3;
	static boolean annexe1Construit=false;
	static boolean annexe2Construit=false;
	static boolean annexe3Construit=false;
	
	public Royal(){
		this.nom="Royal";
		this.emplacementExt=false;
		this.prixTerrain=2500;
		this.prixEntree=200;
		this.prixBatimentPrinc=3600;
		this.nbAnnexe=3;
		this.loyer = new int [this.nbAnnexe+2][6];
		this.prixAnnexe1=2600;
		this.prixAnnexe2=1800;
		this.prixAnnexe3=1800;
		this.prixBaseLoisir=3000;
		this.loyer[0][0]=150;
		this.loyer[1][0]=300;
		this.loyer[2][0]=300;
		this.loyer[3][0]=450;
		this.loyer[4][0]=600;
		for(int i=1;i<6;i++){
			this.loyer[0][i]=this.loyer[0][i-1]+150;
			this.loyer[1][i]=this.loyer[1][i-1]+300;
			this.loyer[2][i]=this.loyer[2][i-1]+300;
			this.loyer[3][i]=this.loyer[3][i-1]+450;
			this.loyer[4][i]=this.loyer[4][i-1]+600;
		}
		casePlateau.add(Plateau.plateau.get(11));
		casePlateau.add(Plateau.plateau.get(12));
		casePlateau.add(Plateau.plateau.get(13));
		casePlateau.add(Plateau.plateau.get(14));
		casePlateau.add(Plateau.plateau.get(15));
		casePlateau.add(Plateau.plateau.get(16));
		casePlateau.add(Plateau.plateau.get(17));
		casePlateau.add(Plateau.plateau.get(18));
		casePlateau.add(Plateau.plateau.get(19));
		casePlateau.add(Plateau.plateau.get(20));
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
		if(nbAnnexeConstruite == 3){
			annexe3Construit=true;
			InterfaceGraphique.joueurs.get(numJoueur-1).setArgentJoueur(InterfaceGraphique.joueurs.get(numJoueur-1).getArgentJoueur()-prixAnnexe3);	
		}
	}

}
