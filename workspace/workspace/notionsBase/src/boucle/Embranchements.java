package boucle;

public class Embranchements {

	public static void main(String[] args) {

		int[] arrayOfInts = { 32, 87, 3, 589, 12, 1076, 2000, 8, 622, 127 };
		int searchfor = 12;
		boolean foundIt = false;

		for (int i = 0; i < arrayOfInts.length; i++) {

			if (arrayOfInts[i] == searchfor) {
				// System.out.println(i);
				foundIt = true;
				break;
			}
			// System.out.println(i);
		}

		// System.out.println(foundIt);

		/// avec label
		int[][] arrayOfInts2 = { { 32, 87, 3, 589 }, { 12, 1076, 2000, 8 }, { 622, 127, 77, 955 } };
		foundIt = false;
		int i = 0, j = 0;

		search: for (i = 0; i < arrayOfInts2.length; i++) {
			// System.out.println(i);

			for (j = 0; j < arrayOfInts2[i].length; j++) {

				// System.out.println(j);
				System.out.println(i + " , " + j);

				if (arrayOfInts2[i][j] == searchfor) {
					foundIt = true;
					break search;
				}

			}

		}
		if (foundIt) {
			System.out.println("Found " + searchfor + " at " + i + ", " + j);
		} else {
			System.out.println(searchfor + " not in the array");
		}

		String searchMe = "peter piper picked a " + "peck of pickled peppers";
		int max = searchMe.length();
		int numPs = 0;

		for (i = 0; i < max; i++) {
			// interested only in p's
			if (searchMe.charAt(i) != 'p')
				continue;

			// process p's
			numPs++;
		}
		System.out.println("Found " + numPs + " p's in the string.");
	}

}
