package AssignmentLevel1;
import java.util.Scanner;
public class RocketLaunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 Scanner input = new Scanner(System.in);

    // Get 3 input values for angles
    int counter = input.nextInt();

while(counter>=1) {
	
	System.out.println( counter);
	counter--;
}
System.out.println("rocket launched");
input.close();
	}
}
