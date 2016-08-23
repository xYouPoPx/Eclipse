
public class Noeud {
	
	private int valeur;
	private Noeud suivant;

	/**
	 * @return the suivant
	 */
	public Noeud getSuivant() {
		return suivant;
	}

	/**
	 * @param suivant the suivant to set
	 */
	public void setSuivant(Noeud suivant) {
		this.suivant = suivant;
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

}
