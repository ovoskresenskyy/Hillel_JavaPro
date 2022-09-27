package HW_5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        reverseEachWordInSentence("ZknahTZuoyZ,doGZiZmaZtonZ!lacsom", "Z");
        simpleCalculator();
    }

    private static void reverseEachWordInSentence(String sentence, String separator) {
        String[] words = sentence.split(separator);

        for (String word : words) {
            System.out.print(new StringBuilder(word).reverse() + " ");
        }
    }

    private static boolean calculatorIsOn = true;

    private static void simpleCalculator() {
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
