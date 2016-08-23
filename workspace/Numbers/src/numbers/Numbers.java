/**
 * 
 */
package numbers;

import java.util.Locale;

/**
 * @author YCourteau
 *
 */
public class Numbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int i, j= 69;
		double k = 0.0;
		String monString = "";
		
		Integer myInt = new Integer(69);
		Integer myInt2 = new Integer(69);
		
		
		
		float floatVar = 3;
		int intVar = 3;
		String stringVar = "test";
		
		System.out.format("The value of " + "the float variable is " +
			     "%f, while the value of the " + "integer variable is %d, " +
			     "and the string is %s", floatVar, intVar, stringVar); 
		
		myInt2 = myInt.decode("123456");
		
		
		/*if(myInt.equals(myInt2)){
			System.out.println("egaux");
		} else {
			System.out.println("non egaux");
		}*/
		
		byte inverse = 127;
		Byte monByte = new Byte(inverse);
		
		Double monDouble = new Double(1.23);
		
		
		short invert = 2;
		Short monShort = new Short(invert);
		invert = monShort.shortValue();
		
		Float monFloat = new Float(1.23);
		
		Long monLong = new Long(2);
		
		//monString = myInt.toString();
		
		i = myInt.MIN_VALUE;
		//myInt = 2147483647;
		
		j = myInt.MAX_VALUE;
		
		i = myInt.compareTo(myInt2);

	}

}
