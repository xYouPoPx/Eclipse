import java.util.ArrayList;

/**
 * 
 * @author YCourteau
 * Pile LIFO
 */
public class Pile {
	
	private ArrayList pile = new ArrayList();
	private int taille = 0; // la pile est toujours vide en commencant
	private int sommet = 0;
	
	public Pile(){
		
	}
	
	public void empiler(int valeur){
		

			this.pile.add(0, valeur);
			taille = this.pile.size();

	}
	
	public void desempiler(){
		
		// gestion du dernier element
		
			this.pile.remove(sommet);
			this.taille = this.pile.size();

		
	}
	
	public boolean isPileVide(){
		
		if(this.taille == 0){
			return true;
		} else {
			return false;
		}
	}
	
	public String toString(){
		
		String strPile = "-----\r\n";
		

		for (int i = 0; i < this.taille ; i++) {
			strPile += "| " + pile.get(i) + " |\r\n-----\r\n";
		}
		
		return strPile;
	}

	/**
	 * @return the pile
	 */
	public ArrayList getPile() {
		return pile;
	}

	/**
	 * @return the taille
	 */
	public int getTaille() {
		return taille;
	}

	/**
	 * @return the sommet
	 */
	public int getSommet() {
		return sommet;
	}
	
	
	public static int partition(ArrayList list, int left, int right) {

		int i = left, j = right;
		int tmp;
		int pivot = (int)list.get((left + right) / 2);
		//System.out.println("i = " + i + " j = " + j);
		while (i <= j) {

			while ((int)list.get(i) < pivot){
				i++;
			}

			while ((int)list.get(j) > pivot){
				j--;
			}
				
			if (i <= j) {

				tmp = (int)list.get(i);
				list.set(i, (int)list.get(j));
				list.set(j, tmp);

				i++;
				j--;
			}
			
		}
		
		return i;

	}

	public static void quickSort(ArrayList list, int left, int right) {

        int index = partition(list, left, right);

        System.out.println("left = " + left + " right = " + right + " index = " + index);
        if (left < index - 1)

            quickSort(list, left, index - 1);

        if (index < right)

            quickSort(list, index, right);

    }
	
	public void rechercheDicho(int valeur) {

		int debut = 0;
		int fin = this.pile.size() - 1;
		int moitie;

		do {
			moitie = (int) ((debut + fin) / 2);
			
			if(valeur > (int)pile.get(moitie)){
				
				debut = moitie + 1;
			} else {
				
				fin = moitie + 1;
			}

		} while (debut < fin && valeur != (int) this.pile.get(moitie));

		if(valeur == (int)pile.get(moitie)){
			System.out.println("(" + valeur + ")" + " trouvé à la position " + "(" + moitie + ")");
		}
	}

}
