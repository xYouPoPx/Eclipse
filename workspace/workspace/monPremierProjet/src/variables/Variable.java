/**
 * 
 */
package variables;

/**
 * @author ycourteau
 *
 */
public class Variable {
	
	static int maVariableGlobale;
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int maVariable1; // declaration de la variable
		byte monByte;
		String monString;
		long monLong;
		float monFloat;
		boolean monBool;
		char monChar;
/*		
		maVariable1 = 3; // initialisation de la variable
		monString = "test";
		// monByte = 300; ne fonctionne pas : valeur maximum = 255
		monByte = -127;
		monLong = 9;
		monFloat = 3.67890123456F;
		monBool = false;
		monChar = '\u0031';
*/		
		//System.out.println(maVariable1);
		//System.out.println(monString);
		
		//System.out.println(monFloat);
		//System.out.format("%3.10f%n", monFloat); // HEIN?!?!?! ca n'affiche pas la valeur affectee!!!
		
		//maVariable1 = 5;
		//monString = "Hello World!";
		
		//System.out.println(maVariable1);
		//System.out.println(monString);
		
		//maVariable1 = 300;
		//System.out.println(maVariable1);
		//System.out.println(monByte);
		
		//monByte = 125;
		//System.out.println(monByte * 0.5);
		
		//System.out.println(monBool);
		//monBool = true;
		//System.out.println(monBool);
		
		// maVariable1 = "A"; // ne fonctionne pas
		
		//System.out.println(monChar);
		
		monChar = '2';
		System.out.println(monChar);
		monChar = '\uffff';
		System.out.println(monChar);
		monChar = '\u4444';
		System.out.println(monChar);
		monChar = 'a';
		
		//System.out.println(monString);
		monString  = "jkghwuksghlisduhglkjsdhfgljhsdljghsdjfgkjerhgjhsdfgkljdfhgjkadfsef7SDcRDZX nbqBWEFR*TD X?C sgBCN"; 
		System.out.println(monString);
		
		System.out.println(maVariableGlobale);
	}

}
