/**
 * 
 */
package fichiers;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URI;
import java.nio.charset.Charset;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileStore;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.DosFileAttributes;
import java.nio.file.attribute.FileTime;
import java.util.Scanner;

/**
 * @author ycourteau
 *
 */
public class Fichiers {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		/*
				FileInputStream in = null;
		FileOutputStream out = null;
		
		try {
		    in = new FileInputStream("xanadu.txt");
		    out = new FileOutputStream("outagain.txt");
		    int c;
		
		    while ((c = in.read()) != -1) {
		        out.write(c);
		    }
		} finally {
		    if (in != null) {
		        in.close();
		    }
		    if (out != null) {
		        out.close();
		    }
		}
		*/

		/*		BufferedReader inputStream = null;
				PrintWriter outputStream = null;
		
				try {
					inputStream = new BufferedReader(new FileReader("xanadu.txt"));
					outputStream = new PrintWriter(new FileWriter("characteroutput.txt"));
		
					String l;
					while ((l = inputStream.readLine()) != null) {
						outputStream.println(l);
					}
				} finally {
					if (inputStream != null) {
						inputStream.close();
					}
					if (outputStream != null) {
						outputStream.close();
					}
				}*/

		/*		FileReader inputStream = null;
		FileWriter outputStream = null;
		
		try {
		    inputStream = new FileReader("xanadu.txt");
		    outputStream = new FileWriter("characteroutput.txt");
		
		    int c;
		    while ((c = inputStream.read()) != -1) {
		        outputStream.write(c);
		    }
		} finally {
		    if (inputStream != null) {
		        inputStream.close();
		    }
		    if (outputStream != null) {
		        outputStream.close();
		    }
		}*/
		/*
		Scanner s = null;
		
		try {
		    s = new Scanner(new BufferedReader(new FileReader("xanadu.txt")));
		
		    while (s.hasNext()) {
		    	System.out.format("%s", s.next());
		        //System.out.println(s.next());
		    }
		} finally {
		    if (s != null) {
		        s.close();
		    }
		}*/

		/*
		Path p1 = Paths.get("/tmp/foo");
		//Path p2 = Paths.get(args[0]);
		Path p3 = Paths.get(URI.create("file:///Users/joe/FileTest.java"));
		
		Path p4 = Paths.get(URI.create("file:///Volumes/INFO-MAC03/workspace/Fichiers/xanadu.txt"));
		
		String dir = System.getProperty("user.home");
		Path p5 = Paths.get(System.getProperty("user.home"),"logs", "foo.log");
		
		// Path path = Paths.get("/home/joe/foo");
		Path path = Paths.get("../sally/bar");
		
		System.out.format("toString: %s%n", path.toString());
		System.out.format("getFileName: %s%n", path.getFileName());
		System.out.format("getName(0): %s%n", path.getName(0));
		System.out.format("getNameCount: %d%n", path.getNameCount());
		System.out.format("subpath(0,2): %s%n", path.subpath(0,2));
		System.out.format("getParent: %s%n", path.getParent());
		System.out.format("getRoot: %s%n", path.getRoot());
		*/

		/*		Path p1 = Paths.get("/home/logfile");
				// Result is file:///home/logfile
				System.out.format("%s%n", p1.toUri());
				
				// Converts the input string to a Path object.
		Path inputPath = Paths.get("/home/logfile");
		
		// Converts the input Path
		// to an absolute path.
		// Generally, this means prepending
		// the current working
		// directory.  If this example
		// were called like this:
		//     java FileTest foo
		// the getRoot and getParent methods
		// would return null
		// on the original "inputPath"
		// instance.  Invoking getRoot and
		// getParent on the "fullPath"
		// instance returns expected values.
		Path fullPath = inputPath.toAbsolutePath();
		System.out.format("%s%n", fullPath);
		
		Path p4 = Paths.get(URI.create("file:///Volumes/INFO-MAC03/workspace/Fichiers/xanadu.txt"));
		
		try {
		    Path fp = p4.toRealPath();
		} catch (NoSuchFileException x) {
		    System.err.format("%s: no such" + " file or directory%n", p4);
		    // Logic for case when file doesn't exist.
		} catch (IOException x) {
		    System.err.format("%s%n", x);
		    // Logic for other sort of file error.
		}
		System.out.format("%s%n", p4);
		*/

		/*		Path path = Paths.get(URI.create("file:///Volumes/INFO-MAC03/workspace/Fichiers/xanadu.txt"));
				Path otherPath = Paths.get("/Volumes/INFO-MAC03/workspace/Fichiers/xanadu.txt");
				Path beginning = Paths.get("/home");
				Path ending = Paths.get("foo");
		
				if (path.equals(otherPath)) {
				    // equality logic here
					System.out.println("meme path");
				} else if (path.startsWith(beginning)) {
				    // path begins with "/home"
				} else if (path.endsWith(ending)) {
				    // path ends with "foo"
				}
				
				
				Path p1 = Paths.get(URI.create("file:///Volumes/INFO-MAC03/workspace/Fichiers/xanadu.txt"));
				System.out.println(p1);
				Path p2 = Paths.get("/Volumes/INFO-MAC03/workspace/Fichiers/xanadu.txt");
		
				if (Files.isSameFile(p1, p2)) {
					System.out.println("pointe vers le meme fichier");
				    // Logic when the paths locate the same file
				}*/
		/*
		Path path = Paths.get(URI.create("file:///Volumes/INFO-MAC03/workspace/Fichiers/xanadu.txt"));
		try {
		    //Files.delete(path);
			Files.deleteIfExists(path);
		} catch (NoSuchFileException x) {
		    System.err.format("%s: no such" + " file or directory%n", path);
		} catch (DirectoryNotEmptyException x) {
		    System.err.format("%s not empty%n", path);
		} catch (IOException x) {
		    // File permission problems are caught here.
		    System.err.println(x);
		}
		*/

		Path src = Paths.get(URI.create("file:///Volumes/INFO-MAC03/workspace/Fichiers/xanadu.txt"));
		Path dest = Paths.get(URI.create("file:///Volumes/INFO-MAC03/workspace/Fichiers/test/xanadu.txt"));

		// Files.copy(src, dest, StandardCopyOption.REPLACE_EXISTING);

		// Files.move(src, dest, StandardCopyOption.REPLACE_EXISTING);

		/*
		Path file = Paths.get(URI.create("file:///Volumes/INFO-MAC03/workspace/Fichiers/test/xanadu.txt"));
		BasicFileAttributes attr = Files.readAttributes(file, BasicFileAttributes.class);
		
		System.out.println("creationTime: " + attr.creationTime());
		System.out.println("lastAccessTime: " + attr.lastAccessTime());
		System.out.println("lastModifiedTime: " + attr.lastModifiedTime());
		
		System.out.println("isDirectory: " + attr.isDirectory());
		System.out.println("isOther: " + attr.isOther());
		System.out.println("isRegularFile: " + attr.isRegularFile());
		System.out.println("isSymbolicLink: " + attr.isSymbolicLink());
		System.out.println("size: " + attr.size());
		
		long currentTime = System.currentTimeMillis();
		FileTime ft = FileTime.fromMillis(currentTime);
		Files.setLastModifiedTime(file, ft);
		
		System.out.println("lastModifiedTime: " + attr.lastModifiedTime());
		*/
		/*try {
		    DosFileAttributes attr2 = Files.readAttributes(file, DosFileAttributes.class);
		    System.out.println("isReadOnly is " + attr2.isReadOnly());
		    System.out.println("isHidden is " + attr2.isHidden());
		    System.out.println("isArchive is " + attr2.isArchive());
		    System.out.println("isSystem is " + attr2.isSystem());
		} catch (UnsupportedOperationException x) {
		    System.err.println("DOS file" +
		        " attributes not supported:" + x);
		}*/

		/*
		FileStore store = Files.getFileStore(file);
		
		long total = store.getTotalSpace() / 1024;
		long used = (store.getTotalSpace() -
		             store.getUnallocatedSpace()) / 1024;
		long avail = store.getUsableSpace() / 1024;
		
		System.out.println("total: " + total + " used " + used + " avail " + avail);
		
		*/

		/*
		Path file = Paths.get(URI.create("file:///Volumes/INFO-MAC03/workspace/Fichiers/xanadu.txt"));
		
		byte[] fileArray;
		fileArray = Files.readAllBytes(file);
		
		Path file2 = Paths.get(URI.create("file:///Volumes/INFO-MAC03/workspace/Fichiers/test/xanadu.txt"));
		byte[] buf = fileArray;
		Files.write(file2, buf);
		
		Charset charset = Charset.forName("US-ASCII");
		try (BufferedReader reader = Files.newBufferedReader(file, charset)) {
		    String line = null;
		    while ((line = reader.readLine()) != null) {
		        System.out.println(line);
		    }
		} catch (IOException x) {
		    System.err.format("IOException: %s%n", x);
		}
		
		String s = "test";
		
		try (BufferedWriter writer = Files.newBufferedWriter(file, charset, StandardOpenOption.APPEND)) {
		    writer.write(s, 0, s.length());
		} catch (IOException x) {
		    System.err.format("IOException: %s%n", x);
		}
		*/

		Iterable<Path> dirs = FileSystems.getDefault().getRootDirectories();
		for (Path name : dirs) {
			System.err.println(name);
		}

		// Path dir = Paths.get(URI.create("file:///Volumes/INFO-MAC03/workspace/Fichiers/testDirectory"));
		// Files.createDirectory(dir);

		Path dir = Paths.get(URI.create("file:///Volumes/INFO-MAC03/workspace/Fichiers/src/fichiers"));
		try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir)) {
			for (Path file : stream) {
				System.out.println(file.getFileName());
			}
		} catch (IOException | DirectoryIteratorException x) {
			// IOException can never be thrown by the iteration.
			// In this snippet, it can only be thrown by newDirectoryStream.
			System.err.println(x);
		}
		
		try (DirectoryStream<Path> stream =
			     Files.newDirectoryStream(dir, "*.{java,class,jar}")) {
			    for (Path entry: stream) {
			        System.out.println(entry.getFileName());
			    }
			} catch (IOException x) {
			    // IOException can never be thrown by the iteration.
			    // In this snippet, it can // only be thrown by newDirectoryStream.
			    System.err.println(x);
			}

	}
}
