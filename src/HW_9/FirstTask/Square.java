package HW_9.FirstTask;

import HW_9.FirstTask.GeometricFigure;
import HW_9.FirstTask.Point;

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
