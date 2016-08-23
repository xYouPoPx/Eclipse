/**
 * 
 */
package conditionnelles;

/**
 * @author YCourteau
 *
 */
public class TutuToto {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int tutu = 1;
		int toto = 4;
		String tata = "ok";

		if (tutu > toto + 4 || tata == "ok") {
			tutu++;
		} else {
			tutu--;
		}

		System.out.println("tutu = " + tutu);

	}

}
