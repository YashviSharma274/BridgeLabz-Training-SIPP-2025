package AssignmentLevel1;
import java.util.Scanner;
public class PowerOfANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input = new Scanner(System.in);
            int result=1;
	      // Get 3 input values for angles
	      int number = input.nextInt();
	      int power = input.nextInt();
for(int i=1;i<=power;i++) {
	result=result*number;
}
System.out.println(result);
input.close();
	}

}






