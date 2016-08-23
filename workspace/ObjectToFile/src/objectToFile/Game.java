package objectToFile;

//Package à importer
import java.io.Serializable;

public class Game implements Serializable {
	private String nom, style;
	private double prix;

	/**
	 * @author YCourteau
	 * 
	 * @param nom
	 * @param style
	 * @param prix
	 */
	public Game(String nom, String style, double prix) {
		this.nom = nom;
		this.style = style;
		this.prix = prix;
	}

	/**
	 * @return string complet
	 */
	public String toString() {
		return "Nom du jeu : " + this.nom + "\nStyle de jeu : " + this.style + "\nPrix du jeu : " + this.prix + "\n";
	}
}