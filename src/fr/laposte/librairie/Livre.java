package fr.laposte.librairie;

public class Livre {
	private String nom;
	private String auteur;
	private String isbn;
	private float prix;
	
	public Livre(String nom, String auteur, String isbn, float prix) {
		super();
		this.nom = nom;
		this.auteur = auteur;
		this.isbn = isbn;
		this.prix = prix;
	}
	
	public void sePresenter() {
		String moi = "Livre : " + this.nom + " , " + this.auteur;
		System.out.println(moi);
		blabla
	}

}
