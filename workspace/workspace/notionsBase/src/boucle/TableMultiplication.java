/**
 * 
 */
package boucle;

import java.util.Scanner;

/**
 * @author ycourteau
 *
 */
public class TableMultiplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int val;
		int compt = 0;

		Scanner scan = new Scanner(System.in);

		
		System.out.println("Entrez un nombre pour faire afficher sa table de multiplication");
		val = scan.nextInt();
		
		while(compt <= 10){
			System.out.println(val + " x " + compt + " = " + (val * compt));
			compt++;
		}

	}

}
