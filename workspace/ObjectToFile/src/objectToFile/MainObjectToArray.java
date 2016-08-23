package objectToFile;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MainObjectToArray {
	public static void main(String[] args) {
		Game[] tableau;
		int i = 0;

		tableau = new Game[3];

		tableau[0] = new Game("Marie", "1", 200);
		tableau[1] = new Game("Sophie", "2", 120);
		tableau[2] = new Game("Gaston", "3", 300);

		ObjectInputStream ois;
		ObjectOutputStream oos = null;

		// ecriture de chaque objet du tableau dans le fichier
		try {
			oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(new File("D:/game.txt"))));
			
			// pour chaque objet Game dans le tableau
			for (Game game : tableau) {

				// l'ecrire dans le fichier
				oos.writeObject(game);

				System.out.println(tableau[i]);
				i++;
			}
			// fermer le fichier une fois les operations d'ecriture terminees
			oos.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// lecture du fichier pour placer chaque objet dans un tableau
		try {
			ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(new File("D:/game.txt"))));
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
}
