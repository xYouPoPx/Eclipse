/**
 * 
 */
package controleur;

import java.io.Serializable;
import java.util.Date;

import modele.Livre;
import modele.Membre;

/**
 * @author YCourteau
 *
 */
public class Pret implements Serializable {
	
	private int id;
	private Date dateEmprunt = new Date();
	private Date dateRetourTheorique = new Date();
	private Date dateRetourEffectif = new Date();
	private Membre membre;// = new Membre();
	private Livre livre = new Livre();
	
	public Pret(int id, Date dateEmprunt, Date dateRetourTheorique, Membre membre, Livre livre){
		
		this.id = id;
		this.dateEmprunt = dateEmprunt;
		this.dateRetourTheorique = dateRetourTheorique;
		this.membre = membre;
		this.livre = livre;
		
		// modifier statut a emprunte
		livre.setStatut(1);
		
	}
	/**
	 * @return the membre
	 */
	public Membre getMembre() {
		return membre;
	}
	/**
	 * @param membre the membre to set
	 */
	public void setMembre(Membre membre) {
		this.membre = membre;
	}
	/**
	 * @return the livre
	 */
	public Livre getLivre() {
		return livre;
	}
	/**
	 * @param livre the livre to set
	 */
	public void setLivre(Livre livre) {
		this.livre = livre;
	}

	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the dateEmprunt
	 */
	public Date getDateEmprunt() {
		return dateEmprunt;
	}
	/**
	 * @param dateEmprunt the dateEmprunt to set
	 */
	public void setDateEmprunt(Date dateEmprunt) {
		this.dateEmprunt = dateEmprunt;
	}
	/**
	 * @return the dateRetourTheorique
	 */
	public Date getDateRetourTheorique() {
		return dateRetourTheorique;
	}
	/**
	 * @param dateRetourTheorique the dateRetourTheorique to set
	 */
	public void setDateRetourTheorique(Date dateRetourTheorique) {
		this.dateRetourTheorique = dateRetourTheorique;
	}
	/**
	 * @return the dateRetourEffectif
	 */
	public Date getDateRetourEffectif() {
		return dateRetourEffectif;
	}
	/**
	 * @param dateRetourEffectif the dateRetourEffectif to set
	 */
	public void setDateRetourEffectif(Date dateRetourEffectif) {
		this.dateRetourEffectif = dateRetourEffectif;
	}

}
