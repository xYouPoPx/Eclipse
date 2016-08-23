package tableaux;

public class TableauxTriRecherche {

	public static void rechercheDicho(int[] tab, int rech) {
		// TODO Auto-generated method stub
		// int[] tab = { 2, 7, 9, 10, 11, 14, 17, 18, 20 };
		int debut, fin, moitier;

		// rech = 1;

		int test = (int) 4.8;

		debut = 0;
		fin = tab.length - 1;

		do {
			moitier = (int) ((debut + fin) / 2);
			System.out.println("début = " + debut + " , fin = " + fin + " , moitier = " + moitier + ", tab[m] = " + tab[moitier]);
			if (rech > tab[moitier])
				debut = moitier + 1;
			else
				fin = moitier - 1;
		} while (debut <= fin && rech != tab[moitier]);
		if (rech == tab[moitier])
			System.out.println("(" + rech + ")" + " trouvé à la position " + "(" + moitier + ")");
		else
			System.out.println(rech + " n'a pas été trouvé");
	}

	public static void triBulles(int[] tab) {
		int swap;
		int compteur = 0;
		int permut = 0;

		for (int i = tab.length - 1; i >= 0; i--) {
			compteur++;
			for (int j = 0; j < i; j++) {
				if (tab[j] > tab[j + 1]) {
					swap = tab[j];
					tab[j] = tab[j + 1];
					tab[j + 1] = swap;

					permut++;
				}
			}
		}
		System.out.println("triBulles compteur = " + compteur + " permut = " + permut);
	}

	public static void triBullesOpti(int[] tab) {
		int tmp;
		int i = tab.length - 1;
		boolean echange = true;
		int permut = 0;

		int compteur = 0;

		while ((i > 0) && echange) {
			compteur++;
			echange = false;

			for (int j = 0; j < i; j++) {
				if (tab[j] > tab[j + 1]) {
					tmp = tab[j];
					tab[j] = tab[j + 1];
					tab[j + 1] = tmp;

					permut++;
					echange = true;
				}
			}

			i--;
		}

		System.out.println("triBullesOpti compteur = " + compteur + " permut = " + permut);
	}

	public static void triSelection(int[] tab) {
		int swap, indice = -1;

		for (int i = 0; i < tab.length; i++) {

			indice = i;

			for (int j = i + 1; j < tab.length; j++) {
				if (tab[j] < tab[indice]) {
					indice = j;
					// min = tab[j];
				}
			}

			if (indice != i) {
				swap = tab[indice];
				tab[indice] = tab[i];
				tab[i] = swap;
			}
		}
	}

	public static int partitionner(int[] tab, int premier, int dernier, int pivot) {

		int tmp;
		int j;

		// mettre le pivot dans la derniere case du tableau
		tmp = tab[pivot];
		tab[pivot] = tab[dernier];
		tab[dernier] = tmp;

		j = premier;

		for (int i = 0; i < tab.length - 1; i++) {
			// tab[dernier] est devenu le pivot
			if (tab[i] <= tab[dernier]) {
				tmp = tab[i];
				tab[i] = tab[j];
				tab[j] = tmp;

				j++;
			}

		}

		tmp = tab[dernier];
		tab[dernier] = tab[j];
		tab[j] = tmp;

		return j;
	}

	public static void triRapide(int[] tab, int premier, int dernier, int pivot) {

		if (premier < dernier) {
			pivot = partitionner(tab, premier, dernier, pivot);
			triRapide(tab, premier, pivot - 1, pivot);
			triRapide(tab, pivot + 1, dernier, ((dernier - (pivot + 1)) / 4) + (pivot + 1));
		}
	}

	public static int partition(int arr[], int left, int right) {

		int i = left, j = right;
		int tmp;
		int pivot = arr[(left + right) / 2];
		System.out.println("i = " + i + " j = " + j);
		while (i <= j) {

			while (arr[i] < pivot){
				i++;
			}

			while (arr[j] > pivot){
				j--;
			}
				
			if (i <= j) {

				tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;

				i++;
				j--;
			}
			
		}
		
		return i;

	}

	public static void quickSort(int arr[], int left, int right) {

		int index = partition(arr, left, right);

		System.out.println("left = " + left + " right = " + right + " index = " + index);
		if (left < index - 1)

			quickSort(arr, left, index - 1);

		if (index < right)

			quickSort(arr, index, right);

	}

	public static void main(String[] args) {

		int[] tableau = { 55, 23, 10, 8, 0, 9, 100, 44, 56, 7 };
		int[] tableau2 = { 55, 23, 10, 8, 0, 9, 100, 44, 56, 7 };

		int[] tableau3 = {1, 12, 5, 26, 7, 14, 3, 7, 2, 23, 55, 11, 3, 5, 9, 56, 89, 11, 14, 63, 57};
		/*
		for (int i = 0; i < tableau.length; i++) {
			tableau[i] = (int) (Math.random() * 10);
		}
		*/

		// test(tableau);
		System.out.println("AVANT TRI");
		for (int i = 0; i < tableau.length; i++) {
			System.out.println(tableau[i]);
		}

		// triSelection(tableau);
		// triBulles(tableau);
		// triBullesOpti(tableau2);
		 //triRapide(tableau, 0, tableau.length -1, tableau.length / 2);
		quickSort(tableau3, 0, tableau3.length - 1);

		System.out.println("APRES TRI");
		for (int i = 0; i < tableau3.length; i++) {
			System.out.println(tableau3[i]);
		}

		// rechercheDicho(tableau, 5);

	}

}
