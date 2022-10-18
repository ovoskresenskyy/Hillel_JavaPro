package HW_11;

public class Order {
    private static int lastOrderNumber;
    private final int number;
    private final String clientName;

    public Order(String clientName) {
        number = ++lastOrderNumber;
        this.clientName = clientName;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "  " + number + "  | " + clientName + "\n";
    }
}
