/**
 * 
 */
package modele;

import java.io.Serializable;

/**
 * @author YCourteau
 *
 */
public class Dictionnaire extends Livre implements Serializable{

	public int intPret = 3;
	public String StringPret = "un string de pret";
	
	public Dictionnaire(int id, String isbn, String titre, Auteur auteur, Editeur editeur, int statut, int nbrPages){
		super(id, isbn,  titre,  auteur,  editeur,  statut,  nbrPages);
		
		this.intPret = id;
	}
	
}
