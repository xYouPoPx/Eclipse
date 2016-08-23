/**
 * 
 */
package conceptsBase;

/**
 * @author YCourteau
 *
 */
public class Base {
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int age = 33;
		String maChaine = "Bonjour";
		boolean maVrai = true;
		double nbr = 1.99;
		
		System.out.println("************** AFFICHAGE VARIABLES **************");
		System.out.println("age = " + age);
		System.out.println("maChaine = " + maChaine);
		System.out.println("maVrai = " + maVrai);
		System.out.println("nbr = " + nbr);
		System.out.println("************************************************");
		
		age++;
		nbr -= 5;
		
		System.out.println("\r\n************** OPERATIONS UNAIRES ***************");
		System.out.println("age = " + age);
		System.out.println("nbr = " + nbr);
		System.out.println("************************************************");
	}

}
