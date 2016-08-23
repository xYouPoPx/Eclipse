import java.util.Scanner;

/**
 * 
 */

/**
 * @author YCourteau
 *
 */
public class calculateur {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int menuSelect = 0;
		double totalFacture = 0.0;

		Scanner scanner = new Scanner(System.in);

		while (true) {

			System.out.println("**********  Calculateur restauration  **********");
			System.out.println("*                                              *");
			System.out.println("* 1 - CALCULER FACTURE                         *");
			System.out.println("* 2 - CALCULER TAXES                           *");
			System.out.println("* 3 - CALCULER POURBOIRE                       *");
			System.out.println("* 4 - FERMER APPLICATION                       *");
			System.out.println("*                                              *");
			System.out.println("************************************************");

			System.out.print("* VOTRE CHOIX : ");
			menuSelect = scanner.nextInt();

			switch (menuSelect) {

			case 1: // 1 - CALCULER FACTURE
				
				int menuTotalFacture;
				
				do{
					
					System.out.println("\r\n\t*******  CALCULER FACTURE  *******");
					System.out.println("\t*                                *");
					System.out.println("\t* 1 - AJOUTER UN ITEM            *");
					System.out.println("\t* 2 - SUPPRIMER UN ITEM          *");
					System.out.println("\t* 0 - TERMINER ET CALCULER TOTAL *");
					System.out.println("\t*                                *");
					System.out.println("\t**********************************");
					
					System.out.print("\t* VOTRE CHOIX : ");
					menuTotalFacture = scanner.nextInt();
					
					switch (menuTotalFacture) {
					
						case 0: // fin saisie items
						
							System.out.printf("\r\n\tTotal :\t%.2f", totalFacture);
							System.out.print("$\r\n\r\n");
													
							break;
							
						case 1: // ajout item
							
							System.out.print("\t\tEntrez le prix de l'item a  ajouter : ");
							totalFacture += scanner.nextDouble();
							
							break;
							
						case 2: // suppression item
							
							System.out.print("\t\tEntrez le prix de l'item a  supprimer : ");
							totalFacture -= scanner.nextDouble();
							
							break;
							
						default:
							
							System.out.println("\r\n\tVotre choix est invalide, veuillez selectionner un item du valide du menu.\r\n");
							
							break;
					}
					
				}while(menuTotalFacture != 0);
				
				break;

			case 2: // 2 - CALCULER TAXES 
				
				// si la facture a ete calculee
				if(totalFacture != 0) {
					
					double tps;
					double tvq;
					
					tps = totalFacture * 0.05;
					tvq = totalFacture * 0.09975;
					
					System.out.printf("\r\nTotal :\t%.2f", totalFacture);
					System.out.print("$");
					System.out.printf("\r\nTPS :\t%.2f", tps );
					System.out.print("$");
					System.out.printf("\r\nTVQ :\t%.2f", tvq);
					System.out.print("$");
					System.out.printf("\r\nTOTAL :\t%.2f", (totalFacture + tps + tvq));
					System.out.print("$\r\n\r\n");
					
				} else{
					
					System.out.println("\r\nLa facture n'a pas été calculée ou son total est à zéro, veuillez CALCULER LA FACTURE\r\n\r\n");
				}
				break;

			case 3: // 3 - CALCULER POURBOIRE
				
				if(totalFacture > 0) {
					
					double pourboire;
					System.out.print("\r\nEntrez le pourboire ( % ) : ");
					pourboire = scanner.nextDouble();
					
					double tps;
					double tvq;
					
					System.out.printf("\r\n\r\nPourboire ( $ ) = %.2f" , (pourboire / 100) * totalFacture);
					System.out.print("$\r\n\r\n");
					
						
				} else{
					
					System.out.println("\r\nLa facture n'a pas été calculée ou son total est à zéro, veuillez CALCULER LA FACTURE\r\n\r\n");
				}
				
				break;

			case 4: // 4 - FERMER APPLICATION
				
				System.exit(0);
				
				break;

			default:
				
				System.out.println("\r\nVotre choix est invalide, veuillez selectionner un item du valide du menu.\r\n");
				break;
			}

		}

	}

}
