/**
 * 
 */
package boucles;

import java.util.Scanner;

/**
 * @author YCourteau
 *
 */
public class Boucles {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int nbr = 0;
		int i = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Entrez un nombre de depart : ");
		nbr = scanner.nextInt();
		
		System.out.println("\r\nTable de " + nbr + "\r\n");
		
		while(i <= nbr){
			
			System.out.println(nbr + " - " + i + " = " + (nbr - i));
			i++;
			
		}
		
		for(double j = 0.0; j < 1.0; j = j + 0.1){
			System.out.printf("j = %.2f\r\n", j);
		}

	}

}
