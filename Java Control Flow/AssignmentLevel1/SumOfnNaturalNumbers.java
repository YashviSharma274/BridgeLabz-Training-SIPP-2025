package AssignmentLevel1;
import java.util.Scanner;
public class SumOfnNaturalNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

	      // Get 3 input values for angles
	      int x = input.nextInt();
	      if(x>0) {
	    	  System.out.println("The number "+x+" a natural number");
	      }
	      else {
	    	  System.out.println("The number "+x+" is  not natural number");
	      }
	      int sum=x*(x+1)/2;
	      System.out.println("Th sum of natural number "+sum);
	
	input.close();
	}

}
