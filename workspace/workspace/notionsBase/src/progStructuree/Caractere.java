/**
 * 
 */
package progStructuree;

/**
 * @author ycourteau
 *
 */
public class Caractere {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// char ch = 'a'; 
		// Unicode for uppercase Greek omega character
		char uniChar = '\u03A9';
		// an array of chars
		char[] charArray = { 'a', 'b', 'c', 'd', 'e' };
		
		System.out.println(charArray[2]);
		
		Character ch = new Character('a');
		System.out.println(ch);
		
		boolean test = Character.isLowerCase('a');
		
		if( test == true){
			System.out.println("MAJUSCULE");
		} else {
			System.out.println("miniscule");
		}
		
		System.out.println(Character.toUpperCase('a'));
		System.out.println(Character.toLowerCase('A'));
		
		System.out.println(" une chaine de caracteres avec un backslash \\");
		System.out.println(" une chaine de caracteres avec un guillemet simple '' dans une chaine de caracteres	");
		System.out.println('\'');
		System.out.println(" une chaine de caracteres avec un guillemet double \" dans une chaine de caracteres	");
		System.out.println('"');

	}

}
