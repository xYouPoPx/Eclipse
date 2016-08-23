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
public class Recompense implements Serializable{
	
	private int id_recompense;
	private String nom_recompense;
	private ArrayList<Recompense> listRecompense = new ArrayList<Recompense>();
	
	/**
	 * 
	 * @author ycourteau
	 * 27 mai 2016
	 * @param nom_recompense
	 * @param valeur
	 */
	public Recompense(String nom_recompense, double valeur){
		
	}

	/**
	 * @return the id_recompense
	 */
	public int getId_recompense() {
		return id_recompense;
	}



	/**
	 * @param id_recompense the id_recompense to set
	 */
	public void setId_recompense(int id_recompense) {
		this.id_recompense = id_recompense;
	}



	/**
	 * @return the nom_recompense
	 */
	public String getNom_recompense() {
		return nom_recompense;
	}



	/**
	 * @param nom_recompense the nom_recompense to set
	 */
	public void setNom_recompense(String nom_recompense) {
		this.nom_recompense = nom_recompense;
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
