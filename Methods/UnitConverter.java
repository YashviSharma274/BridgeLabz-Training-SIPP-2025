package Methods;

public class UnitConverter {

    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double convertPoundsToKilograms(double pounds) {
        return pounds * 0.453592;
    }

    public static double convertKilogramsToPounds(double kilograms) {
        return kilograms * 2.20462;
    }

    public static double convertGallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }

    public static double convertLitersToGallons(double liters) {
        return liters * 0.264172;
    }
    public class Main {
        public static void main(String[] args) {
            System.out.println("98°F to °C: " + UnitConverter.convertFahrenheitToCelsius(98));
            System.out.println("37°C to °F: " + UnitConverter.convertCelsiusToFahrenheit(37));
            System.out.println("150 lbs to kg: " + UnitConverter.convertPoundsToKilograms(150));
            System.out.println("68 kg to lbs: " + UnitConverter.convertKilogramsToPounds(68));
            System.out.println("10 gallons to liters: " + UnitConverter.convertGallonsToLiters(10));
            System.out.println("20 liters to gallons: " + UnitConverter.convertLitersToGallons(20));
        }
    }

}
