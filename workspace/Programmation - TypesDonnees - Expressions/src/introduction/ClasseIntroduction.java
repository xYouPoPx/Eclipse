/**
 * 
 */
package introduction;

/**
 * @author YCourteau
 *
 */
public class ClasseIntroduction {

	static int age = 33;
	static byte min = -128;
	static String maChaine = "Bonjour!";
	static char monChar = 27; // ou = 0x01B
	static boolean monBool = true;
	static float monFloat = 2.3f; // ou double monDouble = 2.3;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int age2 = 33;
		byte min2 = -128;
		String maChaine2 = "Bonjour!";
		char monChar2 = 27; // ou = 0x01B
		boolean monBool2 = true;
		float monFloat2 = 2.3f; // ou double monDouble = 2.3;
		
		System.out.println("age = " + age);
		System.out.println("min = " + min);
		System.out.println("maChaine = " + maChaine);
		System.out.println("monChar = " + monChar);
		System.out.println("monBool = " + monBool);
		System.out.println("monFloat = " + monFloat);
		
		System.out.println("age2 = " + age2);
		System.out.println("min2 = " + min2);
		System.out.println("maChaine2 = " + maChaine2);
		System.out.println("monChar2 = " + monChar2);
		System.out.println("monBool2 = " + monBool2);
		System.out.println("monFloat2 = " + monFloat2);
		
		System.out.println("");
		System.out.println("------------------------------");
		
		int x = 3;
		int y = 5;
		int z = 15;
		int res;
		
		System.out.println("x + y = " + (x + y));
		System.out.println("x + z = " + (x + z));
		System.out.println("y + z = " + (y + z));
		
		res = x * y;
		System.out.println("x^2 + y^2 = " + res);
		res = z / x;
		System.out.println("x^2 + y^2 = " + res);
		res = z % x;
		System.out.println("x^2 + y^2 = " + res);

		System.out.println("");
		System.out.println("------------------------------");
		
		x++;
		System.out.println("x = " + x);
		z--;
		System.out.println("z = " + z);
		y = -y;
		System.out.println("y = " + y);
		
	}

}
