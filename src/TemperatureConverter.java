import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice;

        do {
            System.out.println("Temperature Converter");
            System.out.println("1. Celsius to Fahrenheit");
            System.out.println("2. Fahrenheit to Celsius");
            System.out.println("3. Celsius to Kelvin");
            System.out.println("4. Kelvin to Celsius");
            System.out.println("5. Fahrenheit to Kelvin");
            System.out.println("6. Kelvin to Fahrenheit");
            System.out.println("Enter your choice (1-6) or 'q' to quit:");
            choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Enter temperature in Celsius: ");
                    double celsius = scanner.nextDouble();
                    double fahrenheit = celsiusToFahrenheit(celsius);
                    System.out.printf("%.2f Celsius is %.2f Fahrenheit%n", celsius, fahrenheit);
                    break;
                case "2":
                    System.out.print("Enter temperature in Fahrenheit: ");
                    fahrenheit = scanner.nextDouble();
                    celsius = fahrenheitToCelsius(fahrenheit);
                    System.out.printf("%.2f Fahrenheit is %.2f Celsius%n", fahrenheit, celsius);
                    break;
                case "3":
                    System.out.print("Enter temperature in Celsius: ");
                    celsius = scanner.nextDouble();
                    double kelvin = celsiusToKelvin(celsius);
                    System.out.printf("%.2f Celsius is %.2f Kelvin%n", celsius, kelvin);
                    break;
                case "4":
                    System.out.print("Enter temperature in Kelvin: ");
                    kelvin = scanner.nextDouble();
                    celsius = kelvinToCelsius(kelvin);
                    System.out.printf("%.2f Kelvin is %.2f Celsius%n", kelvin, celsius);
                    break;
                case "5":
                    System.out.print("Enter temperature in Fahrenheit: ");
                    fahrenheit = scanner.nextDouble();
                    kelvin = fahrenheitToKelvin(fahrenheit);
                    System.out.printf("%.2f Fahrenheit is %.2f Kelvin%n", fahrenheit, kelvin);
                    break;
                case "6":
                    System.out.print("Enter temperature in Kelvin: ");
                    kelvin = scanner.nextDouble();
                    fahrenheit = kelvinToFahrenheit(kelvin);
                    System.out.printf("%.2f Kelvin is %.2f Fahrenheit%n", kelvin, fahrenheit);
                    break;
                case "q":
                case "Q":
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            scanner.nextLine(); // Consume newline left-over
        } while (!choice.equalsIgnoreCase("q"));

        scanner.close();
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    public static double fahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9 + 273.15;
    }

    public static double kelvinToFahrenheit(double kelvin) {
        return (kelvin - 273.15) * 9 / 5 + 32;
    }
}