package HW_4;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        sumInRange();
        isNumberPositive();
        printInCycle();
        isYearLeap();
    }

    static void printThreeWords() {
        System.out.println("1. Print three words");
        System.out.println("""
                Orange
                Banana
                Apple
                """);
    }

    static void checkSumSign() {
        int a = getRandomInt(-100, 100);
        int b = getRandomInt(-100, 100);
        int sum = a + b;

        System.out.println("2. Check sum sign");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("a + b = " + sum);
        System.out.println("Sum is " + (isNumberPositive(sum) ? "positive" : "negative"));
        System.out.println();
    }

    static void printColor() {
        int value = getRandomInt(-200, 200);

        String color;

        if (value <= 0) color = "Red";
        else if (value > 100) color = "Green";
        else color = "Yellow";

        System.out.println("3. Print color");
        System.out.println("value = " + value + ".\nMatch color: " + color);
        System.out.println();
    }

    static void compareNumbers() {
        int a = getRandomInt(-100, 100);
        int b = getRandomInt(-100, 100);

        System.out.println("4. Compare numbers");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println(a >= b ? "a >= b" : "a < b");
        System.out.println();
    }

    static void sumInRange() {
        int a = getRandomInt(-20, 20);
        int b = getRandomInt(-20, 20);

        System.out.println("5. Sum in range from 10 to 20 including");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("is (a + b) in range? - " + sumInRange(a, b));
        System.out.println();
    }

    static boolean sumInRange(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    static void isNumberPositive() {
        int a = getRandomInt(-10, 10);

        System.out.println("6. Is number positive");
        System.out.println("a = " + a);
        System.out.println("It's " + (isNumberPositive(a) ? "positive" : "negative"));
        System.out.println();
    }

    static boolean isNumberPositive(int number) {
        return number >= 0;
    }

    static void printInCycle() {
        String text = "Hillel";
        int quantity = getRandomInt(-10, 10);

        System.out.println("7. Printing in cycle");
        System.out.println("Text: " + text);
        System.out.println("Quantity: " + quantity);
        if (isNumberPositive(quantity - 1)) {
            printInCycle(text, quantity);
        } else System.out.println("Cant print. Quantity must be > 0");
        System.out.println();
    }

    static void printInCycle(String text, int qty) {
        for (int i = 0; i < qty; i++) {
            System.out.println(" - " + (i + 1) + ". " + text);
        }
    }

    static void isYearLeap() {
        int[] yearsArray = {1895, 1896, 1897, 1900, 1901, 1996, 1997, 1999, 2000, 2001, 2004, 2100};

        System.out.println("8. Is year leap");
        for (int year: yearsArray) {
            System.out.println(year + (isYearLeap(year) ? " is leap" : " is not leap"));
        }
        System.out.println();
    }

    static boolean isYearLeap(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }


    static int getRandomInt(int minValue, int maxValue) {
        return (int) ((Math.random() * (maxValue - minValue)) + minValue);
    }
}
