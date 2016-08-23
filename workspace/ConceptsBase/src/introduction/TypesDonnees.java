/**
 * 
 */
package introduction;

/**
 * @author YCourteau
 *
 */
public class TypesDonnees {

	// commentaire
	
	/* comm multiligne
	static byte maByte = 127; // commentaire 1 ligne
	static short maShort = 32767;
	static int maInt = 2147483647;*/
	static long	maLong1 = 2147483647L;
	/*static float maFloat = 32767;
	static java.math.BigDecimal monBigDecimal = new java.math.BigDecimal(32767);
	static double maDouble = 32767.123;
	static double maDouble2 = 32767.123d;
	static boolean maBool = true;
	static char maCharHex = 0x041;
	static char maCharChar = '\uffff';
	static char maCharDec = 65;
	static String maString = "chaine de caractere";
	*/
	
	static byte maByte; // commentaire 1 ligne
	static short maShort;
	static int maInt;
	static long	maLong;
	static float maFloat;
	static double maDouble;
	static boolean maBool;
	static char maCharHex;
	static String maString = "tabluation \\ tabluation";
	static final int TEST = 2;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int test;
		
		test = 1;
		System.out.println("test = " + test);
		
		System.out.println("maByte (-128 a 127) = " + maByte);
		System.out.println("maShort (-32 768 a 32 767) = " + maShort);
		System.out.println("maInt (-2^31 a (2^31)-1) = " + maInt);
		System.out.println("maLong (-2^63 a (2^63)-1) = " + maLong);
		System.out.println("maFloat = " + maFloat);
		System.out.println("maFloat * 2 = " + maFloat*1000000);
		//System.out.println("monBigDecimal = " + monBigDecimal);
		
		//System.out.println(monBigDecimal.multiply(new java.math.BigDecimal(1000000)));
		
		System.out.println("maDouble = " + maDouble);
		System.out.println("maDouble * 2 = " + maDouble * 2);
		
		//System.out.println("maDouble2 = " + maDouble2);
		//System.out.println("maDouble2 * 2 = " + maDouble2 * 2);
		
		System.out.println("maBool = " + maBool);
		
		System.out.println("maCharHex = " + maCharHex);
		//System.out.println("maCharChar = " + maCharChar);
		//System.out.println("maCharDec = " + maCharDec);
		
		System.out.println("maString = " + maString);
	}

}
