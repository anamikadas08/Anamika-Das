

import java.util.Scanner;

class Calculator {

    public double calculate(double a, double b, String operation) {

        if (operation.equals("+")) {
            return a + b;
        } 
        else if (operation.equals("-")) {
            return a - b;
        } 
        else if (operation.equals("*")) {
            return a * b;
        } 
        else if (operation.equals("/")) {
            if (b == 0) {
                System.out.println("Error: Division by zero is not allowed.");
                return 0;
            }
            return a / b;
        } 
        else {
            System.out.println("Invalid operation.");
            return 0;
        }
    }
}

public class Problem1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of a: ");
        double a = sc.nextDouble();

        System.out.print("Enter value of b: ");
        double b = sc.nextDouble();

        System.out.print("Enter operation (+, -, *, /): ");
        String operation = sc.next();

        Calculator calc = new Calculator();
        double result = calc.calculate(a, b, operation);

        System.out.println("Result: " + result);

        sc.close();
    }
}