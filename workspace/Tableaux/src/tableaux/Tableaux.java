package tableaux;

import java.util.Date;
import java.util.Iterator;

public class Tableaux {

	public static void main(String[] args) {
		
		// tableau 1 dimension
		int[] tableau1 = new int[5];
		
		tableau1[3] = 4;
		
		for(int i = 0; i < tableau1.length; i++){
			tableau1[i] = i;
		}
		
		System.out.println("");
		
		// tableau 2 dimensions
		int[][] tableau2 = new int[3][5];
		
		tableau2[1][2] = 12;
		tableau2[0][0] = 5;
		
		tableau2[0] = tableau1;
		
		// test pour taille des tableaux
		int[] tableau3 = new int[15];
		
		for(int i = 0; i < tableau3.length; i++){
			tableau3[i] = i + 10;
		}
		
		tableau2[1] = tableau3;
		for(int i = 0; i < tableau2.length; i++){
			for(int j = 0; j < tableau2[i].length; j++){
				//System.out.println(tableau2[i][j]);
			}
		}
		
		
		
		int[][] tableau4 = new int[5][5];
		
		for(int i = 0 ; i < tableau4.length; i++){
			for(int j = 0; j < tableau4[i].length; j++){
				tableau4[i][j] = (i * 10) + j;
				//System.out.println(tableau4[j][i]);
			}
		}
		// parcourir le tableau par colonnes
		/*for(int j = 0; j < tableau4[j].length; j++){
			for(int i = 0; i < tableau4.length; i++){
				//tableau4[j][i] = j * 10 + i;
				//System.out.println(tableau4[i][j]);
			}
		}*/
		/*
		// comparaison parcours tableau
		int[][] tableau5 = new int[1000][1000];
		
		long lStartTime = new Date().getTime(); // start time
		
		// a l<endroit
		for(int i = 0; i < tableau5.length; i++){
			for(int j = 0; j <  tableau5[i].length; j++){
				System.out.println(tableau5[i][j]);
			}
		}
		
		long lEndTime = new Date().getTime(); // end time
		 
		long difference = lEndTime - lStartTime; // check different
 
		System.out.println("Elapsed milliseconds: " + difference);
		
*/
		/*
		long lStartTime = new Date().getTime(); // start time
		
		// a l'envers
		for(int i = 0; i < tableau5.length; i++){
			for(int j = 0; j <  tableau5[i].length; j++){
				System.out.println(tableau5[j][i]);
			}
		}
		
		long lEndTime = new Date().getTime(); // end time
		 
		long difference = lEndTime - lStartTime; // check different
 
		System.out.println("Elapsed milliseconds: " + difference);
		*/
		
		int tableau6[] = new int[3];
		int[] tableau7 = new int[4];
	}

}
