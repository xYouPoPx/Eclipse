package magasin;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 * 
 * @author YCourteau
 *
 */
public final class Main {

	static Scanner scanner = new Scanner(System.in);
	static int menuSelect = 0;

	static ArrayList<Facture> listFactures = new ArrayList<Facture>();

	/**
	 * Ecriture d'une arrayList d'objets Facture dans un fichier texte
	 * 
	 * @param liste
	 * 
	 *            le fichier texte doit etre dans le workspace/projet
	 */
	public static void Ecriture(ArrayList<Facture> liste) {

	}

	public static void main(String[] args) {
		
		while (true) {

			// Menu Principal
			System.out.println("\r\n\r\n******************** FACTURATION *********************");
			System.out.println("*                                                    *");
			System.out.println("* 1 - Ajouter Facture                                *");
			System.out.println("* 2 - Écrire liste des factures dans fichier         *");
			System.out.println("* 3 - Quitter                                        *");
			System.out.println("*                                                    *");
			System.out.println("******************************************************");
			System.out.print("VOTRE CHOIX: ");

			menuSelect = scanner.nextInt();

			switch (menuSelect) {

			case 1: // Ajouter Facture

				int id = (int) (Math.random() * 1000); // simulation du no de
				Date dateFacture = new Date();										// facture
				
				int menuFacture;

				// Créer Facture ici

				// demander infos a l'utilisateur
				// sous-menu pour ajouter produit dans facture
				do {
					System.out.println("******************* AJOUT PRODUIT ********************");
					System.out.println("*                                                    *");
					System.out.println("* 1 - Ajouter Produit                                *");
					System.out.println("* 2 - Quitter                                        *");
					System.out.println("*                                                    *");
					System.out.println("******************************************************");
					System.out.print("VOTRE CHOIX: ");

					menuFacture = scanner.nextInt();

					switch (menuFacture) {

					case 1: // ajouter produit dans facture
						
						int idProduit;
						String nom;
						String description;
						double prix;
						int qtee;
						
						// demander infos du produit a ajouter
						System.out.print("id produit : ");
						idProduit = scanner.nextInt();
						
						System.out.println("nom : ");
						nom = scanner.next();
						
						System.out.println("description : ");
						description = scanner.nextLine();
						scanner.nextLine();
						System.out.println("prix : ");
						prix = scanner.nextDouble();
						
						System.out.println("quantité : ");
						qtee = scanner.nextInt();
						
						// creer nouveau produit
						
						
						// ajouter produit dans facture
						
						
						break;
						
					case 2: // quitter menu ajout produit
						
						menuFacture = 0;
						break;
						
					default:
						System.out.println("\r\nVotre choix est invalide, veuillez selectionner un item du valide du menu.\r\n");
						break;
					}

				} while (menuFacture != 0);

				listFactures.add(fact);

				fact.afficherFacture();

				break;

			case 2: // Écrire liste des factures dans fichier


				break;

			case 3: // Quitter
				System.exit(0);
				break;

			default:
				System.out.println("\r\nVotre choix est invalide, veuillez selectionner un item du valide du menu.\r\n");
				break;
			}

		}

	}
}
