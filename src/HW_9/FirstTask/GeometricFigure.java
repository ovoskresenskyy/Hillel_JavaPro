package HW_9.FirstTask;

@FunctionalInterface
public interface GeometricFigure {

    double getArea();

    default double getSegmentLength(Point first, Point second) {
        return Math.sqrt(Math.pow(second.x() - first.x(), 2.0) + Math.pow(second.y() - first.y(), 2.0));
    }

}
