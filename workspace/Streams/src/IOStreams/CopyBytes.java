package IOStreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBytes {
	
    public static void main(String[] args) throws IOException, FileNotFoundException {

        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("xanadu.txt");
            out = new FileOutputStream("outagain.txt");
            int c;

            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } catch(IOException e){
        	
        	e.printStackTrace();
        	System.out.println("ioexception");
        	
        } catch(Exception e){
        	
        	e.printStackTrace();
        	System.out.println("Exception");
        	
        } finally {
        	
        	 System.out.println("out.close();");
        	 
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
               
            }
        }
    }
}