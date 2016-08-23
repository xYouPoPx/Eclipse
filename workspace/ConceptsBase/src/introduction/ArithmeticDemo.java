/**
 * 
 */
package introduction;

/**
 * @author YCourteau
 *
 */
public class ArithmeticDemo {

	public static void main(String[] args) {

		int x = 0;
		int y = 0;
		String firstString;
		
		System.out.println("x = " + x);

		x += 1; // equivalent a x = x + 1
		System.out.println("x += 1 = " + x);

		x += 5; // equivalent a x = x + 5
		System.out.println("x += 5 = " + x);

		System.out.println("-------------------------");

		while (x < 10) {
			System.out.println("x = " + x + " y = " + y);
			x += 1;
			y++;
		}
		
		System.out.println("-------------------------");
		
		firstString = "This is" + " ";
        String secondString = " a concatenated string.";
        String thirdString = firstString + secondString;
        System.out.println(thirdString);
        
        
		/*
		 * int result = 1 + 2; // result is now 3 System.out.println("1 + 2 = "
		 * + result); int original_result = result;
		 * 
		 * result = result - 1; // result is now 2
		 * System.out.println(original_result + " - 1 = " + result);
		 * original_result = result;
		 * 
		 * result = result * 2; // result is now 4
		 * System.out.println(original_result + " * 2 = " + result);
		 * original_result = result;
		 * 
		 * result = result / 2; // result is now 2
		 * System.out.println(original_result + " / 2 = " + result);
		 * original_result = result;
		 * 
		 * result = result + 8; // result is now 10
		 * System.out.println(original_result + " + 8 = " + result);
		 * original_result = result;
		 * 
		 * result = result % 7; // result is now 3
		 * System.out.println(original_result + " % 7 = " + result);
		 */
	}

}
