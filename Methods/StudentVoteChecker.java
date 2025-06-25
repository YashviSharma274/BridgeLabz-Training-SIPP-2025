package Methods;
import java.util.Scanner;
public class StudentVoteChecker {
	public static boolean canStudentVote(int age) {
	 if(age<=0) {
     	return false;
	 } else if (age >= 18) {
         return true; 
     } else {
         return false; 
     }
 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		  StudentVoteChecker checker = new StudentVoteChecker(); 
	        int[] age =new int[10];
	        for(int i=0;i<10;i++) {
	        	  System.out.print("Enter age of student " + (i + 1) + ": ");
	              age[i] = scanner.nextInt();

	              boolean canVote = checker.canStudentVote(age[i]);

	              if (age[i] < 0) {
	                  System.out.println("Invalid age entered. Cannot vote.");
	              } else if (canVote) {
	                  System.out.println("Student " + (i + 1) + " can vote.");
	              } else {
	                  System.out.println("Student " + (i + 1) + " cannot vote.");
	        }
	        }
	        
	      scanner.close();

	}

}
