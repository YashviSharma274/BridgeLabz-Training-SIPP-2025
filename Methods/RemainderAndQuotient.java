package Methods;
import java.util.Scanner;
public class RemainderAndQuotient {

    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int[] result = new int[2];

        if (divisor == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return null;
        }

        result[0] = number / divisor;
        result[1] = number % divisor;
        return result;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
       System.out.print("Enter the dividend (number): ");
        int number=scanner.nextInt();
           System.out.print("Enter the divisor: ");
        int divisor=scanner.nextInt();
        int[] result=findRemainderAndQuotient(number, divisor);
          if (result!= null) {
            System.out.println("Quotient = " + result[0]);
            System.out.println("Remainder = " + result[1]);
        }

        scanner.close();
    }
}
	


