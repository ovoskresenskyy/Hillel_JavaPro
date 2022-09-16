package HW_3;

public class Main {
    public static void main(String[] args) {
        Mono depositCalculator = new Mono(new User("Alexandr", "Voskresenskyy"), 10_000);
        depositCalculator.printReport();
    }
}
