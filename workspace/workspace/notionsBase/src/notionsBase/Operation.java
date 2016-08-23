/**
 * 
 */
package notionsBase;

/**
 * @author ycourteau
 *
 */
public class Operation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int affectation;
		
		affectation = 100; // le = est l'affectation
		
		int affectation2 = 200; // equivalent au precedent
		
		System.out.println("affectation = " + affectation);
		System.out.println("affectation2 = " + affectation2);
		
		int increment = 0;
		System.out.println("increment = " + increment);
		
		increment++;
		System.out.println("increment = " + increment);
		
		++increment;
		System.out.println("increment = " + increment);
		
		increment = increment + 1;  // equivalent a increment++
		System.out.println("increment = " + increment);
		
		increment += 1;  // equivalent a increment = increment + 1; equivalent a increment++
		System.out.println("increment = " + increment);
		
		increment = increment + 10;  // n<est PLUS equivalent a increment++
		System.out.println("increment = " + increment);
		
		increment += 10;  // equivalent a increment = increment + 10;
		System.out.println("increment = " + increment);
		
		int decrement = 100;
		System.out.println("decrement = " + decrement);
		
		decrement--; // retourne a la fin du compteur si la valeur minimale est atteinte
		System.out.println("decrement = " + decrement);
		
		decrement = decrement - 1; // equivalent decrement--
		System.out.println("decrement = " + decrement);
		
		decrement = decrement - 10; // n'est plus equivalent a decrement--
		System.out.println("decrement = " + decrement);
		
		decrement -= 10; // equivalenet a decrement = decrement - 10;
		System.out.println("decrement = " + decrement);
		
		

	}

}
