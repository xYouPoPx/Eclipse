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
public class Reservation implements Serializable {
	
	private int id;
	private Date dateReservation = new Date();
	private Date dateFinReservation = new Date();
	private Livre livre = new Livre();
	private Membre membre;// = new Membre();
	
	public Reservation(int id, Date dateReservation, Date dateFinReservation, Livre livre, Membre membre){
		
		this.id = id;
		this.dateReservation = dateReservation;
		this.dateFinReservation = dateFinReservation;
		this.livre = livre;
		this.membre = membre;
		
		// statut = 2 = reserve
		this.livre.setStatut(2);
	}
	
	public Reservation(Date dateReservation, Membre membre) {
		super();
		this.dateReservation = dateReservation;
		this.membre = membre;
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
	 * @return the dateReservation
	 */
	public Date getDateReservation() {
		return dateReservation;
	}
	/**
	 * @param dateReservation the dateReservation to set
	 */
	public void setDateReservation(Date dateReservation) {
		this.dateReservation = dateReservation;
	}
	/**
	 * @return the dateFinReservation
	 */
	public Date getDateFinReservation() {
		return dateFinReservation;
	}
	/**
	 * @param dateFinReservation the dateFinReservation to set
	 */
	public void setDateFinReservation(Date dateFinReservation) {
		this.dateFinReservation = dateFinReservation;
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
	

}
