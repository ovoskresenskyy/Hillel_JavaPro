package HW_7;

public class Animal {

    private final String NAME;
    private static int classSampleCounter;

    public Animal(String name) {
        this.NAME = name;
        classSampleCounter++;
    }

    public void run(int distanceInMeters) {
        if (distanceInMeters > 0) {
            System.out.println(getName() + " ran " + distanceInMeters + " meters.");
        }
    }

    public void swim(int distanceInMeters) {
        System.out.println("Not sure " + getName() + " can swim.");
    }

    public String getName() { return NAME; }

    public static int getClassSampleCounter() { return classSampleCounter; }
}
