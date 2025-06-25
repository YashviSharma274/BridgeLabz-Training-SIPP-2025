package AssignmentLevel2;
import java.util.Scanner;
public class BMIOfAPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner input = new Scanner(System.in);
		  System.out.println("Enter weight");
		  
	      double weight = input.nextDouble();
	      System.out.println("Enter height");
	      double height=input.nextDouble();
	      double bmi=weight/(height*height);
	      double result=bmi/100.0;
	      if(result<=18.4) {
	    	  System.out.println("Underweight");
	      }
	      else if(result>=18.5 && result<=24.9) {
	    	  System.out.println("Normal");
	      }
	      else if(result>=25.0 && result<=39.9) {
	    	  System.out.println("Overweight");
	      }
	      else if(result>=40.0) {
	    	  System.out.println("Obese");
	      }
input.close();
	}

}
