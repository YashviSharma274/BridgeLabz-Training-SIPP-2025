package AssignmentLevel2;
import java.util.Scanner;
public class AbundantNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number");
	      int number= input.nextInt();
	      int sum=0;
	      for(int i=1;i<number;i++) {
	    	  if(number%i==0) {
	    		  sum+=i;
	    	  }
	      }
	      if(sum>number) {
	    	  System.out.println("Abundant Number");
	      }
	      else {
	    	  System.out.println("Not a Abundant Number");
	      }
	      input.close();
	      

	}

}
