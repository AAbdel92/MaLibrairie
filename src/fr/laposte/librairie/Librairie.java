package fr.laposte.librairie;

import java.util.ArrayList;

public class Librairie {
	private ArrayList<Livre> stock;
	
	
	
	public Librairie() {
		super();
		this.stock = new ArrayList<>();
	}
	
	



	public void constituerStock() {
		this.stock.add(Livre.creerLivre("Chanson douce", "Leila Slimani", "3289080", 25));
		this.stock.add(Livre.creerLivre("Petit pays", "Gaël Faye", "4332438", 32));
		this.stock.add(Livre.creerLivre("L'autre qu'on adorait", "Catherine Cusset", "9067453", 19));
		this.stock.add(Livre.creerLivre("Cannibales", "Régis Jauffret", "8976383", 12));
		this.stock.add(Livre.creerLivre("Babylone", "Yasmina Reza", "1234546", 20));
		this.stock.add(Livre.creerLivre("Le Dieu du carnage", "Yasmina Reza", "8763903", 6));
		this.stock.add(Livre.creerLivre("California girls", "Simon Leberati", "5656834", 20));
		this.stock.add(Livre.creerLivre("La tour de Babylone", "Ted Chiang", "5226834", 9));
		
	}
	
	public void afficherStock() {
		for (Livre livre : stock) {
			livre.sePresenter();
			
		}
	}

}
