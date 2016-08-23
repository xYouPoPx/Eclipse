/**
 * 
 */
package fonction;

/**
 * @author ycourteau
 *
 */
public class Fonction {
	
	/*
	 * bloc de commentaire
	 */
	
	/**
	 * @author ycourteau 27-04-2016
	 *  Errer sans but
	 */
	public static void errer(){
		
		System.out.println("J'erre tel un zombie dans la vie");
		
	}
	
	/**
	 * @author ycourteau 27-04-2016
	 * 
	 * Calcule les pertes financieres ocasionnees par la poutine
	 * Une poutine coute 9$
	 * 
	 * @param nbrPoutine : nombre de poutines mangees
	 */
	public static void calculPertesEnPoutine(int nbrPoutine){
		
		System.out.println("J'ai perdu " + (nbrPoutine * 9) + "$ en poutines. YARK!");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		errer();
		
		calculPertesEnPoutine(7);

	}

}
