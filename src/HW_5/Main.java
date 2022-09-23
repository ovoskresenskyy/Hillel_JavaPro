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

    private static void reverse(){
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

    private static void calculator() {
        System.out.println("2. Simple calculator");

        Scanner scanner = new Scanner(System.in);

        double firstValue = getValue(scanner);
        char operation = getOperation(scanner);
        double secondValue = getValue(scanner);

        calculate(firstValue, operation, secondValue);
    }

    private static double getValue(Scanner scanner){
        System.out.print("Insert the number: ");
        return scanner.nextInt();
    }

    private static char getOperation(Scanner scanner) {
        System.out.println("Available operations: +, -, *, /");
        System.out.print("Insert operation: ");
        return scanner.next().charAt(0);
    }

    private static void calculate(double firstValue, char operation, double secondValue){
        String textToPrint = firstValue
                + " " + operation
                + " " + secondValue
                + " = " + switch (operation){
            case ('+') -> firstValue + secondValue;
            case ('-') -> firstValue - secondValue;
            case ('*') -> firstValue * secondValue;
            case ('/') -> firstValue / secondValue;
            default -> "Operation is not available";
        };

        System.out.println(textToPrint);
    }
}
