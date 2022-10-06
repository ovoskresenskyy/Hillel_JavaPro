package HW_9.FirstTask;

public class Circle implements GeometricFigure {

    private final Point center, circlePoint;

    public Circle(Point center, Point circlePoint) {
        this.center = center;
        this.circlePoint = circlePoint;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(getSegmentLength(center, circlePoint), 2.0);
    }
}
