/**
 * 
 */
package progStructuree;

import java.util.Scanner;

/**
 * @author ycourteau
 *
 */
public class Revision {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age = 0;
		Scanner scanIn = new Scanner(System.in);
		age = scanIn.nextInt();
		
		char sexe;
		boolean impot = false;
		// Scanner scanIn = new Scanner(System.in);
		System.out.println("Entrez le sexe (M ou F) : ");
		sexe = scanIn.next().charAt(0);
		
		System.out.println("age = " + age + " sexe = " + sexe);
		
		if (sexe == 'M'){
			System.out.println("Vous etes un homme");
			
		} else if ( sexe == 'F'){
			System.out.println("Vous etes une femme");
			
		} else {
			System.out.println("Valeur invalide Veuillez entrer M ou F");
		}
		
		switch(sexe){
			case 'M':
				System.out.println("Vous etes un homme");
				break;
			case 'F':
				System.out.println("Vous etes une femme");
				break;
			default:
				System.out.println("Valeur invalide Veuillez entrer M ou F");
				break;
		}

	}

}
