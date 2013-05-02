package jeu;

public class Fujiyama extends Hotel{
	
	static int prixAnnexe1, prixAnnexe2;
	static boolean annexe1Construit=false;
	static boolean annexe2Construit=false;
	
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
		
	}

}
