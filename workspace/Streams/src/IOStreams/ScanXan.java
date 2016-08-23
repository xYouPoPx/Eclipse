package IOStreams;

import java.io.*;
import java.util.Scanner;

public class ScanXan {
    public static void main(String[] args) throws IOException {

        Scanner s = null;
        String test;
        int longueur;

        try {
            s = new Scanner(new BufferedReader(new FileReader("xanadu.txt")));
            s.useDelimiter(",\\s*");
            
            while (s.hasNext()) {
            	
            	test = s.next();
            	longueur = test.length();
            	//System.out.println(test.length());
                System.out.println(test);
            }
        } finally {
            if (s != null) {
                s.close();
            }
        }
    }
}