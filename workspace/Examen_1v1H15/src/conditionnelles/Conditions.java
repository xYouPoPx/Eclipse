package conditionnelles;

import java.util.Scanner;

public class Conditions {

	public static void main(String[] args) {

		int nbr = 0;
		double prix = 0.0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Entrez le nombre d'oursons surs voulus : ");
		nbr = scanner.nextInt();
		
		if(nbr <= 50){
			
			prix = nbr * 0.10;
			
		}else if(nbr > 50 && nbr <= 75){
			
			prix = (50 * 0.10) + ((nbr - 50) * 0.07);
			
		}else{
			
			prix = (50 * 0.10) + (25 * 0.07) + ((nbr - 75) * 0.05);
			
		}
		
		System.out.printf("Total : \t%.2f",  prix);
		
		System.out.println();
		
		int age = 0;
		String categorie = "";

		System.out.print("Saisir l'age de l'enfant: ");
		age = scanner.nextInt();

		switch (age) {
			
		case 8:
			categorie = "Novice";
			break;
			
		case 9:
			categorie = "Atome";
			break;
			
		case 10:
			categorie = "Benjamine";
			break;
			
		default:
			
			System.out.println("valeur invalide");
			break;
		}
		
		System.out.println("Age : " + age + " Categorie : " + categorie);


	}

}
