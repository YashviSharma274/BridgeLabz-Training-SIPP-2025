package AssignmentLevel2;
import java.util.Scanner;
public class HarshadNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input = new Scanner(System.in);
		 System.out.println("Enter the number");
		 int number = input.nextInt();
		 int sum=0;
		 while(number>0) {
			 int digit=number%10;
			 sum+=digit;
			 number=number/10;
		 }
		if(number%sum==0) {
			System.out.println("Harshad Number");
		}
		else {
			System.out.println("Not a Harshad Number");
		}
	}

}
