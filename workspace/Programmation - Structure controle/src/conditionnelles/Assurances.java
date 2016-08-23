package conditionnelles;

import java.util.Scanner;

public class Assurances {

	public static void main(String[] args) {
		
		int age, permis, accidents, assurances;
		String codeTarif = "";
		boolean casAge = false, casPermis = false, casAssur = false;
		int points = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Entrez l'âge : ");
		age = scanner.nextInt();
		
		System.out.println("Entrez le nombre d'années de permis : ");
		permis = scanner.nextInt();
		
		System.out.println("Entrez le nombre d'accidents : ");
		accidents = scanner.nextInt();

		System.out.println("Entrez le nombre d'années d'assurances : ");
		assurances = scanner.nextInt();
		
		if(age >= 25){
			
			casAge = true;
		}
		
		if(permis >= 2){
			
			casPermis = true;
		}
		
		if(assurances > 5){
			
			casAssur = true;
		}
		
		if(!casAge){
			
			points++;
		}
		
		if(!casPermis){
			
			points++;
		}
		
		points += accidents;
		
		if(points < 3 && casAssur){
			
			points--;
		}
		
		if(points == -1){
			
			codeTarif = "bleu";
			
		}else if(points == 0){
			
			codeTarif = "vert";
			
		}else if(points == 1){
			
			codeTarif = "orange";
			
		}else if(points == 2){
			
			codeTarif = "rouge";
			
		}else{
			
			codeTarif = "refuse";
		}
		
		System.out.println("votre tarif: " + codeTarif);
		
		scanner.close();

	}

}
