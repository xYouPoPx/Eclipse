
public class Noeud {

	// aucun parent, donc aucun parcours vers le haut possible dans ce cas precis
	//sinon rajouter un Noeud parent
	private int valeur;
	private Noeud filsDroit, filsGauche;
	private int nbrOcc; // nombre d<occurence de la meme valeur
	
	
	
	/**
	 * @return the nbrOcc
	 */
	public int getNbrOcc() {
		return nbrOcc;
	}

	/**
	 * @param nbrOcc the nbrOcc to set
	 */
	public void setNbrOcc(int nbrOcc) {
		this.nbrOcc = nbrOcc;
	}

	//Constructeur pour une feuille (pas de fils)
	public Noeud(int valeur){
		this.filsDroit = null;
		this.filsGauche = null;
		this.valeur = valeur;
	}
	
	// polymorphisme: override du constructeur
	// Constructeur pour un noeud a 2 fils (un des 2 noeud fils peut etre null)
	public Noeud(int valeur, Noeud droit, Noeud gauche){
		
		this.filsDroit = droit;
		this.filsGauche = gauche;
		this.valeur = valeur;
	}

	/**
	 * @return the valeur
	 */
	public int getValeur() {
		return valeur;
	}

	/**
	 * @param valeur the valeur to set
	 */
	public void setValeur(int valeur) {
		this.valeur = valeur;
	}

	/**
	 * @return the filsDroit
	 */
	public Noeud getFilsDroit() {
		return filsDroit;
	}

	/**
	 * @param filsDroit the filsDroit to set
	 */
	public void setFilsDroit(Noeud filsDroit) {
		this.filsDroit = filsDroit;
	}

	/**
	 * @return the filsGauche
	 */
	public Noeud getFilsGauche() {
		return filsGauche;
	}

	/**
	 * @param filsGauche the filsGauche to set
	 */
	public void setFilsGauche(Noeud filsGauche) {
		this.filsGauche = filsGauche;
	}
	
	
}
