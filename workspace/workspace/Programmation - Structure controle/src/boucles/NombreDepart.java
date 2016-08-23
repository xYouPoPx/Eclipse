package boucles;

import java.util.Scanner;

public class NombreDepart {

	public static void main(String[] args) {
		int nbr;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Entrez un nombre : ");
		nbr = scanner.nextInt();
		
		System.out.println("Les 10 nombres suivants sont:");
		
		for(int i = 1; i <= 10; i++){
			
			System.out.println(i + nbr);
		}
		
		scanner.close();
	}

}
