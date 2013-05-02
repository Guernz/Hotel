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
	static int nbAnnexe;
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
	
	public void construit(int numJoueur, String nom){
		if(!this.batimentPrincConstruit){
			this.batimentPrincConstruit=true;
			InterfaceGraphique.joueurs.get(numJoueur-1).setArgentJoueur(InterfaceGraphique.joueurs.get(numJoueur-1).getArgentJoueur()-this.prixBatimentPrinc);	
		}
		else{
			if(this.nbAnnexeConstruite<this.nbAnnexe){
				this.nbAnnexeConstruite++;
				if(nom.equals("Fujiyama")){
					Fujiyama.construireAnnexe(numJoueur);
				}
				if(nom.equals("Etoile")){
					Etoile.construireAnnexe(numJoueur);
				}
				if(nom.equals("President")){
					President.construireAnnexe(numJoueur);
				}
				if(nom.equals("Royal")){
					Royal.construireAnnexe(numJoueur);
				}
				if(nom.equals("Safari")){
					Safari.construireAnnexe(numJoueur);
				}
				if(nom.equals("TajMahal")){
					TajMahal.construireAnnexe(numJoueur);
				}
				if(nom.equals("Waikiki")){
					Waikiki.construireAnnexe(numJoueur);
				}
			}
			//if(this.nbAnnexeConstruite == this.nbAnnexe){
			else{
				this.baseLoisirConstruit=true;
				InterfaceGraphique.joueurs.get(numJoueur-1).setArgentJoueur(InterfaceGraphique.joueurs.get(numJoueur-1).getArgentJoueur()-this.prixBaseLoisir);	
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
			System.out.println("hotel non trouvé");
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
