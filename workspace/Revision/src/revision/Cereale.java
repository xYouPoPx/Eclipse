package revision;

import java.io.Serializable;

public class Cereale implements Serializable {
	
	private String nom;
	
	// constructeur sans aprametre
	public Cereale(){
		
	}
	
	// constructeur avec 1 parametre
	public Cereale(String nom){
		this.nom = nom;
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

}
