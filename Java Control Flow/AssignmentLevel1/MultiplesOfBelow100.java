package AssignmentLevel1;
import java.util.Scanner;
public class MultiplesOfBelow100 {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Input number from user
	        System.out.print("Enter a positive number less than 100: ");
	        int number = sc.nextInt();

	        // Check if valid input
	        if (number <= 0 || number >= 100) {
	            System.out.println("Invalid input! Number must be > 0 and < 100.");
	        } else {
	            int counter = number - 1;

	            System.out.println("Multiples of " + number + " below 100 are:");

	            while (counter > 1) {
	                // If counter is a multiple of the number
	                if (counter % number == 0) {
	                    System.out.println(counter);
	                }
	                counter--;
	            }
	        }

	        sc.close();
	    }
	}
