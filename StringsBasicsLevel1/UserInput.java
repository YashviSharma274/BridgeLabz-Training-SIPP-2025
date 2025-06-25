package StringsBasicsLevel1;
import java.util.Scanner;
public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner input=new Scanner(System.in);
  System.out.println("Enter your Name");
  String x=input.nextLine();
  System.out.println(x);
  input.close();
	}

}
