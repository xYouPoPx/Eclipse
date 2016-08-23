package conditionnelles;

import java.util.Scanner;

public class Elections {

	public static void main(String[] args) {
		
		double candidat1 = 0.0;
		double candidat2 = 0.0;
		double candidat3 = 0.0;
		double candidat4 = 0.0;
		
		boolean cas1 = false;
		boolean cas2 = false;
		boolean cas3 = false;
		boolean cas4 = false;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Entrez le score du candidat 1 : ");
		candidat1 = scanner.nextDouble();
		
		System.out.println("Entrez le score du candidat 2 : ");
		candidat2 = scanner.nextDouble();
		
		System.out.println("Entrez le score du candidat 3 : ");
		candidat3 = scanner.nextDouble();
		
		System.out.println("Entrez le score du candidat 4 : ");
		candidat4 = scanner.nextDouble();
		
		if(candidat1 > 50.0){
			
			cas1 = true;
			
		}

		if(candidat2 > 50.0 || candidat3 > 50.0 || candidat4 > 50.0){
			
			cas2 = true;
			
		}

		if(candidat1 >= candidat2 && candidat1 >= candidat3 && candidat1 >= candidat4){
			
			cas3 = true;
			
		}

		if(candidat1 >= 12.5){
			
			cas4 = true;
		}
		
		if(cas1 == true){
			
			System.out.println("Elu au premier tour");
			
		}else if(cas2 || !cas4){
			
			System.out.println("Battu, éliminé, sorti !!!");
			
		}else if(cas3){
			
			System.out.println("Ballotage favorable");
			
		}else{
			
			System.out.println("Ballotage défavorable");
		}
		
		scanner.close();

	}

}
