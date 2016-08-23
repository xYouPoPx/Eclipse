package introduction;

import java.util.Scanner;

public class IfElseDemo {

	 public static void main(String[] args) {

	        int testscore; // = 76;
	        //char grade;
	        String grade;
	        
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Entrez le resultat: ");
	        //testscore = scanner.nextInt();
	        //grade = scanner.next().charAt(1);
	        grade = scanner.nextLine();
	        
	        /*if (testscore >= 90) {
	            grade = 'A';
	        } else if (testscore >= 80) {
	            grade = 'B';
	        } else if (testscore >= 70) {
	            grade = 'C';
	        } else if (testscore >= 60) {
	            grade = 'D';
	        } else {
	            grade = 'F';
	        }*/
	        
	        System.out.println("Grade = " + grade);
	        
	        scanner.close();
	    }

}
