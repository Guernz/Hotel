package jeu;

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
	// - entrée gratuite (2)
	// - construction gratuite (3)
	// - permis de construire (4)
	// - achat (5)
	// entre case 7 et 8 banque
	// entre case 26 et 27 achat entrée
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
	
}
