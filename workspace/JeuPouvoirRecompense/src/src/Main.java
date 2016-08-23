/**
 * 
 */
package src;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author ycourteau
 *
 */
public class Main {

	private Scanner scanner = new Scanner(System.in);
	private static int menuSelect;
	static ArrayList<Utilisateur> listUtilisateur = new ArrayList<Utilisateur>();
	ArrayList<Pouvoir> listPouvoir = new ArrayList<Pouvoir>();
	static ArrayList<Jeu> listJeu = new ArrayList<Jeu>();

	/**
	 * 
	 * @author ycourteau 27 mai 2016
	 *
	 */
	public void lecture() {

	}

	/**
	 * 
	 * @author ycourteau 27 mai 2016
	 *
	 */
	public void ecriture() {

	}

	/**
	 * 
	 * @author ycourteau 27 mai 2016
	 *
	 */
	public void afficherListeUtilisateurs() {

	}

	/**
	 * 
	 * @author ycourteau 27 mai 2016
	 *
	 */
	public static Utilisateur connecter(String nom_utilisateur, String mot_passe) {
		
		Utilisateur monUser = null;
		for( Utilisateur usr : listUtilisateur){
			if(usr.getNom_utilisateur().equals(nom_utilisateur) && usr.getMot_passe().equals(mot_passe)){
				monUser = usr;
				monUser.connecter();
				break;
			} else {
				System.out.println("Informations de connexion incorrectes. Veuillez recommencer");
			}
			
		}
		
		return monUser;

	}

	/**
	 * 
	 * @author ycourteau 27 mai 2016
	 *
	 */
	public void deconnecter(Utilisateur utilisateur) {

	}

	/**
	 * 
	 * @author ycourteau 27 mai 2016
	 *
	 */
	public static Recompense jouer() {

		return new Recompense(null, menuSelect);
	}

	/**
	 * 
	 * @author ycourteau 27 mai 2016
	 *
	 */
	public void afficherFortune() {

	}

	/**
	 * 
	 * @author ycourteau 27 mai 2016
	 *
	 */
	public void afficherRecompense() {

	}

	/**
	 * 
	 * @author ycourteau 27 mai 2016
	 *
	 */
	public void acheterPouvoir() {

	}

	/**
	 * 
	 * @author ycourteau 27 mai 2016
	 *
	 */
	public void afficherPouvoir() {

	}

	/**
	 * 
	 * @author ycourteau 27 mai 2016
	 * 
	 */
	public static void main(String[] args) {

		/*
		 * 2.1.5.	Au démarrage du programme, la liste des récompenses doit se charger en mémoire.
		 * 2.1.5.1.	Cette liste doit être située dans le fichier « recompense.txt » et être enregistré directement dans le répertoire du projet.
		 * 2.1.5.2.	Vous pouvez créer un main dans cette classe afin d’ajouter des objets dans le fichier (hardcoded)
		 * 2.1.5.3.	Le fichier est « fixe » : il contient déjà des objets au démarrage du programme
		 */
		
		Utilisateur usr = connecter("username", "password");
		
		if(usr != null){
			// afficher et selectionner la liste de jeux
			
			Recompense rec = jouer();
			
			//usr.setListRecompenseGagnees.add(rec);
			Jeu jeu = listJeu.get(0);
			ArrayList<Recompense> listRec = jeu.getListRecompense();
		}
		
		/**
		 *  TODO load fichier
		 *  load listes
		 *  Utilisateur
		 *  Connecter
		 *  Menu
		 */

	}

}
