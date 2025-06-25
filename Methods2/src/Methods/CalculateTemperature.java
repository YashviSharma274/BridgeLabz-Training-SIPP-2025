package Methods;
import java.util.Scanner;
public class CalculateTemperature {
	public static double calculateWindChill(double temperature, double windSpeed) {
		double windChill=35.74+0.6215*temperature+(0.4275*temperature-35.75)*0.16*windSpeed;
	
	return windChill;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter temperature: ");
        double temperature = scanner.nextDouble();
        System.out.print("Enter windSpeed: ");
        double windSpeed = scanner.nextDouble();
        double result=calculateWindChill(temperature,windSpeed);
     System.out.println(result);
     scanner.close();
	}

}
