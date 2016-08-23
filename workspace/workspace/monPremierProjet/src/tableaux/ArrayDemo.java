package tableaux;

public class ArrayDemo {
	
    public static void main(String[] args) {
        // declares an array of integers
        int[] anArray;

        // allocates memory for 10 integers
        anArray = new int[10];
/*           
        // initialize first element
        anArray[0] = 100;
        // initialize second element
        anArray[1] = 200;
        // and so forth
        anArray[2] = 300;
        anArray[3] = 400;
        anArray[4] = 500;
        anArray[5] = 600;
        anArray[6] = 700;
        anArray[7] = 800;
        anArray[8] = 900;
        anArray[9] = 1000;

        System.out.println("Element at index 0: " + anArray[0]);
        System.out.println("Element at index 1: " + anArray[1]);
        System.out.println("Element at index 2: " + anArray[2]);
        System.out.println("Element at index 3: " + anArray[3]);
        System.out.println("Element at index 4: " + anArray[4]);
        System.out.println("Element at index 5: " + anArray[5]);
        System.out.println("Element at index 6: " + anArray[6]);
        System.out.println("Element at index 7: " + anArray[7]);
        System.out.println("Element at index 8: " + anArray[8]);
        System.out.println("Element at index 9: " + anArray[9]);

        
        anArray[2] = 12345;
        anArray[0] = 54321;
        
        System.out.println("Element at index 2: " + anArray[2]);
        System.out.println("Element at index 0: " + anArray[0]);

        byte[] tabByte;
        
        tabByte = new byte[3]; // tabByte contient l'adresse de la case 0
        tabByte[0] = -123;
        tabByte[2] = 3;
        
        System.out.println("Element at index 2: " + tabByte[0]);
        System.out.println("Element at index 0: " + tabByte[2]);
       
        char[] anArrayOfChars;
        
        anArrayOfChars = new char[12];
        anArrayOfChars[0] = 'H';
        anArrayOfChars[1] = 'e';
        anArrayOfChars[2] = 'l';
        anArrayOfChars[3] = 'l';
        anArrayOfChars[4] = 'o';
        anArrayOfChars[5] = '\n';
        anArrayOfChars[6] = 'W';
        anArrayOfChars[7] = 'o';
        anArrayOfChars[8] = 'r';
        anArrayOfChars[9] = 'l';
        anArrayOfChars[10] = 'd';
        anArrayOfChars[11] = '!';
        
        System.out.print(anArrayOfChars[0]);
        System.out.print(anArrayOfChars[1]);
        System.out.print(anArrayOfChars[2]);
        System.out.print(anArrayOfChars[3]);
        System.out.print(anArrayOfChars[4]);
        System.out.print(anArrayOfChars[5]);
        System.out.print(anArrayOfChars[6]);
        System.out.print(anArrayOfChars[7]);
        System.out.print(anArrayOfChars[8]);
        System.out.print(anArrayOfChars[9]);
        System.out.print(anArrayOfChars[10]);
        System.out.print(anArrayOfChars[11]);

        String[] anArrayOfStrings;
        anArrayOfStrings = new String[4];
        
        anArrayOfStrings[0] = "Hello";
        anArrayOfStrings[1] = "World";
        anArrayOfStrings[2] = "From";
        anArrayOfStrings[3] = "YouPoP";
        
        System.out.print(anArrayOfStrings[0] + " ");
        System.out.print(anArrayOfStrings[1] + " ");
        System.out.print(anArrayOfStrings[2] + " ");
        System.out.print(anArrayOfStrings[3] + "!" + "\r");
        
        System.out.print("\r" + anArrayOfStrings[0] + " ");
        System.out.print(anArrayOfStrings[3] + " ");
        System.out.print(anArrayOfStrings[2] + " ");
        System.out.print(anArrayOfStrings[1] + "!");
        
        int[] anArray2 = { 100, 200, 300, 400, 500, 600, 700, 800, 900, 1000 };
*/        	
        String[][] names;
        names = new String[2][3];
        
        names[0][0] = "Mr. ";
        names[0][1] = "Mrs. ";
        names[0][2] = "Ms. ";
/*        
        System.out.println(names[0][0]);
        System.out.println(names[0][1]);
        System.out.println(names[1][0]);
        System.out.println(names[1][1]);
        System.out.println(names[2][0]);
        System.out.println(names[2][1]);
*/       
        names[1][0] = "Smith";
        names[1][1] = "Jones";
        names[1][2] = "Moi";
        
        // Mr. Smith
       // System.out.println(names[0][0] + names[1][0]);
        // Ms. Jones
        //System.out.println(names[0][2] + names[1][2]);
        
        String[][] names2 = {
                {"Mr. ", "Mrs. ", "Ms. "},
                {"Smith", "Jones"}
            };
            // Mr. Smith
            // System.out.println(names2[0][0] + names2[1][0]);
            // Ms. Jones
            // System.out.println(names2[0][2] + names2[1][2]);
        	System.out.println("[0][0]" + names2[0][0]);
        	System.out.println("[0][1]" + names2[0][1]);
        	System.out.println("[0][2]" + names2[0][2]);
        	System.out.println("[1][0]" + names2[1][0]);
        	System.out.println("[1][1]" + names2[1][1]);
        	System.out.println("[1][2]" + names2[1][2]);
        	
        	int[][] names3;
        	names3 = new int[2][3];
    }


}
