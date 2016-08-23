/**
 * 
 */
package notionsBase;

/**
 * @author ycourteau
 *
 */
public class Conditionnel {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int valeur1 = 1;
		int valeur2 = 2;
		int valeur3 = 3;
		
		if(valeur1 == 1){
			System.out.println("valeur1 == 1");
		}
		
		if(valeur2 == 2){
			System.out.println("valeur2 == 2");
		}
		
		// SI	A			ET		B
		if( (valeur1 == 1) && (valeur2 == 2)){
			System.out.println("valeur1 == 1 ET valeur2 == 2");
		}
		
		// SI 	A			OU		B
		if( (valeur1 == 1) || (valeur3 == 2) ){
			System.out.println("valeur1 == 1 OU valeur3 == 2");
		}
		
		String resultat;
		
		if(valeur1 == 1){
			resultat = "valeur1 == 1";
		} else {
			resultat = "valeur1 != 1";
		}
		System.out.println(resultat);
		
		
		
		resultat = ((valeur1 == 1) && (valeur3 == 2) ) ? "valeur1 == 1" : "valeur1 != 1" ;
		System.out.println(resultat);

	}

}
