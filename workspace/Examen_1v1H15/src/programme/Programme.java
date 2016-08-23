package programme;

import java.util.Scanner;

public class Programme {

	public static void main(String[] args) {

		String reponse = "";
		int menuChoice;
		Scanner scanner = new Scanner(System.in);

		while (true) {

			System.out.println("************** DEVINETTES **************");
			System.out.println("* 1 - Devinette Napoleon               *");
			System.out.println("* 2 - Devinette Course animal          *");
			System.out.println("* 3 - Devinette Chute                  *");
			System.out.println("****************************************");
			
			System.out.print("VOTRE CHOIX: ");

			menuChoice = scanner.nextInt();

			switch (menuChoice) {
			case 1:
				
				System.out.print("\r\nQuelle est la couleur du cheval Blanc de Napoléon? ");
				reponse = scanner.next();

				switch (reponse) {
				case "blanc":
					System.out.println("\r\nVous vous êtes fait avoir!\r\n");
					break;

				case "noir":
					System.out.println("\r\nBravo!\r\n");
					break;

				default:
					System.out.println("\r\nVous avez tout faux!\r\n");
					break;
				}
				
				break;
				
			case 2:
				
				System.out.print("\r\nQuel animal court le plus vite? ");
				reponse = scanner.next();

				switch (reponse) {
				case "pou":

					System.out.println("\r\nLe pour car il est toujours en tête! Bravo!\r\n");
					break;

				default:
					System.out.println("\r\nVous avez tout faux!\r\n");
					break;
				}
				
				break;
				
			case 3:
				
				System.out.print("\r\nQu'est-ce qui tombe de très très haut sans jamais se faire mal? ");
				reponse = scanner.next();

				switch (reponse) {
				case "pluie":

					System.out.println("\r\nBravo!\r\n");
					break;

				default:
					System.out.println("\r\nVous avez tout faux!\r\n");
					break;
				}
				break;
				
			default:
				
				System.out.println("\r\nChoix invalide\r\n");
				
				break;
			}
		}

	}

}
