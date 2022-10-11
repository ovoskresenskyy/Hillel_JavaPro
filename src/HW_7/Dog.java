package HW_7;

public class Dog extends Animal {

    private static final int MAX_CAN_RUN_METERS = 500;
    private static final int MAX_CAN_SWIM_METERS = 10;
    private static int classSampleCounter;

    public Dog(String name) {
        super(name);
        classSampleCounter++;
    }

    @Override
    public void run(int distanceInMeters) {
        if (distanceInMeters > 0 && distanceInMeters <= MAX_CAN_RUN_METERS) {
            System.out.println("Dog " + getName() + " ran " + distanceInMeters + " meters.");
        }
    }

    @Override
    public void swim(int distanceInMeters) {
        if (distanceInMeters > 0 && distanceInMeters <= MAX_CAN_SWIM_METERS) {
            System.out.println("Dog " + getName() + " swam " + distanceInMeters + " meters.");
        }
    }

    public static int getClassSampleCounter() { return classSampleCounter; }
}
