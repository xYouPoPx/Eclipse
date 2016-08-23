import java.util.ArrayList;

/**
 * 
 * @author YCourteau File FIFO
 */
public class File {

	private ArrayList file = new ArrayList();
	private int taille = 0; // la file est toujours vide en commencant
	private int tete = 0;
	private int queue = 0;

	public File() {

	}

	public void enfiler(int valeur) {

		this.file.add(this.file.size(), valeur);
		this.taille = this.file.size();
		this.queue = this.file.size() - 1;

	}

	public void defiler() {

		// gestion du dernier element

		this.file.remove(tete);
		this.taille = this.file.size();
		this.queue = this.file.size() - 1;

	}

	public boolean isFileVide() {

		if (this.taille == 0) {
			return true;
		} else {
			return false;
		}
	}

	public String toString() {

		String strFile = "|";

		for (int i = 0; i < this.file.size(); i++) {
			strFile += file.get(i) + " | ";
		}

		return strFile;
	}

	/**
	 * @return the file
	 */
	public ArrayList getfile() {
		return file;
	}

	/**
	 * @return the taille
	 */
	public int getTaille() {
		return taille;
	}

	/**
	 * @return the file
	 */
	public ArrayList getFile() {
		return file;
	}

	/**
	 * @return the tete
	 */
	public int getTete() {
		return tete;
	}

	/**
	 * @return the queue
	 */
	public int getQueue() {
		return queue;
	}

	public void rechercheDicho(int valeur) {

		int debut = 0;
		int fin = this.file.size() - 1;
		int moitie;

		do {
			moitie = (int) ((debut + fin) / 2);
			
			if(valeur > (int)file.get(moitie)){
				
				debut = moitie + 1;
			} else {
				
				fin = moitie + 1;
			}

		} while (debut < fin && valeur != (int) this.file.get(moitie));

		if(valeur == (int)file.get(moitie)){
			System.out.println("(" + valeur + ")" + " trouvé à la position " + "(" + moitie + ")");
		}
	}
	
	public static void quickSort(ArrayList list, int left, int right) {

        int index = partition(list, left, right);

        System.out.println("left = " + left + " right = " + right + " index = " + index);
        if (left < index - 1)

            quickSort(list, left, index - 1);

        if (index < right)

            quickSort(list, index, right);

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

	

}
