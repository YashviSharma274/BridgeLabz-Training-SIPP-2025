package AssignmentLevel1;
import java.util.Scanner;
public class PowerNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input = new Scanner(System.in);
int result=1;
int counter=0;
	      // Get 3 input values for angles
	      int number= input.nextInt();
	      int power = input.nextInt();
while(counter==power)
{
 result=result*number;
 counter++;
 System.out.println(result);
}
input.close();
}
}
