package jeu;

public class Etoile extends Hotel{
	
	static int prixAnnexe1, prixAnnexe2, prixAnnexe3, prixAnnexe4;
	static boolean annexe1Construit=false;
	static boolean annexe2Construit=false;
	static boolean annexe3Construit=false;
	static boolean annexe4Construit=false;
	
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
	
	public static void construireAnnexe(int numJoueur){
		if(nbAnnexeConstruite == 1){
			int resDeConstruit = De.lancerDeConstruit();
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
			int resDeConstruit = De.lancerDeConstruit();
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
			int resDeConstruit = De.lancerDeConstruit();
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
		if(nbAnnexeConstruite == 4){
			int resDeConstruit = De.lancerDeConstruit();
			switch(resDeConstruit){
			case 0:
				break;
			case 1:
				annexe4Construit=true;
				InterfaceGraphique.joueurs.get(numJoueur-1).setArgentJoueur(InterfaceGraphique.joueurs.get(numJoueur-1).getArgentJoueur()-prixAnnexe4);	
				break;
			case 2:
				annexe4Construit=true;
				InterfaceGraphique.joueurs.get(numJoueur-1).setArgentJoueur(InterfaceGraphique.joueurs.get(numJoueur-1).getArgentJoueur()-prixAnnexe4*2);	
				break;
			case 3:
				annexe4Construit=true;
				break;
			}
		}
	}


}
