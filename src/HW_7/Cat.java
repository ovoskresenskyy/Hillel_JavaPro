package HW_7;

public class Cat extends Animal {

    private static final int MAX_CAN_RUN_METERS = 200;
    private static int classSampleCounter;

    public Cat(String name) {
        super(name);
        classSampleCounter++;
    }

    @Override
    public void run(int distanceInMeters) {
        if (distanceInMeters > 0 && distanceInMeters <= MAX_CAN_RUN_METERS) {
            System.out.println("Cat " + getName() + " ran " + distanceInMeters + " meters.");
        }
    }

    @Override
    public void swim(int distanceInMeters) {
        System.out.println("Cat " + getName() + " can't swim.");
    }

    public static int getClassSampleCounter() { return classSampleCounter; }
}
