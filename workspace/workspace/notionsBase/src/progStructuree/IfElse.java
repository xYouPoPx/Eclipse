/**
 * 
 */
package progStructuree;

/**
 * @author ycourteau
 *
 */
public class IfElse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int note = 76;

		char cote;

		if (note >= 90) {
			cote = 'A';
		} else if (note >= 80) {
			cote = 'B';
		} else if (note >= 70) {
			cote = 'C';
		} else if (note >= 60) {
			cote = 'D';
		} else {
			cote = 'F';
		}
		System.out.println("Grade = " + cote);

	}

}
