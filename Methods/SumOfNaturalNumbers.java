package Methods;
import java.util.Scanner;
public class SumOfNaturalNumbers {
	public static  int findSum(int number) {
		int sum=0;
		for(int i=1;i<=number;i++) {
		sum +=i;
		}
		return sum ;
	}
	
public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
 System.out.print("Enter the positive integer: ");
int number = sc.nextInt();
if(number<=0) {
	System.out.println("Invalid Number");
}
else {
	int result=findSum(number);
  System.out.println(result);
  sc.close();

    }
}
}
	
