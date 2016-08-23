package librairie;

public final class ClasseFinale {
	
	public int id = 100;
	
	public static int compteur = 0;
	public final int constante = 1000;
	
	// instancier une variable finale dans le constructeur
	public final int constante2;
	
	public ClasseFinale(){
		constante2 = 2;
	}
	// un 2e constructeur qui affecte une valeur
	// differente a la constante
	public ClasseFinale(int test){
		constante2 = test;
	}
	
	public void uneFonction(){
		System.out.println("MonObjet.uneFonction");
	}

}
