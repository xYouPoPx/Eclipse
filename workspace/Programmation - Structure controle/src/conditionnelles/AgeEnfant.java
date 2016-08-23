package conditionnelles;

import java.util.Scanner;

public class AgeEnfant {

	public static void main(String[] args) {

		int age = 0;
		String categorie;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Saisir l'age de l'enfant: ");
		age = scanner.nextInt();

		switch (age) {
		
		case 6:
		case 7:
			categorie = "poussin";
			break;
			
		case 8:
		case 9:
			categorie = "pupille";
			break;
			
		case 10:
		case 11:
			categorie = "minime";
			break;
		
		default:
			
			if(age >= 12){
				categorie = "cadet";
			} else {
				categorie = "aucune";
			}
			
			break;
		}

		/*
		 * if(age >=6 && age <=7){
		 * 
		 * categorie = "Pousin";
		 * 
		 * }else if( age >= 8 && age <= 9){
		 * 
		 * categorie = "Pupille";
		 * 
		 * }else if(age >= 10 && age <= 11){
		 * 
		 * categorie = "Minime";
		 * 
		 * }else if (age >= 12){
		 * 
		 * categorie = "Cadet";
		 * 
		 * }else{
		 * 
		 * categorie = "Aucune"; }
		 */

		System.out.println("categorie = " + categorie);
		scanner.close();

	}

}
