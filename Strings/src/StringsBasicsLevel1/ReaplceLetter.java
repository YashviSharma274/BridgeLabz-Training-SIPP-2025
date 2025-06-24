package StringsBasicsLevel1;
import java.util.*;
public class ReaplceLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter your string");
        String input=sc.next();
        String result="";
       for(int i=0;i<input.length();i++) {
    	   if(input.charAt(i)=='e') {
    		   result+='i';
    	   
    		   }else {
    			   result+=input.charAt(i);
    	   }
       }
       System.out.println(result);
      
        
	}

}
