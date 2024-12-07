import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Temperature Converter");
        System.out.println("1. Convert Celsius to Fahrenheit");
        System.out.println("2. Convert Fahrenheit to Celsius");


        System.out.print("Enter your choice (1 or 2): ");
        int choice = scanner.nextInt(); 


        System.out.print("Enter the temperature: ");
        double temperature = scanner.nextDouble();


        if (choice == 1) {
            double fahrenheit = temperature * 9 / 5 + 32;
            System.out.printf("%.2f°C is equal to %.2f°F%n", temperature, fahrenheit);
        } else if (choice == 2) {
            double celsius = (temperature - 32) * 5 / 9;
            System.out.printf("%.2f°F is equal to %.2f°C%n", temperature, celsius);
        } else {
            System.out.println("Invalid choice. Please restart the program and try again.");
        }

        scanner.close();
    }
}
