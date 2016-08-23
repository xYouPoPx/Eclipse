/**
 * 
 */
package progStructuree;

/**
 * @author ycourteau
 *
 */
public class ChaineCaracteres {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] helloArray = { 'h', 'e', 'l', 'l', 'o', '.' };
		String helloString = new String(helloArray);
		System.out.println(helloString);

		String palindrome = "Dot saw I was Tod";
		int len = palindrome.length();
		System.out.println(len);

		char[] tempCharArray = new char[len];
		char[] charArray = new char[len];

		// put original string in an
		// array of chars
		for (int i = 0; i < len; i++) {
			tempCharArray[i] = palindrome.charAt(i);
		}

		// reverse array of chars
		for (int j = 0; j < len; j++) {
			charArray[j] = tempCharArray[len - 1 - j];
		}

		String reversePalindrome = new String(charArray);
		System.out.println(reversePalindrome);

		System.out.println("Mon " + " String");

		String str1 = "Ma chaine ";
		String str2 = "de caracteres";

		System.out.println(str1 + str2);

		System.out.println(str1.concat(str2));
		System.out.println(str2.concat(str1));

		System.out.println("My name is ".concat("Rumplestiltskin"));

		float x = 3.14f;
		Float y = 3.14f;

		String convert = String.valueOf(x);
		String convert2 = y.toString();

		String anotherPalindrome = "Niagara. O roar again!";
		char aChar = anotherPalindrome.charAt(3);
		System.out.println(aChar);

		String roar = anotherPalindrome.substring(11, 15);
		System.out.println(roar);
		roar = anotherPalindrome.substring(11);
		System.out.println(roar);

		String[] tableauString = anotherPalindrome.split(" ");

		String[] tableauString2 = anotherPalindrome.split(" ", 2);
		System.out.println();

		String anotherPalindrome2 = " Niagara. O roar again!                      ";
		String strTrim = anotherPalindrome2.trim();
		System.out.println(strTrim);

		boolean contains = anotherPalindrome2.contains("gara");
		System.out.println(contains);

		String searchMe = "Green Eggs and Ham";
		String findMe = "Eggs";
		int searchMeLength = searchMe.length();
		int findMeLength = findMe.length();
		boolean foundIt = false;
		for (int i = 0; i <= (searchMeLength - findMeLength); i++) {
			if (searchMe.regionMatches(i, findMe, 0, findMeLength)) {
				foundIt = true;
				System.out.println(searchMe.substring(i, i + findMeLength));
				break;
			}
		}
		if (!foundIt)
			System.out.println("No match found.");
		
		if(findMe.equals("Eggs")){ // if (findMe == "Eggs") n<est pas valide
			System.out.println("2 strings sont egaux");
		}
		
		int test3 = findMe.compareToIgnoreCase("Egg");
		System.out.println(test3);
	}

}
