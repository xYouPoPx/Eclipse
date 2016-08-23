/**
 * 
 */
package boucle;

import java.util.Scanner;

/**
 * @author ycourteau
 *
 */
public class boucleFor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int val;
		int compt = 0;

		Scanner scan = new Scanner(System.in);
/*
		
		System.out.println("Entrez un nombre pour faire afficher sa table de multiplication");
		val = scan.nextInt();
	
		while(compt <= 10){
			System.out.println(val + " x " + compt + " = " + (val * compt));
			compt++;
		}
	
		for( compt = 0; compt <= 10; compt++){
			System.out.println(val + " x " + compt + " = " + (val * compt));
		}
		System.out.println(compt);
		
		// executer un nombre i de fois la meme instruction
		for(int i = 0; i <= 10; i++){
			System.out.println(val + " x " + i + " = " + (val * i));
		}
		// System.out.println(i);
*/
/*
		// for avec des tableaux
		int tab[] = new int[10];
		
		for(int i = 0; i < tab.length; i++){
			tab[i] = i;
			System.out.println("i = " + i + " taille = " + tab.length + " tab[" + i + "] = " + tab[i]);
		}
*/

		String tab2[][] = new String[10][5];
		
		for(int i = 0; i < tab2.length; i++){
			
			for(int j = 0; j < tab2[0].length; j++) {
				tab2[i][j] = i + ", " + j;
				System.out.print(tab2[i] + " | ");
			}
			
			System.out.println("Fin de la ligne");
		}
/*		
		for(int j = 0; j < tab2.length; j++){
			
			for(int i = 0; i < tab2[0].length; i++) {
				tab2[j][i] = i + ", " + j;
				System.out.print(tab2[j][i] + " | ");
			}
			
			System.out.println("Fin de la ligne");
		}
		
		// afficher les 10 nombres suivants
		int value;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Entrez un nombre:");
		value = scan.nextInt();
		
		for(int i = value + 1; i <= value + 10; i++){
			System.out.println(i);
		}
*/
	
	}

}
