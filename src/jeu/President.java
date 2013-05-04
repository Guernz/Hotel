package jeu;

public class President extends Hotel{

	static int prixAnnexe1, prixAnnexe2, prixAnnexe3;
	static boolean annexe1Construit=false;
	static boolean annexe2Construit=false;
	static boolean annexe3Construit=false;
	
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
	
	public static int construireAnnexe(int numJoueur){
		int resDeConstruit = 10;
		if(nbAnnexeConstruite == 1){
			resDeConstruit = De.lancerDeConstruit();
			switch(resDeConstruit){
			case 0:
				break;
			case 1:
				annexe1Construit=true;
				InterfaceGraphique.joueurs.get(numJoueur-1).setArgentJoueur(InterfaceGraphique.joueurs.get(numJoueur-1).getArgentJoueur()-prixAnnexe1);	
				break;
			case 2:
				annexe1Construit=true;
				InterfaceGraphique.joueurs.get(numJoueur-1).setArgentJoueur(InterfaceGraphique.joueurs.get(numJoueur-1).getArgentJoueur()-prixAnnexe1*2);	
				break;
			case 3:
				annexe1Construit=true;
				break;
			}
		}
		if(nbAnnexeConstruite == 2){
			resDeConstruit = De.lancerDeConstruit();
			switch(resDeConstruit){
			case 0:
				break;
			case 1:
				annexe2Construit=true;
				InterfaceGraphique.joueurs.get(numJoueur-1).setArgentJoueur(InterfaceGraphique.joueurs.get(numJoueur-1).getArgentJoueur()-prixAnnexe2);	
				break;
			case 2:
				annexe2Construit=true;
				InterfaceGraphique.joueurs.get(numJoueur-1).setArgentJoueur(InterfaceGraphique.joueurs.get(numJoueur-1).getArgentJoueur()-prixAnnexe2*2);	
				break;
			case 3:
				annexe2Construit=true;
				break;
			}
		}
		if(nbAnnexeConstruite == 3){
			resDeConstruit = De.lancerDeConstruit();
			switch(resDeConstruit){
			case 0:
				break;
			case 1:
				annexe3Construit=true;
				InterfaceGraphique.joueurs.get(numJoueur-1).setArgentJoueur(InterfaceGraphique.joueurs.get(numJoueur-1).getArgentJoueur()-prixAnnexe3);	
				break;
			case 2:
				annexe3Construit=true;
				InterfaceGraphique.joueurs.get(numJoueur-1).setArgentJoueur(InterfaceGraphique.joueurs.get(numJoueur-1).getArgentJoueur()-prixAnnexe3*2);	
				break;
			case 3:
				annexe3Construit=true;
				break;
			}
		}
		return resDeConstruit;
	}
	
	public static void construireGratuitAnnexe(int numJoueur){
		if(nbAnnexeConstruite == 1){
			annexe1Construit=true;
		}
		if(nbAnnexeConstruite == 2){
			annexe2Construit=true;
		}
		if(nbAnnexeConstruite == 3){
			annexe3Construit=true;
		}
	}
	
}
