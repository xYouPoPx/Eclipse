package revision;

import java.io.Serializable;
import java.util.ArrayList;

public class Alcool implements Serializable{
	
	private String nom;
	private String couleur;
	private double pourcentageAlcool;
	private ArrayList<Cereale> cereales = new ArrayList<Cereale>();
	
	// constructeur sans parametre
	public Alcool(){
		
	}
	
	// constructeur avec parametre
	public Alcool(String nom, String couleur, double pourcentageAlcool, ArrayList<Cereale> cereales){
		
		this.nom = nom;
		this.couleur = couleur;
		this.pourcentageAlcool = pourcentageAlcool;
		this.cereales = cereales;
	}
	
	public void AfficherAlcool(){
		System.out.println("nom = " + nom + " pourcentageAlcool = " + pourcentageAlcool);
	}
	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * @return the couleur
	 */
	public String getCouleur() {
		return couleur;
	}
	/**
	 * @param couleur the couleur to set
	 */
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	/**
	 * @return the pourcentageAlcool
	 */
	public double getPourcentageAlcool() {
		return pourcentageAlcool;
	}
	/**
	 * @param pourcentageAlcool the pourcentageAlcool to set
	 */
	public void setPourcentageAlcool(double pourcentageAlcool) {
		this.pourcentageAlcool = pourcentageAlcool;
	}
	/**
	 * @return the cereales
	 */
	public ArrayList<Cereale> getCereales() {
		return cereales;
	}
	/**
	 * @param cereales the cereales to set
	 */
	public void setCereales(ArrayList<Cereale> cereales) {
		this.cereales = cereales;
	}

	

}
