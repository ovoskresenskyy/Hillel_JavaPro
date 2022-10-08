package HW_10.Task_1;

public class MyPair<T, E> {
    private final T key;
    private final E value;

    public MyPair(T key, E value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return key + ": " + value;
    }
}
