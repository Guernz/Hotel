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
	private JLabel labelEntree = new JLabel("Poser une entr�e :");
	private JLabel labelInfo = new JLabel("");
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
	private Bouton bouton2 = new Bouton("2");
	private Bouton bouton3 = new Bouton("3");
	private Bouton bouton4 = new Bouton("4");
	private Bouton bouton5 = new Bouton("5");
	private Bouton bouton6 = new Bouton("6");
	private Bouton bouton7 = new Bouton("7");
	private Bouton bouton9 = new Bouton("9");
	private Bouton bouton10 = new Bouton("10");
	private Bouton bouton11 = new Bouton("11");
	private Bouton bouton12 = new Bouton("12");
	private Bouton bouton13 = new Bouton("13");
	private Bouton bouton14 = new Bouton("14");
	private Bouton bouton15 = new Bouton("15");
	private Bouton bouton16 = new Bouton("16");
	private Bouton bouton17 = new Bouton("17");
	private Bouton bouton18 = new Bouton("18");
	private Bouton bouton19 = new Bouton("19");
	private Bouton bouton20 = new Bouton("20");
	private Bouton bouton21 = new Bouton("21");
	private Bouton bouton22 = new Bouton("22");
	private Bouton bouton23 = new Bouton("23");
	private Bouton bouton24 = new Bouton("24");
	private Bouton bouton25 = new Bouton("25");
	private Bouton bouton26 = new Bouton("26");
	private Bouton bouton27 = new Bouton("27");
	private Bouton bouton28 = new Bouton("28");
	private Bouton bouton29 = new Bouton("29");
	private Bouton bouton30 = new Bouton("30");
	private Bouton bouton31 = new Bouton("31");
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
	    bouton2.addActionListener(this);
	    bouton3.addActionListener(this);
	    bouton4.addActionListener(this);
	    bouton5.addActionListener(this);
	    bouton6.addActionListener(this);
	    bouton7.addActionListener(this);
	    bouton9.addActionListener(this);
	    bouton10.addActionListener(this);
	    bouton11.addActionListener(this);
	    bouton12.addActionListener(this);
	    bouton13.addActionListener(this);
	    bouton14.addActionListener(this);
	    bouton15.addActionListener(this);
	    bouton16.addActionListener(this);
	    bouton17.addActionListener(this);
	    bouton18.addActionListener(this);
	    bouton19.addActionListener(this);
	    bouton20.addActionListener(this);
	    bouton21.addActionListener(this);
	    bouton22.addActionListener(this);
	    bouton23.addActionListener(this);
	    bouton24.addActionListener(this);
	    bouton25.addActionListener(this);
	    bouton26.addActionListener(this);
	    bouton27.addActionListener(this);
	    bouton28.addActionListener(this);
	    bouton29.addActionListener(this);
	    bouton30.addActionListener(this);
	    bouton31.addActionListener(this);
	    double widthTemp = width*0.85;
	    double heightTemp = height*0.1;
	    int margeLargeurBouton = (int) widthTemp;
	    int margeHauteurBouton = (int) heightTemp;
	    widthTemp = width*0.1;
	    int largeurBouton = (int) widthTemp;
	    int hauteurBouton = margeHauteurBouton;

	    this.add(boutonJouer);
	    //this.add(boutonRegle);
	    this.add(boutonQuitter);
	    argentJoueurActuel.setBounds(margeLargeurBouton,margeHauteurBouton/4,largeurBouton,hauteurBouton/2);
	    labelAchat.setBounds(margeLargeurBouton,3*margeHauteurBouton,largeurBouton,hauteurBouton);
	    labelRachat.setBounds(margeLargeurBouton,5*margeHauteurBouton,largeurBouton,hauteurBouton);
	    labelConstruire.setBounds(margeLargeurBouton,3*margeHauteurBouton,largeurBouton,hauteurBouton);
	    labelConstruireGratuit.setBounds(margeLargeurBouton,3*margeHauteurBouton,largeurBouton,hauteurBouton);
	    labelEntree.setBounds(margeLargeurBouton,2*margeHauteurBouton,largeurBouton,hauteurBouton);
	    labelInfo.setBounds(1025,margeHauteurBouton/4,300,hauteurBouton*2);
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
	    bouton2.setBounds(margeLargeurBouton-50,3*margeHauteurBouton,50,50);
	    bouton3.setBounds(margeLargeurBouton,3*margeHauteurBouton,50,50);
	    bouton4.setBounds(margeLargeurBouton+50,3*margeHauteurBouton,50,50);
	    bouton5.setBounds(margeLargeurBouton+100,3*margeHauteurBouton,50,50);
	    bouton6.setBounds(margeLargeurBouton-50,3*margeHauteurBouton+50,50,50);
	    bouton7.setBounds(margeLargeurBouton,3*margeHauteurBouton+50,50,50);
	    bouton9.setBounds(margeLargeurBouton+50,3*margeHauteurBouton+50,50,50);
	    bouton10.setBounds(margeLargeurBouton+100,3*margeHauteurBouton+50,50,50);
	    bouton11.setBounds(margeLargeurBouton-50,3*margeHauteurBouton+100,50,50);
	    bouton12.setBounds(margeLargeurBouton,3*margeHauteurBouton+100,50,50);
	    bouton13.setBounds(margeLargeurBouton+50,3*margeHauteurBouton+100,50,50);
	    bouton14.setBounds(margeLargeurBouton+100,3*margeHauteurBouton+100,50,50);
	    bouton15.setBounds(margeLargeurBouton-50,3*margeHauteurBouton+150,50,50);
	    bouton16.setBounds(margeLargeurBouton,3*margeHauteurBouton+150,50,50);
	    bouton17.setBounds(margeLargeurBouton+50,3*margeHauteurBouton+150,50,50);
	    bouton18.setBounds(margeLargeurBouton+100,3*margeHauteurBouton+150,50,50);
	    bouton19.setBounds(margeLargeurBouton-50,3*margeHauteurBouton+200,50,50);
	    bouton20.setBounds(margeLargeurBouton,3*margeHauteurBouton+200,50,50);
	    bouton21.setBounds(margeLargeurBouton+50,3*margeHauteurBouton+200,50,50);
	    bouton22.setBounds(margeLargeurBouton+100,3*margeHauteurBouton+200,50,50);
	    bouton23.setBounds(margeLargeurBouton-50,3*margeHauteurBouton+250,50,50);
	    bouton24.setBounds(margeLargeurBouton,3*margeHauteurBouton+250,50,50);
	    bouton25.setBounds(margeLargeurBouton+50,3*margeHauteurBouton+250,50,50);
	    bouton26.setBounds(margeLargeurBouton+100,3*margeHauteurBouton+250,50,50);
	    bouton27.setBounds(margeLargeurBouton-50,3*margeHauteurBouton+300,50,50);
	    bouton28.setBounds(margeLargeurBouton,3*margeHauteurBouton+300,50,50);
	    bouton29.setBounds(margeLargeurBouton+50,3*margeHauteurBouton+300,50,50);
	    bouton30.setBounds(margeLargeurBouton+100,3*margeHauteurBouton+300,50,50);
	    bouton31.setBounds(margeLargeurBouton-50,3*margeHauteurBouton+350,50,50);
	    //On rend la fenetre visible
	    this.setVisible(true);
	    
	    bouton2.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		    	panneau.setMagenta(Plateau.plateau.get(1).getX()-7,Plateau.plateau.get(1).getY()-7);
		    	setContentPane(panneau);
		    }
		    public void mouseExited(java.awt.event.MouseEvent evt) {
		    	panneau.setMagenta(-30,-30);
		    	setContentPane(panneau);
		    }
		});
	    
	    bouton3.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		    	panneau.setMagenta(Plateau.plateau.get(2).getX()-7,Plateau.plateau.get(2).getY()-7);
		    	setContentPane(panneau);
		    }
		    public void mouseExited(java.awt.event.MouseEvent evt) {
		    	panneau.setMagenta(-30,-30);
		    	setContentPane(panneau);
		    }
		});
	    
	    bouton4.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		    	panneau.setMagenta(Plateau.plateau.get(3).getX()-7,Plateau.plateau.get(3).getY()-7);
		    	setContentPane(panneau);
		    }
		    public void mouseExited(java.awt.event.MouseEvent evt) {
		    	panneau.setMagenta(-30,-30);
		    	setContentPane(panneau);
		    }
		});
	    
	    bouton5.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		    	panneau.setMagenta(Plateau.plateau.get(4).getX()-7,Plateau.plateau.get(4).getY()-7);
		    	setContentPane(panneau);
		    }
		    public void mouseExited(java.awt.event.MouseEvent evt) {
		    	panneau.setMagenta(-30,-30);
		    	setContentPane(panneau);
		    }
		});
	    
	    bouton6.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		    	panneau.setMagenta(Plateau.plateau.get(5).getX()-7,Plateau.plateau.get(5).getY()-7);
		    	setContentPane(panneau);
		    }
		    public void mouseExited(java.awt.event.MouseEvent evt) {
		    	panneau.setMagenta(-30,-30);
		    	setContentPane(panneau);
		    }
		});
	    
	    bouton7.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		    	panneau.setMagenta(Plateau.plateau.get(6).getX()-7,Plateau.plateau.get(6).getY()-7);
		    	setContentPane(panneau);
		    }
		    public void mouseExited(java.awt.event.MouseEvent evt) {
		    	panneau.setMagenta(-30,-30);
		    	setContentPane(panneau);
		    }
		});
	    
	    bouton9.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		    	panneau.setMagenta(Plateau.plateau.get(8).getX()-7,Plateau.plateau.get(8).getY()-7);
		    	setContentPane(panneau);
		    }
		    public void mouseExited(java.awt.event.MouseEvent evt) {
		    	panneau.setMagenta(-30,-30);
		    	setContentPane(panneau);
		    }
		});
	    
	    bouton10.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		    	panneau.setMagenta(Plateau.plateau.get(9).getX()-7,Plateau.plateau.get(9).getY()-7);
		    	setContentPane(panneau);
		    }
		    public void mouseExited(java.awt.event.MouseEvent evt) {
		    	panneau.setMagenta(-30,-30);
		    	setContentPane(panneau);
		    }
		});
	    
	    bouton11.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		    	panneau.setMagenta(Plateau.plateau.get(10).getX()-7,Plateau.plateau.get(10).getY()-7);
		    	setContentPane(panneau);
		    }
		    public void mouseExited(java.awt.event.MouseEvent evt) {
		    	panneau.setMagenta(-30,-30);
		    	setContentPane(panneau);
		    }
		});
	    
	    bouton12.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		    	panneau.setMagenta(Plateau.plateau.get(11).getX()-7,Plateau.plateau.get(11).getY()-7);
		    	setContentPane(panneau);
		    }
		    public void mouseExited(java.awt.event.MouseEvent evt) {
		    	panneau.setMagenta(-30,-30);
		    	setContentPane(panneau);
		    }
		});
	    
	    bouton13.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		    	panneau.setMagenta(Plateau.plateau.get(12).getX()-7,Plateau.plateau.get(12).getY()-7);
		    	setContentPane(panneau);
		    }
		    public void mouseExited(java.awt.event.MouseEvent evt) {
		    	panneau.setMagenta(-30,-30);
		    	setContentPane(panneau);
		    }
		});
	    
	    bouton14.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		    	panneau.setMagenta(Plateau.plateau.get(13).getX()-7,Plateau.plateau.get(13).getY()-7);
		    	setContentPane(panneau);
		    }
		    public void mouseExited(java.awt.event.MouseEvent evt) {
		    	panneau.setMagenta(-30,-30);
		    	setContentPane(panneau);
		    }
		});
	    
	    bouton15.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		    	panneau.setMagenta(Plateau.plateau.get(14).getX()-7,Plateau.plateau.get(14).getY()-7);
		    	setContentPane(panneau);
		    }
		    public void mouseExited(java.awt.event.MouseEvent evt) {
		    	panneau.setMagenta(-30,-30);
		    	setContentPane(panneau);
		    }
		});
	    
	    bouton16.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		    	panneau.setMagenta(Plateau.plateau.get(15).getX()-7,Plateau.plateau.get(15).getY()-7);
		    	setContentPane(panneau);
		    }
		    public void mouseExited(java.awt.event.MouseEvent evt) {
		    	panneau.setMagenta(-30,-30);
		    	setContentPane(panneau);
		    }
		});
	    
	    bouton17.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		    	panneau.setMagenta(Plateau.plateau.get(16).getX()-7,Plateau.plateau.get(16).getY()-7);
		    	setContentPane(panneau);
		    }
		    public void mouseExited(java.awt.event.MouseEvent evt) {
		    	panneau.setMagenta(-30,-30);
		    	setContentPane(panneau);
		    }
		});
	    
	    bouton18.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		    	panneau.setMagenta(Plateau.plateau.get(17).getX()-7,Plateau.plateau.get(17).getY()-7);
		    	setContentPane(panneau);
		    }
		    public void mouseExited(java.awt.event.MouseEvent evt) {
		    	panneau.setMagenta(-30,-30);
		    	setContentPane(panneau);
		    }
		});
	    
	    bouton19.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		    	panneau.setMagenta(Plateau.plateau.get(18).getX()-7,Plateau.plateau.get(18).getY()-7);
		    	setContentPane(panneau);
		    }
		    public void mouseExited(java.awt.event.MouseEvent evt) {
		    	panneau.setMagenta(-30,-30);
		    	setContentPane(panneau);
		    }
		});
	    
	    bouton20.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		    	panneau.setMagenta(Plateau.plateau.get(19).getX()-7,Plateau.plateau.get(19).getY()-7);
		    	setContentPane(panneau);
		    }
		    public void mouseExited(java.awt.event.MouseEvent evt) {
		    	panneau.setMagenta(-30,-30);
		    	setContentPane(panneau);
		    }
		});
	    
	    bouton21.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		    	panneau.setMagenta(Plateau.plateau.get(20).getX()-7,Plateau.plateau.get(20).getY()-7);
		    	setContentPane(panneau);
		    }
		    public void mouseExited(java.awt.event.MouseEvent evt) {
		    	panneau.setMagenta(-30,-30);
		    	setContentPane(panneau);
		    }
		});
	    
	    bouton22.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		    	panneau.setMagenta(Plateau.plateau.get(21).getX()-7,Plateau.plateau.get(21).getY()-7);
		    	setContentPane(panneau);
		    }
		    public void mouseExited(java.awt.event.MouseEvent evt) {
		    	panneau.setMagenta(-30,-30);
		    	setContentPane(panneau);
		    }
		});
	    
	    bouton23.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		    	panneau.setMagenta(Plateau.plateau.get(22).getX()-7,Plateau.plateau.get(22).getY()-7);
		    	setContentPane(panneau);
		    }
		    public void mouseExited(java.awt.event.MouseEvent evt) {
		    	panneau.setMagenta(-30,-30);
		    	setContentPane(panneau);
		    }
		});
	    
	    bouton24.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		    	panneau.setMagenta(Plateau.plateau.get(23).getX()-7,Plateau.plateau.get(23).getY()-7);
		    	setContentPane(panneau);
		    }
		    public void mouseExited(java.awt.event.MouseEvent evt) {
		    	panneau.setMagenta(-30,-30);
		    	setContentPane(panneau);
		    }
		});
	    
	    bouton25.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		    	panneau.setMagenta(Plateau.plateau.get(24).getX()-7,Plateau.plateau.get(24).getY()-7);
		    	setContentPane(panneau);
		    }
		    public void mouseExited(java.awt.event.MouseEvent evt) {
		    	panneau.setMagenta(-30,-30);
		    	setContentPane(panneau);
		    }
		});
	    
	    bouton26.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		    	panneau.setMagenta(Plateau.plateau.get(25).getX()-7,Plateau.plateau.get(25).getY()-7);
		    	setContentPane(panneau);
		    }
		    public void mouseExited(java.awt.event.MouseEvent evt) {
		    	panneau.setMagenta(-30,-30);
		    	setContentPane(panneau);
		    }
		});
	    
	    bouton27.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		    	panneau.setMagenta(Plateau.plateau.get(26).getX()-7,Plateau.plateau.get(26).getY()-7);
		    	setContentPane(panneau);
		    }
		    public void mouseExited(java.awt.event.MouseEvent evt) {
		    	panneau.setMagenta(-30,-30);
		    	setContentPane(panneau);
		    }
		});
	    
	    bouton28.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		    	panneau.setMagenta(Plateau.plateau.get(27).getX()-7,Plateau.plateau.get(27).getY()-7);
		    	setContentPane(panneau);
		    }
		    public void mouseExited(java.awt.event.MouseEvent evt) {
		    	panneau.setMagenta(-30,-30);
		    	setContentPane(panneau);
		    }
		});
	    
	    bouton29.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		    	panneau.setMagenta(Plateau.plateau.get(28).getX()-7,Plateau.plateau.get(28).getY()-7);
		    	setContentPane(panneau);
		    }
		    public void mouseExited(java.awt.event.MouseEvent evt) {
		    	panneau.setMagenta(-30,-30);
		    	setContentPane(panneau);
		    }
		});
	    
	    bouton30.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		    	panneau.setMagenta(Plateau.plateau.get(29).getX()-7,Plateau.plateau.get(29).getY()-7);
		    	setContentPane(panneau);
		    }
		    public void mouseExited(java.awt.event.MouseEvent evt) {
		    	panneau.setMagenta(-30,-30);
		    	setContentPane(panneau);
		    }
		});
	    
	    bouton31.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		    	panneau.setMagenta(Plateau.plateau.get(30).getX()-7,Plateau.plateau.get(30).getY()-7);
		    	setContentPane(panneau);
		    }
		    public void mouseExited(java.awt.event.MouseEvent evt) {
		    	panneau.setMagenta(-30,-30);
		    	setContentPane(panneau);
		    }
		});
	    
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
			  labelInfo.setText("<html>Deux joueurs<br/><html>Joueur " + joueurActif + " veuillez lancer les d�s.</html></html>");
			  add(labelInfo);
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
			  labelInfo.setText("<html>Trois joueurs<br/><html>Joueur " + joueurActif + " veuillez lancer les d�s.</html></html>");
			  add(labelInfo);
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
			  labelInfo.setText("<html>Quatre joueurs<br/><html>Joueur " + joueurActif + " veuillez lancer les d�s.</html></html>");
			  add(labelInfo);
			  setContentPane(panneau);
		  }
		  
		  if(arg0.getSource() == boutonLancerDe){
			  labelInfo.setText("");
			  add(argentJoueurActuel);
			  add(labelInfo);
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
			  argentJoueurActuel.setText("<html>Joueur " + joueurActif + "(" + joueurs.get(joueurActif-1).getCouleur() + ")" + "<br/>Argent " + joueurs.get(joueurActif-1).getArgentJoueur() + "</html>");
			  setContentPane(panneau);			  
		  }
		  
		  if(arg0.getSource() == boutonContinuer){
			  clean();
			  cleanTitre();
			  labelInfo.setText("<html>Joueur " + joueurActif + " veuillez lancer les d�s.</html>");
			  remove(boutonContinuer);
			  remove(boutonAction);
			  add(boutonLancerDe);
			  verifierArgentJoueur();
			  setContentPane(panneau);
		  }
		  
		  if(arg0.getSource() == boutonJoueurSuivant){
			  clean();
			  cleanTitre();
			  labelInfo.setText("<html>Joueur " + joueurActif + " veuillez lancer les d�s.</html>");
			  remove(boutonJoueurSuivant);
			  remove(boutonAction);
			  remove(argentJoueurActuel);
			  add(boutonLancerDe);
			  verifierArgentJoueur();
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
				if(hotels.get(i).getNom().equals("Fujiyama") && !hotels.get(i).getBaseLoisirConstruit()){
					add(boutonConstruireGratuitFujiyama);
					add(labelConstruireGratuit);
				}
				if(hotels.get(i).getNom().equals("Boomerang") && !hotels.get(i).getBaseLoisirConstruit()){
					add(boutonConstruireGratuitBoomerang);
					add(labelConstruireGratuit);
				}
				if(hotels.get(i).getNom().equals("Etoile") && !hotels.get(i).getBaseLoisirConstruit()){
					add(boutonConstruireGratuitEtoile);
					add(labelConstruireGratuit);
				}
				if(hotels.get(i).getNom().equals("President") && !hotels.get(i).getBaseLoisirConstruit()){
					add(boutonConstruireGratuitPresident);
					add(labelConstruireGratuit);
				}
				if(hotels.get(i).getNom().equals("Royal") && !hotels.get(i).getBaseLoisirConstruit()){
					add(boutonConstruireGratuitRoyal);
					add(labelConstruireGratuit);
				}
				if(hotels.get(i).getNom().equals("Safari") && !hotels.get(i).getBaseLoisirConstruit()){
					add(boutonConstruireGratuitSafari);
					add(labelConstruireGratuit);
				}
				if(hotels.get(i).getNom().equals("TajMahal") && !hotels.get(i).getBaseLoisirConstruit()){
					add(boutonConstruireGratuitTajMahal);
					add(labelConstruireGratuit);
				}
				if(hotels.get(i).getNom().equals("Waikiki") && !hotels.get(i).getBaseLoisirConstruit()){
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
		argentJoueurActuel.setText("<html>Joueur " + joueurActif + "<br/>Argent " + joueurs.get(joueurActif-1).getArgentJoueur() + "</html>");
	}
	
	public void boutonRachatHotel(String nom){
		clean();
		Hotel hotel = Hotel.trouveHotel(nom, hotelCase);
		hotel.rachatHotel(joueurActif);
		argentJoueurActuel.setText("<html>Joueur " + joueurActif + "<br/>Argent " + joueurs.get(joueurActif-1).getArgentJoueur() + "</html>");
	}
	
	public void boutonConstruitHotel(String nom){
		clean();
		Hotel hotel = Hotel.trouveHotel(nom, hotels);
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
		argentJoueurActuel.setText("<html>Joueur " + joueurActif + "<br/>Argent " + joueurs.get(joueurActif-1).getArgentJoueur() + "</html>");
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

	public void verifierArgentJoueur(){
		for( int i=0 ; i<joueurs.size(); i++){
			if(joueurs.get(i).getArgentJoueur()<=0){
				clean();
				cleanTitre();
				remove(boutonLancerDe);
				remove(argentJoueurActuel);
				setContentPane(panneau);
				int joueur1 = 0,
					joueur2 = 0, 
					joueur3 = 0, 
					joueur4 = 0,
					argentJoueur1 = 0,
					argentJoueur2 = 0,
					argentJoueur3 = 0,
					argentJoueur4 = 0;
				int egaliteJoueur = 0; // =23 pour egalite entre joueur 2 et 3, =24 pour egalite entre 2 et 4, etc...
				boolean egalite = false;
				switch(this.nbJoueur){
				case 2:
					joueur2=i+1;
					if(i==0){
						joueur1=2;
						argentJoueur1 = joueurs.get(1).getArgentJoueur();
					}
					else{
						joueur1=1;
						argentJoueur1 = joueurs.get(0).getArgentJoueur();
					}
					labelInfo.setText("<html>La partie est termin�e, le joueur " + joueur2 
									  + " n'a plus d'argent.<br/>Classement :<br/>Premier : joueur " + joueur1 + " avec " + argentJoueur1 + " euros"
									  + "<br/>Deuxieme : joueur " + joueur2 + " avec " + argentJoueur1 + " euros</html>");
					break;
				case 3:
					joueur3=i+1;
					if(i==0){
						if(joueurs.get(1).getArgentJoueur()>joueurs.get(2).getArgentJoueur()){
							joueur1=2;
							joueur2=3;
							argentJoueur1 = joueurs.get(1).getArgentJoueur();
							argentJoueur2 = joueurs.get(2).getArgentJoueur();
						}
						if(joueurs.get(1).getArgentJoueur()<joueurs.get(2).getArgentJoueur()){
							joueur1=3;
							joueur2=2;
							argentJoueur1 = joueurs.get(2).getArgentJoueur();
							argentJoueur2 = joueurs.get(1).getArgentJoueur();
						}
						if(joueurs.get(1).getArgentJoueur()==joueurs.get(2).getArgentJoueur()){
							egalite=true;
							joueur1=2;
							joueur2=3;
							argentJoueur1 = joueurs.get(1).getArgentJoueur();
							argentJoueur2 = joueurs.get(2).getArgentJoueur();
						}
					}
					if(i==1){
						if(joueurs.get(0).getArgentJoueur()>joueurs.get(2).getArgentJoueur()){
							joueur1=1;
							joueur2=3;
							argentJoueur1 = joueurs.get(0).getArgentJoueur();
							argentJoueur2 = joueurs.get(2).getArgentJoueur();
						}
						if(joueurs.get(0).getArgentJoueur()<joueurs.get(2).getArgentJoueur()){
							joueur1=3;
							joueur2=1;
							argentJoueur1 = joueurs.get(2).getArgentJoueur();
							argentJoueur2 = joueurs.get(0).getArgentJoueur();
						}
						if(joueurs.get(0).getArgentJoueur()==joueurs.get(2).getArgentJoueur()){
							egalite=true;
							joueur1=1;
							joueur2=3;
							argentJoueur1 = joueurs.get(0).getArgentJoueur();
							argentJoueur2 = joueurs.get(2).getArgentJoueur();
						}
					}
					if(i==2){
						if(joueurs.get(1).getArgentJoueur()>joueurs.get(0).getArgentJoueur()){
							joueur1=2;
							joueur2=1;
							argentJoueur1 = joueurs.get(1).getArgentJoueur();
							argentJoueur2 = joueurs.get(0).getArgentJoueur();
						}
						if(joueurs.get(1).getArgentJoueur()<joueurs.get(0).getArgentJoueur()){
							joueur1=1;
							joueur2=2;
							argentJoueur1 = joueurs.get(0).getArgentJoueur();
							argentJoueur2 = joueurs.get(1).getArgentJoueur();
						}
						if(joueurs.get(1).getArgentJoueur()==joueurs.get(0).getArgentJoueur()){
							egalite=true;
							joueur1=1;
							joueur2=2;
							argentJoueur1 = joueurs.get(0).getArgentJoueur();
							argentJoueur2 = joueurs.get(1).getArgentJoueur();
						}
					}
					if(!egalite){
						labelInfo.setText("<html>La partie est termin�e, le joueur " + joueur3 
										  + " n'a plus d'argent.<br/>Classement :<br/>Premier : joueur " + joueur1 + " avec " + argentJoueur1 + " euros"
										  + "<br/>Deuxieme : joueur " + joueur2 + " avec " + argentJoueur2 + " euros"
										  + "<br/>Troisieme : joueur " + joueur3 + " avec " + argentJoueur3 + " euros</html>");
					}
					else{
						labelInfo.setText("<html>La partie est termin�e, le joueur " + joueur3 
								  + " n'a plus d'argent.<br/>Classement :<br/>Premier ex aequo : joueur " + joueur1 + " avec " + argentJoueur1 + " euros"
								  + "<br/>Premier ex aequo : joueur " + joueur2 + " avec " + argentJoueur2 + " euros"
								  + "<br/>Troisieme : joueur " + joueur3 + " avec " + argentJoueur3 + " euros</html>");
					}
					break;
				case 4:
					break;
				}
				setContentPane(panneau);
			}
		}
	}		  
}	
