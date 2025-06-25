package AssignmentLevel2;
import java.util.Scanner;
public class EvenAndOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner input = new Scanner(System.in);

		      // Get 3 input values for angles
		      int x = input.nextInt();
		      if(x>0) {
              for(int i=1;i<x;i++ ) {
            	  if(i%2==0) {
            		  System.out.println("even "+i);
            	  }
            	  else {
            		  System.out.println("odd "+i);
            	  }
	}
		      }
		      else {
		    	  System.out.println("Not a natural number");
		      }
		      input.close();
}
}