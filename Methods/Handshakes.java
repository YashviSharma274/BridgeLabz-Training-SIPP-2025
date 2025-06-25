package Methods;

import java.util.Scanner;

public class Handshakes{

    public static int calculateHandshakes(int numberOfStudents) {
        return (numberOfStudents * (numberOfStudents - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        if (numberOfStudents < 0) {
            System.out.println("Invalid number of students.");
        } else {
            int handshakes = calculateHandshakes(numberOfStudents);
            System.out.println("Maximum number of handshakes possible: " + handshakes);
        }

        scanner.close();
    }
}
