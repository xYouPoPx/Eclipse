/**
 * 
 */
package notionsBase;

/**
 * @author ycourteau
 *
 */
public class Arithmetique {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int resultat = 0;
		int resultatOrigine;
		
		System.out.println("resultat = " + resultat);
		
		resultat = 1 + 2;
		resultatOrigine = resultat;
		System.out.println("resultat = " + resultat + " resultatOrigine = " + resultatOrigine);
		
		resultat -= 1;
		System.out.println("resultat = " + resultat + " resultatOrigine = " + resultatOrigine);
		resultatOrigine = resultat;
		
		resultat *= 2; // = 4
		System.out.println("resultat = " + resultat + " resultatOrigine = " + resultatOrigine);
		resultatOrigine = resultat;
		
		resultat /= 2; // = 2
		System.out.println("resultat = " + resultat + " resultatOrigine = " + resultatOrigine);
		resultatOrigine = resultat;
		
		resultat += 8; // = 10
		System.out.println("resultat = " + resultat + " resultatOrigine = " + resultatOrigine);
		resultatOrigine = resultat;
		
		resultat = resultat % 7; // = 3
		System.out.println("resultat = " + resultat + " resultatOrigine = " + resultatOrigine);
		resultatOrigine = resultat;

	}

}
