import java.util.Scanner;

class Calculator {
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public double divide(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("Error! Division by zero is undefined.");
            return Double.NaN;
        }
        return (double) num1 / num2;
    }
}

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.println("Select operation:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");

        while (true) {
            System.out.print("Enter choice (1/2/3/4): ");
            int choice = scanner.nextInt();

            System.out.print("Enter first number: ");
            int num1 = scanner.nextInt();
            System.out.print("Enter second number: ");
            int num2 = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Result: " + calculator.add(num1, num2));
                    break;
                case 2:
                    System.out.println("Result: " + calculator.subtract(num1, num2));
                    break;
                case 3:
                    System.out.println("Result: " + calculator.multiply(num1, num2));
                    break;
                case 4:
                    System.out.println("Result: " + calculator.divide(num1, num2));
                    break;
                default:
                    System.out.println("Invalid input");
            }

            System.out.print("Do you want to perform another calculation? (yes/no): ");
            String nextCalculation = scanner.next();
            if (!nextCalculation.equalsIgnoreCase("yes")) {
                break;
            }
        }

        scanner.close();
    }
}
