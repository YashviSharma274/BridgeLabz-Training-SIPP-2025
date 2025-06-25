package AssignmentLevel2;
import java.util.Scanner;
public class PrimeNumber{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
        int number = input.nextInt();
        int originalnumber=number;
      int sum=0;
      while(number>0) {
    	  int digit=number%10;
    	  sum+=digit;
    	  number=number/10;
      }
      if(originalnumber%sum==0) {
    	  System.out.println("Harshad NUmber");
      }
      else {
    	  System.out.println("not a Harshad Number");
      }
      input.close();
	}

}
