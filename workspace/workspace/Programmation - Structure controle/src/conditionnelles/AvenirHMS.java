package conditionnelles;

import java.util.Scanner;

public class AvenirHMS {

	public static void main(String[] args) {
		int heure = 0;
		int minute = 0;
		int seconde = 0;
		
		Scanner scanIn = new Scanner(System.in);

		System.out.println("Entrez les heures : ");
		heure = scanIn.nextInt();
		
		System.out.println("Entrez les minutes : ");
		minute = scanIn.nextInt();
		
		System.out.println("Entrez les secondes : ");
		seconde = scanIn.nextInt();
		
		seconde++;
		
		if(seconde == 60){
			seconde = 0;
			minute++;
		}
		
		if(minute == 60){
			minute = 0;
			heure++;
		}
		
		if(heure == 24){
			heure = 0;
		}
		
		System.out.println("dans une seconde, il sera: " + heure + ":" + minute + ":" + seconde);

	}

}
