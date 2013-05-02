package jeu;

import java.util.ArrayList;
import java.util.Random;

public class De {
	
	int nbFace=6;
	ArrayList<Face> faceDeAvance = new ArrayList<Face>();
	ArrayList<Face> faceDeConstruit = new ArrayList<Face>();
	
	public De(){
		new DeAvance();
		new DeConstruit();
	}
	
	public int lancer(){
		Random r = new Random();
		return r.nextInt(nbFace);
	}
	
	public int lancerDeAvance(){
		return faceDeAvance.get(lancer()).getContenuFace();
	}
	
	public int lancerDeConstruit(){
		return faceDeConstruit.get(lancer()).getContenuFace();
	}
	
	class DeAvance{
		
		public DeAvance(){
			Face face1 = new Face(1);
			Face face2 = new Face(2);
			Face face3 = new Face(3);
			Face face4 = new Face(4);
			Face face5 = new Face(5);
			Face face6 = new Face(6);
			faceDeAvance.add(face1);
			faceDeAvance.add(face2);
			faceDeAvance.add(face3);
			faceDeAvance.add(face4);
			faceDeAvance.add(face5);
			faceDeAvance.add(face6);
		}
		
		
	}
	
	class DeConstruit{
		//0 ne construit pas
		//1 construit
		//2 construit paie double
		//3 construit gratuit
		public DeConstruit(){
			Face face1 = new Face(1);
			Face face2 = new Face(2);
			Face face3 = new Face(3);
			Face face0 = new Face(0);
			faceDeConstruit.add(face0);
			faceDeConstruit.add(face1);
			faceDeConstruit.add(face1);
			faceDeConstruit.add(face1);
			faceDeConstruit.add(face2);
			faceDeConstruit.add(face3);
		}
		
	}

}
