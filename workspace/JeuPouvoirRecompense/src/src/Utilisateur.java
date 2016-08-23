/**
 * 
 */
package src;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * @author ycourteau
 * 420-E6S-SW Programmation structurée 2016 - 2017
 * Evaluation 2
 *
 */
public class Utilisateur implements Serializable{
	
	private int id_utilisateur;
	private String nom_utilisateur;
	private String mot_passe;
	private String courriel;
	private boolean statut;
	private double fortune_totale;
	private ArrayList<Jeu> listJeuJoues = new ArrayList<Jeu>();
	private ArrayList<Pouvoir> listPouvoir = new ArrayList<Pouvoir>();
	private ArrayList<Recompense> listRecompenseGagnees = new ArrayList<Recompense>();

	
	
	public Utilisateur(String string, String string2, double d) {
		// TODO Auto-generated constructor stub
	}

	public boolean connecter(){
		
		this.setStatut(this.isStatut()? false : true);
		return true;
	}
	
	public Recompense jouerJeu(Jeu jeu){
		
		Recompense RecompenseGagnee;
		RecompenseGagnee = jeu.jouer();
		listRecompenseGagnees.add(RecompenseGagnee);
		
		return new Recompense(courriel, fortune_totale);
	}
	
	public void acheterPouvoir(Pouvoir pouvoir){
		
	}
	

	/**
	 * @return the id_utilisateur
	 */
	public int getId_utilisateur() {
		return id_utilisateur;
	}





	/**
	 * @param id_utilisateur the id_utilisateur to set
	 */
	public void setId_utilisateur(int id_utilisateur) {
		this.id_utilisateur = id_utilisateur;
	}





	/**
	 * @return the nom_utilisateur
	 */
	public String getNom_utilisateur() {
		return nom_utilisateur;
	}





	/**
	 * @param nom_utilisateur the nom_utilisateur to set
	 */
	public void setNom_utilisateur(String nom_utilisateur) {
		this.nom_utilisateur = nom_utilisateur;
	}





	/**
	 * @return the mot_passe
	 */
	public String getMot_passe() {
		return mot_passe;
	}





	/**
	 * @param mot_passe the mot_passe to set
	 */
	public void setMot_passe(String mot_passe) {
		this.mot_passe = mot_passe;
	}





	/**
	 * @return the courriel
	 */
	public String getCourriel() {
		return courriel;
	}





	/**
	 * @param courriel the courriel to set
	 */
	public void setCourriel(String courriel) {
		this.courriel = courriel;
	}





	/**
	 * @return the statut
	 */
	public boolean isStatut() {
		return statut;
	}





	/**
	 * @param statut the statut to set
	 */
	public void setStatut(boolean statut) {
		this.statut = statut;
	}





	/**
	 * @return the fortune_totale
	 */
	public double getFortune_totale() {
		return fortune_totale;
	}





	/**
	 * @param fortune_totale the fortune_totale to set
	 */
	public void setFortune_totale(double fortune_totale) {
		this.fortune_totale = fortune_totale;
	}





	/**
	 * @return the listJeuJoues
	 */
	public ArrayList<Jeu> getListJeuJoues() {
		return listJeuJoues;
	}





	/**
	 * @param listJeuJoues the listJeuJoues to set
	 */
	public void setListJeuJoues(ArrayList<Jeu> listJeuJoues) {
		this.listJeuJoues = listJeuJoues;
	}





	/**
	 * @return the listPouvoir
	 */
	public ArrayList<Pouvoir> getListPouvoir() {
		return listPouvoir;
	}





	/**
	 * @param listPouvoir the listPouvoir to set
	 */
	public void setListPouvoir(ArrayList<Pouvoir> listPouvoir) {
		this.listPouvoir = listPouvoir;
	}





	/**
	 * @return the listRecompenseGagnees
	 */
	public ArrayList<Recompense> getListRecompenseGagnees() {
		return listRecompenseGagnees;
	}





	/**
	 * @param rec TODO
	 */
	public void setListRecompenseGagnees(Recompense rec) {
		this.listRecompenseGagnees.add(rec);
	}





	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}

}
