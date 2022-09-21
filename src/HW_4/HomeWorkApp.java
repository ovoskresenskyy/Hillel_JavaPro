package HW_4;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
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
        System.out.println("Sum is " + (sum >= 0 ? "positive" : "negative"));
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

    static int getRandomInt(int minValue, int maxValue){
        return (int) ((Math.random() * (maxValue - minValue)) + minValue);
    }
}
