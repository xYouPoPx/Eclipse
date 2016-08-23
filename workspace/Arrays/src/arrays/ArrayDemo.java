package arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		// declares an array of integers
		int[] anArray; // = new int[10];
		byte[] anArrayOfBytes;

		// allocates memory for 10 integers
		anArray = new int[10];

		int[] anArray2 = { 100, 200, 300, 400, 500, 600, 700, 800, 900, 1000 };
		/*
		 * // initialize first element anArray[0] = 100; // initialize second
		 * element anArray[1] = 200; // and so forth anArray[2] = 300;
		 * anArray[3] = 400; anArray[4] = 500; anArray[5] = 600; anArray[6] =
		 * 700; anArray[7] = 800; anArray[8] = 900; anArray[9] = 1000;
		 */

		for (int i = 0; i < anArray.length; i++) {

			// anArray[i] = (i + 1) * 100;
			anArray[i] = (int) (Math.random() * 100);
			System.out.println("Element at index [" + i + "] : " + anArray[i]);
		}

		// impression de l'objet complet
		System.out.println("anArray = " + anArray);

		/*
		 * System.out.println("Element at index 0: " + anArray[0]);
		 * System.out.println("Element at index 1: " + anArray[1]);
		 * System.out.println("Element at index 2: " + anArray[2]);
		 * System.out.println("Element at index 3: " + anArray[3]);
		 * System.out.println("Element at index 4: " + anArray[4]);
		 * System.out.println("Element at index 5: " + anArray[5]);
		 * System.out.println("Element at index 6: " + anArray[6]);
		 * System.out.println("Element at index 7: " + anArray[7]);
		 * System.out.println("Element at index 8: " + anArray[8]);
		 * System.out.println("Element at index 9: " + anArray[9]);
		 */
	}
}
