/**
 * 
 */
package progStructuree;
import java.util.Scanner;
/**
 * @author ycourteau
 *
 */
public class ExerciceCategorie {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

// Ecrire un algorithme qui demande l’âge d’un enfant à l’utilisateur.
// Ensuite, il l’informe de sa catégorie :
//
//		    "Poussin" de 6 à 7 ans
//		    "Pupille" de 8 à 9 ans
//		    "Minime" de 10 à 11 ans
//		    "Cadet" après 12 ans
		
		
		Scanner scanIn = new Scanner(System.in);
		int age = 0;
		String categorie = "";
		
		System.out.println("Entrez l'age de l'enfant");
		age = scanIn.nextInt();
		
/*		if(age >=12){
			categorie = "Cadet";
			System.out.println("Categorie = " + categorie);
		} else if(age >= 10){
			categorie = "Minime";
			System.out.println("Categorie = " + categorie);
		} else if(age >= 8){
			categorie = "Pupille";
			System.out.println("Categorie = " + categorie);
		} else if(age >= 6){
			categorie = "Poussin";
			System.out.println("Categorie = " + categorie);
		}
	
		System.out.println("Categorie = " + categorie);
*/			
		switch(age){
			case 6:
			case 7:
				categorie = "Poussin";
				break;
				
			case 8:
			case 9:
				categorie = "Pupille";
				break;
				
			case 10:
			case 11:
				categorie = "Minime";
				break;
				
			default:
				if(age >=12){
					categorie = "Cadet";
					// System.out.println("Categorie = " + categorie);
				} else { 
					categorie = "Aucune";
				}
				break;
		}
		
		System.out.println("Categorie = " + categorie);
		

	}

}
