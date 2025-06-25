package AssignmentLevel1;
import java.util.Scanner;
public class FindSumNumbersUntilZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        
        double total = 0.0;
        double number;

        System.out.println("Enter numbers to add (Enter 0 to stop):");

        
        while (true) {
            System.out.print("Enter a number: ");
            number = sc.nextDouble();
            if (number == 0) {
                break; 
            }

            total += number;
        }

       
        System.out.println("Total sum = " + total);

        sc.close();
    }

	}


