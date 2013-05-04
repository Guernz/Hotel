package jeu;

public class TajMahal extends Hotel{
	
	static int prixAnnexe1, prixAnnexe2;
	static boolean annexe1Construit = false;
	static boolean annexe2Construit = false;
	
	public TajMahal(){
		this.nom="TajMahal";
		this.emplacementExt=true;
		this.prixTerrain=1500;
		this.prixEntree=100;
		this.prixBatimentPrinc=2400;
		this.nbAnnexe=2;
		this.loyer = new int [this.nbAnnexe+2][6];
		this.prixAnnexe1=1000;
		this.prixAnnexe2=500;
		this.prixBaseLoisir=1000;
		this.loyer[0][0]=100;
		this.loyer[1][0]=100;
		this.loyer[2][0]=200;
		this.loyer[3][0]=300;
		for(int i=1;i<6;i++){
			this.loyer[0][i]=this.loyer[0][i-1]+100;
			this.loyer[1][i]=this.loyer[1][i-1]+100;
			this.loyer[2][i]=this.loyer[2][i-1]+200;
			this.loyer[3][i]=this.loyer[3][i-1]+300;
		}
		casePlateau.add(Plateau.plateau.get(21));
		casePlateau.add(Plateau.plateau.get(22));
		casePlateau.add(Plateau.plateau.get(23));
		casePlateau.add(Plateau.plateau.get(24));
		casePlateau.add(Plateau.plateau.get(25));
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
		return resDeConstruit;
	}
	
	public static void construireGratuitAnnexe(int numJoueur){
		if(nbAnnexeConstruite == 1){
			annexe1Construit=true;
		}
		if(nbAnnexeConstruite == 2){
			annexe2Construit=true;
		}
	}

}
