package boucles;

import java.util.Scanner;

public class Nombre1_3 {

	public static void main(String[] args) {
		
		int nbr;
		Scanner scanner = new Scanner(System.in);
		
		do {
			
			System.out.println("Entrez un nombre compris entre un et trois: ");
			nbr = scanner.nextInt();
			
		}while (nbr <= 1 || nbr >= 3);
		
		scanner.close();
	}

}
