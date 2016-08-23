
public class Arbre {

	private Noeud racine; // depart de l'arbre, essentiel a connaitre
	
	
	// appel de la fonction inserer avec des parametres, qui permet de gerer la racine
	public void inserer(int valeur){
		this.racine = inserer(this.racine, valeur);
	}
	
	// polymorphisme: override de la fonction inserer
	public Noeud inserer(Noeud racine, int valeur){
		
		// creation de la racine de l'arbre
		if(racine == null){
			Noeud noeud = new Noeud(valeur);
			return noeud;
		}
		
		if(valeur < racine.getValeur()){
			
			// appel recursif, qui inserera a gauche tant que la valeur est plus petite
			racine.setFilsGauche(inserer(racine.getFilsGauche(), valeur));
		} else if(valeur == racine.getValeur()) {
			
			racine.setNbrOcc(racine.getNbrOcc() + 1);
		
		} else {// appel recursif, qui inserera a droite tant que la valeur est plus grande
			
			racine.setFilsDroit(inserer(racine.getFilsDroit(), valeur));
		}
		
		return racine;
	}
	
	public int hauteur(){
		
		return hauteur(racine);
	}
	
	private int hauteur(Noeud racine){
		
		int hauteurGauche;
		int hauteurDroite;
		
		if(racine == null){ // arbre vide
			return -1; 
		}
		
		hauteurDroite = hauteur(racine.getFilsDroit()); // appel recursif qui descend l'arbre a droite
		hauteurGauche = hauteur(racine.getFilsGauche()); // appel recursif qui descend l'arbre a gauche
		
		if(hauteurGauche < hauteurDroite){
			 return hauteurDroite + 1;
		}
		
		return hauteurGauche + 1;
	}
	
	public void arbreToString(){
		this.arbreToString(this.racine);
	}
	
	// obtenir une impression de la liste
	// recursivite
	
	String droite = "";
	String gauche = "";
	private void arbreToString(Noeud racine){
		
		if (racine != null) {

			arbreToString(racine.getFilsGauche());

		    System.out.println(racine.getValeur() + " (" + racine.getNbrOcc() + " fois)");

		    arbreToString(racine.getFilsDroit());

		   
		}
		
	}
	
}
