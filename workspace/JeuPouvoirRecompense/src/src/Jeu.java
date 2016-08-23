/**
 * 
 */
package src;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * @author ycourteau
 *
 */
public class Jeu implements Serializable {
	
	private int id_jeu;
	private String nom_jeu;
	private ArrayList<Recompense> listRecompense = new ArrayList<Recompense>();

	public Jeu(String nomJeu, ArrayList<Recompense> listRec){
		this.nom_jeu = nomJeu;
		this.listRecompense = listRec;
	}
	
	public Recompense jouer(){
		
		return new Recompense(nom_jeu, id_jeu);
	}
	
	/**
	 * @return the id_jeu
	 */
	public int getId_jeu() {
		return id_jeu;
	}



	/**
	 * @param id_jeu the id_jeu to set
	 */
	public void setId_jeu(int id_jeu) {
		this.id_jeu = id_jeu;
	}



	/**
	 * @return the nom_jeu
	 */
	public String getNom_jeu() {
		return nom_jeu;
	}



	/**
	 * @param nom_jeu the nom_jeu to set
	 */
	public void setNom_jeu(String nom_jeu) {
		this.nom_jeu = nom_jeu;
	}



	/**
	 * @return the listRecompense
	 */
	public ArrayList<Recompense> getListRecompense() {
		return listRecompense;
	}



	/**
	 * @param listRecompense the listRecompense to set
	 */
	public void setListRecompense(ArrayList<Recompense> listRecompense) {
		this.listRecompense = listRecompense;
	}



	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
