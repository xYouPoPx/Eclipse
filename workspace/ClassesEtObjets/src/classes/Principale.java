/**
 * 
 */
package classes;

/**
 * @author ycourteau
 *
 */
public class Principale {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		MaClasse monObjet = new MaClasse();
		
		System.out.println(monObjet);
		System.out.println(monObjet.monChampPublic);
		// System.out.println(monObjet.monChampPrive); le champ n'est pas visible
		
		int resultat = monObjet.multiplier();
		System.out.println(resultat);

		// int resultat2 = monObjet.multiplierPriver(); la methode est privee et non visible
		// System.out.println(resultat2); 
		
		int resultat3 = monObjet.multiplierAvecParam(3, 5);
		
		monObjet.mutiplierSansRetour(2, 5);
		
		double test = 2.5;
		double test2 = 3.0;
		int res;
		double res2;
		res = monObjet.multiplierAvecParam( resultat, resultat3);
		
		res2 = monObjet.multiplierAvecParam( test, test2);
		
		//System.out.println(res2);
			
		MaClasse monObjet2 = new MaClasse(234);
		System.out.println("");
		
		Bicycle monVelo = new Bicycle(50, 0, 2);
		System.out.println(monVelo);
		
		monVelo.speed = 10;
		System.out.println(monVelo.speed);
		
		// monVelo.gear = 4; le cham est prive donc invisible de l<exterieur
	}

}
