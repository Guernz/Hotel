package jeu;

import java.awt.*;
import java.awt.event.*;
import java.util.*;

import javax.swing.*;

public class InterfaceGraphique extends JFrame implements ActionListener{
	
	private Panneau panneau = new Panneau("cover.png");
	private JLabel argentJoueurActuel = new JLabel("");
	private JLabel labelAchat = new JLabel("Achat");
	private JLabel labelRachat = new JLabel("Rachat");
	private JLabel labelConstruire = new JLabel("Construire");
	private JLabel labelConstruireGratuit = new JLabel("<html>Construction <br/>Gratuite</html>");
	private Bouton boutonJouer =  new Bouton("Jouer");
	private Bouton boutonRegle = new Bouton("Règle du jeu");
	private Bouton boutonLancerDe = new Bouton("Lancer dé");
	private Bouton bouton2J = new Bouton("2 joueurs");
	private Bouton bouton3J = new Bouton("3 joueurs");
	private Bouton bouton4J = new Bouton("4 joueurs");
	private Bouton boutonQuitter = new Bouton("Quitter");
	private Bouton boutonContinuer = new Bouton("Continuer");
	private Bouton boutonJoueurSuivant = new Bouton("Joueur suivant");
	private Bouton boutonAction = new Bouton("Actions");
	private Bouton boutonFujiyama = new Bouton("Fujiyama");
	private Bouton boutonBoomerang = new Bouton("Boomerang");
	private Bouton boutonEtoile = new Bouton("Etoile");
	private Bouton boutonPresident = new Bouton("President");
	private Bouton boutonRoyal = new Bouton("Royal");
	private Bouton boutonSafari = new Bouton("Safari");
	private Bouton boutonTajMahal = new Bouton("TajMahal");
	private Bouton boutonWaikiki = new Bouton("Waikiki");
	private Bouton boutonRachatFujiyama = new Bouton("Fujiyama");
	private Bouton boutonRachatBoomerang = new Bouton("Boomerang");
	private Bouton boutonRachatEtoile = new Bouton("Etoile");
	private Bouton boutonRachatPresident = new Bouton("President");
	private Bouton boutonRachatRoyal = new Bouton("Royal");
	private Bouton boutonRachatSafari = new Bouton("Safari");
	private Bouton boutonRachatTajMahal = new Bouton("TajMahal");
	private Bouton boutonRachatWaikiki = new Bouton("Waikiki");
	private Bouton boutonConstruireGratuitFujiyama = new Bouton("Fujiyama");
	private Bouton boutonConstruireGratuitBoomerang = new Bouton("Boomerang");
	private Bouton boutonConstruireGratuitEtoile = new Bouton("Etoile");
	private Bouton boutonConstruireGratuitPresident = new Bouton("President");
	private Bouton boutonConstruireGratuitRoyal = new Bouton("Royal");
	private Bouton boutonConstruireGratuitSafari = new Bouton("Safari");
	private Bouton boutonConstruireGratuitTajMahal = new Bouton("TajMahal");
	private Bouton boutonConstruireGratuitWaikiki = new Bouton("Waikiki");
	private Bouton boutonConstruitFujiyama = new Bouton("Fujiyama");
	private Bouton boutonConstruitBoomerang = new Bouton("Boomerang");
	private Bouton boutonConstruitEtoile = new Bouton("Etoile");
	private Bouton boutonConstruitPresident = new Bouton("President");
	private Bouton boutonConstruitRoyal = new Bouton("Royal");
	private Bouton boutonConstruitSafari = new Bouton("Safari");
	private Bouton boutonConstruitTajMahal = new Bouton("TajMahal");
	private Bouton boutonConstruitWaikiki = new Bouton("Waikiki");
	private Bouton titreBoomerang = new Bouton("boomerang.png",0);
	private Bouton titreFujiyama = new Bouton("fujiyama.png",0);
	private Bouton titreEtoile = new Bouton("etoile.png",0);
	private Bouton titrePresident = new Bouton("president.png",0);
	private Bouton titreRoyal = new Bouton("royal.png",0);
	private Bouton titreSafari = new Bouton("safari.png",0);
	private Bouton titreTajMahal = new Bouton("tajmahal.png",0);
	private Bouton titreWaikiki = new Bouton("waikiki.png",0);
	private Bouton de1 = new Bouton("1.png",0);
	private Bouton de2 = new Bouton("2.png",0);
	private Bouton de3 = new Bouton("3.png",0);
	private Bouton de4 = new Bouton("4.png",0);
	private Bouton de5 = new Bouton("5.png",0);
	private Bouton de6 = new Bouton("6.png",0);
	private Bouton deConstruit = new Bouton("oui.png",0);
	private Bouton deConstruitPas = new Bouton("non.png",0);
	private Bouton deGratuit = new Bouton("gratuit.png",0);
	private Bouton deDouble = new Bouton("double.png",0);
	private Plateau plateauJeu = new Plateau();
	private Joueur joueurBleu = new Joueur("Bleu");
	private Joueur joueurJaune = new Joueur("Jaune");
	private Joueur joueurVert = new Joueur("Vert");
	private Joueur joueurRouge = new Joueur("Rouge");
	int width = 1048;
	int height = 700;
	static boolean 	fait6, 
				   	boutonBoom = false,
				   	boutonEtoi = false,
				   	boutonFuji = false,
				   	boutonPres = false,
				   	boutonRoya = false,
				   	boutonSafa = false,
				   	boutonTajM = false,
				   	boutonWaik = false;
	static int 	nbJoueur, 
				joueurActif = 1;
	static ArrayList<Joueur> joueurs = new ArrayList<Joueur>();
	static ArrayList<Hotel> hotels = new ArrayList<Hotel>();
	static ArrayList<Hotel> hotelCase;
	static int numHotelCase;
		
	public InterfaceGraphique(){
		//D�finit un titre pour notre fen�tre
	    this.setTitle("Jeu de soci�t� Hotel");
	    //D�finit sa taille 
	    this.setSize(width+302, height);
	    //Nous demandons maintenant � notre objet de se positionner au centre
	    this.setLocationRelativeTo(null);
	    //Termine le processus lorsqu'on clique sur la croix rouge
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
	    //On pr�vient notre JFrame que notre JPanel sera son content pane
	    this.setContentPane(panneau); 
	    this.setLayout(null);
	    
	    boutonJouer.addActionListener(this);
	    boutonQuitter.addActionListener(this);
	    boutonLancerDe.addActionListener(this);
	    boutonContinuer.addActionListener(this);
	    bouton2J.addActionListener(this);
	    bouton3J.addActionListener(this);
	    bouton4J.addActionListener(this);
	    boutonRegle.addActionListener(this);
	    boutonJoueurSuivant.addActionListener(this);
	    boutonAction.addActionListener(this);
	    boutonFujiyama.addActionListener(this);
	    boutonBoomerang.addActionListener(this);
	    boutonEtoile.addActionListener(this);
	    boutonPresident.addActionListener(this);
	    boutonRoyal.addActionListener(this);
	    boutonSafari.addActionListener(this);
	    boutonTajMahal.addActionListener(this);
	    boutonWaikiki.addActionListener(this);
	    boutonRachatFujiyama.addActionListener(this);
	    boutonRachatBoomerang.addActionListener(this);
	    boutonRachatEtoile.addActionListener(this);
	    boutonRachatPresident.addActionListener(this);
	    boutonRachatRoyal.addActionListener(this);
	    boutonRachatSafari.addActionListener(this);
	    boutonRachatTajMahal.addActionListener(this);
	    boutonRachatWaikiki.addActionListener(this);
	    boutonConstruitFujiyama.addActionListener(this);
	    boutonConstruitBoomerang.addActionListener(this);
	    boutonConstruitEtoile.addActionListener(this);
	    boutonConstruitPresident.addActionListener(this);
	    boutonConstruitRoyal.addActionListener(this);
	    boutonConstruitSafari.addActionListener(this);
	    boutonConstruitTajMahal.addActionListener(this);
	    boutonConstruitWaikiki.addActionListener(this);
	    boutonConstruireGratuitFujiyama.addActionListener(this);
	    boutonConstruireGratuitBoomerang.addActionListener(this);
	    boutonConstruireGratuitEtoile.addActionListener(this);
	    boutonConstruireGratuitPresident.addActionListener(this);
	    boutonConstruireGratuitRoyal.addActionListener(this);
	    boutonConstruireGratuitSafari.addActionListener(this);
	    boutonConstruireGratuitTajMahal.addActionListener(this);
	    boutonConstruireGratuitWaikiki.addActionListener(this);
	    double widthTemp = width*0.85;
	    double heightTemp = height*0.1;
	    int margeLargeurBouton = (int) widthTemp;
	    int margeHauteurBouton = (int) heightTemp;
	    widthTemp = width*0.1;
	    int largeurBouton = (int) widthTemp;
	    int hauteurBouton = margeHauteurBouton;

	    this.add(boutonJouer);
	    this.add(boutonRegle);
	    this.add(boutonQuitter);
	    argentJoueurActuel.setBounds(margeLargeurBouton,margeHauteurBouton/4,largeurBouton,hauteurBouton/2);
	    labelAchat.setBounds(margeLargeurBouton,3*margeHauteurBouton,largeurBouton,hauteurBouton);
	    labelRachat.setBounds(margeLargeurBouton,5*margeHauteurBouton,largeurBouton,hauteurBouton);
	    labelConstruire.setBounds(margeLargeurBouton,3*margeHauteurBouton,largeurBouton,hauteurBouton);
	    labelConstruireGratuit.setBounds(margeLargeurBouton,3*margeHauteurBouton,largeurBouton,hauteurBouton);
	    boutonJouer.setBounds(margeLargeurBouton,margeHauteurBouton,largeurBouton,hauteurBouton);
	    boutonRegle.setBounds(margeLargeurBouton,3*margeHauteurBouton,largeurBouton,hauteurBouton);
	    boutonQuitter.setBounds(margeLargeurBouton,8*margeHauteurBouton,largeurBouton,hauteurBouton);
	    boutonLancerDe.setBounds(margeLargeurBouton,margeHauteurBouton,largeurBouton,hauteurBouton);
	    boutonJoueurSuivant.setBounds(margeLargeurBouton,margeHauteurBouton,largeurBouton,hauteurBouton);
	    boutonContinuer.setBounds(margeLargeurBouton,margeHauteurBouton,largeurBouton,hauteurBouton);
	    boutonAction.setBounds(margeLargeurBouton,3*margeHauteurBouton,largeurBouton,hauteurBouton);
	    boutonBoomerang.setBounds(margeLargeurBouton,4*margeHauteurBouton+margeHauteurBouton/2,largeurBouton,hauteurBouton/2);
	    boutonEtoile.setBounds(margeLargeurBouton,4*margeHauteurBouton,largeurBouton,hauteurBouton/2);
	    boutonFujiyama.setBounds(margeLargeurBouton,4*margeHauteurBouton,largeurBouton,hauteurBouton/2);
	    boutonPresident.setBounds(margeLargeurBouton,4*margeHauteurBouton+margeHauteurBouton/2,largeurBouton,hauteurBouton/2);
	    boutonRoyal.setBounds(margeLargeurBouton,4*margeHauteurBouton,largeurBouton,hauteurBouton/2);
	    boutonSafari.setBounds(margeLargeurBouton,4*margeHauteurBouton+margeHauteurBouton/2,largeurBouton,hauteurBouton/2);
	    boutonTajMahal.setBounds(margeLargeurBouton,4*margeHauteurBouton+margeHauteurBouton/2,largeurBouton,hauteurBouton/2);
	    boutonWaikiki.setBounds(margeLargeurBouton,4*margeHauteurBouton+margeHauteurBouton/2,largeurBouton,hauteurBouton/2);
	    boutonRachatBoomerang.setBounds(margeLargeurBouton,6*margeHauteurBouton+margeHauteurBouton/2,largeurBouton,hauteurBouton/2);
	    boutonRachatEtoile.setBounds(margeLargeurBouton,6*margeHauteurBouton,largeurBouton,hauteurBouton/2);
	    boutonRachatFujiyama.setBounds(margeLargeurBouton,6*margeHauteurBouton,largeurBouton,hauteurBouton/2);
	    boutonRachatPresident.setBounds(margeLargeurBouton,6*margeHauteurBouton+margeHauteurBouton/2,largeurBouton,hauteurBouton/2);
	    boutonRachatRoyal.setBounds(margeLargeurBouton,6*margeHauteurBouton,largeurBouton,hauteurBouton/2);
	    boutonRachatSafari.setBounds(margeLargeurBouton,6*margeHauteurBouton+margeHauteurBouton/2,largeurBouton,hauteurBouton/2);
	    boutonRachatTajMahal.setBounds(margeLargeurBouton,6*margeHauteurBouton+margeHauteurBouton/2,largeurBouton,hauteurBouton/2);
	    boutonRachatWaikiki.setBounds(margeLargeurBouton,6*margeHauteurBouton+margeHauteurBouton/2,largeurBouton,hauteurBouton/2);
	    boutonConstruitBoomerang.setBounds(margeLargeurBouton,4*margeHauteurBouton+margeHauteurBouton/2,largeurBouton,hauteurBouton/2);
	    boutonConstruitEtoile.setBounds(margeLargeurBouton,5*margeHauteurBouton,largeurBouton,hauteurBouton/2);
	    boutonConstruitFujiyama.setBounds(margeLargeurBouton,4*margeHauteurBouton,largeurBouton,hauteurBouton/2);
	    boutonConstruitPresident.setBounds(margeLargeurBouton,5*margeHauteurBouton+margeHauteurBouton/2,largeurBouton,hauteurBouton/2);
	    boutonConstruitRoyal.setBounds(margeLargeurBouton,6*margeHauteurBouton,largeurBouton,hauteurBouton/2);
	    boutonConstruitSafari.setBounds(margeLargeurBouton,6*margeHauteurBouton+margeHauteurBouton/2,largeurBouton,hauteurBouton/2);
	    boutonConstruitTajMahal.setBounds(margeLargeurBouton,7*margeHauteurBouton,largeurBouton,hauteurBouton/2);
	    boutonConstruitWaikiki.setBounds(margeLargeurBouton,7*margeHauteurBouton+margeHauteurBouton/2,largeurBouton,hauteurBouton/2);
	    boutonConstruireGratuitBoomerang.setBounds(margeLargeurBouton,4*margeHauteurBouton+margeHauteurBouton/2,largeurBouton,hauteurBouton/2);
	    boutonConstruireGratuitEtoile.setBounds(margeLargeurBouton,5*margeHauteurBouton,largeurBouton,hauteurBouton/2);
	    boutonConstruireGratuitFujiyama.setBounds(margeLargeurBouton,4*margeHauteurBouton,largeurBouton,hauteurBouton/2);
	    boutonConstruireGratuitPresident.setBounds(margeLargeurBouton,5*margeHauteurBouton+margeHauteurBouton/2,largeurBouton,hauteurBouton/2);
	    boutonConstruireGratuitRoyal.setBounds(margeLargeurBouton,6*margeHauteurBouton,largeurBouton,hauteurBouton/2);
	    boutonConstruireGratuitSafari.setBounds(margeLargeurBouton,6*margeHauteurBouton+margeHauteurBouton/2,largeurBouton,hauteurBouton/2);
	    boutonConstruireGratuitTajMahal.setBounds(margeLargeurBouton,7*margeHauteurBouton,largeurBouton,hauteurBouton/2);
	    boutonConstruireGratuitWaikiki.setBounds(margeLargeurBouton,7*margeHauteurBouton+margeHauteurBouton/2,largeurBouton,hauteurBouton/2);
	    //boutonOK.setBounds(margeLargeurBouton,3*margeHauteurBouton,largeurBouton,hauteurBouton);
	    //boutonPasOK.setBounds(margeLargeurBouton,5*margeHauteurBouton,largeurBouton,hauteurBouton);
	    bouton2J.setBounds(margeLargeurBouton,margeHauteurBouton,largeurBouton,hauteurBouton);
	    bouton3J.setBounds(margeLargeurBouton,3*margeHauteurBouton,largeurBouton,hauteurBouton);
	    bouton4J.setBounds(margeLargeurBouton,5*margeHauteurBouton,largeurBouton,hauteurBouton);
	    titreBoomerang.setBounds(1025,450,300,200);
	    titreFujiyama.setBounds(1025,250,300,200);
	    titreEtoile.setBounds(1025,250,300,200);
	    titrePresident.setBounds(1025,450,300,200);
	    titreSafari.setBounds(1025,450,300,200);
	    titreTajMahal.setBounds(1025,450,300,200);
	    titreWaikiki.setBounds(1025,450,300,200);
	    titreRoyal.setBounds(1025,250,300,200);
	    de1.setBounds(1075,180,50,50);
	    de2.setBounds(1075,180,50,50);
	    de3.setBounds(1075,180,50,50);
	    de4.setBounds(1075,180,50,50);
	    de5.setBounds(1075,180,50,50);
	    de6.setBounds(1075,180,50,50);
	    deConstruit.setBounds(1225,180,50,50);
	    deConstruitPas.setBounds(1225,180,50,50);
	    deDouble.setBounds(1225,180,50,50);
	    deGratuit.setBounds(1225,180,50,50);
	    //On rend la fenetre visible
	    this.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent arg0) {

		  if(arg0.getSource() == boutonJouer){
			  panneau.setImage("plateau.png");
			  remove(boutonJouer);
			  remove(boutonRegle);
			  add(bouton2J);
			  add(bouton3J);
			  add(bouton4J);
			  panneau.setBleu(54,403); 
			  panneau.setRouge(29, 403);
			  panneau.setVert(79, 403);
			  panneau.setJaune(104, 403);
			  setContentPane(panneau);
			  Audio audio = new Audio();
			  audio.start();
			  creerHotels();
			  
			  

		  }
		  if(arg0.getSource() == boutonRegle){
			  
		  }
		  /*
		  if(arg0.getSource() == boutonOK){
			  remove(boutonOK);
			  remove(boutonPasOK);
			  setContentPane(panneau);
			  hotelCase.get(numHotelCase).achatHotel(joueurActif);
			  System.out.println("Le joueur " + joueurActif + " a achete l'hotel " + hotelCase.get(numHotelCase).getNom());
			  
		  }
		  
		  if(arg0.getSource() == boutonPasOK) {
			  remove(boutonOK);
			  remove(boutonPasOK);
			  setContentPane(panneau);
			  System.out.println("Le joueur " + joueurActif + " n'a pas achete l'hotel " + hotelCase.get(numHotelCase).getNom());
			  
		  }
		  */
		  if(arg0.getSource() == boutonQuitter){
			  System.exit(0);

		  }
		  
		  if(arg0.getSource() == bouton2J){
			  nbJoueur=2;
			  joueurBleu.setArgentJoueur(25000);
			  joueurRouge.setArgentJoueur(25000);
			  joueurs.add(joueurBleu);
			  joueurs.add(joueurRouge);
			  remove(bouton2J);
			  remove(bouton3J);
			  remove(bouton4J);
			  add(boutonLancerDe);
			  setContentPane(panneau);
		  }
		  
		  if(arg0.getSource() == bouton3J){
			  nbJoueur=3;
			  joueurBleu.setArgentJoueur(12500);
			  joueurRouge.setArgentJoueur(12500);
			  joueurVert.setArgentJoueur(12500);
			  joueurs.add(joueurBleu);
			  joueurs.add(joueurRouge);
			  joueurs.add(joueurVert);
			  remove(bouton2J);
			  remove(bouton3J);
			  remove(bouton4J);
			  add(boutonLancerDe);
			  setContentPane(panneau);
		  }
		  
		  if(arg0.getSource() == bouton4J){
			  nbJoueur=4;
			  joueurBleu.setArgentJoueur(12500);
			  joueurRouge.setArgentJoueur(12500);
			  joueurVert.setArgentJoueur(12500);
			  joueurJaune.setArgentJoueur(125000);
			  joueurs.add(joueurBleu);
			  joueurs.add(joueurRouge);
			  joueurs.add(joueurVert);
			  joueurs.add(joueurJaune);
			  remove(bouton2J);
			  remove(bouton3J);
			  remove(bouton4J);
			  add(boutonLancerDe);
			  setContentPane(panneau);
		  }
		  
		  if(arg0.getSource() == boutonLancerDe){
			  argentJoueurActuel.setText("<html>Joueur " + joueurActif + "<br/>argent " + joueurs.get(joueurActif-1).getArgentJoueur() + "</html>");
			  add(argentJoueurActuel);
			  int res;
			  fait6 = false;
			  res = joueurs.get(joueurActif-1).seDeplacer();
			  if (res==6){
				  remove(boutonLancerDe);
				  add(boutonContinuer);
				  add(boutonAction);
				  fait6 = true;
			  }
			  else{
				  remove(boutonLancerDe);
				  add(boutonJoueurSuivant);
				  add(boutonAction);
			  }
			  switch(res){
			  case 1:
				  add(de1);
				  break;
			  case 2:
				  add(de2);
				  break;
			  case 3:
				  add(de3);
				  break;
			  case 4:
				  add(de4);
				  break;
			  case 5:
				  add(de5);
				  break;
			  case 6:
				  add(de6);
				  break;
			  }
			  hotelCase = Hotel.trouveHotel(joueurs.get(joueurActif-1).getPosition(),hotels);
			  for( int i = 0 ; i<hotelCase.size(); i++){
					if(hotelCase.get(i).getNom().equals("Fujiyama")){
						add(titreFujiyama);
					}
					if(hotelCase.get(i).getNom().equals("Boomerang")){
						add(titreBoomerang);
					}
					if(hotelCase.get(i).getNom().equals("Etoile")){
						add(titreEtoile);
					}
					if(hotelCase.get(i).getNom().equals("President")){
						add(titrePresident);
					}
					if(hotelCase.get(i).getNom().equals("Royal")){
						add(titreRoyal);
					}
					if(hotelCase.get(i).getNom().equals("Safari")){
						add(titreSafari);
					}
					if(hotelCase.get(i).getNom().equals("TajMahal")){
						add(titreTajMahal);
					}
					if(hotelCase.get(i).getNom().equals("Waikiki")){
						add(titreWaikiki);
					}
				}
			  actualiserPosition();
			  argentJoueurActuel.setText("<html>Joueur " + joueurActif + "(" + joueurs.get(joueurActif-1).getCouleur() + ")" + "<br/>argent " + joueurs.get(joueurActif-1).getArgentJoueur() + "</html>");
			  setContentPane(panneau);			  
		  }
		  
		  if(arg0.getSource() == boutonContinuer){
			  clean();
			  cleanTitre();
			  remove(boutonContinuer);
			  remove(boutonAction);
			  add(boutonLancerDe);
			  setContentPane(panneau);
		  }
		  
		  if(arg0.getSource() == boutonJoueurSuivant){
			  clean();
			  cleanTitre();
			  remove(boutonJoueurSuivant);
			  remove(boutonAction);
			  remove(argentJoueurActuel);
			  add(boutonLancerDe);
			  setContentPane(panneau);
			  joueurActif++;
			  if(joueurActif>joueurs.size()){
				  joueurActif=1;
			  }
		  }
		  
		  if(arg0.getSource() == boutonAction){
			  int type = Plateau.plateau.get(joueurs.get(joueurActif-1).getPosition()-1).getType();
			  verifieSiDoitPayerLoyer();
			  switch(type){
				  case 1:
					  //case d�part, il n'y a pas d'action
					  break;
				  case 2:
					  //entreeGratuite();
					  break;
				  case 3:
					  constructionGratuite();
					  break;
				  case 4:
					  permisConstruire();
					  break;
				  case 5:
					  achat();
					break;
			  }
		  }
		  
		  if(arg0.getSource() == boutonBoomerang){
			  boutonHotel("Boomerang");
		  }
		  
		  if(arg0.getSource() == boutonFujiyama){
			  boutonHotel("Fujiyama");
		  }
		  
		  if(arg0.getSource() == boutonEtoile){
			  boutonHotel("Etoile");
		  }
		  
		  if(arg0.getSource() == boutonPresident){
			  boutonHotel("President");
		  }
		  
		  if(arg0.getSource() == boutonRoyal){
			  boutonHotel("Royal");
		  }
		  
		  if(arg0.getSource() == boutonSafari){
			  boutonHotel("Safari");
		  }
		  
		  if(arg0.getSource() == boutonTajMahal){
			  boutonHotel("TajMahal");
		  }
		  
		  if(arg0.getSource() == boutonWaikiki){
			  boutonHotel("Waikiki");
		  }
		  
		  if(arg0.getSource() == boutonRachatBoomerang){
			  boutonRachatHotel("Boomerang");
		  }
		  
		  if(arg0.getSource() == boutonRachatFujiyama){
			  boutonRachatHotel("Fujiyama");
		  }
		  
		  if(arg0.getSource() == boutonRachatEtoile){
			  boutonRachatHotel("Etoile");
		  }
		  
		  if(arg0.getSource() == boutonRachatPresident){
			  boutonRachatHotel("President");
		  }
		  
		  if(arg0.getSource() == boutonRachatRoyal){
			  boutonRachatHotel("Royal");
		  }
		  
		  if(arg0.getSource() == boutonRachatSafari){
			  boutonRachatHotel("Safari");
		  }
		  
		  if(arg0.getSource() == boutonRachatTajMahal){
			  boutonRachatHotel("TajMahal");
		  }
		  
		  if(arg0.getSource() == boutonRachatWaikiki){
			  boutonRachatHotel("Waikiki");
		  }
		  
		  if(arg0.getSource() == boutonConstruitBoomerang){
			  boutonConstruitHotel("Boomerang");
		  }
		  
		  if(arg0.getSource() == boutonConstruitFujiyama){
			  boutonConstruitHotel("Fujiyama");
		  }
		  
		  if(arg0.getSource() == boutonConstruitEtoile){
			  boutonConstruitHotel("Etoile");
		  }
		  
		  if(arg0.getSource() == boutonConstruitPresident){
			  boutonConstruitHotel("President");
		  }
		  
		  if(arg0.getSource() == boutonConstruitRoyal){
			  boutonConstruitHotel("Royal");
		  }
		  
		  if(arg0.getSource() == boutonConstruitSafari){
			  boutonConstruitHotel("Safari");
		  }
		  
		  if(arg0.getSource() == boutonConstruitTajMahal){
			  boutonConstruitHotel("TajMahal");
		  }
		  
		  if(arg0.getSource() == boutonConstruitWaikiki){
			  boutonConstruitHotel("Waikiki");
		  }
		  
		  if(arg0.getSource() == boutonConstruireGratuitBoomerang){
			  boutonConstruireGratuitHotel("Boomerang");
		  }
		  
		  if(arg0.getSource() == boutonConstruireGratuitFujiyama){
			  boutonConstruireGratuitHotel("Fujiyama");
		  }
		  
		  if(arg0.getSource() == boutonConstruireGratuitEtoile){
			  boutonConstruireGratuitHotel("Etoile");
		  }
		  
		  if(arg0.getSource() == boutonConstruireGratuitPresident){
			  boutonConstruireGratuitHotel("President");
		  }
		  
		  if(arg0.getSource() == boutonConstruireGratuitRoyal){
			  boutonConstruireGratuitHotel("Royal");
		  }
		  
		  if(arg0.getSource() == boutonConstruireGratuitSafari){
			  boutonConstruireGratuitHotel("Safari");
		  }
		  
		  if(arg0.getSource() == boutonConstruireGratuitTajMahal){
			  boutonConstruireGratuitHotel("TajMahal");
		  }
		  
		  if(arg0.getSource() == boutonConstruireGratuitWaikiki){
			  boutonConstruireGratuitHotel("Waikiki");
		  }
		}
	
	public void actualiserPosition(){
		if(joueurs.get(joueurActif-1).getCouleur().equals("Bleu")){
			  panneau.setBleu(Plateau.plateau.get(joueurs.get(joueurActif-1).getPosition()-1).getX(), Plateau.plateau.get(joueurs.get(joueurActif-1).getPosition()-1).getY());
		  }
		  if(joueurs.get(joueurActif-1).getCouleur().equals("Rouge")){
			  panneau.setRouge(Plateau.plateau.get(joueurs.get(joueurActif-1).getPosition()-1).getX(), Plateau.plateau.get(joueurs.get(joueurActif-1).getPosition()-1).getY());
		  }
		  if(joueurs.get(joueurActif-1).getCouleur().equals("Vert")){
			  panneau.setVert(Plateau.plateau.get(joueurs.get(joueurActif-1).getPosition()-1).getX(), Plateau.plateau.get(joueurs.get(joueurActif-1).getPosition()-1).getY());
		  }
		  if(joueurs.get(joueurActif-1).getCouleur().equals("Jaune")){
			  panneau.setJaune(Plateau.plateau.get(joueurs.get(joueurActif-1).getPosition()-1).getX(), Plateau.plateau.get(joueurs.get(joueurActif-1).getPosition()-1).getY());
		  }
	}
	
	public void creerHotels(){
		Hotel fujiyama = new Fujiyama();
		Hotel boomerang = new Boomerang();
		Hotel etoile = new Etoile();
		Hotel president = new President();
		Hotel royal = new Royal();
		Hotel safari = new Safari();
		Hotel tajmahal = new TajMahal();
		Hotel waikiki = new Waikiki();
		hotels.add(fujiyama);
		hotels.add(boomerang);
		hotels.add(etoile);
		hotels.add(president);
		hotels.add(royal);
		hotels.add(safari);
		hotels.add(tajmahal);
		hotels.add(waikiki);
	}
	
	public void verifieSiDoitPayerLoyer(){
		ArrayList<Hotel> hotelCase = new ArrayList<Hotel>();
		hotelCase = Hotel.trouveHotel(joueurs.get(joueurActif-1).getPosition(),hotels);
		for( int i = 0 ; i<hotelCase.size(); i++){
			System.out.println("Hotel " + hotelCase.get(i).getNom());
			if(hotelCase.get(i).getJoueurProprio() != 0 && hotelCase.get(i).getBatimentPrincConstruit() && hotelCase.get(i).getJoueurProprio() != joueurActif) {
				int proprio = hotelCase.get(i).getJoueurProprio();
				String couleurProprio = null;
				switch(proprio){
				case 1:
					couleurProprio = "bleu";
					break;
				case 2:
					couleurProprio = "rouge";
					break;
				case 3:
					couleurProprio = "vert";
					break;
				case 4:
					couleurProprio = "jaune";
					break;
				}
				System.out.println("Cet hotel appartient au joueur " + couleurProprio);
				System.out.println("Vous devez lui payer");
			}
			if(hotelCase.get(i).getJoueurProprio() == joueurActif){
				System.out.println("Vous etes chez vous.");
			}
		}
	}
	
	public void permisConstruire(){
		remove(boutonAction);
		for( int i = 0 ; i<hotels.size(); i++){
			if(hotels.get(i).getJoueurProprio() == joueurActif){
				add(labelConstruire);
				if(hotels.get(i).getNom().equals("Fujiyama") && !hotels.get(i).getBaseLoisirConstruit()){
					add(boutonConstruitFujiyama);
				}
				if(hotels.get(i).getNom().equals("Boomerang") && !hotels.get(i).getBaseLoisirConstruit()){
					add(boutonConstruitBoomerang);
				}
				if(hotels.get(i).getNom().equals("Etoile") && !hotels.get(i).getBaseLoisirConstruit()){
					add(boutonConstruitEtoile);
				}
				if(hotels.get(i).getNom().equals("President") && !hotels.get(i).getBaseLoisirConstruit()){
					add(boutonConstruitPresident);
				}
				if(hotels.get(i).getNom().equals("Royal") && !hotels.get(i).getBaseLoisirConstruit()){
					add(boutonConstruitRoyal);
				}
				if(hotels.get(i).getNom().equals("Safari") && !hotels.get(i).getBaseLoisirConstruit()){
					add(boutonConstruitSafari);
				}
				if(hotels.get(i).getNom().equals("TajMahal") && !hotels.get(i).getBaseLoisirConstruit()){
					add(boutonConstruitTajMahal);
				}
				if(hotels.get(i).getNom().equals("Waikiki") && !hotels.get(i).getBaseLoisirConstruit()){
					add(boutonConstruitWaikiki);
				}
			}
		}
		setContentPane(panneau);
	}
	
	public void achat(){
		


		remove(boutonAction);
		hotelCase = new ArrayList<Hotel>();
		hotelCase = Hotel.trouveHotel(joueurs.get(joueurActif-1).getPosition(),hotels);
		for( numHotelCase = 0 ; numHotelCase<hotelCase.size(); numHotelCase++){
			if(hotelCase.get(numHotelCase).getJoueurProprio() == 0) {
				if(hotelCase.get(numHotelCase).getNom().equals("Fujiyama")){
					add(boutonFujiyama);
					add(labelAchat);
				}
				if(hotelCase.get(numHotelCase).getNom().equals("Boomerang")){
					add(boutonBoomerang);
					add(labelAchat);
				}
				if(hotelCase.get(numHotelCase).getNom().equals("Etoile")){
					add(boutonEtoile);
					add(labelAchat);
				}
				if(hotelCase.get(numHotelCase).getNom().equals("President")){
					add(boutonPresident);
					add(labelAchat);
				}
				if(hotelCase.get(numHotelCase).getNom().equals("Royal")){
					add(boutonRoyal);
					add(labelAchat);
				}
				if(hotelCase.get(numHotelCase).getNom().equals("Safari")){
					add(boutonSafari);
					add(labelAchat);
				}
				if(hotelCase.get(numHotelCase).getNom().equals("TajMahal")){
					add(boutonTajMahal);
					add(labelAchat);
				}
				if(hotelCase.get(numHotelCase).getNom().equals("Waikiki")){
					add(boutonWaikiki);
					add(labelAchat);
				}
			}
			else{
				if(hotelCase.get(numHotelCase).getJoueurProprio() == joueurActif){
					System.out.println("Ce terrain vous appartient deja.");
				}
				if(!hotelCase.get(numHotelCase).getBatimentPrincConstruit() && hotelCase.get(numHotelCase).getJoueurProprio() != joueurActif){
					if(hotelCase.get(numHotelCase).getNom().equals("Fujiyama")){
						add(boutonRachatFujiyama);
						add(labelRachat);
					}
					if(hotelCase.get(numHotelCase).getNom().equals("Boomerang")){
						add(boutonRachatBoomerang);
						add(labelRachat);
					}
					if(hotelCase.get(numHotelCase).getNom().equals("Etoile")){
						add(boutonRachatEtoile);
						add(labelRachat);
					}
					if(hotelCase.get(numHotelCase).getNom().equals("President")){
						add(boutonRachatPresident);
						add(labelRachat);
					}
					if(hotelCase.get(numHotelCase).getNom().equals("Royal")){
						add(boutonRachatRoyal);
						add(labelRachat);
					}
					if(hotelCase.get(numHotelCase).getNom().equals("Safari")){
						add(boutonRachatSafari);
						add(labelRachat);
					}
					if(hotelCase.get(numHotelCase).getNom().equals("TajMahal")){
						add(boutonRachatTajMahal);
						add(labelRachat);
					}
					if(hotelCase.get(numHotelCase).getNom().equals("Waikiki")){
						add(boutonRachatWaikiki);
						add(labelRachat);
					}
				}
			}
			setContentPane(panneau);
		}
	}
	
	public void constructionGratuite(){
		remove(boutonAction);
		for( int i = 0 ; i<hotels.size(); i++){
			if(hotels.get(i).getJoueurProprio() == joueurActif){
				if(hotels.get(i).getNom().equals("Fujiyama")){
					add(boutonConstruireGratuitFujiyama);
					add(labelConstruireGratuit);
				}
				if(hotels.get(i).getNom().equals("Boomerang")){
					add(boutonConstruireGratuitBoomerang);
					add(labelConstruireGratuit);
				}
				if(hotels.get(i).getNom().equals("Etoile")){
					add(boutonConstruireGratuitEtoile);
					add(labelConstruireGratuit);
				}
				if(hotels.get(i).getNom().equals("President")){
					add(boutonConstruireGratuitPresident);
					add(labelConstruireGratuit);
				}
				if(hotels.get(i).getNom().equals("Royal")){
					add(boutonConstruireGratuitRoyal);
					add(labelConstruireGratuit);
				}
				if(hotels.get(i).getNom().equals("Safari")){
					add(boutonConstruireGratuitSafari);
					add(labelConstruireGratuit);
				}
				if(hotels.get(i).getNom().equals("TajMahal")){
					add(boutonConstruireGratuitTajMahal);
					add(labelConstruireGratuit);
				}
				if(hotels.get(i).getNom().equals("Waikiki")){
					add(boutonConstruireGratuitWaikiki);
					add(labelConstruireGratuit);
				}
			}
			setContentPane(panneau);
		}
	}
	
	public void boutonHotel(String nom){
		clean();
		Hotel hotel = Hotel.trouveHotel(nom, hotelCase);
		hotel.achatHotel(joueurActif);
		argentJoueurActuel.setText("<html>Joueur " + joueurActif + "<br/>argent " + joueurs.get(joueurActif-1).getArgentJoueur() + "</html>");
	}
	
	public void boutonRachatHotel(String nom){
		clean();
		Hotel hotel = Hotel.trouveHotel(nom, hotelCase);
		hotel.rachatHotel(joueurActif);
		argentJoueurActuel.setText("<html>Joueur " + joueurActif + "<br/>argent " + joueurs.get(joueurActif-1).getArgentJoueur() + "</html>");
	}
	
	public void boutonConstruitHotel(String nom){
		clean();
		Hotel hotel = Hotel.trouveHotel(nom, hotelCase);
		int resDeConstruit = hotel.construit(joueurActif,nom);
		switch(resDeConstruit){
		case 0:
			add(deConstruitPas);
			break;
		case 1:
			add(deConstruit);
			break;
		case 2:
			add(deDouble);
			break;
		case 3:
			add(deGratuit);
			break;
		}
		setContentPane(panneau);
		argentJoueurActuel.setText("<html>Joueur " + joueurActif + "<br/>argent " + joueurs.get(joueurActif-1).getArgentJoueur() + "</html>");
	}
	
	public void boutonConstruireGratuitHotel(String nom){
		clean();
		ArrayList<Hotel> hotelJoueur = new ArrayList<Hotel>();
		for( int i=0 ; i<hotels.size() ; i++){
			if(hotels.get(i).getJoueurProprio() == joueurActif){
				hotelJoueur.add(hotels.get(i));
			}
		}
		Hotel hotel = Hotel.trouveHotel(nom, hotelJoueur);
		hotel.construitGratuit(joueurActif,nom);
	}
	
	public void clean(){
		remove(boutonFujiyama);
		remove(boutonBoomerang);
		remove(boutonEtoile);
		remove(boutonPresident);
		remove(boutonRoyal);
		remove(boutonSafari);
		remove(boutonTajMahal);
		remove(boutonWaikiki);
		remove(boutonRachatFujiyama);
		remove(boutonRachatBoomerang);
		remove(boutonRachatEtoile);
		remove(boutonRachatPresident);
		remove(boutonRachatRoyal);
		remove(boutonRachatSafari);
		remove(boutonRachatTajMahal);
		remove(boutonRachatWaikiki);
		remove(labelAchat);
		remove(labelRachat);
		remove(labelConstruire);
		remove(labelConstruireGratuit);
		remove(boutonAction);
		remove(boutonConstruitFujiyama);
		remove(boutonConstruitBoomerang);
		remove(boutonConstruitEtoile);
		remove(boutonConstruitPresident);
		remove(boutonConstruitRoyal);
		remove(boutonConstruitSafari);
		remove(boutonConstruitTajMahal);
		remove(boutonConstruitWaikiki);
		remove(boutonConstruireGratuitFujiyama);
		remove(boutonConstruireGratuitBoomerang);
		remove(boutonConstruireGratuitEtoile);
		remove(boutonConstruireGratuitPresident);
		remove(boutonConstruireGratuitRoyal);
		remove(boutonConstruireGratuitSafari);
		remove(boutonConstruireGratuitTajMahal);
		remove(boutonConstruireGratuitWaikiki);
		setContentPane(panneau);
	}
	
	public void cleanTitre(){
		remove(titreBoomerang);
		  remove(titreFujiyama);
		  remove(titreEtoile);
		  remove(titrePresident);
		  remove(titreRoyal);
		  remove(titreSafari);
		  remove(titreTajMahal);
		  remove(titreWaikiki);
		  remove(de1);
		  remove(de2);
		  remove(de3);
		  remove(de4);
		  remove(de5);
		  remove(de6);
		  remove(deConstruit);
		  remove(deConstruitPas);
		  remove(deGratuit);
		  remove(deDouble);
		  setContentPane(panneau);
	}
	
	public int valeurDe(){
		int valRetour = 0;
		if(de1.isVisible() == true){
			valRetour = 1;
		}
		else if(de2.isVisible() == true){
			valRetour = 2;
		}
		else if(de3.isVisible() == true){
			valRetour = 3;
		}
		else if(de4.isVisible() == true){
			valRetour = 4;
		}
		else if(de5.isVisible() == true){
			valRetour = 5;
		}
		else if(de6.isVisible() == true){
			valRetour = 6;
		}
		return valRetour;
		
	}
			  
}	
