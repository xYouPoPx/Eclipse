package fileIO;

import java.util.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.CopyOption;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;


public class FileOperations {

	public static void main(String[] args) {

		// si on utilise System.getProperty
		// Path chemin = Paths.get(System.getProperty("user.home"));

		// si on utilise pas System.getProperty
		/*Path chemin = Paths.get("C:\\Users\\YCourteau\\workspace\\Streams\\xanadu.txt");

		// verifie si un fichier ou repertoire existe
		if (Files.exists(chemin)) {
			System.out.println("existe");
		} else {
			System.out.println("n'existe pas");
		}
*/
		// verifications proprietes ficheirs
		/*boolean isRegularExecutableFile = Files.isRegularFile(chemin) & Files.isReadable(chemin) & Files.isExecutable(chemin);

		if (Files.isReadable(chemin) && Files.isWritable(chemin)) {
			System.out.println("existe et lisible");
		} else {
			System.out.println("n'existe pas ou non lisible");
		}
*/
		// effecer fichier - SOYONS PRUDENTS!!!!!
		/*
		 * try { Files.delete(chemin); } catch (NoSuchFileException x) {
		 * x.printStackTrace(); System.err.format("%s: no such" +
		 * " file or directory%n", chemin); } catch (DirectoryNotEmptyException
		 * x) { System.err.format("%s not empty%n", chemin); } catch
		 * (IOException x) { // File permission problems are caught here.
		 * System.err.println(x); }
		 */

		/*
		// copie fichiers
		Path source = Paths.get("xanadu.txt");
		Path target = Paths.get("xanadu2.txt");
		try {
			Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/

		/*
		// deplacement fichiers
		Path src = Paths.get("xanadu.txt");
		Path dest = Paths.get("C:\\Users\\YCourteau\\Desktop\\xanadu2.txt");
		try {
			Files.move(src, dest, StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		//Path file = Paths.get("xanadu.txt");
		
		/*
		byte[] fileArray;
		List<String> myList;
		Charset charset = Charset.forName("ISO-8859-1");
		try {
			
			//fileArray = Files.readAllBytes(file);
			myList = Files.readAllLines(file, charset);
			String test = myList.get(1);
			System.out.println(myList);
			System.out.println(test);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
		/*
		// lecture du fichier ligne par ligne avec un buffer
		Path file = Paths.get("xanadu.txt");
		
		Charset charset = Charset.forName("US-ASCII");
		try (BufferedReader reader = Files.newBufferedReader(file, charset)) {
		    String line = null;
		    while ((line = reader.readLine()) != null) {
		        System.out.println(line);
		    }
		} catch (IOException x) {
		    System.err.format("IOException: %s%n", x);
		}
		*/
		
		// append fichier ecriture avec buffer
		Path file = Paths.get("xanadu.txt");
		Charset charset = Charset.forName("US-ASCII");
		String s = "\r\nLe texte que je veux ajouter dans mon fichier, une ligne complete sera ecrite";
		try (BufferedWriter writer = Files.newBufferedWriter(file, charset, StandardOpenOption.APPEND)) {
		    writer.write(s, 0, s.length());
		} catch (IOException x) {
		    System.err.format("IOException: %s%n", x);
		}
		
		

	}

}
