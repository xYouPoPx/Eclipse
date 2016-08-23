package arrays;

public class MultiDimArrayDemo {

	public static void main(String[] args) {
		/*String[][][] names = { {{ "0 0 0", "0 0 1", "0 0 2" }, { "1 0 ", "1 1", "1 2" }, {"2 0", "2 1", "2 2" },},
							   {{ "0 1 0", "0 1 1", "0 1 2" },{ "1 0", "1 1", "1 2" },{"2 0", "2 1", "2 2" },},
							   {{ "0 2 0", "0 1", "0 2" },{ "1 0", "1 1", "1 2" },{"2 0", "2 1", "2 2" },}
							};
		
		// Mr. Smith
		System.out.println(names[0][0][0] + names[1][0][0]);
		// Ms. Jones
		System.out.println(names[0][2][2] + names[1][1][1]);
		
		/*
		int[][][] monArray = new int[5][7][3];
		int[][][] arrayCopy = new int[5][7][3];
		
		for(int i = 0; i < monArray.length; i++){
			
			//System.out.println(monArray[i]);
			
			for(int j = 0; j < monArray[0].length; j++){
				
				for(int k = 0; k < monArray[0][0].length; k++){
					
					monArray[i][j][k] = k;
					System.out.println("monArray[" + i + "][" + j + "][" + k + "] = " + monArray[i][j][k]);
					
					//arrayCopy[i][j][k] = monArray[i][j][k];

				}
				
			}
		}
		*/
		/*arrayCopy = monArray;
		
		System.out.println(arrayCopy[4][6][2]);
		
		char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e',
			    'i', 'n', 'a', 't', 'e', 'd' };
        char[] copyTo = new char[1000];

        System.arraycopy(copyFrom, 2, copyTo, 25, 7);
        System.out.println(new String(copyTo));
        */
		
		// Integer pour pouivoir utiliser .tostring()
		Integer myIntString = new Integer(0);
		
		String[][] monTableau = new String[5][4];
		
		// premiere dimension (x)
		for(int i = 0; i < monTableau.length; i++){
			
			System.out.println("i = " + i);
			
			// 2e dimension (y)
			for(int j = 0; j < monTableau[0].length; j++){
				
				System.out.println("j = " + j);
				
				myIntString = (i * 10) + j;
				
				// montableau(x,y) = quelquechose
				monTableau[i][j] = myIntString.toString();
				
				System.out.println("monTableau[" + i + "][" + j + "] = " + monTableau[i][j]);
				
			}
		}
		
		
	}
}
