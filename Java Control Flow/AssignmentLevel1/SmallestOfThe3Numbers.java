package AssignmentLevel1;
import java.util.Scanner;

public class SmallestOfThe3Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner input = new Scanner(System.in);

	      // Get 3 input values for angles
	      int x = input.nextInt();
	      int y = input.nextInt();
	      int z = input.nextInt();
if(x<y && x<z) {
	System.out.println(" Is the first number the smallest?yes");
}
else {
	System.out.println(" Is the first number the smallest?no;");
}

input.close();
	}

}
