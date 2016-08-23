package tableaux;

public class Recursivite {

	public static int factorielle(int n) {

		System.out.println("n = " + n);
		if (n < 0) {
			return -1;
		}

		if (n == 0) {
			return 1;
		}

		int test = n * factorielle(n - 1);
		System.out.println("n = " + n + " test = " + test);
		return test;

	}

	public static void pgcd(int a, int b) {
		if (b == 0) {
			System.out.println(a);
		} else {
			pgcd(b, a % b);
			System.out.println("a = " + a + " b = " + b);
		}
	}

	public static int pgcd2(int a, int b) {
		System.out.println("a = " + a + " b = " + b);

		if (b == 0) {
			return a;
		} else {
			int test = pgcd2(b, a % b);
			System.out.println("a = " + a + " b = " + b + " test = " + test);
			return test;
		}
	}

	public static int fibonacci(int n) {

		System.out.println("n = " + n);

		if ((n == 0) || n == 1) {

			return n;
		}

		int fib = fibonacci(n - 1) + fibonacci(n - 2);
		return fib;
	}

	public static int test() {

		return factorielle(1);
	}

	static void hanoi(int n, char depart, char arrivee, char aux) {
		
		System.out.println("n = " + n + " depart = " + depart + " arrivee = " + arrivee + " aux = " + aux);
		if (n > 0) {
			hanoi(n - 1, depart, aux, arrivee);
			System.out.println(depart + "->" + arrivee);
			hanoi(n - 1, aux, arrivee, depart);
		}
	}

	public static void solve(int n, String start, String auxiliary, String end) {
	       if (n == 1) {
	           System.out.println(start + " -> " + end);
	       } else {
	           solve(n - 1, start, end, auxiliary);
	           System.out.println(start + " -> " + end);
	           solve(n - 1, auxiliary, start, end);
	       }
	   }
	
	public static void main(String[] args) {

		// int resultat = factorielle(-6);
		int test = 5;

		// System.out.println(factorielle(test) == -1 ? "test" :
		// int result = factorielle(test);

		// pgcd(10 , 12);
		// int result = pgcd2(10 , 12);
		// int result = fibonacci(5);

		// System.out.println(result);

		//hanoi(3, 'A', 'B', 'C');
		solve(3, "A", "B", "C");

	}

}
