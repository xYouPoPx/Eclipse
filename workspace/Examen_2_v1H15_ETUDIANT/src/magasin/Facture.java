package magasin;

import java.util.ArrayList;
import java.util.Date;
import java.io.Serializable;

public class Facture{
	
	private int id;
	private Date date = new Date();
	private ArrayList<Produit> listProduits = new ArrayList<Produit>();
	private ArrayList<Integer> listQtee = new ArrayList<Integer>();
	private double sousTotal;
	private double tps;
	private double tvq;
	private double total;
	

	
	/**
	 * public void calculerFacture()
	 * Calcule le sous-total (prix produit * qtee) de la facture, la tps, la tvq et le total
	 * 
	 */
	
	
	/**
	 * public void ajouterProduit(Produit prod, int qtee)
	 * 
	 * @param prod : le produit a ajouter dans la facture
	 * @param qtee : la qtee de ce produit achetee par le client
	 * 
	 * Ajoute un produit dans la facture, et la qtee achetee. Le produit est ajout/e dans une liste
	 * et la qtee achetee est ajouteee dans une 2e liste, mais ils se situent au meme indice puisqu'ils
	 * sont ajoutes simultanement et enleves simultanement
	 * 
	 * @author YCourteau H15
	 */
	public void ajouterProduit(Produit prod, int qtee){
		
		this.listProduits.add(prod);
		this.listQtee.add(qtee);
		
	}
	
	/**
	 * Affiche la facture
	 * 
	 * @author YCourteau H15
	 */
	public void afficherFacture(){
		
		// s'assurer que la facture est calculee avant toute chose!
		calculerFacture();
		
		System.out.println("\r\n\r\n************************************** FACTURE **************************************");
		System.out.println("* Date :\t" + date);
		System.out.println("* No. Facture :\t" + id);
		System.out.println("*");
		System.out.println("* ----------- Produit ------------------------- Qtee -------- Prix ---- Sous-total---");
		
		// pour chaque produit dans la liste de produit, r/cup/rer le produit et la qtee
		for(int i = 0; i < listProduits.size(); i++){
			
			
			System.out.println(" \t" + listProduits.get(i).getNom() + "\t\t\t\t\t" + listQtee.get(i) + "\t\t" + listProduits.get(i).getPrix() + "\t" + (listProduits.get(i).getPrix() * listQtee.get(i)));
		}
		
		System.out.println("\r\n\r\n");
		System.out.printf("\r\n\t\t\t\t\t\t\tSOUS-TOTAL:\t%10.2f",  this.sousTotal);
		System.out.printf("\r\n\t\t\t\t\t\t\tTPS:\t\t%10.2f", this.tps);
		System.out.printf("\r\n\t\t\t\t\t\t\tTVQ:\t\t%10.2f" , this.tvq);
		System.out.printf("\r\n\t\t\t\t\t\t\tTOTAL:\t\t%10.2f", this.total);
		System.out.println("\r\n*************************************************************************************");
		
	}
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the listProduits
	 */
	public ArrayList<Produit> getListProduits() {
		return listProduits;
	}
	/**
	 * @param listProduits the listProduits to set
	 */
	public void setListProduits(ArrayList<Produit> listProduits) {
		this.listProduits = listProduits;
	}
	/**
	 * @return the listQtee
	 */
	public ArrayList<Integer> getListQtee() {
		return listQtee;
	}
	/**
	 * @param listQtee the listQtee to set
	 */
	public void setListQtee(ArrayList<Integer> listQtee) {
		this.listQtee = listQtee;
	}
	/**
	 * @return the sousTotal
	 */
	public double getSousTotal() {
		return sousTotal;
	}
	/**
	 * @param sousTotal the sousTotal to set
	 */
	public void setSousTotal(double sousTotal) {
		this.sousTotal = sousTotal;
	}
	/**
	 * @return the tps
	 */
	public double getTps() {
		return tps;
	}
	/**
	 * @param tps the tps to set
	 */
	public void setTps(double tps) {
		this.tps = tps;
	}
	/**
	 * @return the tvq
	 */
	public double getTvq() {
		return tvq;
	}
	/**
	 * @param tvq the tvq to set
	 */
	public void setTvq(double tvq) {
		this.tvq = tvq;
	}
	/**
	 * @return the total
	 */
	public double getTotal() {
		return total;
	}
	/**
	 * @param total the total to set
	 */
	public void setTotal(double total) {
		this.total = total;
	}


}
