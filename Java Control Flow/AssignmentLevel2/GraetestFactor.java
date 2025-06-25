package AssignmentLevel2;
import java.util.Scanner;
public class GraetestFactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Create a Scanner Object
	      Scanner input = new Scanner(System.in);

	      System.out.println("Enter a number");
	      int number = input.nextInt();
int  greatestFactor =1;
int counter=number-1;
while(counter>1) {
if(number%counter==0) {
	greatestFactor=counter;

break;
}
counter--;
}
System.out.println(greatestFactor);
input.close();
	}

}
