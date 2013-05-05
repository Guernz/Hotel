package jeu;

import java.util.ArrayList;

public class Case {
	
	boolean noirInt;
	boolean noirExt;
	boolean entreeInt = false;
	boolean entreeExt = false;
	int num;
	int x;
	int y;
	int type;
	//type de case :
	// - depart (1)
	// - entr�e gratuite (2)
	// - construction gratuite (3)
	// - permis de construire (4)
	// - achat (5)
	// entre case 7 et 8 banque
	// entre case 26 et 27 achat entr�e
	// 31 cases

	public Case(int num, int type, boolean noirInt, boolean noirExt, int x, int y){
		this.num=num;
		this.type = type;
		this.noirInt = noirInt;
		this.noirExt = noirExt;
		this.x = x;
		this.y = y;
	}
	
	public boolean isEntreeInt() {
		return entreeInt;
	}

	public void setEntreeInt(boolean entreeInt) {
		this.entreeInt = entreeInt;
	}

	public boolean isEntreeExt() {
		return entreeExt;
	}

	public void setEntreeExt(boolean entreeExt) {
		this.entreeExt = entreeExt;
	}

	public boolean isNoirInt() {
		return noirInt;
	}

	public boolean isNoirExt() {
		return noirExt;
	}

	public int getType() {
		return type;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public int getNum() {
		return num;
	}
	
	/**
	 * Fonction retourne vrai si le joueur peut placer une entrée
	 * @return
	 */
	public boolean entreeDispo(){
		 if (this.entreeExt == false && this.entreeInt == false){
			 return true;
		 }
		 else{
			 return false;
		 }
	}
	
	/**
	 * Renvoie toutes les entrees possibles pour le joueur courant
	 * Renvoie 0 dans un tableau d'une case si aucune entree n'est disponible pour le joueur
	 * @return entreeRetour
	 */
	public int[] entreePossible(){
		ArrayList <Hotel> listeHotel = InterfaceGraphique.hotels;
		int[] tableauTemp = new int[32];
		int nbEntreeRetour = 0;
		
		//On récupère les numéros de case possibles pour le joueurActif
		for(int i= 0; i < listeHotel.size(); i++){
			if(InterfaceGraphique.joueurActif == listeHotel.get(i).joueurProprio && listeHotel.get(i).batimentPrincConstruit == true){
				for(int j = 0; j < listeHotel.get(i).casePlateau.size(); j++){
					if(listeHotel.get(i).casePlateau.get(j).entreeDispo()){
						tableauTemp[nbEntreeRetour] = listeHotel.get(i).casePlateau.get(j).num;
						nbEntreeRetour = nbEntreeRetour + 1;
					}	
				}
			}
		}
		
		//Adapte la taille du tableau au nombre d'entree et gere s'il n'y a pas d'entree disponible
		int[] entreeRetour = null;
		if(nbEntreeRetour == 0){
			entreeRetour =  new int[1];
			entreeRetour[0] = 0;
		}
		else{
			entreeRetour = new int[nbEntreeRetour];
			for(int j=0; j<nbEntreeRetour;j++){
				entreeRetour[j] = tableauTemp[j];
			}
		}
		return entreeRetour;
	}
	
	
	/**
	 * Méthode qui vérifie que la position d'un joueur lui permet l'achat d'entree
	 * Retourne vrai s'il est dans la zone, faux sinon
	 */
	public boolean zoneAchatEntree(int positionJoueur){
		if(positionJoueur<8 || positionJoueur>26){
			return true;
		}
		else{
			return false;
		}
	}
	
	//int positionJoueur = InterfaceGraphique.joueurs.get(InterfaceGraphique.joueurActif).position;
	/**
	 * Ajoute une entree sur la case renseignee en entree pour un hotel precis
	 * On precise le nom de l'hotel pour savoir sur quel cote on la place
	 */
	public void placerEntree(int caseEntree, String nomHotel){
		Hotel hotelConcerne = Hotel.trouveHotel(nomHotel, InterfaceGraphique.hotels);
		if(hotelConcerne.emplacementExt == true){
			Plateau.plateau.get(caseEntree).entreeExt = true;
		}
		else{
			Plateau.plateau.get(caseEntree).entreeInt = true;
		}
		
	}
	
}
