public class Examen {

	public static double moyenne(int[] tab) {
		double moyenne;
		double somme = 0;

		for (int i = 0; i < tab.length; i++) {
			somme += tab[i];
		}

		moyenne = somme / tab.length;
		return moyenne;

	}

	public static int somme(int[] tab) {

		int somme = 0;

		for (int i = 0; i < tab.length; i++) {
			somme += tab[i];
		}

		return somme;

	}

	public static int sommeRecursif(int[] t, int indice) {
		if (indice == t.length)
			return 0;
		else
			return t[indice] + sommeRecursif(t, indice + 1);
	}

	public static int[] insertionMilieuTableau(int[] tab, int nouvElement) {

		int indice = (tab.length + 1) / 2;
		int[] tabInsere = new int[tab.length + 1];

		// copier les premires valeurs jusqu'a l'indice
		for (int i = 0; i < indice; i++) {
			tabInsere[i] = tab[i];
		}

		// ajouter le nouvel elelment a l'indice
		tabInsere[indice] = nouvElement;

		// copier les cellules restantes
		// tenir compte du decalage de lignes que l'ajout a produit
		// [0] [1] [2] [3][4] devient
		// [0] [1] [201][2][3][4], justifiant l'utlisation du tab[i - 1] lors de
		// la copie
		for (int i = indice + 1; i < tabInsere.length; i++) {
			tabInsere[i] = tab[i - 1];
		}
		// System.out.println(tabInsere);
		return tabInsere;

	}

	public static void triBullesOptiDecroissant(int[] tab) {
		int tmp;
		int i = tab.length - 1;
		boolean echange = true;
		int permut = 0;

		int compteur = 0;

		while ((i > 0) && echange) {
			compteur++;
			echange = false;

			for (int j = 0; j < i; j++) {
				if (tab[j] < tab[j + 1]) {
					tmp = tab[j];
					tab[j] = tab[j + 1];
					tab[j + 1] = tmp;

					permut++;
					echange = true;
				}
			}

			i--;
		}

		// System.out.println("triBullesOpti compteur = " + compteur +
		// " permut = " + permut);
	}

	public static void descending(int n) {
		if (n <= 0)
			return;
		System.out.println(n);
		descending(n - 1);
	}

	public static void decToBin(int num) {
		if (num > 0) {
			// System.out.println("num = " + num);
			decToBin(num / 2);
			System.out.print(num % 2);
			// System.out.println("num = " + num + " num % 2 = " + num % 2);
		}

		// System.out.print(num % 2);
	}

	public static void triBullesOptiAscen(int[] tab) {

		int i = tab.length - 1;
		int permut = 0;
		int compteur = 0;
		boolean echange = true;
		while (i > 0 && echange) {
			compteur++;
			echange = false;
			for (int j = 0; j < i; j++) {
				if (tab[j] < tab[j + 1]) {
					int tmp = tab[j];
					tab[j] = tab[j + 1];
					tab[j + 1] = tmp;
					permut++;
					echange = true;
				}
			}
			i--;
		}
	}
}
