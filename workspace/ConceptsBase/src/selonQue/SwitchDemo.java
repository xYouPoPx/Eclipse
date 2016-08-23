/**
 * 
 */
package selonQue;


/**
 * @author YCourteau
 *
 */
public class SwitchDemo {

	public static void main(String[] args) {

		int month = 5;
		//byte month = 127;
		//short month = 8;
		//char month = 'k';
		//long month = 93L; // erreur
		//double month = 9.3; // erreur
		String monthString = "";

		switch (month) {
		case 1:
			monthString = "January";
			break;
		case 2:
			monthString = "February";
			break;
		case 3:
			monthString = "March";
			break;
		default:
			monthString = "Invalid month";
			break;
		}
		
		/*if (month == 1) {
		    monthString = "January";
		} else if (month == 2) {
		   monthString = "February";
		} else {
			monthString = "Invalid month";
		}*/
		
		System.out.println(monthString);
	}

}
