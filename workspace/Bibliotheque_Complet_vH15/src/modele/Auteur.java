/**
 * 
 */
package modele;

import java.io.Serializable;

/**
 * @author YCourteau
 *
 */
public class Auteur implements Serializable {
	
	public int getIntPret() {
		return intPret;
	}
	public void setIntPret(int intPret) {
		this.intPret = intPret;
	}
	public String getStringPret() {
		return StringPret;
	}
	public void setStringPret(String stringPret) {
		StringPret = stringPret;
	}
	private int intPret = 3;
	private String StringPret = "un string de pret";

}
