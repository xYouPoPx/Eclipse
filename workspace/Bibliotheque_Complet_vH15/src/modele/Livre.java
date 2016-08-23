/**
 * 
 */
package modele;

import java.io.Serializable;

/**
 * @author YCourteau
 *
 */
public class Livre implements Serializable {
	
	private int id;
	private String isbn;
	private String titre;
	private Auteur auteur; // = new Auteur();
	private Editeur editeur; // = new Editeur();
	private int statut;
	private int nbrPages;
	
	public Livre(int id, String isbn, String titre, Auteur auteur, Editeur editeur, int statut, int nbrPages){
		this.id = id;
		this.isbn = isbn;
		this.titre = titre;
		this.auteur = auteur;
		this.editeur = editeur;
		this.statut = statut;
		this.nbrPages = nbrPages;
	}
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public Editeur getEditeur() {
		return editeur;
	}

	public void setEditeur(Editeur editeur) {
		this.editeur = editeur;
	}

	public int getNbrPages() {
		return nbrPages;
	}

	public void setNbrPages(int nbrPages) {
		this.nbrPages = nbrPages;
	}

	public Livre(){
		
	}
	
	public int getStatut() {
		return statut;
	}

	public void setStatut(int statut) {
		this.statut = statut;
	}

	public Auteur getAuteur() {
		return auteur;
	}

	public void setAuteur(Auteur auteur) {
		this.auteur = auteur;
	}

	public static void main(String[] args) {
		
		Livre monLivre = new Livre();
		Auteur aut = new Auteur();
		
		int test = monLivre.getStatut();
		
		int test2 = monLivre.auteur.getIntPret();
	}
	
	
	

}
