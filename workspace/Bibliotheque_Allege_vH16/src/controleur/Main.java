package controleur;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

import vue.Menu;
import modele.Livre;
import modele.Membre;


public class Main {

	/**
	 * Point d'entree de l'application Bibliotheque
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		ArrayList<ArrayList<?>> mesObjets = new ArrayList<ArrayList<?>>();

		ArrayList<Pret> listPret = new ArrayList<Pret>();

		ArrayList<Livre> listLivre = new ArrayList<Livre>();
		ArrayList<Membre> listMembre = new ArrayList<Membre>();


		int menuSelect = 0;

		// lecture des fichiers de donnees au demarrage de l'application
		mesObjets = Fichier.OnLoad();

		// separer les arraylists par type d'objets
		for (int i = 0; i < mesObjets.size(); i++) {

			ArrayList<?> maListeObjets = new ArrayList();

			maListeObjets = mesObjets.get(i);
			// System.out.println(maListeObjets.get(0).getClass().getSimpleName());

			switch (maListeObjets.get(0).getClass().getSimpleName()) {

			case "Livre":
				listLivre = (ArrayList<Livre>) maListeObjets;
				break;
			case "Membre":
				listMembre = (ArrayList<Membre>) maListeObjets;
				break;
			case "Pret":
				listPret = (ArrayList<Pret>) maListeObjets;
				break;

			default:
				break;
			}// fin switch

		}// fin for

		// menuSelect = Menu.MenuPrincipal();

		// execution normale du programme
		while (true) {

			menuSelect = Menu.MenuPrincipal();

			switch (menuSelect) {

			case 1: // membres
				menuSelect = Menu.MenuMembre();

				switch (menuSelect) {
				case 1: // ajouter membre
					break;

				case 2: // supprimer membre

					break;
				case 3: // modifier membre

					break;
				}
			case 2: // livres

	
				break;

			case 3: // reservation

				break;

			case 4: // pret

				menuSelect = Menu.MenuPret();

				switch (menuSelect) {

				case 1: // ajouter pret

					int idPret = (int) (Math.random() * 1000);
					String isbn = "";
					String titre = "";
					String auteur = null;// = new Auteur();
					String editeur = null;// = new Editeur();
					int statut = 5;
					int nbrPages = 0;
					Livre livre = new Livre();

					int idMemb = (int) Math.random() * 1000;
					int idLivr = (int) Math.random() * 1000;
					String nom = "";
					String prenom = "";
					String adresse = "";
					String codePostal = "";
					String telephone = "";
					int statutMembre = 0;

					Membre membre;// = new Membre();

					Date datePret = new Date(); // new Date() = aujourd'hui
					Date dateFinPret;

					Calendar cal = Calendar.getInstance();
					cal.setTime(datePret);
					cal.add(Calendar.DATE, 21); // ajouter 21 jours

					dateFinPret = cal.getTime();

					// ici ajouter println et scanner pour
					// demander toutes les infos a l'utilisateur
					
					Scanner scanner = new Scanner (System.in);
					String test = scanner.nextLine();

					// instancier membre
					membre = new Membre(idMemb, nom, prenom, adresse, codePostal, telephone, statutMembre);

					// instancier Livre
					livre = new Livre(idLivr, isbn, titre, auteur, editeur, statut, nbrPages);

					// TODO: verifier si 5 livres ou moins deja empruntes
					// (iterer dans liste pret)
					// TODO: verifier si livre disponible (statut)

					// creer nouveau pret avec toutes les infos obtenues
					Pret pret = new Pret(idPret, datePret, dateFinPret, membre, livre);

					// 15.1.1.2. V�rifier si le livre avait �t� r�serv� avant
					// d��tre emprunt� (v�rifier dans la liste de livres
					// s�il y a une r�servation pour ce id livre);
					for (Livre res : listLivre) {

						if (res.getId() == idLivr) {
							System.out.println("Le livre  a �t� r�serv� pour le membre  le pr�t ne pourra s'effectuer");
							//break;
						}
					}
					
					int count = 0;
					for(Pret pr : listPret){
						if(pr.getMembre().getId() == idMemb){
							count++;
						}
					}
					
					if(count >= 5 && livre.getStatut() != 0){
						
						System.out.println("vous avez deja 5 prets ou le livre n'est pas disponible");
						
					} else{
						
						listPret.add(pret);

						Fichier.Ecriture(listPret);
					}


					break;
				case 2: // supprimer pret

					menuSelect = Menu.MenuPretSupprimerNoMembre(listPret);

					switch (menuSelect) {

					case 1: // supprimer pret par no reservation
						System.out.println("supprimer pret par no reservation");
						break;
					case 2: // supprimer pret par no de membre
						break;
					case 3: // supprimer pret par liste
						System.out.println("supprimer pret par liste");
						break;
					default:
						System.out.println("\r\nVotre choix est invalide, veuillez selectionner un item du valide du menu.\r\n");
						break;

					}

					break;
				case 3: // modifier pret
					menuSelect = Menu.MenuPretModifier();

					switch (menuSelect) {

					case 1: // modifier pret par no livre

						menuSelect = Menu.MenuPretModifierNoLivre(listPret);

						// TODO ici modifier le pret

						break;

					case 2: // modifier pret par no membre
						System.out.println("modifier pret par no membre");
						break;

					case 3: // modifier pret par liste

						System.out.println("modifier pret - afficher liste");
						break;

					default:

						System.out.println("\r\nVotre choix est invalide, veuillez selectionner un item du valide du menu.\r\n");
						break;

					}
					break;
				default:
					System.out.println("\r\nVotre choix est invalide, veuillez selectionner un item du valide du menu.\r\n");
					break;
				}

				break;
			case 5: // quitter
				System.exit(0);
				break;

			default:
				System.out.println("\r\nVotre choix est invalide, veuillez selectionner un item du valide du menu.\r\n");
				break;
			}
		}

	}
}
