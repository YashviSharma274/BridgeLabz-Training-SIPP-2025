package Methods;
import java.util.Scanner;

public class NaturalNumberSum {

    // Recursive method to find sum of n natural numbers
    public static int recursiveSum(int n) {
        if (n == 1)
            return 1;
        return n + recursiveSum(n - 1);
    }

    // Method to find sum using formula
    public static int formulaSum(int n) {
        return (n * (n + 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input. Please enter a natural number (positive integer).");
        } else {
            int sumRecursive = recursiveSum(n);
            int sumFormula = formulaSum(n);

            System.out.println("Sum using recursion: " + sumRecursive);
            System.out.println("Sum using formula: " + sumFormula);

            if (sumRecursive == sumFormula) {
                System.out.println("Both results match. The calculation is correct.");
            } else {
                System.out.println("Results do not match. Please check the logic.");
            }
        }

        scanner.close();
    }
}

