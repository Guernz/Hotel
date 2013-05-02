package jeu;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Panneau extends JPanel{
	
	String image;
	int xBleu = -10;
	int yBleu = -10;
	int xVert = -10;
	int yVert = -10;
	int xJaune = -10;
	int yJaune = -10;
	int xRouge = -10;
	int yRouge = -10;
	
	public Panneau(String image){
		this.image=image;
	}
	
	public void paintComponent(Graphics g){
	    try {
	      Image img = ImageIO.read(new File(this.image));
	      double w =1048*0.8;
	      int i = (int) w;
	      g.drawImage(img, 0, 0, i, 660, this);	
	      g.setColor(Color.BLUE);
	  	  g.fillOval(this.xBleu, this.yBleu, 15, 15);
	      g.setColor(Color.YELLOW);
	  	  g.fillOval(this.xJaune, this.yJaune, 15, 15);
	      g.setColor(Color.GREEN);
	  	  g.fillOval(this.xVert, this.yVert, 15, 15);
	      g.setColor(Color.RED);
	  	  g.fillOval(this.xRouge, this.yRouge, 15, 15);
	      
	    } catch (IOException e) {
	      e.printStackTrace();
	    }                
	}

	public void setImage(String image) {
		this.image = image;
	}  
	
	public void setBleu(int x, int y){
		this.xBleu = x;
		this.yBleu = y;
	}
	
	public void setVert(int x, int y){
		this.xVert = x;
		this.yVert = y;
	}
	
	public void setJaune(int x, int y){
		this.xJaune = x;
		this.yJaune = y;
	}

	public void setRouge(int x, int y){
		this.xRouge = x;
		this.yRouge = y;
	}
	
	public int getXBleu(){
		return this.xBleu;
	}
	
	public int getYBleu(){
		return this.yBleu;
	}
}
