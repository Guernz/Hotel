package jeu;

import java.util.ArrayList;


public class Plateau {

	static int nbCase=31;
	static ArrayList<Case> plateau = new ArrayList<Case>();
	
	public Plateau(){
		Case case1 = new Case(1,1,false,false,80,350);
		plateau.add(case1);
		Case case2 = new Case(2,4,true,false,53,267);
		plateau.add(case2);
		Case case3 = new Case(3,5,true,true,62,200);
		plateau.add(case3);
		Case case4 = new Case(4,4,true,true,100,150);
		plateau.add(case4);
		Case case5 = new Case(5,5,true,true,158,122);
		plateau.add(case5);
		Case case6 = new Case(6,4,true,true,218,125);
		plateau.add(case6);
		Case case7 = new Case(7,2,true,false,270,145);
		plateau.add(case7);
		Case case8 = new Case(8,4,false,false,335,153);
		plateau.add(case8);
		Case case9 = new Case(9,5,true,false,393, 133);
		plateau.add(case9);
		Case case10 = new Case(10,5,true,true,450, 138);
		plateau.add(case10);
		Case case11 = new Case(11,3,true,true,500, 187);
		plateau.add(case11);
		Case case12 = new Case(12,5,true,true,558, 220);
		plateau.add(case12);
		Case case13 = new Case(13,4,true,true,616, 236);
		plateau.add(case13);
		Case case14 = new Case(14,5,true,true,678, 245);
		plateau.add(case14);
		Case case15 = new Case(15,4,true,true,738, 275);
		plateau.add(case15);
		Case case16 = new Case(16,5,true,true,765, 335);
		plateau.add(case16);
		Case case17 = new Case(17,4,true,true,758, 402);
		plateau.add(case17);
		Case case18 = new Case(18,5,true,true,715, 452);
		plateau.add(case18);
		Case case19 = new Case(19,2,true,true,653, 467);
		plateau.add(case19);
		Case case20 = new Case(20,4,true,true,587, 450);
		plateau.add(case20);
		Case case21 = new Case(21,5,true,true,527, 430);
		plateau.add(case21);
		Case case22 = new Case(22,5,true,true,467, 410);
		plateau.add(case22);
		Case case23 = new Case(23,4,true,true,405, 400);
		plateau.add(case23);
		Case case24 = new Case(24,5,true,true,352, 440);
		plateau.add(case24);
		Case case25 = new Case(25,3,true,true,340, 500);
		plateau.add(case25);
		Case case26 = new Case(26,4,false,true,320, 565);
		plateau.add(case26);
		Case case27 = new Case(27,4,false,true,247, 592);
		plateau.add(case27);
		Case case28 = new Case(28,4,false,true,197, 540);
		plateau.add(case28);
		Case case29 = new Case(29,5,true,true,190, 470);
		plateau.add(case29);
		Case case30 = new Case(30,2,true,true,190, 406);
		plateau.add(case30);
		Case case31 = new Case(31,4,false,true,154, 356);
		plateau.add(case31);
	}
}
