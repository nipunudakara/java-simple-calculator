import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double num1, num2;
        char operator;
        double result;

        System.out.println("Simple Java Calculator");
        System.out.println("--------------------");

        System.out.print("Enter first number: ");
        num1 = input.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        operator = input.next().charAt(0);

        System.out.print("Enter second number: ");
        num2 = input.nextDouble();

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println(num1 + " / " + num2 + " = " + result);
                } else {
                    System.out.println("Error: Cannot divide by zero.");
                }
                break;
            default:
                System.out.println("Error: Invalid operator. Use +, -, *, or /.");
        }

        input.close();
    }
}
