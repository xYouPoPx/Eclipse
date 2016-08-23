/**
 * 
 */
package progStructuree;

import static java.lang.Math.*;

/**
 * @author ycourteau
 *
 */
public class BasicMathDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		cos(35);
		
		double pi = Math.PI;
		double e = Math.E;
		
		int monInt = -100;
		int res = abs(monInt);
		
		System.out.println("monInt = " + monInt + " res = " + res);
		
		System.out.println("PI = " + PI + " CEILING de PI = " + ceil(PI));
		System.out.println("PI = " + PI + " FLOOR de PI = " + floor(PI));
		System.out.println("PI = " + PI + " RINT de PI = " + rint(PI));
		
		int min = 555;
		int max = 666;
		
		System.out.println("MIN = " + min(max, min));
		System.out.println("MAX = " + max(min, max));
		
		int racine = 25;
		int puissance = 5;
		
		System.out.println("5 puissance 2 = " + pow(puissance, 2));
		System.out.println("racine de 25 = " + sqrt(racine));
		
		System.out.println("sin(45) = " + sin(45));
		System.out.println("cos(45) = " + cos(45));
		System.out.println("tan(45) = " + tan(45));
		
		double degrees = 45.0;
        double radians = Math.toRadians(degrees);
        System.out.println("degrees = " + degrees + " radians = " + radians);
        
		System.out.println("sin(1) = " + sin(radians));
		System.out.println("cos(1) = " + cos(radians));
		System.out.println("tan(1) = " + tan(radians));
		
		double number = (Math.random());
		int nombre = (int) (number * 1000);
		System.out.println("Math.random = " + number + " nombre = " + nombre);


	}

}
