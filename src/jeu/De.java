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
		
	}

}
