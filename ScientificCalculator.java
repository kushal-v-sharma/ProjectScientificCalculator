import java.util.Scanner;

public class ScientificCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Scientific Calculator");
        System.out.println("---------------------");
        
        while (true) {
            System.out.println("Choose an operation:");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Exponentiation (^)");
            System.out.println("6. Square Root (√)");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            
            if (choice == 7) {
                System.out.println("Exiting the calculator. Goodbye!");
                break;
            }
            
            double result;
            
            switch (choice) {
                case 1:
                    System.out.print("Enter the first number: ");
                    double num1 = scanner.nextDouble();
                    System.out.print("Enter the second number: ");
                    double num2 = scanner.nextDouble();
                    result = num1 + num2;
                    System.out.println("Result: " + result);
                    break;
                    
                case 2:
                    System.out.print("Enter the first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter the second number: ");
                    num2 = scanner.nextDouble();
                    result = num1 - num2;
                    System.out.println("Result: " + result);
                    break;
                    
                case 3:
                    System.out.print("Enter the first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter the second number: ");
                    num2 = scanner.nextDouble();
                    result = num1 * num2;
                    System.out.println("Result: " + result);
                    break;
                    
                case 4:
                    System.out.print("Enter the dividend: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter the divisor: ");
                    num2 = scanner.nextDouble();
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("Result: " + result);
                    } else {
                        System.out.println("Cannot divide by zero!");
                    }
                    break;
                    
                case 5:
                    System.out.print("Enter the base: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter the exponent: ");
                    num2 = scanner.nextDouble();
                    result = Math.pow(num1, num2);
                    System.out.println("Result: " + result);
                    break;
                    
                case 6:
                    System.out.print("Enter the number: ");
                    num1 = scanner.nextDouble();
                    if (num1 >= 0) {
                        result = Math.sqrt(num1);
                        System.out.println("Result: " + result);
                    } else {
                        System.out.println("Cannot calculate square root of a negative number!");
                    }
                    break;
                    
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
            
            System.out.println();
        }
        
        scanner.close();
    }
}
