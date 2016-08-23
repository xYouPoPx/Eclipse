package boucles;

import java.util.Scanner;

public class Nombre10_20 {

	public static void main(String[] args) {
		
		int nbr;
		Scanner scanner = new Scanner(System.in);
		
		do {
			
			System.out.println("Entrez un nombre compris entre 10 et 20: ");
			nbr = scanner.nextInt();
			
			if(nbr < 10){
				System.out.println("Plus grand!");
			}
			
			if(nbr > 20){
				System.out.println("Plus petit!");
			}
			
		}while (nbr < 10 || nbr > 20);
		
		
		scanner.close();
	}

}
