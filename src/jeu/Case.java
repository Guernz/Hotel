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
	 * Renvoie un tableau d'entier avec les entrees disponibles pour un joueur pour chaque hotels
	 * Renvoie -1 si aucune entree n'est disponible pour le joueur
	 */
	public int[] entreePossible(){
		ArrayList <Hotel> listeHotel = InterfaceGraphique.hotels;
		int[] entreeRetour = {-1};
		for(int i= 0; i < listeHotel.size(); i++){
			if(InterfaceGraphique.joueurActif == listeHotel.get(i).joueurProprio){
				for(int j = 0; j < listeHotel.get(i).casePlateau.size(); j++){
					if(listeHotel.get(i).casePlateau.get(j).entreeDispo()){
						entreeRetour[entreeRetour.length] = listeHotel.get(i).casePlateau.get(j).num;
					}	
				}
			}
		}
		return entreeRetour;
	}
	
	/**
	 * Ajoute une entrée sur la case correspondante pour le joueur qui lance cette action
	 */
	
	
}
