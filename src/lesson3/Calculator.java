package lesson3;

import java.util.Scanner;

public class Calculator {
    public static double sum(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtraction(double num1, double num2) {return num1 - num2;}

    public static double multiplication(double num1, double num2) {return num1 * num2;}

    public static double division(double num1, double num2) {return num1 / num2;}

    public static void start() {
        Scanner scannerLine = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        double number1 = scannerLine.nextDouble();
        System.out.println("Choose the operation");
        String operation = scanner.nextLine();
        System.out.println("Enter the second number:");
        double number2 = scanner.nextDouble();
        switch (operation) {
            case ("+"): {
                System.out.println(sum(number1, number2));
                break;
            }
            case ("-") : {
                System.out.println(subtraction(number1, number2));
                break;
            }
            case ("*") : {
                System.out.println(multiplication(number1, number2));
                break;
            }
            case ("/") : {
                System.out.println(division(number1, number2));
                break;
            }
        }
        System.out.println("Repeat? (y - yes, another button for exit)");
        String answer = scannerLine.nextLine();
        System.out.println(answer);
        if (scannerLine.hasNext("exit")) end();
        else start();
    }

    public static void end() {
        System.out.println("Calculator ending...");
    }

    public static void main(String[] args) {
        System.out.println("Calculator starting...");
        start();
    }
}

