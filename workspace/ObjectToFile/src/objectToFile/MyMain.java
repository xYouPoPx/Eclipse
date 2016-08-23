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

public class MyMain {

	public static void main(String[] args) {

		Game myGame = new Game("Jeu1", "Aventure", 69.99);
		System.out.println(myGame.toString());

		// Nous d�clarons nos objets en dehors du bloc try/catch
		ObjectInputStream ois;
		ObjectOutputStream oos;
		try {
			oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(new File("/Volumes/INFO-MAC03/workspace/ObjectToFile/game.txt"))));

			// Nous allons �crire chaque objet Game dans le fichier
			oos.writeObject(new Game("Assassin Creed", "Aventure", 45.69));
			oos.writeObject(new Game("Tomb Raider", "Plateforme", 23.45));
			oos.writeObject(new Game("Tetris", "Strat�gie", 2.50));
			// Ne pas oublier de fermer le flux !
			oos.close();

			// On r�cup�re maintenant les donn�es !
			ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(new File("/Volumes/INFO-MAC03/workspace/ObjectToFile/game.txt"))));

			try {
				System.out.println("Affichage des jeux :"); 
				System.out.println("*************************\n");
				System.out.println(((Game) ois.readObject()).toString());
				System.out.println(((Game) ois.readObject()).toString());
				System.out.println(((Game) ois.readObject()).toString());
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}

			ois.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
