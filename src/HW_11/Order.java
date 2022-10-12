package HW_11;

public class Order {
    private final int number;
    private final String clientName;

    public Order(int number, String clientName) {
        this.number = number;
        this.clientName = clientName;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "  " + number + "  | " + clientName;
    }
}
