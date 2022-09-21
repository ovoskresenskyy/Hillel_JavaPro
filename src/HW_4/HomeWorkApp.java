package HW_4;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        sumInRange();
        isNumberPositive();
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

    static void sumInRange(){
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

    static void isNumberPositive(){
        int a = getRandomInt(-10, 10);

        System.out.println("6. Is number positive");
        System.out.println("a = " + a);
        System.out.println("It's " + (isNumberPositive(a) ? "positive" : "negative"));
        System.out.println();
    }

    static boolean isNumberPositive(int number){
        return number >= 0;
    }

    static int getRandomInt(int minValue, int maxValue) {
        return (int) ((Math.random() * (maxValue - minValue)) + minValue);
    }
}
