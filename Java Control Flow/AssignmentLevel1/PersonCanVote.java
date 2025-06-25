package AssignmentLevel1;
import java.util.Scanner;
public class PersonCanVote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner input = new Scanner(System.in);

	      // Get 3 input values for angles
	      int x = input.nextInt();
	     if(x>18) {
	    	 System.out.println("The person's age is "+x+"  and can vote.");
	     
	     }
	     else {
	    	 System.out.println("The person's age is "+x+" and cannot vote.");
	     }
input.close();
	}

}
