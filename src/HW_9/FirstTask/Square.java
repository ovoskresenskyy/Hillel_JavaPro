package HW_9.FirstTask;

public class Square implements GeometricFigure {

    private final Point ApexA, ApexB;

    public Square(Point a, Point b) {
        ApexA = a;
        ApexB = b;
    }

    @Override
    public double getArea() {
        return Math.pow(getSegmentLength(ApexA, ApexB), 2.0);
    }
}
