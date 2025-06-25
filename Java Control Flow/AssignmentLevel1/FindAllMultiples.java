package AssignmentLevel1;
import java.util.Scanner;
public class FindAllMultiples {
	Scanner input = new Scanner(System.in);
	int total=0 ;
   
    int number = input.nextInt();
    
        while (true) {
            System.out.print("Enter a number: ");
            number = input.nextInt();
            if (number == 0) {
                break; 
            }

            total += number;
        }

       
        System.out.println("Total sum = " + total);

        sc.close();
    }

	}

    }
}
