package AssignmentLevel1;
import java.util.Scanner;
public class Soln1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input = new Scanner(System.in);
		 int x = input.nextInt();
		 if(x%5==0) {
			 System.out.println("Is the number"+x+" divisible by 5?True");
		 }
		 else {
			 System.out.println("Is the number"+x+" divisible by 5?False");
		 }
		 input.close();
	}

}
