package controleur;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

import vue.Menu;
import modele.Auteur;
import modele.BD;
import modele.Dictionnaire;
import modele.Editeur;
import modele.Livre;
import modele.Membre;
import modele.Revue;
import modele.Roman;

public class Main {

	/**
	 * Point d'entree de l'application Bibliotheque
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		ArrayList<ArrayList<?>> mesObjets = new ArrayList<ArrayList<?>>();

		ArrayList<Pret> listPret = new ArrayList<Pret>();
		ArrayList<Reservation> listReservation = new ArrayList<Reservation>();
		ArrayList<Auteur> listAuteur = new ArrayList<Auteur>();
		ArrayList<BD> listBd = new ArrayList<BD>();
		ArrayList<Dictionnaire> listDictionnaire = new ArrayList<Dictionnaire>();
		ArrayList<Editeur> listEditeur = new ArrayList<Editeur>();
		ArrayList<Livre> listLivre = new ArrayList<Livre>();
		ArrayList<Membre> listMembre = new ArrayList<Membre>();
		ArrayList<Revue> listRevue = new ArrayList<Revue>();
		ArrayList<Roman> listRoman = new ArrayList<Roman>();

		int menuSelect = 0;

		// lecture des fichiers de donnees au demarrage de l'application
		mesObjets = Fichier.OnLoad();

		// separer les arraylists par type d'objets
		for (int i = 0; i < mesObjets.size(); i++) {

			ArrayList<?> maListeObjets = new ArrayList();

			maListeObjets = mesObjets.get(i);
			// System.out.println(maListeObjets.get(0).getClass().getSimpleName());

			switch (maListeObjets.get(0).getClass().getSimpleName()) {

			case "Auteur":
				listAuteur = (ArrayList<Auteur>) maListeObjets;
				break;
			case "BD":
				listBd = (ArrayList<BD>) maListeObjets;
				break;
			case "Dictionnaire":
				listDictionnaire = (ArrayList<Dictionnaire>) maListeObjets;
				break;
			case "Editeur":
				listEditeur = (ArrayList<Editeur>) maListeObjets;
				break;
			case "Livre":
				listLivre = (ArrayList<Livre>) maListeObjets;
				break;
			case "Membre":
				listMembre = (ArrayList<Membre>) maListeObjets;
				break;
			case "Revue":
				listRevue = (ArrayList<Revue>) maListeObjets;
				break;
			case "Roman":
				listRoman = (ArrayList<Roman>) maListeObjets;
				break;
			case "Pret":
				listPret = (ArrayList<Pret>) maListeObjets;
				break;
			case "Reservation":
				listReservation = (ArrayList<Reservation>) maListeObjets;
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

					int idMembre = (int) (Math.random() * 1000);
					String nom = "";
					String prenom = "";
					String adresse = "";
					String codePostal = "";
					String telephone = "";
					int statut = 0;

					System.out.println("Menu Membres ajouter");
					Membre membre;

					// demander infos du membre \ l<utilisateur ici

					// instancier membre avec infos obtenues
					membre = new Membre(idMembre, nom, prenom, adresse, codePostal, telephone, statut);

					listMembre.add(membre);

					Fichier.Ecriture(listMembre);

					break;

				case 2: // supprimer membre
					System.out.println("Menu Membres suprimer");

					menuSelect = Menu.MenuMembreSupprimer();

					switch (menuSelect) {
					case 1: // par id
						System.out.println("Menu Membres suprimer ID");
						int id = Menu.MenuMembreSupprimerID();
						int index = 0;
						for (Membre mem : listMembre) {
							System.out.println("mem.getId() = " + mem.getId());
							if (mem.getId() == id) {

								index = listMembre.indexOf(mem);

							}
						}
						listMembre.remove(index);
						Fichier.Ecriture(listMembre);
						break;

					case 2: // supprimer membre par liste
						System.out.println("Menu Membres suprimer Liste");
						int idMem = Menu.MenuMembreSupprimerListe(listMembre);

						for (Membre mem : listMembre) {

							if (mem.getId() == idMem) {

								listMembre.remove(mem);

							}
						}
						Fichier.Ecriture(listMembre);
						break;

					default:
						break;
					}
					break;
				case 3: // modifier membre

					System.out.println("Menu modifier membre");

					int modifMembre = Menu.MenuMembreModifier();

					switch (modifMembre) {

					case 1: // modifier membre par ID

						System.out.println("Menu modifier membre ID");
						int idMem = Menu.MenuMembreModiferID();

						for (Membre mem : listMembre) {

							if (mem.getId() == idMem) {

								// ici ajouter modification objet;
								Fichier.Ecriture(listMembre);
							}
						}

						break;

					case 2: // modifier membre par liste

						System.out.println("Menu modifier membre liste");
						int id = Menu.MenuMembreModifierListe(listMembre);

						for (Livre liv : listLivre) {

							if (liv.getId() == id) {

								// ici ajouter modification objet
								// il faut demander a l'utilisateur d'entrer
								// chaque propriete de l'objet a la mitaine\
								// creer un menu pour cela!
							}
						}

						Fichier.Ecriture(listLivre);

						break;
					case 3:
						break;

					case 4: // retour menu principal
						System.out.println("Menu Membres 4");
						break;
					default:
						System.out.println("\r\nVotre choix est invalide, veuillez selectionner un item du valide du menu.\r\n");
						break;
					}
					break;
				}
			case 2: // livres

				menuSelect = Menu.MenuLivre();

				switch (menuSelect) {
				case 1: // ajouter

					Livre livre = new Livre();

					// donner ses valeurs au membre ici
					livre.setTitre("mon titre");
					listLivre.add(livre);

					Fichier.Ecriture(listLivre);

					System.out.println("Menu Livre 1");
					break;

				case 2: // supprimer

					int menu = Menu.MenuLivreSupprimer();

					switch (menu) {

					case 1: // supprimer par ISBN

						String isbn = Menu.MenuLivreSupprimerISBN();

						for (Livre liv : listLivre) {

							if (liv.getIsbn().equalsIgnoreCase(isbn)) {

								listLivre.remove(liv);
								Fichier.Ecriture(listLivre);
							}
						}

						break;

					case 2: // supprimer livre par liste

						int id = Menu.MenuLivreSupprimerListe(listLivre);

						for (Livre liv : listLivre) {

							if (liv.getId() == id) {

								listLivre.remove(liv);
								Fichier.Ecriture(listLivre);
							}
						}

						break;

					case 3: // retour menu precedent

						break;

					default:
						break;
					}

					System.out.println("Menu Livre Supprimer");
					break;

				case 3: // modifier Livre

					int modif = Menu.MenuLivreModifier();

					switch (modif) {

					case 1: // modifier par ISBN

						String isbn = Menu.MenuLivreModifierISBN();

						for (Livre liv : listLivre) {

							if (liv.getIsbn().equalsIgnoreCase(isbn)) {

								Scanner scanner = new Scanner(System.in);

								System.out.println("Entrez le nouveau titre : ");
								String titre = scanner.next();

								liv.setTitre(titre);

							}
						}

						Fichier.Ecriture(listLivre);

						break;

					case 2: // modifier par liste

						int id = Menu.MenuLivreModifierListe(listLivre);

						for (Livre liv : listLivre) {

							if (liv.getId() == id) {

								// ici ajouter modification objet
								// il faut demander a l'utilisateur d'entrer
								// chaque propriete de l'objet a la mitaine\
								// creer un menu pour cela!

								Scanner scanner = new Scanner(System.in);

								System.out.println("Entrez le nouveau titre : ");
								String titre = scanner.next();

								liv.setTitre(titre);

							}
						}

						Fichier.Ecriture(listLivre);

						break;

					case 3: // retour menu precedent

						break;

					default:
						break;
					}

					System.out.println("Menu Livre Modifier");
					break;
				case 4: // retour menu principal
					System.out.println("Menu Livre 4");
					break;
				default:
					System.out.println("\r\nVotre choix est invalide, veuillez selectionner un item du valide du menu.\r\n");
					break;
				}

				break;

			case 3: // reservation

				menuSelect = Menu.MenuReservation();

				switch (menuSelect) {
				case 1: // ajouter

					int idReservation = (int) (Math.random() * 1000);
					String isbn;
					String titre;
					Auteur auteur;
					Editeur editeur;
					int statut;
					int nbrPages;
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

					Date dateReservation = new Date(); // new Date() =
														// aujourd'hui
					Date dateFinReservation;

					Calendar cal = Calendar.getInstance();
					cal.setTime(dateReservation);
					cal.add(Calendar.DATE, 15); // ajouter 15 jours

					dateFinReservation = cal.getTime();

					System.out.println();

					// ici ajouter println et scanner pour
					// demander toutes les infos a l'utilisateur

					// instancier membre
					membre = new Membre(idMemb, nom, prenom, adresse, codePostal, telephone, statutMembre);

					// instancier Livre
					// livre = new Livre(id, isbn, titre, auteur, editeur,
					// statut, nbrPages);

					// creer nouvelle reservation avec toutes les infos obtenues
					Reservation res = new Reservation(idReservation, dateReservation, dateFinReservation, livre, membre);

					// ajouter reservation dans liste
					listReservation.add(res);

					Fichier.Ecriture(listReservation);

					break;
				case 2: // reservation supprimer

					menuSelect = Menu.MenuReservationSupprimer();

					switch (menuSelect) {
					case 1: // reservation supprimer par no de reservation

						System.out.println("reservation supprimer par no de reservation");
						break;
					case 2: // par no membre
						// System.out.println("reservation supprimer par no de membre");

						int idMembre = Menu.MenuReservationSupprimerNoMembre(listReservation);

						for (Reservation liv : listReservation) {

							if (liv.getMembre().getId() == idMembre) {

								listReservation.remove(liv);
								Fichier.Ecriture(listLivre);
							}
						}

						break;
					case 3: // afficher liste reservations
						System.out.println("reservation supprimer par liste");
						break;

					default:
						System.out.println("\r\nVotre choix est invalide, veuillez selectionner un item du valide du menu.\r\n");
						break;
					}

					break;

				case 3: // reservation modifier

					menuSelect = Menu.MenuReservationModifier();

					switch (menuSelect) {
					case 1: // reservation modifier par no reservation
						int id = Menu.MenuReservationModifierNoRes();
						for (Reservation liv : listReservation) {

							if (liv.getId() == id) {

								// TODO modifier reservation ici
								Fichier.Ecriture(listLivre);
							}
						}

						System.out.println("reservation modifier par no reservation");
						break;
					case 2: // reservation modifier par no membre
						System.out.println("reservation modifier par no membre");
						break;
					case 3: // reservation modifier par liste
						System.out.println("reservation modifier par liste");
						break;
					default:
						System.out.println("\r\nVotre choix est invalide, veuillez selectionner un item du valide du menu.\r\n");
						break;
					}

					break;
				case 4: // retour menu principal
					System.out.println("Menu Livre 4");
					break;
				default:
					System.out.println("\r\nVotre choix est invalide, veuillez selectionner un item du valide du menu.\r\n");
					break;
				}

				break;

			case 4: // pret

				menuSelect = Menu.MenuPret();

				switch (menuSelect) {

				case 1: // ajouter pret

					int idPret = (int) (Math.random() * 1000);
					String isbn = "";
					String titre = "";
					Auteur auteur = new Auteur();
					Editeur editeur = new Editeur();
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

					// 15.1.1.2. Vérifier si le livre avait été réservé avant
					// d’être emprunté (vérifier dans la liste de réservations
					// s’il y a une réservation pour ce id livre ET id membre);
					for (Reservation res : listReservation) {

						if (res.getLivre().getId() == idLivr && res.getMembre().getId() == idMemb) {
							res.setDateFinReservation(pret.getDateEmprunt());
							res.getLivre().setStatut(0);

							//break;
						}
						if (res.getLivre().getId() == idLivr && res.getMembre().getId() != idMemb) {
							System.out.println("Le livre  a été réservé pour le membre " + res.getMembre().getPrenom() + " le prêt ne pourra s'effectuer");
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
