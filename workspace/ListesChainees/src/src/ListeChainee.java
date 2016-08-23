package src;

public class ListeChainee {

	Noeud premier;
	Noeud dernier;
	int nbrNoeuds;

	public ListeChainee() {

		this.premier = null;
		this.dernier = null;
		this.nbrNoeuds = 0;

	}

	public void insertionDebut(int value) {

		Noeud n1 = new Noeud();
		// this.valeur = valeur;

		if (nbrNoeuds == 0) {
			n1.suivant = n1;
			n1.precedent = n1;
			dernier = n1;
			premier = n1;
			n1.valeur = value;
			nbrNoeuds++;

		} else {
			n1.valeur = value;
			n1.suivant = premier;
			n1.precedent = dernier;
			dernier.suivant = n1;
			premier.precedent = n1;
			premier = n1;
			nbrNoeuds++;

		}

	}

	public void suppNoeud() {
		// suppression au debut de la liste
		Noeud nd = new Noeud();

		if (nbrNoeuds == 0) {

			System.out.println("la liste est vide ");

		} else {

			this.premier = this.premier.suivant;
			this.dernier.suivant = this.premier;
			this.premier.precedent = this.dernier;

			// premier = premier.suivant;
			// dernier.suivant = premier;
			// premier.precedent = dernier;
			nbrNoeuds--;

		}
	}

	public void triSelection() {
		int i = 0;
		if (nbrNoeuds != 0) { // si la liste n'est pas vide

			Noeud noeudPremier = premier;
			// Noeud tmp = new Noeud();

			while (noeudPremier != dernier) {
				Noeud noeudDeuxieme = noeudPremier.suivant;
				Noeud tmp = new Noeud();

				while (noeudDeuxieme != premier) {

					if (noeudDeuxieme.valeur < noeudPremier.valeur) {

						tmp.valeur = noeudDeuxieme.valeur;
						noeudDeuxieme.valeur = noeudPremier.valeur;
						noeudPremier.valeur = tmp.valeur;

					}

					noeudDeuxieme = noeudDeuxieme.suivant;

				}

				noeudPremier = noeudPremier.suivant;
			}

		}
	}

	public void triBulles() {

		Noeud noeudDernier = this.dernier;
		Noeud noeudPremier = this.premier;

		while (noeudDernier != noeudPremier) {

			Noeud tmp = new Noeud();

			while (noeudPremier != dernier) {

				if (noeudPremier.valeur > noeudPremier.suivant.valeur) {
					tmp.valeur = noeudPremier.valeur;
					noeudPremier.valeur = noeudPremier.suivant.valeur;
					noeudPremier.suivant.valeur = tmp.valeur;
				}
				noeudPremier = noeudPremier.suivant;
			}
			noeudDernier = noeudDernier.precedent;
		}
	}

	public void triBulleOptiCarl() {

		if (nbrNoeuds != 0) {

			Noeud n1 = premier;
			// boolean swap = true;
			Noeud n2 = dernier;
			Noeud tmp = new Noeud();

			while (n1 != dernier) {// && swap) {

				// swap = false;

				while (n2 != n1) {

					if (n1.valeur < n1.suivant.valeur) {
						tmp.valeur = n1.valeur;
						n1.valeur = n1.suivant.valeur;
						n1.suivant.valeur = tmp.valeur;
						// swap = true;
					}
					n2 = n2.suivant;
				}
				n1 = n1.precedent;
			}
		}
	}

	public void triQuickSort(ListeChainee list, int left, int right) {

		int i = 0;
		Noeud noeud = list.premier;

		int index = partition(list, left, right);
		// System.out.println("Partition left = " + left + " Partition Right = "
		// + right + " Index = " + index);
		System.out.println("---------------PENDANT TRI------------");
		System.out.print("|");
		while (i < list.nbrNoeuds) {

			System.out.print(noeud.valeur + "|");
			noeud = noeud.suivant;
			i++;
		}
		System.out.println();
		System.out.println("---------------------------");
		int test = index;

		if (left < test - 1) {
			System.out.println("Quicksort Left = " + left + " right = " + right + " Index = " + index);
			triQuickSort(list, left, index - 1);
		}
		if (index < right) {
			System.out.println("Quicksort Right = " + right + " left = " + left + " Index = " + index);
			triQuickSort(list, index, right);
		}
	}

	public static int partition(ListeChainee list, int left, int right) {

		int i = left, j = right;
		// int tmp;
		int indexPivot = ((right - left) / 2);
		int pivot = getNodeAtIndex(list, indexPivot).valeur;
		System.out.println("Partition i = " + i + " j = " + j + " pivot = " + pivot + " indexPivot = " + indexPivot);
		Noeud tmp;

		Noeud noeudPremier = getNodeAtIndex(list, left);
		Noeud noeudDernier = getNodeAtIndex(list, right);
		Noeud temp = noeudPremier;

		int value = 0;
		Noeud noeud;
		int idx = 0;

		do {
			Noeud test = getNodeAtIndex(list, i);
			while (getNodeAtIndex(list, i).valeur < pivot && getNodeAtIndex(list, i) != noeudDernier.suivant) {
				i++;
				// System.out.println("i = " + i);
			}
			Noeud test2 = getNodeAtIndex(list, j);
			while (getNodeAtIndex(list, j).valeur > pivot && getNodeAtIndex(list, j) != noeudDernier) {
				// System.out.println("getNodeAtIndex(list,  j).valeur = " +
				// getNodeAtIndex(list, j).valeur);
				j--;
				// System.out.println("j = " + j);
			}
			if (i <= j) {
				System.out.println("Swap from index i = " + i + " value = " + getNodeAtIndex(list, i).valeur + " to index j = " + j + " to value = " + getNodeAtIndex(list, j).valeur);
				// tmp = arr[i];
				tmp = getNodeAtIndex(list, i);
				// System.out.println("Partition tmp.valeur = " + tmp.valeur +
				// " left = " + left + " right = " + right + " pivot = " +
				// pivot);
				value = tmp.valeur;
				getNodeAtIndex(list, i).valeur = getNodeAtIndex(list, j).valeur;
				getNodeAtIndex(list, j).valeur = value;
				// arr[i] = arr[j];
				// arr[j] = tmp;

				i++;
				j--;
			}

			temp = temp.suivant;
			// System.out.println("Partition i = " + i + " j = " + j +
			// " pivot = " + pivot);
			// System.out.println("temp = " + temp.valeur);

		} while (temp != noeudDernier.suivant);
		System.out.println("Partition return i = " + i);
		return i;
	}

	public static Noeud getNodeAtIndex(ListeChainee list, int index) {

		int value = 0;
		Noeud noeud;
		int idx = 0;

		Noeud noeudPremier = list.premier;
		Noeud noeudDernier = list.dernier;
		Noeud temp = list.premier;

		do {

			if (idx == index) {
				value = temp.valeur;
				return temp;
			}

			temp = temp.suivant;
			idx++;

		} while (temp != noeudDernier.suivant);

		return temp;
	}

	public static void quickSortTableaux(int arr[], int left, int right) {

		int index = partitionTableaux(arr, left, right);

		System.out.println("left = " + left + " right = " + right + " index = " + index);
		if (left < index - 1)

			quickSortTableaux(arr, left, index - 1);

		if (index < right)

			quickSortTableaux(arr, index, right);

	}

	public static int partitionTableaux(int arr[], int left, int right) {

		int i = left, j = right;
		int tmp;
		int pivot = arr[(left + right) / 2];
		System.out.println("i = " + i + " j = " + j);
		while (i <= j) {

			while (arr[i] < pivot) {
				i++;
			}

			while (arr[j] > pivot) {
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

	public void rechercheDicho(int val) {

		if (nbrNoeuds != 0) {

			Noeud noeudPremier = premier;
			Noeud noeudDernier = dernier;
			Noeud tmp = premier;

			do {

				if (tmp.valeur == val) {
					System.out.println("La valeur a ete trouve " + " " + tmp.valeur);

				} else {
					System.out.println("La valeur n'a pas ete trouve " + tmp.valeur);
				}

				tmp = tmp.suivant;
			} while (tmp != noeudDernier.suivant);
		}
	}

	// Effacer tous les éléments ayant une certaine valeur
	// https://openclassrooms.com/courses/les-listes-chainees-2
	// ne fonctionne pas encore
	public void supprimerElementsSelonValeur(int valeur) {

		Noeud current = premier;
		Noeud previous = premier.precedent;
		Noeud tmp;

		while (current.suivant != dernier.suivant) {

			while (current.suivant != dernier.suivant && current.valeur != valeur) {

				previous = current;
				System.out.println(" Valeur conservee : " + current.valeur);
				current = current.suivant;
			}

			if (current.valeur == valeur) {

				previous.suivant = current.suivant;
				nbrNoeuds--;
				System.out.println(" Valeur supprimee : " + current.valeur);
				current = current.suivant;
			}
		}

		this.premier = current.suivant;

	}

	public void removeOdds() {

		Noeud current = premier;
		Noeud previous = premier.precedent;

		while (current.suivant != previous) {

			while (current.suivant != previous && current.valeur % 2 != 1) {

				previous = current;
				System.out.println(" Valeur conservee : " + current.valeur);
				current = current.suivant;
			}

			if (current.valeur % 2 == 1) {

				previous.suivant = current.suivant;
				nbrNoeuds--;
				System.out.println(" Valeur supprimee : " + current.valeur);
				current = current.suivant;
			}
		}

		this.premier = current;

	}

	public void tabToList(int[] tab) {

		for (int i = 0; i < tab.length; i++) {

			this.insertionDebut(tab[i]);
		}

	}

	public void supprimerElementsSelonValeurYS(int valeur){
		Noeud ici;
		ici = premier;
		if(premier==null){
		System.out.println("liste est vide!!!");
		} else {
		do {
		if ((ici.valeur)==valeur) {
		if (ici == dernier) {
		premier.precedent = ici.precedent;
		ici.precedent.suivant = premier;
		dernier = ici.precedent;
		}
		else if
		(ici == premier) {
		dernier.suivant = ici.suivant;
		ici.suivant.precedent = dernier;
		premier = ici.suivant;
		}
		else
		{
		ici.precedent.suivant = ici.suivant;
		ici.suivant.precedent = ici.precedent;
		}


		}
		ici = ici.suivant;
		} while (ici != premier);
		}


		}

}
