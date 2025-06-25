package AssignmentLevel1;
import java.util.Scanner;
public class LargestAmongThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

	      // Get 3 input values for angles
	      int x = input.nextInt();
	      int y = input.nextInt();
	      int z = input.nextInt();
        if(x>y && x>y) {
        	System.out.println("Is the first number the largest?Yes");
        	System.out.println("Is the second number the largest? No");
        	System.out.println("Is the third number the largest? No");
        }
        else if(y>x && y>z) {
        	System.out.println("Is the first number the largest?No");
        	System.out.println("Is the second number the largest? Yes");
        	System.out.println("Is the third number the largest? No");
        }
        else {
        	System.out.println("Is the first number the largest?no");
        	System.out.println("Is the second number the largest? No");
        	System.out.println("Is the third number the largest? yes");
        }
        
	input.close();
	}
	}


