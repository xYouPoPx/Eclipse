
public class Main {

	public static void main(String[] args) {


		Arbre arbre = new Arbre();
		
		arbre.inserer(11);
		arbre.inserer(7);
		arbre.inserer(15);
		arbre.inserer(0);
		arbre.inserer(23);
		arbre.inserer(9);
		arbre.inserer(13);
		arbre.inserer(7);
		
		System.out.println("Hauteur de l'arbre: " + arbre.hauteur());
		
		
		arbre.arbreToString();
		

	}

}
