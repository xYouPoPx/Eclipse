package librairie;

public class MonObjet {
	
	public int id = 100;
	
	public static int compteur = 0;
	public final int constante = 1000;
	
	public void uneFonction(){
		System.out.println("MonObjet.uneFonction");
	}
	
	// parametre final
	public void fontionDeux(final int a, int b){
		System.out.println(a);
		System.out.println(b);
		
		//a = 3; impossible car final
		b = 200;
		
		System.out.println(b);
	}
	
	
	// variable locale finale
	public void fonctionTrois(int a){
		final int b = 5;
		//b = 9; // impossible car final
		a = 9;
	}

}
