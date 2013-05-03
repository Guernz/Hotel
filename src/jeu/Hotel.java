package jeu;

import java.util.ArrayList;

public abstract class Hotel {

	String nom;
	boolean emplacementExt;
	int prixTerrain;
	int prixAchatObligatoire=prixTerrain/2;
	int prixEntree;
	int prixBatimentPrinc;
	boolean batimentPrincConstruit=false;
	int prixBaseLoisir;
	boolean baseLoisirConstruit=false;
	int nbAnnexe;
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
	
	public void setBatimentPrincConstruit(){
		this.batimentPrincConstruit = true;
	}
	
	public boolean getBaseLoisirConstruit(){
		return this.baseLoisirConstruit;
	}
	
	public void setBaseLoisirConstruit(){
		this.baseLoisirConstruit = true;
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
