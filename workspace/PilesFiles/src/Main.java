
public class Main {

	public static void main(String[] args) {


		///////////////////////// PILE
		/*
		System.out.println("\r\n------------------ PILES --------------------------");
		Pile maPile = new Pile();
		
		System.out.println("Pile vide? " + maPile.isPileVide());
		
		System.out.println("J'empile");
		maPile.empiler(9);
		maPile.empiler(25);
		maPile.empiler(17);
		maPile.empiler(10);
		maPile.empiler(5);
		maPile.empiler(15);
		maPile.empiler(5);
		maPile.empiler(9);
		maPile.empiler(5);
		maPile.empiler(12);
		maPile.empiler(5);
		
		System.out.println("Taille = " + maPile.getTaille());
		System.out.println(maPile.toString());
		
		maPile.quickSort(maPile.getPile(), 0, maPile.getPile().size() - 1);
		maPile.rechercheDicho(5);

		System.out.println(maPile.toString());
		//System.out.println("Pile vide? " + maPile.isPileVide());
		//System.out.println("Sommet = " + maPile.getSommet());
		
		//System.out.println("\r\n------------------------------\r\nje desempile");
		//maPile.desempiler();
		//maPile.desempiler();
		//maPile.desempiler();
		
		//System.out.println("Taille = " + maPile.getTaille());
		//System.out.println(maPile.toString());

		
		//System.out.println("Pile vide? " + maPile.isPileVide());
		//System.out.println("Sommet = " + maPile.getSommet());
		*/
		
		///////////////////////// FILE
		System.out.println("\r\n------------------ FILES --------------------------");
		File maFile = new File();
		
		System.out.println("File vide? " + maFile.isFileVide());
		System.out.println("J'enfile");
		
		maFile.enfiler(9);
		maFile.enfiler(25);
		maFile.enfiler(17);
		maFile.enfiler(10);
		maFile.enfiler(5);
		maFile.enfiler(15);
		maFile.enfiler(5);
		maFile.enfiler(9);
		maFile.enfiler(5);
		maFile.enfiler(12);
		maFile.enfiler(5);
		
		//System.out.println("Taille = " + maFile.getTaille());
		//System.out.println("Tete = " + maFile.getTete());
		//System.out.println("Queue = " + maFile.getQueue());
		//System.out.println(maFile.toString());
		//System.out.println("File vide? " + maFile.isFileVide());
		
		//System.out.println("\r\n------------------------------\r\nje defile");
		
		//maFile.defiler();
		//maFile.defiler();
		//maFile.defiler();
		maFile.quickSort(maFile.getFile(), 0, maFile.getTaille() - 1);
		//maFile.rechercheDichoPA(5);
		
		System.out.println("Taille = " + maFile.getTaille());
		System.out.println("Tete = " + maFile.getTete());
		System.out.println("Queue = " + maFile.getQueue());
		System.out.println(maFile.toString());
		System.out.println("File vide? " + maFile.isFileVide());
		
	}

}
