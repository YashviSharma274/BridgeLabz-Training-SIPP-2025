package AssignmentLevel1;
import java.util.Scanner;
public class PositiveOrNegativeOrZero {
	 public static void main(String[] args) {

	 Scanner input = new Scanner(System.in);

     // Get 3 input values for angles
     int x = input.nextInt();
     if(x>0) {
    	 System.out.println("Positive");
     }
     else if(x<0) {
    	 System.out.println("Negative");
     }
     else {
    	 System.out.println("Zero");
     }
     input.close();
	 }

}
