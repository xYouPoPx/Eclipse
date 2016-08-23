package fileIO;

import java.io.IOException;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileStore;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;

public class Repertoires {

	public static void main(String[] args) {

		// liste des repertoires racines
		Iterable<Path> dirs = FileSystems.getDefault().getRootDirectories();

		for (Path name : dirs) {
			System.err.println(name);
		}

		/*
		 * // creation repertoire Path dir =
		 * Paths.get("C://foo/bar/test/unAutre"); try {
		 * Files.createDirectories(dir); } catch (IOException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */

		Path dir = Paths.get("C://foo/bar");
		try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir)) {
			for (Path file : stream) {
				System.out.println(file.getFileName());
			}
		} catch (IOException | DirectoryIteratorException x) {
			// IOException can never be thrown by the iteration.
			// In this snippet, it can only be thrown by newDirectoryStream.
			System.err.println(x);
		}

		PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:*.*");
		System.out.println(matcher.toString());

		String separateur = FileSystems.getDefault().getSeparator();
		System.out.println(separateur);
		Path dir2 = Paths.get("C:" + separateur + "foo" + separateur + "bar");

		/*try {
			FileStore store = Files.getFileStore(dir2);
			System.out.println(store);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/

		for (FileStore store : FileSystems.getDefault().getFileStores()) {
			System.out.println(store);
		}

	}

}
