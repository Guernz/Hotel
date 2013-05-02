package jeu;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;

public class Bouton extends JButton{
	
	private String nom;
	private Image img;
	
	public Bouton(String nom){
	    super(nom);
	    this.nom = nom;
	    /*
	    try {
	        img = ImageIO.read(new File("fondBouton.png"));
	      } 
	    catch (IOException e) {
	        e.printStackTrace();
	      }
	      */
	}
	
	  

}
