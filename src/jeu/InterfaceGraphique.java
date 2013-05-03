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
	private Bouton boutonJouer = new Bouton("Jouer");
	private Bouton boutonRegle = new Bouton("R�gle du jeu");
	private Bouton boutonLancerDe = new Bouton("Lancer d�");
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
				   	boutonWaik = false,
				   	achat = false,
				   	rachat = false;
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
	    this.setSize(width, height);
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
	    double widthTemp = width*0.85;
	    double heightTemp = height*0.1;
	    int margeLargeurBouton = (int) widthTemp;
	    int margeHauteurBouton = (int) heightTemp;
	    widthTemp = width*0.1;
	    int largeurBouton = (int) widthTemp;
	    int hauteurBouton = margeHauteurBouton;
	    
	    //boutonJouer.setSize(largeurBouton,hauteurBouton);
	    this.add(boutonJouer);
	    this.add(boutonRegle);
	    this.add(boutonQuitter);
	    argentJoueurActuel.setBounds(margeLargeurBouton,margeHauteurBouton/4,largeurBouton,hauteurBouton/2);
	    labelAchat.setBounds(margeLargeurBouton,3*margeHauteurBouton,largeurBouton,hauteurBouton);
	    labelRachat.setBounds(margeLargeurBouton,5*margeHauteurBouton,largeurBouton,hauteurBouton);
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
	    //boutonOK.setBounds(margeLargeurBouton,3*margeHauteurBouton,largeurBouton,hauteurBouton);
	    //boutonPasOK.setBounds(margeLargeurBouton,5*margeHauteurBouton,largeurBouton,hauteurBouton);
	    bouton2J.setBounds(margeLargeurBouton,margeHauteurBouton,largeurBouton,hauteurBouton);
	    bouton3J.setBounds(margeLargeurBouton,3*margeHauteurBouton,largeurBouton,hauteurBouton);
	    bouton4J.setBounds(margeLargeurBouton,5*margeHauteurBouton,largeurBouton,hauteurBouton);
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
			  actualiserPosition();
			  setContentPane(panneau);			  
		  }
		  
		  if(arg0.getSource() == boutonContinuer){
			  clean();
			  remove(boutonContinuer);
			  remove(boutonAction);
			  add(boutonLancerDe);
			  setContentPane(panneau);
		  }
		  
		  if(arg0.getSource() == boutonJoueurSuivant){
			  clean();
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
					  //constructionGratuite();
					  break;
				  case 4:
					  //permisConstruire();
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
				System.out.println("Vous �tes chez vous.");
			}
		}
	}
	
	public void achat(){
		hotelCase = new ArrayList<Hotel>();
		hotelCase = Hotel.trouveHotel(joueurs.get(joueurActif-1).getPosition(),hotels);
		for( numHotelCase = 0 ; numHotelCase<hotelCase.size(); numHotelCase++){
			System.out.println("Hotel " + hotelCase.get(numHotelCase).getNom());
			if(hotelCase.get(numHotelCase).getJoueurProprio() == 0) {
				System.out.println("Vous pouvez acheter cet hotel.");
				remove(boutonAction);
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
					int proprio = hotelCase.get(numHotelCase).getJoueurProprio();
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
					System.out.println("Cet hotel appartient au joueur " + couleurProprio + ", mais il n'a pas encore construit. Vous pouvez donc lui racheter.");
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
	
	public void boutonHotel(String nom){
		clean();
		Hotel hotel = Hotel.trouveHotel(nom, hotelCase);
		hotel.achatHotel(joueurActif);
	}
	
	public void boutonRachatHotel(String nom){
		clean();
		Hotel hotel = Hotel.trouveHotel(nom, hotelCase);
		hotel.rachatHotel(joueurActif);
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
		setContentPane(panneau);
	}
			  
}	
