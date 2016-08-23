package vue;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import controleur.Pret;
import modele.Livre;
import modele.Membre;

public final class Menu {

	static Scanner scanner = new Scanner(System.in);
	static int menuSelect = 0;

	public static int MenuPrincipal() {

		System.out.println("******************** BIBLIOTHEQUE ********************");
		System.out.println("*                                                    *");
		System.out.println("* 1 - Membres                                        *");
		System.out.println("* 2 - Livres                                         *");
		System.out.println("* 3 - Reservation                                    *");
		System.out.println("* 4 - Pret                                           *");
		System.out.println("* 5 - Quitter                                        *");
		System.out.println("*                                                    *");
		System.out.println("******************************************************");
		System.out.print("VOTRE CHOIX: ");

		menuSelect = scanner.nextInt();

		return menuSelect;

	}

	public static int MenuMembre() {

		System.out.println("*********************** Membres **********************");
		System.out.println("*                                                    *");
		System.out.println("* 1 - Ajouter                                        *");
		System.out.println("* 2 - Supprimer                                      *");
		System.out.println("* 3 - Modifier                                       *");
		System.out.println("* 4 - Retour au menu principal                       *");
		System.out.println("*                                                    *");
		System.out.println("******************************************************");
		System.out.print("VOTRE CHOIX: ");

		menuSelect = scanner.nextInt();

		return menuSelect;
	}

	public static int MenuMembreSupprimer() {

		System.out.println("***************** Membre - Supprimer *****************");
		System.out.println("*                                                    *");
		System.out.println("* 1 - Par num�ro de membre                           *");
		System.out.println("* 2 - Afficher liste                                 *");
		System.out.println("* 3 - Retour au menu Membres                         *");
		System.out.println("*                                                    *");
		System.out.println("******************************************************");
		System.out.print("VOTRE CHOIX: ");

		menuSelect = scanner.nextInt();

		return menuSelect;
	}

	public static int MenuMembreSupprimerID() {

		System.out.print("* Entrez l'ID du membre � supprimer: ");

		int id = scanner.nextInt();

		return id;
	}

	public static int MenuMembreModifier() {

		System.out.println("***************** Membre - Modifier ******************");
		System.out.println("*                                                    *");
		System.out.println("* 1 - Par num�ro de membre                           *");
		System.out.println("* 2 - Afficher liste                                 *");
		System.out.println("* 3 - Retour au menu Membres                         *");
		System.out.println("*                                                    *");
		System.out.println("******************************************************");
		System.out.print("VOTRE CHOIX: ");

		menuSelect = scanner.nextInt();

		return menuSelect;
	}

	public static int MenuMembreModiferID() {

		System.out.print("* Entrez l'ID du membre � modifier: ");

		int id = scanner.nextInt();

		return id;
	}

	public static int MenuMembreModifierListe(ArrayList<Membre> liste) {

		System.out.println("************* Membre - Supprimer - Liste **************");
		System.out.println("*                                                    *");
		System.out.println("ID \tNom\tPr�nom");

		for (Membre mem : liste) {

			System.out.println(mem.getId() + "\t" + mem.getNom() + "\t" + mem.getPrenom());
		}

		System.out.print("Entrez l'ID du membre � modifier: ");

		menuSelect = scanner.nextInt();

		return menuSelect;
	}

	public static int MenuLivre() {

		System.out.println("*********************** Livres ***********************");
		System.out.println("*                                                    *");
		System.out.println("* 1 - Ajouter                                        *");
		System.out.println("* 2 - Supprimer                                      *");
		System.out.println("* 3 - Modifier                                       *");
		System.out.println("* 4 - Retour au menu principal                       *");
		System.out.println("*                                                    *");
		System.out.println("******************************************************");
		System.out.print("VOTRE CHOIX: ");

		menuSelect = scanner.nextInt();

		return menuSelect;
	}

	public static int MenuLivreModifier() {

		System.out.println("\r\n***************** Livre - Modifier *******************");
		System.out.println("*                                                    *");
		System.out.println("* 1 - Par ISBN                                       *");
		System.out.println("* 2 - Afficher liste                                 *");
		System.out.println("* 3 - Retour au menu Livres                          *");
		System.out.println("*                                                    *");
		System.out.println("******************************************************");
		System.out.print("VOTRE CHOIX: ");

		menuSelect = scanner.nextInt();

		return menuSelect;
	}

	public static String MenuLivreModifierISBN() {

		System.out.print("* Entrez l'ISBN � modifier:");

		String isbn = scanner.next();

		return isbn;
	}

	public static int MenuLivreModifierListe(ArrayList<Livre> liste) {

		System.out.println("************* Livre - Modifier - Liste **************");
		System.out.println("*                                                    *");
		System.out.println("ID \tTITRE");

		for (Livre liv : liste) {

			System.out.println(liv.getId() + "\t" + liv.getTitre());
		}
		System.out.print("Entrez l'ID du livre � modifier: ");

		menuSelect = scanner.nextInt();

		return menuSelect;
	}

	public static int MenuLivreSupprimer() {

		System.out.println("***************** Livre - Supprimer ******************");
		System.out.println("*                                                    *");
		System.out.println("* 1 - Par ISBN                                       *");
		System.out.println("* 2 - Afficher liste                                 *");
		System.out.println("* 3 - Retour au menu Livres                          *");
		System.out.println("*                                                    *");
		System.out.println("******************************************************");
		System.out.print("VOTRE CHOIX: ");

		menuSelect = scanner.nextInt();

		return menuSelect;
	}

	// TODO a modifier!! doit retourner isbn a supprimer
	public static String MenuLivreSupprimerISBN() {

		System.out.print("* Entrez l'ISBN � supprimer:");

		String isbn = scanner.next();

		return isbn;
	}

	public static int MenuLivreSupprimerListe(ArrayList<Livre> liste) {

		System.out.println("************* Livre - Supprimer - Liste **************");
		System.out.println("*                                                    *");
		System.out.println("ID \tTITRE");
		
		for(int i = 0; i < liste.size(); i++){
			System.out.println(liste.get(i).getId() + "\t" + liste.get(i).getTitre());
		}

		for (Livre liv : liste) {

			System.out.println(liv.getId() + "\t" + liv.getTitre());
		}
		System.out.print("Entrez l'ID du livre � supprimer: ");

		menuSelect = scanner.nextInt();

		return menuSelect;
	}

	public static int MenuMembreSupprimerListe(ArrayList<Membre> liste) {

		System.out.println("************* Membre - Supprimer - Liste **************");
		System.out.println("*                                                    *");
		System.out.println("ID \tNom\tPr�nom");

		for (Membre mem : liste) {

			System.out.println(mem.getId() + "\t" + mem.getNom() + "\t" + mem.getPrenom());
		}

		System.out.print("Entrez l'ID du membre � supprimer: ");

		menuSelect = scanner.nextInt();

		return menuSelect;
	}

	public static int MenuPret() {

		System.out.println("************************* Pret ***********************");
		System.out.println("*                                                    *");
		System.out.println("* 1 - Ajouter                                        *");
		System.out.println("* 2 - Supprimer                                      *");
		System.out.println("* 3 - Modifier                                       *");
		System.out.println("* 4 - Retour au menu Pr�ts                           *");
		System.out.println("*                                                    *");
		System.out.println("******************************************************");
		System.out.print("VOTRE CHOIX: ");

		menuSelect = scanner.nextInt();

		return menuSelect;
	}

	public static int MenuPretSupprimer() {

		System.out.println("******************* Pr�t - Supprimer *****************");
		System.out.println("*                                                    *");
		System.out.println("* 1 - Par num�ro de r�servation                      *");
		System.out.println("* 2 - Par num�ro de membre                           *");
		System.out.println("* 3 - Afficher liste                                 *");
		System.out.println("* 4 - Retour au menu Pr�t                            *");
		System.out.println("*                                                    *");
		System.out.println("******************************************************");
		System.out.print("VOTRE CHOIX: ");

		menuSelect = scanner.nextInt();

		return menuSelect;
	}
	
	public static int MenuPretSupprimerNoPret() {

		System.out.print("Entrez le no de pr�t � supprimer: ");

		menuSelect = scanner.nextInt();

		return menuSelect;
	}
	
	public static int MenuPretSupprimerListe(ArrayList<Pret> liste) {

		System.out.println("************* Pr�t - Supprimer - Liste **************");
		System.out.println("*                                                    *");
		System.out.println("ID \tNom\tPr�nom");

		for (Pret pr : liste) {

			System.out.println(pr.getId() + "\t" + pr.getId() + "\t" + pr.getMembre().getNom() + "\t" + pr.getMembre().getPrenom());
		}

		System.out.print("Entrez l'ID du membre � supprimer: ");

		menuSelect = scanner.nextInt();

		return menuSelect;
	}

	public static int MenuPretSupprimerNoMembre(ArrayList<Pret> liste) {

		System.out.println("************ Pr�t - Supprimer - No Membre ************");
		System.out.println("*                                                    *");
		System.out.println("ID Membre \tNom\t\tPr�nom\t\tIDPret");

		for (Pret pr : liste) {

			System.out.println(pr.getMembre().getId() + "\t\t" + pr.getMembre().getNom() + "\t\t" + pr.getMembre().getPrenom() + "\t\t" + pr.getId());
		}

		System.out.print("Entrez l'ID du membre dont il faut supprimer le pr�t: ");

		menuSelect = scanner.nextInt();

		return menuSelect;
	}

	public static int MenuPretModifier() {

		System.out.println("******************* Pr�t - Modifier ******************");
		System.out.println("*                                                    *");
		System.out.println("* 1 - Par num�ro de livre                            *");
		System.out.println("* 2 - Par num�ro de membre                           *");
		System.out.println("* 3 - Afficher liste                                 *");
		System.out.println("* 4 - Retour au menu Pr�t                            *");
		System.out.println("*                                                    *");
		System.out.println("******************************************************");
		System.out.print("VOTRE CHOIX: ");

		menuSelect = scanner.nextInt();

		return menuSelect;
	}
	
	public static int MenuPretModifierNoLivre(ArrayList<Pret> liste) {

		System.out.println("************ Pr�t - Modifier - No Livre ************");
		System.out.println("*                                                    *");
		System.out.println("ID Livre \tTitre\t\tIDPret");

		for (Pret pr : liste) {

			System.out.println(pr.getLivre().getId() + "\t\t" + pr.getLivre().getTitre() + "\t\t" + pr.getId());
		}

		System.out.print("Entrez l'ID du livre dont il faut modifier le pr�t: ");

		menuSelect = scanner.nextInt();

		return menuSelect;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
