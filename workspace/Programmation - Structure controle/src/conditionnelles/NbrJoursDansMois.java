package conditionnelles;

import java.util.Scanner;

public class NbrJoursDansMois {

	public static void main(String[] args) {

		int mois = 0;
		int nbrJours = 0;
		int annee = 0;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Entrez le mois en cours (nombre entier) :  ");
		mois = scanner.nextInt();

		System.out.println("Entrez l'année en cours (nombre entier) :  ");
		annee = scanner.nextInt();

		switch (mois) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			nbrJours = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			nbrJours = 30;
			break;
		case 2:
			if (((annee % 4 == 0) && !(annee % 100 == 0)) || (annee % 400 == 0))
				nbrJours = 29;
			else
				nbrJours = 28;
			break;
		default:
			System.out.println("Mois invalide");
			break;
		}

		System.out.println("Nombre de jours = " + nbrJours);
		scanner.close();
	}

}
