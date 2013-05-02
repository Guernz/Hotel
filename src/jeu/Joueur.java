package jeu;

import java.awt.*;

public class Joueur extends De {
	
	int argentJoueur=0;
	String couleur; //1 pour rouge, 2 pour bleu, 3 pour vert, 4 pour jaune
	int position=0;
	
	public Joueur(String couleur){
		this.couleur=couleur;
		new De();
	}
	
	public int getArgentJoueur() {
		return argentJoueur;
	}

	public void setArgentJoueur(int argentJoueur) {
		this.argentJoueur = argentJoueur;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}
	
	public String getCouleur(){
		return couleur;
	}
	
	public int seDeplacer(){
		int res,caseFinale;
		int i=0;
		res=lancerDeAvance();
		System.out.println("de :"+res);
		caseFinale=res;
		while(i<InterfaceGraphique.joueurs.size()){
			if(InterfaceGraphique.joueurs.get(i).getPosition()==this.getPosition()+caseFinale){
				caseFinale++;
				i=0;
			}
			else {
				i++;
			}
		}
		if (this.position<=7 && caseFinale>=8 && (InterfaceGraphique.joueurs.size()==2 || InterfaceGraphique.nbJoueur!=2 && InterfaceGraphique.joueurs.size()>2)){
			this.argentJoueur+=2000;
		}
		this.position+=caseFinale;
		if(this.position>=Plateau.nbCase+1){
			this.position-=Plateau.nbCase;
		}
		System.out.println("Vous êtes sur la case numero :"+getPosition());
		actionCase(this.position);
		return res;
	}
	
	public void actionCase(int numCase){
		int type;
		type=Plateau.plateau.get(numCase-1).getType();
		if (type==1){
			System.out.println("Type : depart \nCote ext : "+Plateau.plateau.get(numCase-1).isNoirExt()+"\nCote int : "+Plateau.plateau.get(numCase-1).isNoirInt());
		}
		if (type==2){
			System.out.println("Type : entree \nCote ext : "+Plateau.plateau.get(numCase-1).isNoirExt()+"\nCote int : "+Plateau.plateau.get(numCase-1).isNoirInt());
		}
		if (type==3){
			System.out.println("Type : construction \nCote ext : "+Plateau.plateau.get(numCase-1).isNoirExt()+"\nCote int : "+Plateau.plateau.get(numCase-1).isNoirInt());
		}
		if (type==4){
			System.out.println("Type : permis \nCote ext : "+Plateau.plateau.get(numCase-1).isNoirExt()+"\nCote int : "+Plateau.plateau.get(numCase-1).isNoirInt());
		}
		if (type==5){
			System.out.println("Type : achat \nCote ext : "+Plateau.plateau.get(numCase-1).isNoirExt()+"\nCote int : "+Plateau.plateau.get(numCase-1).isNoirInt());
		}
		
	}

}
