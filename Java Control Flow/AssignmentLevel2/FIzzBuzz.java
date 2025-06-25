package AssignmentLevel2;
import java.util.Scanner;
public class FIzzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner input = new Scanner(System.in);

	      // Get 3 input values for angles
	      int x = input.nextInt();
	     if(x>0) {
	    	 System.out.println(x);
	     
	     if(x%3==0 && x%5==0) {
	    	 System.out.println("FizzBuzz");
	     }
	     else if(x%5==0) {
	    	 System.out.println("Buzz");
	     }
	      else if(x%3==0) {
	    	 System.out.println("Fizz");
	     }
	}
	     else {
	    	 System.out.println("Not apositive number");
	     }
	     input.close();
	}
}
