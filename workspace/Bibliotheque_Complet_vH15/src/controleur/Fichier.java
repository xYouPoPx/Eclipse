/**
 * 
 */
package controleur;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.FileSystems;
import java.util.ArrayList;

import modele.Auteur;
import modele.BD;
import modele.Dictionnaire;
import modele.Editeur;
import modele.Livre;
import modele.Membre;
import modele.Revue;
import modele.Roman;

/**
 * @author YCourteau
 *
 */
public final class Fichier {
	
	private static String sep = FileSystems.getDefault().getSeparator();
	private static String path = System.getProperty("user.home") + sep + "biblio";


	/**
	 * Au demarrage lit tous les fichiers du repertoire /biblio et cree
	 * tous les objets de tous les fichiers
	 * 
	 * @return une arraylist contenant une arraylist de chaque objet / fichier present dans le repertoire
	 */
	public static ArrayList<ArrayList<?>> OnLoad() {

		ObjectInputStream ois;
		ArrayList<ArrayList<?>> al = new ArrayList<ArrayList<?>>();

		// lister les fichiers du repertoire
		File folder = new File(path);
		File[] listOfFiles = folder.listFiles();
		
		// pour chaque fichier
		for (int i = 0; i < listOfFiles.length; i++) {

			File file = listOfFiles[i];

			if (file.isFile() && file.getName().endsWith(".txt")) {

				try {
					
					ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)));
					Object obj;

					// lire le contenu du fichier (arraylist d'objets)
					obj = ois.readObject(); // on recoit une arrayList d<objets!

					al.add((ArrayList<?>)obj); // ajouter l'arraylist dans une arraylist

					ois.close();

				} catch (Exception e) {
					e.printStackTrace();

				}

			}
		}
		return al;

	}

	/**
	 * 
	 * @param nomFichier
	 * @return
	 */
	public boolean Lecture(String nomFichier) {

		return false;
	}

	/**
	 * 
	 * @param listeObj : ArrayList d'objets a ecrire dans le fichier correspondant
	 * @return
	 */
	public static void Ecriture(ArrayList<?> listeObj) {
		
		String type = listeObj.get(0).getClass().getSimpleName();
		
		ObjectOutputStream oos;
		try {
			oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(new File(path + sep + type + ".txt"))));
			oos.writeObject(listeObj);
			oos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * Obtention du type de l'objet en string, pour connaitre la classe afin de
	 * creer les fichiers texte du nom correspondant
	 * 
	 * @author YCourteau
	 * @param obj
	 * @return String typeObjet
	 */
	public String getTypeObjet(Object obj) {
		
		String typeObjet = "";
		typeObjet = obj.getClass().getSimpleName(); // .getName retourne package.class
		
		return typeObjet;
	}

	// fonction main pour fins de tests uniquement, a commenter / supprimer
	public static void main(String[] args) {

		Fichier file = new Fichier();
		

		Auteur auteur = new Auteur();
		BD bd = new BD();
		Dictionnaire dict = new Dictionnaire(0, path, path, auteur, null, 0, 0);
		Editeur editeur = new Editeur();
		Livre livre = new Livre();
		Membre membre = new Membre(0, "", "", "", "", "", 0);
		Pret pret = new Pret(0, null, null, membre, livre);
		Reservation reservation = new Reservation(0, null, null, livre, membre);
		Revue revue = new Revue();
		Roman roman = new Roman();
		
		//Fichier.OnLoad();

		// exemple pour l'obtention de la classe de l'objet
		System.out.println(file.getTypeObjet(pret));
		System.out.println(file.getTypeObjet(auteur));

		ArrayList<Auteur> maListeAuteur = new ArrayList<Auteur>();
		ArrayList<BD> maListeBD = new ArrayList<BD>();
		ArrayList<Dictionnaire> maListeDictionnaire = new ArrayList<Dictionnaire>();
		ArrayList<Editeur> maListeEditeur = new ArrayList<Editeur>();
		ArrayList<Livre> maListeLivre = new ArrayList<Livre>();
		ArrayList<Membre> maListeMembre = new ArrayList<Membre>();
		ArrayList<Pret> maListePret = new ArrayList<Pret>();
		ArrayList<Reservation> maListeReservation= new ArrayList<Reservation>();
		ArrayList<Revue> maListeRevue = new ArrayList<Revue>();
		ArrayList<Roman> maListeRoman = new ArrayList<Roman>();

		int i = 0;

		maListeAuteur.add(auteur);
		maListeAuteur.add(auteur);
		maListeAuteur.add(auteur);
		
		maListeBD.add(bd);
		maListeBD.add(bd);
		maListeBD.add(bd);
		
		maListeDictionnaire.add(dict);
		maListeDictionnaire.add(dict);
		maListeDictionnaire.add(dict);
		
		maListeEditeur.add(editeur);
		maListeEditeur.add(editeur);
		maListeEditeur.add(editeur);
		
		livre.setId(5);
		maListeLivre.add(livre);
		livre = new Livre();
		livre.setId(10);	
		maListeLivre.add(livre);
		
		livre = new Livre();
		Auteur aut = new Auteur();
		//aut.setIntPret(21);
		String test = aut.getStringPret();
		
		livre = new Livre(25, "isbn", "titre", aut, null, 0, 0);
		//livre.setId(15);
		maListeLivre.add(livre);
		
		membre = new Membre(1, "1", "1", "1", "1", "1", 1);
		maListeMembre.add(membre);
		membre = new Membre(2, "2", "2", "2", "2", "2", 2);
		maListeMembre.add(membre);
		membre = new Membre(3, "3", "3", "3", "3", "3", 3);
		maListeMembre.add(membre);
		
		maListePret.add(pret);
		maListePret.add(pret);
		maListePret.add(pret);
		
		maListeReservation.add(reservation);
		maListeReservation.add(reservation);
		maListeReservation.add(reservation);
		
		maListeRevue.add(revue);
		maListeRevue.add(revue);
		maListeRevue.add(revue);
		
		maListeRoman.add(roman);
		maListeRoman.add(roman);
		maListeRoman.add(roman);
		


		try {

			ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(new File(System.getProperty("user.home") + "/biblio/Auteur.txt"))));
			oos.writeObject(maListeAuteur);
			oos.close();
			
			oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(new File(System.getProperty("user.home") + "/biblio/BD.txt"))));
			oos.writeObject(maListeBD);
			oos.close();
			

			oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(new File(System.getProperty("user.home") + "/biblio/Dictionnaire.txt"))));
			oos.writeObject(maListeDictionnaire);
			oos.close();
			
			oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(new File(System.getProperty("user.home") + "/biblio/Editeur.txt"))));
			oos.writeObject(maListeEditeur);
			oos.close();
			
			oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(new File(System.getProperty("user.home") + "/biblio/Livre.txt"))));
			oos.writeObject(maListeLivre);
			oos.close();
			
			oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(new File(System.getProperty("user.home") + "/biblio/Membre.txt"))));
			oos.writeObject(maListeMembre);
			oos.close();
			
			oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(new File(System.getProperty("user.home") + "/biblio/Reservation.txt"))));
			oos.writeObject(maListeReservation);
			oos.close();
			
			
			oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(new File(System.getProperty("user.home") + "/biblio/Revue.txt"))));
			oos.writeObject(maListeRevue);
			oos.close();
			
			oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(new File(System.getProperty("user.home") + "/biblio/Roman.txt"))));
			oos.writeObject(maListeRoman);
			oos.close();
						
			oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(new File(System.getProperty("user.home") + "/biblio/Pret.txt"))));
			oos.writeObject(maListePret);
			oos.close();

			System.out.println(maListePret.get(i));
			i++;
			// }
			// fermer le fichier une fois les operations d'ecriture terminees
			//oos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException exc) {
			// TODO Auto-generated catch block
			exc.printStackTrace();
		}
		
		//ArrayList<?> maListeObjets = new ArrayList();
		//maListeObjets = Fichier.OnLoad();
	}
}
