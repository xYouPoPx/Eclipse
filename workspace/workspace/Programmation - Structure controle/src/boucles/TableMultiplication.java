package boucles;

import java.util.Scanner;

public class TableMultiplication {

	public static void main(String[] args) {
		int nbr;
		Scanner scanner = new Scanner(System.in);
		
		// notez l'utilisation du print plutot que le println
		// afin d'entrer la valeur sur la meme ligne
		System.out.print("Entrez un nombre : ");
		nbr = scanner.nextInt();
		
		System.out.println("Table de " + nbr + " : ");
		
		for(int i = 1; i <= 10; i++){
			
			System.out.println(nbr  + " x " + i + " = " + nbr * i);
		}
		
		scanner.close();
	}

}
