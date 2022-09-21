package HW_4;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
    }

    static void printThreeWords() {
        System.out.println("""
                Orange
                Banana
                Apple
                """);
    }

    static void checkSumSign() {
        int minValue = -100;
        int maxValue = 100;

        int a = (int) ((Math.random() * (maxValue - minValue)) + minValue);
        int b = (int) ((Math.random() * (maxValue - minValue)) + minValue);
        int sum = a + b;

        System.out.println("a + b = " + sum + ". Sum is " + (sum >= 0 ? "positive" : "negative"));
        System.out.println();
    }

    static void printColor() {
        int minValue = -200;
        int maxValue = 200;

        int value = (int) ((Math.random() * (maxValue - minValue)) + minValue);

        String color;

        if (value <= 0) color = "Red";
        else if (value > 100) color = "Green";
        else color = "Yellow";

        System.out.println("value = " + value + ". Match color - " + color);
        System.out.println();
    }
}
