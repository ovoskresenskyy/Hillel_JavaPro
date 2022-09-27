package HW_5;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static char[] reversedText;
    public static int reverseIndex;
    public static final char SEPARATOR = 'Z';

    public static void main(String[] args) {
        reverse();
        calculator();
    }

    private static void reverse() {
        String text = "ZknahTZuoyZ,doGZiZmaZtonZ!lacsom";
        String reversedText = reverse(text);

        System.out.println("1. Reverse");
        System.out.println(text);
        System.out.println(reversedText);
        System.out.println();
    }

    private static String reverse(String text) {

        reversedText = new char[text.length()];
        reverseIndex = 0;

        Stack<Character> stack = new Stack();

        for (char character : text.toCharArray()) {
            if (character == SEPARATOR && !stack.isEmpty()) {
                getFromStack(stack);
            } else {
                stack.push(character);
            }
        }
        getFromStack(stack);

        return String.copyValueOf(reversedText);
    }

    private static void getFromStack(Stack<Character> stack) {
        char symbolFromStack;
        while (!stack.isEmpty()) {
            symbolFromStack = stack.pop();
            reversedText[reverseIndex++] = symbolFromStack == SEPARATOR ? ' ' : symbolFromStack;
        }
        stack.push(SEPARATOR);
    }

    private static boolean calculatorIsOn = true;

    private static void calculator() {
        System.out.println("2. Simple calculator");

        Scanner scanner = new Scanner(System.in);
        do {
            calculate(scanner);
        } while (calculatorIsOn);
        scanner.close();
    }

    private static void calculate(Scanner scanner) {

        String userInput = getOperation(scanner);

        if (userInput.equals("Exit")) {
            calculatorIsOn = false;
        } else {
            char operation = userInput.charAt(0);

            if (operationIsAvailable(operation)) {
                System.out.print("Insert the first number: ");
                double firstNumber = scanner.nextDouble();
                System.out.print("Insert the second number: ");
                double secondNumber = scanner.nextDouble();

                double value = getValue(firstNumber, operation, secondNumber);

                System.out.println(firstNumber + " " + operation + " " + secondNumber + " = " + value);
            }
        }

    }

    private static boolean operationIsAvailable(char operation) {
        return switch (operation) {
            case '+', '-', '*', '/' -> true;
            default -> false;
        };
    }

    private static String getOperation(Scanner scanner) {
        System.out.println("Lets calculate!");
        System.out.println("Available operations: +, -, *, / or 'Exit' to close calculator");
        System.out.print("Insert operation: ");
        return scanner.next();
    }

    private static double getValue(double firstNumber, char operation, double secondNumber) {
        return switch (operation) {
            case '-' -> firstNumber - secondNumber;
            case '*' -> firstNumber * secondNumber;
            case '/' -> firstNumber / secondNumber;
            default -> firstNumber + secondNumber;
        };
    }

}
