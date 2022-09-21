package HW_4;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
    }

    static void printThreeWords() {
        System.out.print("""
                Orange
                Banana
                Apple""");
    }

    static void checkSumSign() {
        int minValue = -100;
        int maxValue = 100;

        int a = (int) ((Math.random() * (maxValue - minValue)) + minValue);
        int b = (int) ((Math.random() * (maxValue - minValue)) + minValue);
        int sum = a + b;

        System.out.println("a + b = " + sum);
        System.out.println("Sum of a and b is " + (sum >= 0 ? "positive" : "negative"));
    }
}
