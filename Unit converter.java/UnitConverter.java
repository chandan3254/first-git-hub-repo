import java.util.Scanner;

public class UnitConverter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.println("\n===== Unit Converter =====");
            System.out.println("1. Temperature Conversion");
            System.out.println("2. Length Conversion");
            System.out.println("3. Weight Conversion");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    convertTemperature(sc);
                    break;
                case 2:
                    convertLength(sc);
                    break;
                case 3:
                    convertWeight(sc);
                    break;
                case 4:
                    System.out.println("Exiting... Thank you!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }

    //  Temperature Conversion
    private static void convertTemperature(Scanner sc) {
        System.out.println("\nTemperature Conversion:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Celsius to Kelvin");
        System.out.print("Enter your choice: ");
        int tempChoice = sc.nextInt();
        System.out.print("Enter value: ");
        double value = sc.nextDouble();

        switch (tempChoice) {
            case 1:
                System.out.println("Result: " + (value * 9/5 + 32) + " °F");
                break;
            case 2:
                System.out.println("Result: " + ((value - 32) * 5/9) + " °C");
                break;
            case 3:
                System.out.println("Result: " + (value + 273.15) + " K");
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }

    // Length Conversion
    private static void convertLength(Scanner sc) {
        System.out.println("\nLength Conversion:");
        System.out.println("1. Meters to Kilometers");
        System.out.println("2. Feet to Inches");
        System.out.println("3. Centimeters to Meters");
        System.out.print("Enter your choice: ");
        int lengthChoice = sc.nextInt();
        System.out.print("Enter value: ");
        double value = sc.nextDouble();

        switch (lengthChoice) {
            case 1:
                System.out.println("Result: " + (value / 1000) + " km");
                break;
            case 2:
                System.out.println("Result: " + (value * 12) + " inches");
                break;
            case 3:
                System.out.println("Result: " + (value / 100) + " meters");
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }

    // Weight Conversion
    private static void convertWeight(Scanner sc) {
        System.out.println("\nWeight Conversion:");
        System.out.println("1. Kilograms to Grams");
        System.out.println("2. Pounds to Kilograms");
        System.out.println("3. Ounces to Grams");
        System.out.print("Enter your choice: ");
        int weightChoice = sc.nextInt();
        System.out.print("Enter value: ");
        double value = sc.nextDouble();

        switch (weightChoice) {
            case 1:
                System.out.println("Result: " + (value * 1000) + " g");
                break;
            case 2:
                System.out.println("Result: " + (value * 0.453592) + " kg");
                break;
            case 3:
                System.out.println("Result: " + (value * 28.3495) + " g");
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }
}