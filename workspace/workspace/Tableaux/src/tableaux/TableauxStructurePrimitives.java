package tableaux;

public class TableauxStructurePrimitives {

	// insertion a la fin du tableau
	public static int[] InsertionTableau(int[] tab, int nouvElement) {

		int grandeurTab = tab.length;
		int[] tabInsere = new int[grandeurTab + 1];

		for (int i = 0; i < tab.length; i++) {

			tabInsere[i] = tab[i];
		}

		int grandeurTabInsere = tabInsere.length;
		tabInsere[grandeurTabInsere - 1] = nouvElement;

		return tabInsere;

	}

	// insertion a n'importe quel indice
	public static int[] InsertionTableau(int[] tab, int nouvElement, int indice) {
		
		int[] tabInsere = new int[tab.length + 1];

		// copier les premires valeurs jusqu'a l'indice
		for(int i = 0; i < indice; i++){
			tabInsere[i] = tab[i];
		}
		
		// ajouter le nouvel elelment a l'indice
		tabInsere[indice] = nouvElement;
		
		// copier les cellules restantes
		// tenir compte du decalage de lignes que l'ajout a produit
		// [0] [1] [2]  [3][4] devient
		// [0] [1] [201][2][3][4], justifiant l'utlisation du tab[i - 1] lors de la copie
		for(int i = indice + 1; i < tabInsere.length; i++){
			tabInsere[i] = tab[i - 1];
		}
		System.out.println(tabInsere);
		return tabInsere;

	}

	public static int[] SuppressionTableau(int[] tab, int indice){

		// creer tableau une case plus petit
		int[] tabSupprime = new int[tab.length - 1];
		
		// de 0 a indice copier
		for(int i = 0; i < indice; i++){
			tabSupprime[i] = tab[i];
		}
		
		// sauter tab[indice]
		// de indice+1 a la fin copier
		// copier les cellules restantes
		// tenir compte du decalage de lignes que l'ajout a produit
		// [0] [1] [2] [3] [4] devient
		// [0] [1] [3] [4], justifiant l'utlisation du tabSupprime[i - 1] lors de la copie
		for(int i = indice + 1; i < tab.length; i++){
			tabSupprime[i - 1] = tab[i];
		}
		return tabSupprime;
		
	}
	
	public static int MinimumTableau(int[] tab){
		 
		int min = tab[0]; // affecter une valeur du tableau
		
		for(int i = 0; i > tab.length; i++){
			
			if( min > tab[0]){
				min = tab[0];
			}
		}
		
		return min;
	}
	
	public static int[] test(int[] tab){
		
		int[] tableau = new int[tab.length];
		tab[2] = 200;
		
		return tableau;
	}
	
	public static void main(String[] args) {

		int[] tableauOriginal = {10, 20, 30, 40};
		int[] tableauInsertion;
		int[] tableauSuppression;

		// ajouter des donnees dans le tableau pour fins de test
		/*for (int i = 0; i < tableauOriginal.length; i++) {

			tableauOriginal[i] = i;
		}
*/
		//tableauInsertion = InsertionTableau(tableauOriginal, 199);
		//tableauOriginal = tableauInsertion;
		//tableauInsertion = InsertionTableau(tableauOriginal, 200);
		//tableauInsertion = InsertionTableau(tableauOriginal, 201, 2);
		//System.out.println(tableauInsertion);
		
		//tableauSuppression = SuppressionTableau(tableauOriginal, 3);
		
		//int minimum = MinimumTableau(tableauOriginal);
		
		System.out.println(tableauOriginal);
		tableauInsertion = tableauOriginal;
		System.out.println(tableauInsertion);
		
		tableauInsertion[1] = 100;
		
		int[] tabTest = new int[4];
		int[] tabTest2 = test(tabTest);
		//tabTest = tableauOriginal;
	}

}
