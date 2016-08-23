package conditionnelles;

import java.util.Scanner;

public class Photocopies {

	public static void main(String[] args) {
		
		int nbr = 0;
		double prix = 0.0;
		Scanner scanIn = new Scanner(System.in);
		
		System.out.println("Entrez le nombre de photocopies : ");
		nbr = scanIn.nextInt();
		
		if(nbr <= 10){
			
			prix = nbr * 0.10;
			
		}else if(nbr > 10 && nbr <= 30){
			
			prix = (10 * 0.10) + ((nbr - 10) * 0.09);
			
		}else{
			
			prix = (10 * 0.10) + (20 * 0.09) + ((nbr - 30) * 0.08);
			
		}
		
		System.out.println("Total : " + prix);

	}

}
