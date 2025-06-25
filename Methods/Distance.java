package Methods;
import java.util.Scanner;
public class Distance {
	  public static double calculateRounds(double side1, double side2, double side3) {
	        double perimeter = side1 + side2 + side3;
	        double distanceToRun = 5000.0; 
	        return distanceToRun / perimeter;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);
        
        // Get user input
System.out.print("Enter side 1 of the triangle in meters: ");
double side1 = scanner.nextDouble();
System.out.print("Enter side 2 of the triangle in meters: ");
double side2 = scanner.nextDouble();
System.out.print("Enter side 3 of the triangle in meters: ");
double side3 = scanner.nextDouble();
if (side1 + side2 > side3 && side2 + side3 > side1 && side3 + side1 > side2) {
 
    double rounds = calculateRounds(side1, side2, side3);
    System.out.printf("The athlete must complete approximately %.2f rounds to run 5 km.\n", rounds);
} else {
    System.out.println("The entered sides do not form a valid triangle.");
}

scanner.close();
	}
}
