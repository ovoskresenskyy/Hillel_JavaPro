package HW_13;

public class MyPair {
    private final String key;
    private final int value;

    public MyPair(String key, int value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Word: " + key + ", occurrence: " + value;
    }
}
