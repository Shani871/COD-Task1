import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalculatorOperations calculator = new CalculatorOperations();

        boolean continueCalculation = true;
        while (continueCalculation) {
            System.out.println("Choose an operation:");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Exponentiation (^)");
            System.out.println("6. Quit");

            int choice = scanner.nextInt();
            double result = 0;

            switch (choice) {
                case 1:
                    result = calculator.addition();
                    break;
                case 2:
                    result = calculator.subtraction();
                    break;
                case 3:
                    result = calculator.multiplication();
                    break;
                case 4:
                    result = calculator.division();
                    break;
                case 5:
                    result = calculator.exponentiation();
                    break;
                case 6:
                    continueCalculation = false;
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 6.");
            }

            if (choice >= 1 && choice <= 5) {
                System.out.println("Result: " + result);
            }
        }

        System.out.println("Calculator has been closed.");
        scanner.close();
    }
}

class CalculatorOperations {
    Scanner scanner = new Scanner(System.in);

    double addition() {
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        return num1 + num2;
    }

    double subtraction() {
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        return num1 - num2;
    }

    double multiplication() {
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        return num1 * num2;
    }

    double division() {
        System.out.print("Enter the dividend: ");
        double dividend = scanner.nextDouble();
        System.out.print("Enter the divisor: ");
        double divisor = scanner.nextDouble();
        if (divisor == 0) {
            System.out.println("Error: Cannot divide by zero.");
            return Double.NaN; // NaN (Not a Number) indicates an error
        }
        return dividend / divisor;
    }

    double exponentiation() {
        System.out.print("Enter the base: ");
        double base = scanner.nextDouble();
        System.out.print("Enter the exponent: ");
        double exponent = scanner.nextDouble();
        return Math.pow(base, exponent);
    }
}
