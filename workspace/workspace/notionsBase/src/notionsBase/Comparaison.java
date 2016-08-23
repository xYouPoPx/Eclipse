/**
 * 
 */
package notionsBase;

/**
 * @author ycourteau
 *
 */
public class Comparaison {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int valeur1 = 1;
		int valeur2 = 2;
		int valeur3 = 2;
		
		if( valeur1 == valeur2 ){
			System.out.println("sont egales");
		}
		
		if(valeur1 != valeur2){
			System.out.println("ne sont pas egales");
		}
		
		if(valeur1 > valeur2){
			System.out.println("valeur1 > valeur2");
		}
		
		if(valeur1 < valeur2){
			System.out.println("valeur1 < valeur2");
		}
		
		if(valeur2 >= valeur3){
			System.out.println("valeur2 >= valeur3");
		}
		
		if(valeur2 <= valeur3){
			System.out.println("valeur2 <= valeur3");
		}
		
		if(valeur1 >= valeur3){
			System.out.println("valeur1 >= valeur3");
		}
		
		if(valeur1 <= valeur3){
			System.out.println("valeur1 <= valeur3");
		}
		
		System.out.println("valeur1 = " + valeur1 + " valeur3 = " + valeur3);
		if(valeur3 >= valeur1){
			System.out.println("valeur3 >= valeur1");
		}
	}

}
