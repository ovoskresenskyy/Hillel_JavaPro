package HW_9.FirstTask;

@FunctionalInterface
public interface GeometricFigure {

    double getArea();

    default double getSegmentLength(Point a, Point b) {
        return Math.sqrt(
                Math.pow(b.getX() - a.getX(), 2.0)
                        + Math.pow(b.getY() - a.getY(), 2.0)
        );
    }

}
