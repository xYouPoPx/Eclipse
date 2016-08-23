package branching;

public class BreakWithLabelDemo {

	public static void main(String[] args) {

		int[][] arrayOfInts = { { 32, 87, 3, 589 }, { 12, 1076, 2000, 8 }, { 622, 127, 77, 955 } };

		int[][][] arrayOfInts3D = { { { 32, 87, 3, 589 }, { 32, 87, 3, 589 }, { 32, 87, 3, 589 }, { 32, 87, 3, 589 } }, { { 12, 87, 3, 589 }, { 32, 87, 3, 589 }, { 32, 87, 3, 589 }, { 32, 87, 3, 589 } }, { { 32, 87, 3, 589 }, { 32, 87, 3, 589 }, { 32, 87, 3, 589 }, { 32, 87, 3, 589 } } };

		int searchfor = 12;

		int i;
		int j = 0;
		boolean foundIt = false;
		/*
		 * for (i = 0; i < arrayOfInts.length; i++) {
		 * 
		 * for (j = 0; j < arrayOfInts[i].length; j++) {
		 * 
		 * System.out.println("arrayOfInts[" + i + "][" + j + "] = " +
		 * arrayOfInts[i][j]);
		 * 
		 * if (arrayOfInts[i][j] == searchfor) {
		 * 
		 * foundIt = true; System.out.println("foundIt = true;");
		 * 
		 * break; } } }
		 */
		/*
		 * monBreak: for (i = 0; i < arrayOfInts.length; i++) {
		 * 
		 * 
		 * for (j = 0; j < arrayOfInts[i].length;j++) {
		 * 
		 * System.out.println("arrayOfInts[" + i + "][" + j + "] = " +
		 * arrayOfInts[i][j]);
		 * 
		 * if (arrayOfInts[i][j] == searchfor) {
		 * 
		 * foundIt = true; System.out.println("foundIt = true;");
		 * 
		 * break monBreak; } } }
		 */

monBreak: 
			
		for (i = 0; i < arrayOfInts3D.length; i++) {

			for (j = 0; j < arrayOfInts3D[i].length; j++) {

				for (int k = 0; k < arrayOfInts3D[i][j].length; k++) {

					System.out.println("arrayOfInts[" + i + "][" + j + "][" + k + "] = " + arrayOfInts3D[i][j][k]);

					if (arrayOfInts3D[i][j][k] == searchfor) {

						foundIt = true;
						System.out.println("foundIt = true;");

						break monBreak;
					}
				}
			}
		}
		if (foundIt) {
			System.out.println("Found " + searchfor + " at " + i + ", " + j);
		} else {
			System.out.println(searchfor + " not in the array");
		}
	}

}
