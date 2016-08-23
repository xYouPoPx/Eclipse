/**
 * 
 */
package fonction;

/**
 * @author ycourteau
 *
 */
public class PiseExercices {

	/**
	 * @author ycourteau http://pise.info/algo/enonces9.htm#En9.6 exercice 9.4
	 * @param str
	 *            qui dans lequel on recherche le nombre de voyelles
	 * @return le nombre de voyelles contenues dans la chaine de caracteres
	 */
	public static int trouverNbVoyelle(String str) {

		char courantStr, courantVoyelle;
		int nbrVoyelles = 0;
		String voyelles = "AEIOUY";

		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < voyelles.length(); j++) {

				courantStr = Character.toLowerCase(str.charAt(i));
				courantVoyelle = Character.toLowerCase(voyelles.charAt(j));
				if (courantStr == courantVoyelle) {
					nbrVoyelles++;
				}
			}
		}

		return nbrVoyelles;
	}

	public static String coderPhrase(String phrase) {

		String phraseCodee = "";
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String code = "";
		int position;

		char[] chaineChar = phrase.toCharArray();

		int charCode;

		for (int i = 0; i < phrase.length(); i++) {
			if (Character.isAlphabetic(phrase.codePointAt(i))) {
				charCode = phrase.codePointAt(i);
				if ((phrase.toLowerCase().charAt(i) == 'z')) {
					charCode -= 25;
				} else if ((phrase.toLowerCase().charAt(i) == 'a')) {
					charCode += 25;
				} else {
					charCode--;
				}
				chaineChar[i] = (char) charCode;
				System.out.println(phrase.charAt(i) + " --> " + chaineChar[i] + " " + charCode);
			}
		}
		System.out.print("Chaine départ, = " + phrase + " crypté = ");
		System.out.print(chaineChar);

	return phraseCodee;

	}

	/**
	 * @author ycourteau
	 * @param str
	 *            chaine dans laquelle on cherche le nombre de mots
	 * @return int le nombre de mots contenus dans la chaine de caracteres
	 */
	public static int trouverNbMots(String str) {

		String[] tabString;
		int nbrMots = 0;
		String separateur = " ";

		tabString = str.split(separateur);

		nbrMots = tabString.length;
		return nbrMots;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String maPhrase = "J'ai un joli petit lot de noix de coco";

		int nbrVoyelles = trouverNbVoyelle(maPhrase);
		System.out.println(nbrVoyelles);

		int nbrMots = trouverNbMots(maPhrase);
		System.out.println(nbrMots);

	}

}
