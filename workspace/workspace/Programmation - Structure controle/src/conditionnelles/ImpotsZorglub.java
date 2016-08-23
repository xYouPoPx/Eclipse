package conditionnelles;

import java.util.Scanner;

public class ImpotsZorglub {

	public static void main(String[] args) {
		int age = 0;
		char sexe;
		boolean impot = false;
		
		Scanner scanIn = new Scanner(System.in);
		
		System.out.println("Entrez le sexe (M ou F) : ");
		sexe = scanIn.next().charAt(0);
		
		System.out.println("Entrez l'âge : ");
		age = scanIn.nextInt();
		
		if(sexe == 'M' && age > 20){
			
			impot = true;
			
		}else if(sexe == 'F' && (age >= 18 && age <= 35)){
			
			impot = true;
		}
		
		if(impot == true){
			
			System.out.println("Imposable");
			
		}else{
			
			System.out.println("Non imposable");
		}

	}

}
