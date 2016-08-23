package boucle;

import java.util.Scanner;

public class BoucleWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		
		int compteur = 0;
		while(compteur <= 10){
			
			System.out.println("compteur = " + compteur);
			compteur++; // compteur = compteur + 1
		}
*/
		int rep;
		Scanner scan = new Scanner (System.in);
		System.out.println("Entrez une valeur comprise entre 1 et 3");
		
		rep = scan.nextInt();
		
		while(rep > 1 || rep < 3){
			System.out.println("Entrez une valeur comprise entre 1 et 3");
			
			rep = scan.nextInt();
		}
		
		System.out.println("valeur entrée : " + rep);
		

	}

}
