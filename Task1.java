package Bank_Managment;

import java.util.Scanner;

public class Task1 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {

            showMenu();
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    celsiusConverter();
                    break;

                case 2:
                    fahrenheitConverter();
                    break;

                case 3:
                    kelvinConverter();
                    break;

                case 4:
                    System.out.println("\nThank you for using Temperature Converter!");
                    sc.close();
                    return;

                default:
                    System.out.println("\nInvalid choice! Try again.");
            }
        }
    }

    // Display Menu
    public static void showMenu() {
        System.out.println("\n===== Temperature Converter =====");
        System.out.println("1. Celsius to Fahrenheit & Kelvin");
        System.out.println("2. Fahrenheit to Celsius & Kelvin");
        System.out.println("3. Kelvin to Celsius & Fahrenheit");
        System.out.println("4. Exit");
        System.out.print("Enter choice: ");
    }

    // Celsius Conversion
    public static void celsiusConverter() {

        System.out.print("\nEnter temperature in Celsius: ");
        double c = sc.nextDouble();

        double f = (c * 9 / 5) + 32;
        double k = c + 273.15;

        System.out.println("Fahrenheit: " + f);
        System.out.println("Kelvin: " + k);
    }

    // Fahrenheit Conversion
    public static void fahrenheitConverter() {

        System.out.print("\nEnter temperature in Fahrenheit: ");
        double f = sc.nextDouble();

        double c = (f - 32) * 5 / 9;
        double k = c + 273.15;

        System.out.println("Celsius: " + c);
        System.out.println("Kelvin: " + k);
    }

    // Kelvin Conversion
    public static void kelvinConverter() {

        System.out.print("\nEnter temperature in Kelvin: ");
        double k = sc.nextDouble();

        double c = k - 273.15;
        double f = (c * 9 / 5) + 32;

        System.out.println("Celsius: " + c);
        System.out.println("Fahrenheit: " + f);
    }
}