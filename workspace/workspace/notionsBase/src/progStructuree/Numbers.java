/**
 * 
 */
package progStructuree;

/**
 * @author ycourteau
 *
 */
public class Numbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int monInt = 2147483647;
		Integer monInteger = 20;
		int testPrimitif;
		String str;
		
		System.out.println(monInteger.intValue());
		testPrimitif = monInteger.intValue();
		// testPrimitif = monInteger;
		System.out.println(testPrimitif);
		
		str = monInteger.toString();
		System.out.println(str);
		
		str = "987654321";
		monInteger = Integer.parseInt(str);
		System.out.println(monInteger);
		
		System.out.println(monInteger.MAX_VALUE);
		
		String toBinary = monInteger.toBinaryString(monInt);
		System.out.println("monInteger.toBinaryString(monInt) = " + toBinary);
		System.out.println("longueur du String = " + toBinary.length());
		
		monInteger = Integer.valueOf(str);
		System.out.println(monInteger);
		
		
		// Formattage des Numbers
		float floatVar = 312345.1416f;
		int intVar = 3;
		String stringVar = "mon string";
		
		System.out.format("The value of " + "the float variable is " +
			     "%5.3f%n, while the value of the " + "integer variable is %d, " +
			     "and the string is %s", floatVar, intVar, stringVar); 
		
	}

}
