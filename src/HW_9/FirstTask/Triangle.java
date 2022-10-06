package HW_9.FirstTask;

public class Triangle implements GeometricFigure {

    private final Point ApexA, ApexB, ApexC;

    public Triangle(Point a, Point b, Point c) {
        ApexA = a;
        ApexB = b;
        ApexC = c;
    }

    @Override
    public double getArea() {
        double lengthAB = getSegmentLength(ApexA, ApexB);
        double lengthBC = getSegmentLength(ApexB, ApexC);
        double lengthCA = getSegmentLength(ApexC, ApexA);

        double p = (lengthAB + lengthBC + lengthCA) / 2;

        // Heron's formula
        return Math.sqrt(p
                * (p - lengthAB)
                * (p - lengthBC)
                * (p - lengthCA)
        );
    }
}
