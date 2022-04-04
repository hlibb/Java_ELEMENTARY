package lesson4;

import java.util.Scanner;

public class Calculator {
    private double currentValue = 0;
    private final String[] commands = new String[]{"+", "-", "*", "/"};
    private final String[] controlCommands = new String[]{"c", "<-"};
    private final String[] numbers = new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    private final char[] numbersToChar = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

    public Calculator() {
    }

    public Calculator(double currentValue) {
        this.currentValue = currentValue;
    }

    public double sum(double num1, double num2) {
        currentValue = num1 + num2;
        return currentValue;
    }

    public double subtraction(double num1, double num2) {
        currentValue = num1 - num2;
        return currentValue;
    }

    public double multiplication(double num1, double num2) {
        currentValue = num1 * num2;
        return currentValue;
    }

    public double division(double num1, double num2) {
        currentValue = num1 / num2;
        return currentValue;
    }

    public void commandC() {
        currentValue = 0;
        calculatorLook();
    }

    public void commandBackspace() { //only for currentValue
        double number = currentValue;
        String numberStr = Double.toString(number);
        int i = 0;
        while (numberStr.toCharArray()[numberStr.length() - 1] == '.' | numberStr.toCharArray()[numberStr.length() - 1] == '0') {
            i++;
            String numberStrEdited = numberStr.substring(0, numberStr.length() - i);
            if ((numberStrEdited.toCharArray()[numberStrEdited.length() - 1] != ('.')) & (numberStrEdited.toCharArray()[numberStrEdited.length() - 1] != ('0'))) {
                if (numberStrEdited.length() == 1) {
                    commandC();
                    break;
                }
                numberStrEdited = numberStrEdited.substring(0, numberStr.length() - (i + 1));
                currentValue = Double.parseDouble(numberStrEdited);
                calculatorLook();
                break;
            }
        }
        if (!(numberStr.toCharArray()[numberStr.length() - 1] == '.' | numberStr.toCharArray()[numberStr.length() - 1] == '0')) {
            String numberStrEdited = numberStr.substring(0, numberStr.length() - (i + 1));
            currentValue = Double.parseDouble(numberStrEdited);
            calculatorLook();
        }
    }

    public boolean stringIsDouble(String string) {
        char[] stringInCharArray = string.toCharArray();
        boolean isDouble = false;
        int countOfComas = 0;
        if (string.length() > 12) {
            System.err.println("Too many characters in your double value!");
            return false;
        }
        for (int i = 0; i < string.length(); i++) {
            if (isNumber(stringInCharArray[i])) isDouble = true;
            else if (stringInCharArray[i] == ('.')) {
                if (countOfComas < 1) {
                    countOfComas++;
                } else System.err.println("Too many comas in your double value!");
            } else return false;
        }
        return isDouble;
    }

    private boolean isNumber(char number) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbersToChar[i] == number) return true;
        }
        return false;
    }

    public boolean isCommand(String command) {
        for (String s : commands) {
            if (s.equals(command)) return true;
        }
        return false;
    }

    public boolean isControlCommand(String controlCommand) {
        for (String s : controlCommands) {
            if (s.equals(controlCommand)) return true;
        }
        return false;
    }

    public void useCommand(double currentValue, String command, double secondNumber) {
        switch (command) {
            case ("+"): {
                this.currentValue = sum(currentValue, secondNumber);
                break;
            }
            case ("-"): {
                this.currentValue = subtraction(currentValue, secondNumber);
                break;
            }
            case ("*"): {
                this.currentValue = multiplication(currentValue, secondNumber);
                break;
            }
            case ("/"): {
                this.currentValue = division(currentValue, secondNumber);
                break;
            }
        }
    }

    public void useControlCommand(String controlCommand) {
        if (controlCommand.equals("c")) {
            commandC();
        }
        if (controlCommand.equals("<-")) {
            commandBackspace();
        }
    }

    public void launch() {
        Scanner sc = new Scanner(System.in);
        while (!sc.hasNext("exit")) {
            String strIn = sc.nextLine();
            if (stringIsDouble(strIn)) {
                currentValue = Double.parseDouble((strIn));
                calculatorLook();
            } else if (isCommand(strIn)) {
                String secondNumberStr = sc.nextLine();
                if (stringIsDouble(secondNumberStr)) {
                    double secondNumber = Double.parseDouble(secondNumberStr);
                    useCommand(currentValue, strIn, secondNumber);
                    calculatorLook();
                }
            } else if (isControlCommand(strIn)) {
                useControlCommand(strIn);
            } else System.err.println("Error: unknown character");
        }
    }

    public void calculatorLook() {
        System.out.printf(" ----------------\n" +
                "|%15.2f |\n" +
                "| c   /   *   <- |\n" +
                "| 1   2   3   -  |\n" +
                "| 4   5   6   +  |\n" +
                "| 7   8   9      |\n" +
                "|     0   ,      |\n" +
                " ----------------\n", this.currentValue);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.calculatorLook();
        calculator.launch();
    }
}
