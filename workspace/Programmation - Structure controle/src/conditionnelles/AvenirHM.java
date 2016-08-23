package conditionnelles;

import java.util.Scanner;

public class AvenirHM {

	public static void main(String[] args) {
		int heure = 0;
		int minute = 0;
		
		Scanner scanIn = new Scanner(System.in);

		System.out.println("Entrez les heures : ");
		heure = scanIn.nextInt();
		
		System.out.println("Entrez les minutes : ");
		minute = scanIn.nextInt();
		
		minute++;
		
		if(minute == 60){
			minute = 0;
			heure++;
		}
		
		if(heure == 24){
			heure = 0;
		}
		
		System.out.println("dans une minute, il sera: " + heure + ":" + minute);
		scanIn.close();

	}

}
