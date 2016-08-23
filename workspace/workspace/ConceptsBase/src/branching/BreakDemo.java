package branching;

public class BreakDemo {

	public static void main(String[] args) {

		int[] arrayOfInts = { 32, 87, 3, 589, 12, 1076, 2000, 8, 622, 127 };
		int searchfor = 12;

		int i, compteur = 0;
		boolean foundIt = false;

		
		for (i = 0; i < arrayOfInts.length; i++) {
		
			System.out.println(arrayOfInts[i]);
		  
			if (arrayOfInts[i] == searchfor) {
		  
				foundIt = true; System.out.println("foundIt = true;");
		  
				break;
			}
		  
		 }
		 

		/*
		 * i = 0; while (i < arrayOfInts.length) {
		 * 
		 * System.out.println(arrayOfInts[i]);
		 * 
		 * if (arrayOfInts[i] == searchfor) {
		 * 
		 * foundIt = true; System.out.println("foundIt = true;");
		 * 
		 * break; } i++; }
		 */

		/*
		i = 0;
		do {
			System.out.println(arrayOfInts[i]);

			if (arrayOfInts[i] == searchfor) {

				foundIt = true;
				System.out.println("foundIt = true;");

				break;
			}
			i++;

		} while (i < arrayOfInts.length);
	*/	

		if (foundIt) {
			System.out.println("Found " + searchfor + " at index " + i);
		} else {
			System.out.println(searchfor + " not in the array");
		}
	}
}
