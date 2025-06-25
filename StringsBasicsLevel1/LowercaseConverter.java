package StringsBasicsLevel1;
import java.util.Scanner;
public class LowercaseConverter {
	 public static String convertToLowerManual(String input) {
	String result="";
	for(int i=0;i<input.length();i++){
		char ch=input.charAt(i);
		if(ch >='A'&& ch<='Z') {
			ch=(char)(ch+32);
		}
		result+=ch;
	}
	return result;
	 }
	 public static boolean compareStrings(String s1, String s2) {
	        if (s1.length() != s2.length()) {
	            return false;
	        }
 for (int i = 0; i < s1.length(); i++) {
	            if (s1.charAt(i) != s2.charAt(i)) {
	                return false;
	            }
	        }
 return true;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner=new Scanner(System.in);
System.out.println("Enter your text: ");
String input=scanner.nextLine();
String builtInLower = input.toLowerCase();
String manualLower = convertToLowerManual(input);
boolean areEqual = compareStrings(builtInLower, manualLower);
System.out.println("\nManual Conversion: " + manualLower);
System.out.println("Built-in Conversion: " + builtInLower);
System.out.println("Are both equal? " + areEqual);
//	input.close();
	}

} 



