/**
 * 
 */
package boucle;

import java.util.Scanner;

/**
 * @author ycourteau
 *
 */
public class boucleWhile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] tab = new int[10];

		int i = 0;
		int taille = tab.length;

		// parcourir toutes les cellules du tableau
		while (i <= taille - 1) {

			// System.out.println("i = " + i + " taille = " + taille + " tab[" +
			// i + "] = " + tab[i]);
			//tab[i] = i;
			System.out.println("i = " + i + " taille = " + taille + " tab[" + i + "] = " + tab[i]);
			// System.out.println(" tab[" + i +"] = " + tab[i]);
			i++;

		}

		System.out.println("FIN");

		int valeur;

		Scanner scan = new Scanner(System.in);
		System.out.println("Entrez un nombre entre 10 et 20 inclusivement :");

		valeur = scan.nextInt();

		while (valeur < 10 || valeur > 20) {

			if (valeur < 10) {
				System.out.println("Entrez un nombre plus grand!");
			} else {
				System.out.println("Entrez un nombre plus petit!");
			}

			System.out.println("Entrez un nombre entre 10 et 20 inclusivement :");
			valeur = scan.nextInt();
		}
		System.out.println("Vous avez entre la valeur " + valeur + " Bravo!");

		// do-while
		// parcourir toutes les cellules du tableau
/*		i = 0;
		do {
			// tab[i] = i;
			System.out.println("i = " + i + " taille = " + taille + " tab[" + i + "] = " + tab[i]);

			 i++;

		} while (i <= taille - 1);
*/		
		
		i = tab.length - 1;
		do {
			tab[i] = i;
			System.out.println("i = " + i + " taille = " + taille + " tab[" + i + "] = " + tab[i]);

			 i--;

		} while (i >= 0);
		

		i = tab.length;
		do {
			 i--;
			tab[i] = i;
			System.out.println("i = " + i + " taille = " + taille + " tab[" + i + "] = " + tab[i]);



		} while (i >= 0);
		
		
	}

}
