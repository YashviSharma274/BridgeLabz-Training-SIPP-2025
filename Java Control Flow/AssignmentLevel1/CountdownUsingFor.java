package AssignmentLevel1;
import java.util.Scanner;

public class CountdownUsingFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	      Scanner input = new Scanner(System.in);

	      // Get 3 input values for angles
	      int counter = input.nextInt();

for(int i=counter;i<1;i--) {
	System.out.println(counter);
}
input.close();
	}

}
