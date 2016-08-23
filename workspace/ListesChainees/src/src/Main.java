package src;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListeChainee maListe = new ListeChainee();

		maListe.insertionDebut(5);
		maListe.insertionDebut(12);
		maListe.insertionDebut(5);
		maListe.insertionDebut(9);
		maListe.insertionDebut(5);
		maListe.insertionDebut(15);
		maListe.insertionDebut(5);
		maListe.insertionDebut(10);
		maListe.insertionDebut(17);
		maListe.insertionDebut(25);
		maListe.insertionDebut(9);

		// maListe.triSelectionPA();
		// maListe.triSelection();
		// maListe.triBulleOptiCarl();
		// maListe.triBulles();

		
		int i = 0;
		Noeud noeud = maListe.premier;
		/*System.out.println("---------------AVANT TRI------------");
		System.out.print("|");
		while (i < maListe.nbrNoeuds) {

			System.out.print(noeud.valeur + "|");
			noeud = noeud.suivant;
			i++;
		}
		System.out.println();
		System.out.println("---------------------------");

		//maListe.triQuickSort(maListe, 0, maListe.nbrNoeuds - 1);
*/		
		i = 0;
		noeud = maListe.premier;
		System.out.println("---------------AVANT TRI------------");
		System.out.print("|");
		while (i < maListe.nbrNoeuds) {

			System.out.print(noeud.valeur + "|");
			noeud = noeud.suivant;
			i++;
		}
		System.out.println();
		System.out.println("nombre de noeuds: " + maListe.nbrNoeuds);
		System.out.println("---------------------------");
		

		// maListe.suppNoeud();
		
		//maListe.removeOdds();
		//maListe.supprimerElementsSelonValeur(5);
		maListe.supprimerElementsSelonValeurYS(10);
		
		i = 0;
		noeud = maListe.premier;
		System.out.println("---------------APRES TRI------------");
		System.out.print("|");
		while (i < maListe.nbrNoeuds) {

			System.out.print(noeud.valeur + "|");
			noeud = noeud.suivant;
			i++;
		}
		System.out.println();
		System.out.println("---------------------------");
		System.out.println("nombre de noeuds: " + maListe.nbrNoeuds);

	/*	
		ListeChainee liste = new ListeChainee();
		int[] tab = {9, 25, 17, 10, 5, 15, 5, 9, 5, 12, 5};

		liste.tabToList(tab);
		
		i = 0;
		noeud = maListe.premier;
		System.out.println("---------------APRES TRI------------");
		System.out.print("|");
		while (i < liste.nbrNoeuds) {

			System.out.print(noeud.valeur + "|");
			noeud = noeud.suivant;
			i++;
		}
		System.out.println();
		System.out.println("---------------------------");
		System.out.println("nombre de noeuds: " + liste.nbrNoeuds);
		
*/
	}

}
