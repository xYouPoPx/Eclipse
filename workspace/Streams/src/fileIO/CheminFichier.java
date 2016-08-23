package fileIO;

import java.net.URI;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CheminFichier {

	public static void main(String[] args) {
		/*
		Path p1 = Paths.get("/tmp/foo");
		//Path p2 = Paths.get(args[0]);
		Path p3 = Paths.get(URI.create("file:///Users/YCourteau/FileTest.java"));
		
		Path p4 = FileSystems.getDefault().getPath("/users/sally");
		
		String s = System.getProperty("user.home");
		System.out.println(s);
		
		Path p5 = Paths.get(s,"\\logs", "foo.log");
		System.out.println(p5);
		*/
		
		// None of these methods requires that the file corresponding
		// to the Path exists.
		// Microsoft Windows syntax
		Path path = Paths.get("Streams\\foo");

		// Solaris syntax
		//Path path2 = Paths.get("/home/joe/foo");

		System.out.format("toString: %s%n", path.toString());
		System.out.format("getFileName: %s%n", path.getFileName());
		System.out.format("getName(0): %s%n", path.getName(0));
		System.out.format("getNameCount: %d%n", path.getNameCount());
		System.out.format("subpath(0,2): %s%n", path.subpath(0,2));
		System.out.format("getParent: %s%n", path.getParent());
		System.out.format("getRoot: %s%n", path.getRoot());

	}

}
