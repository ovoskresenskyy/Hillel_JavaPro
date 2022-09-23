package HW_5;

import java.util.Stack;

public class Main {

    public static char[] reversedText;
    public static int reverseIndex;
    public static final char SEPARATOR = 'Z';

    public static void main(String[] args) {

        String text = "ZknahTZuoyZ,doGZiZmaZtonZ!lacsom";
        String reversedText = reverse(text);

        System.out.println(text);
        System.out.println(reversedText);
    }

    public static String reverse(String text) {

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
}
