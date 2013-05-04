package jeu;

import java.util.ArrayList;

public abstract class Hotel {

	String nom;
	boolean emplacementExt;
	int prixTerrain;
	int prixEntree;
	int prixBatimentPrinc;
	boolean batimentPrincConstruit=false;
	int prixBaseLoisir;
	boolean baseLoisirConstruit=false;
	int nbAnnexe;
	static int nbAnnexeConstruite = 0;
	int loyer[][];
	int joueurProprio=0;
	ArrayList<Case> casePlateau = new ArrayList<Case>();
	
	public String getNom(){
		return this.nom;
	}
	
	public int getPrixTerrain(){
		return this.prixTerrain;
	}
	
	public boolean getBatimentPrincConstruit(){
		return this.batimentPrincConstruit;
	}
	
	public boolean getBaseLoisirConstruit(){
		return this.baseLoisirConstruit;
	}
	
	public int getJoueurProprio(){
		return this.joueurProprio;
	}
	
	
	public void achatHotel(int numJoueur){
		this.joueurProprio = numJoueur;
		InterfaceGraphique.joueurs.get(numJoueur-1).setArgentJoueur(InterfaceGraphique.joueurs.get(numJoueur-1).getArgentJoueur()-this.prixTerrain);
	}
	
	public void rachatHotel(int acheteur){
		int vendeur = getJoueurProprio();
		this.joueurProprio = acheteur;
		InterfaceGraphique.joueurs.get(acheteur-1).setArgentJoueur(InterfaceGraphique.joueurs.get(acheteur-1).getArgentJoueur()-this.prixTerrain/2);
		InterfaceGraphique.joueurs.get(vendeur-1).setArgentJoueur(InterfaceGraphique.joueurs.get(vendeur-1).getArgentJoueur()+this.prixTerrain/2);
	}
	
	public int construit(int numJoueur, String nom){
		int resDeConstruit = 10;
		if(!this.batimentPrincConstruit){
			resDeConstruit = De.lancerDeConstruit();
			switch(resDeConstruit){
			case 0:
				System.out.println("construit pas");
				break;
			case 1:
				System.out.println("construit");
				InterfaceGraphique.joueurs.get(numJoueur-1).setArgentJoueur(InterfaceGraphique.joueurs.get(numJoueur-1).getArgentJoueur()-this.prixBatimentPrinc);
				this.batimentPrincConstruit=true;
				break;
			case 2:
				System.out.println("construit double");
				InterfaceGraphique.joueurs.get(numJoueur-1).setArgentJoueur(InterfaceGraphique.joueurs.get(numJoueur-1).getArgentJoueur()-this.prixBatimentPrinc*2);
				this.batimentPrincConstruit=true;
				break;
			case 3:
				System.out.println("construit gratuit");
				this.batimentPrincConstruit=true;
				break;
			}	
		}
		else{
			if(this.nbAnnexeConstruite<this.nbAnnexe){
				this.nbAnnexeConstruite++;
				if(nom.equals("Fujiyama")){
					resDeConstruit=Fujiyama.construireAnnexe(numJoueur);
				}
				if(nom.equals("Etoile")){
					resDeConstruit=Etoile.construireAnnexe(numJoueur);
				}
				if(nom.equals("President")){
					resDeConstruit=President.construireAnnexe(numJoueur);
				}
				if(nom.equals("Royal")){
					resDeConstruit=Royal.construireAnnexe(numJoueur);
				}
				if(nom.equals("Safari")){
					resDeConstruit=Safari.construireAnnexe(numJoueur);
				}
				if(nom.equals("TajMahal")){
					resDeConstruit=TajMahal.construireAnnexe(numJoueur);
				}
				if(nom.equals("Waikiki")){
					resDeConstruit=Waikiki.construireAnnexe(numJoueur);
				}
			}
			else{
				resDeConstruit = De.lancerDeConstruit();
				switch(resDeConstruit){
				case 0:
					break;
				case 1:
					this.baseLoisirConstruit=true;
					InterfaceGraphique.joueurs.get(numJoueur-1).setArgentJoueur(InterfaceGraphique.joueurs.get(numJoueur-1).getArgentJoueur()-this.prixBaseLoisir);
					break;
				case 2:
					this.baseLoisirConstruit=true;
					InterfaceGraphique.joueurs.get(numJoueur-1).setArgentJoueur(InterfaceGraphique.joueurs.get(numJoueur-1).getArgentJoueur()-this.prixBaseLoisir*2);
					break;
				case 3:
					this.baseLoisirConstruit=true;
					break;
				}
			}
		}
		return resDeConstruit;
	}
	
	public void construitGratuit(int numJoueur, String nom){
		if(!this.batimentPrincConstruit){
				this.batimentPrincConstruit=true;
		}
		else{
			if(this.nbAnnexeConstruite<this.nbAnnexe){
				this.nbAnnexeConstruite++;
				if(nom.equals("Fujiyama")){
					Fujiyama.construireGratuitAnnexe(numJoueur);
				}
				if(nom.equals("Etoile")){
					Etoile.construireGratuitAnnexe(numJoueur);
				}
				if(nom.equals("President")){
					President.construireGratuitAnnexe(numJoueur);
				}
				if(nom.equals("Royal")){
					Royal.construireGratuitAnnexe(numJoueur);
				}
				if(nom.equals("Safari")){
					Safari.construireGratuitAnnexe(numJoueur);
				}
				if(nom.equals("TajMahal")){
					TajMahal.construireGratuitAnnexe(numJoueur);
				}
				if(nom.equals("Waikiki")){
					Waikiki.construireGratuitAnnexe(numJoueur);
				}
			}
			else{
				this.baseLoisirConstruit=true;
			}
		}
	}
	
	public static Hotel trouveHotel(String nom, ArrayList<Hotel> liste){
		int size = liste.size();
		int i =0;
		Hotel rep = null;
		boolean trouve = false;
		while(!trouve && i<size){
			if(liste.get(i).getNom().equals(nom)){
				rep = liste.get(i);
				trouve = true;
			}
			i++;
		}
		if(!trouve){
			System.out.println("hotel non trouv�");
		}
		return rep;
	}
	
	public static ArrayList<Hotel> trouveHotel(int numCase, ArrayList<Hotel> hotels){
		int sizeArrayList = hotels.size();
		ArrayList<Hotel> res = new ArrayList<Hotel>();
		for(int i = 0 ; i<sizeArrayList ; i++){
			int sizeTableauCase = hotels.get(i).casePlateau.size();
			int j = 0;
			boolean trouve = false;
			while( j<sizeTableauCase && !trouve ){
				if(hotels.get(i).casePlateau.get(j).getNum() == numCase){
					res.add(hotels.get(i));
					trouve = true;
				}
				j++;
			}
		}
		return res;
	}

}
